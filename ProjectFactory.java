package group1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectFactory<T> implements IDataFactory<T> {
    private Connection conn;
    public ProjectFactory(Connection conn){
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
            Project t =  p instanceof Project ? ((Project) p) : null;
            sql += STR."(\{t.getId()},\{t.getTitle()}),";
        }
        stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
