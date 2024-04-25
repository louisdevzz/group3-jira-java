package group1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserFactory<T> implements IDataFactory<T>{
    private Connection conn;

    public UserFactory(Connection conn){
        this.conn = conn;
    }

    @Override
    public List<T> load() {
        ArrayList<T> result = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                String uid = rs.getString(2);
                String fullname = rs.getString(3);
                String username = rs.getString(4);
                String password = rs.getString(5);
                String create_at = rs.getString(6);
                User user = new User(uid,fullname,username,password,create_at);
                result.add((T) user);
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

    public void save(List<T> list_users) {
        try {
            Statement stmt = conn.createStatement();
            String sql ="";
            for(T us: list_users){
                User u = us instanceof User ? ((User) us) : null;
                sql+="INSERT INTO user (uid,fullname,username,password,create_at) VALUES ('"+u.getUid()+"','"+u.getFull_name()+"','"+u.getUsername()+"','"+u.getPassword()+"','"+u.getCreate_at()+"')";
            }
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
