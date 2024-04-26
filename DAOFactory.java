package group1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DAOFactory{
    public Connection conn;
    public DAOFactory(String mysql){
        Welcome wl = new Welcome();
        wl.setVisible(true);
        try {
            wl.ProgressBar();
            conn = DriverManager.getConnection(mysql,"louisdevzz","Louisdevzz1310");
            System.out.println("connect success!!");
            wl.setVisible(false);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public <T> void createProject(List<T> list_project){
        new ProjectFactory(conn).save(list_project);
    }

    public <T> List<T> loadProject(){
        return new ProjectFactory(conn).load();
    }

    public <T> void createUser(List<T> list_users){
        new UserFactory(conn).save(list_users);
    }

    public <T> List<T> loadUser(){
        return new UserFactory(conn).load();
    }

    public <T> void createTask(List<T> list_tasks){
        new TaskFactory(conn).save(list_tasks);
    }

    public <T> List<T> loadTask(){
        return new TaskFactory(conn).load();
    }

}
