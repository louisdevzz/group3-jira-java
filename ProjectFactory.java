package group1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProjectFactory<T> implements IDataFactory<T>{
    private Connection conn;

    public ProjectFactory(Connection conn){
        this.conn = conn;
    }
    @Override
    public List<T> load(String choose) {
        ArrayList<T> result = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = null;
            if(Objects.equals(choose, "user")){
                rs = stmt.executeQuery("SELECT * FROM user");
                while (rs.next()) {
                    String uid = rs.getString(2);
                    String fullname = rs.getString(3);
                    String username = rs.getString(4);
                    String password = rs.getString(5);
                    String create_at = rs.getString(6);
                    User user = new User(uid,fullname,username,password,create_at);
                    result.add((T) user);
                }
            }else if(Objects.equals(choose,"project")){
                rs = stmt.executeQuery("SELECT * FROM project");
                while (rs.next()) {
                    String title = rs.getString(2);
                    String description = rs.getString(3);
                    String time_finish = rs.getString(4);
                    String in_status = rs.getString(5);
                    Project.STATUS status = null;
                    if(Objects.equals(in_status, "todo")){
                        status = Project.STATUS.TODO;
                    }
                    else if(Objects.equals(in_status, "completed")){
                        status = Project.STATUS.COMPLETED;
                    }else if(Objects.equals(in_status,"pending")){
                        status = Project.STATUS.PENDING;
                    }
                    String manager = rs.getString(6);
                    String create_at = rs.getString(7);
                    String comment = rs.getString(8);
                    String tags = rs.getString(9);
                    String uid = rs.getString(10);

                    Project project = new Project(title,description,time_finish,status,manager,create_at,comment,tags,uid);
                    result.add((T) project);
                }
            }

        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return result;
    }
    @Override
    public void save(List<T> list_objs) {
        try {
            Statement stmt = conn.createStatement();
            String sql ="";
            for(T p: list_objs){
                if(p instanceof Project){
                    Project t =  p instanceof Project ? ((Project) p) : null;
                    sql+="INSERT INTO project (title,description,time_finish,status,manager,create_at,comment,tags,userId) VALUES ('"+t.getTitle()+"','"+t.getDescription()+"','"+t.getTime_finish()+"','"+t.getStatus()+"','"+t.getManager()+"','"+t.getCreate_at_string()+"','"+t.getComment()+"','web3','"+t.getUserId()+"')";

                }else if(p instanceof User){
                    User u = p instanceof User ? ((User) p) : null;
                    sql+="INSERT INTO user (uid,fullname,username,password,create_at) VALUES ('"+u.getUid()+"','"+u.getFull_name()+"','"+u.getUsername()+"','"+u.getPassword()+"','"+u.getCreate_at()+"')";
                }
            }
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
