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
                              String manager, String create_at_string, String comment, String tags, String userId){
        List<T> projectList = new ArrayList<>();
        Project project = new Project(title,description,time_finish,status,manager,create_at_string,comment,tags,userId);
        projectList.add((T) project);
        dao.createProject(projectList);
        System.out.println("Create project successful!!!");
    }
    @SuppressWarnings("unchecked")
    public void createUser(String uid,String full_name,String username,String password,String create_at){
        List<T> userList = new ArrayList<>();
        User user = new User(uid,full_name,username,password,create_at);
        userList.add((T) user);
        dao.createProject(userList);
        System.out.println("Create user successful!!!");
    }

    public List<User> loadUser(){
        List<User> list = dao.load("user");
        return list;
    }

    public void loadProject(){
        List<Project> projects = dao.load("project");
        for(Project p: projects){
            System.out.println(p.toString());
        }
    }
}
