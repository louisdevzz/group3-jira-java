package group1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectFactory<T> implements IDataFactory<T>{
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
            String sql = "INSERT INTO project (title,description,time_finish,status,manager,create_at,comment,tags,userId) VALUES ";

            for(T p: list_objs){
                Project t =  p instanceof Project ? ((Project) p) : null;
                System.out.println("time: "+t.getTime_finish());
                sql+="('"+t.getTitle()+"','"+t.getDescription()+"','"+t.getTime_finish()+"','"+t.getStatus()+"','"+t.getManager()+"','"+t.getCreate_at_string()+"','"+t.getComment()+"','web3','"+t.getUserId()+"')";
            }
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
