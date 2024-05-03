package group1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskFactory<T> implements IDataFactory<T>{
    private Connection conn;

    public TaskFactory(Connection conn){
        this.conn = conn;
    }

    @Override
    public List<T> load() {
        ArrayList<T> result = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM task");
            while (rs.next()) {
                int pid = rs.getInt(2);
                String topic = rs.getString(3);
                String from_date = rs.getString(4);
                String to_date = rs.getString(5);
                String description = rs.getString(6);
                String assignment = rs.getString(7);
                String create_at = rs.getString(8);
                String in_status = rs.getString(9);
                String comment = rs.getString(10);
                String tags = rs.getString(11);
                Task.STATUS status = null;
                if(Objects.equals(in_status, "todo")){
                    status = Task.STATUS.TODO;
                }
                else if(Objects.equals(in_status, "completed")){
                    status = Task.STATUS.COMPLETED;
                }else if(Objects.equals(in_status,"pending")){
                    status = Task.STATUS.PENDING;
                }
                Task task = new Task(pid,topic,from_date,to_date,description,assignment,create_at,status,comment,tags);
                result.add((T) task);
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

    public List<T> loadByPID(int pID) {
        ArrayList<T> result = new ArrayList<>();
        String sql = "SELECT * FROM task WHERE pid='"+Integer.toString(pID)+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int pid = rs.getInt(2);
                String topic = rs.getString(3);
                String from_date = rs.getString(4);
                String to_date = rs.getString(5);
                String description = rs.getString(6);
                String assignment = rs.getString(7);
                String create_at = rs.getString(8);
                String in_status = rs.getString(9);
                String comment = rs.getString(10);
                String tags = rs.getString(11);
                Task.STATUS status = null;
                if(Objects.equals(in_status, "TODO")){
                    status = Task.STATUS.TODO;
                }
                else if(Objects.equals(in_status, "COMPLETED")){
                    status = Task.STATUS.COMPLETED;
                }else if(Objects.equals(in_status,"PENDING")){
                    status = Task.STATUS.PENDING;
                }
                Task task = new Task(pid,topic,from_date,to_date,description,assignment,create_at,status,comment,tags);
                result.add((T) task);
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
    public void save(List<T> list_tasks) {
        try {
            Statement stmt = conn.createStatement();
            String sql ="";
            for(T ts: list_tasks){
                Task t = ts instanceof Task ? ((Task) ts) : null;
                sql+="INSERT INTO task (pid,topic,from_date,to_date,description,assignment,create_at,status,comment,tags) VALUES ('"+t.getPid()+"','"+t.getTopic()+"','"+t.getFrom_date()+"','"+t.getTo_date()+"','"+t.getDescription()+"','"+t.getAssignment()+"','"+t.getCreate_at()+"','"+t.getStatus()+"','"+t.getComment()+"','"+t.getTags()+"')";
            }
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
