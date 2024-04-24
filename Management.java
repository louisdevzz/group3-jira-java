package group1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Management<T> {
    private DAOFactory dao;
    public Management(){
        dao = new DAOFactory("jdbc:mysql://unl4gv0g6ppkcyik:zYDmomoVGeEOwKClk08E@beoydmpfmbnzpwcoxzu6-mysql.services.clever-cloud.com:3306/beoydmpfmbnzpwcoxzu6");
    }
    @SuppressWarnings("unchecked")
    public void createProject(String title, String description, String time_finish, Project.STATUS status,
                              String manager, String create_at_string, String comment, ArrayList<String> tags, String userId){
        List<T> projectList = new ArrayList<>();
        Project project = new Project(title,description,time_finish,status,manager,create_at_string,comment,tags,userId);
        projectList.add((T) project);
        this.dao.createProject(projectList);
        System.out.println("Create project successful!!!");
    }
}
