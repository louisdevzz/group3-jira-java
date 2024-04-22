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

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public List<ProductFactory> createProduct(){
        return new ProductFactory(conn).load();
    }

    public void saveProduct(List<ProductFactory> list_product){
        new ProductFactory(conn).save(list_product);
    }
}
