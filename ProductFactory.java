package group1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class ProductFactory<T> implements Data<T>{
    private Connection conn;
    public ProductFactory(Connection conn){
        this.conn = conn;
    }
    @Override
    public List<T> load() {
        return new ArrayList<>();
    }

    @Override
    public void save(List<T> list_objs) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO(xxx) VALUES ";
        for(T p: list_objs){
            Product t =  p instanceof Product ? ((Product) p) : null;
            sql += STR."(\{t.getId()},\{t.getName()}),";
        }
        stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
