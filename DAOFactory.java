package group1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DAOFactory {
    private Connection conn;
    public DAOFactory(String mysql){
        try {
            conn = DriverManager.getConnection(mysql);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public <T> void createProject(List<T> list_project){
        new ProjectFactory(conn).save(list_project);
    }

    public <T> List<T> load(String choose){
        return new ProjectFactory(conn).load(choose);
    }
}
