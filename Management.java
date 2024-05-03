package group1;


import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class Management<T> {
    private DAOFactory dao;
    public Management(){
        dao = new DAOFactory("jdbc:mysql://jira.czg8sceumunq.us-west-1.rds.amazonaws.com:3306/jira");
    }
    @SuppressWarnings("unchecked")
    public void createProject(int pid,String title, String description, String time_finish, Project.STATUS status,
                              String manager, String create_at_string, String comment, String tags, String userId){
        List<T> projectList = new ArrayList<>();
        Project project = new Project(pid,title,description,time_finish,status,manager,create_at_string,comment,tags,userId);
        projectList.add((T) project);
        dao.createProject(projectList);
        System.out.println("Create project successful!!!");
    }

    public void createTask(int pid, String topic, String from_date, String to_date, String description,
                           String assignment, String create_at, Task.STATUS status, String comment, String tags){
        List<T> taskList = new ArrayList<>();
        Task task = new Task(pid,topic,from_date, to_date, description, assignment, create_at,  status, comment, tags);
        taskList.add((T) task);
        dao.createTask(taskList);
        System.out.println("Create task successful!!!");
    }


    @SuppressWarnings("unchecked")
    public void createUser(String uid,String full_name,String username,String password,String create_at){
        List<T> userList = new ArrayList<>();
        User user = new User(uid,full_name,username,password,create_at);
        userList.add((T) user);
        dao.createUser(userList);
        System.out.println("Create user successful!!!");
    }

    public void loadProject(){
        List<Project> projects = dao.loadProject();
        for(Project p: projects){
            System.out.println(p.toString());
        }
    }

    public List<Project> loadProjectByUID(String uid){
        List<Project> projects = dao.loadProjectByUID(uid);
        return projects;
    }


    public void loadTask(){
        List<Task> tasks = dao.loadTask();
        for(Task t: tasks){
            System.out.println(t.toString());
        }
    }

    public List<Task> loadTaskByPID(int pid){
        List<Task> tasks = dao.loadTaskByPID(pid);
        return tasks;
    }

    public List<User> userList(){
        List<User> user = dao.loadUser();
        return user;
    }

    public Boolean checkLogin(String username,String password){
        List<User> list = dao.loadUser();
        Boolean isCheck = false;
        for(User u: list){
            if(Objects.equals(username, u.getUsername()) && Objects.equals(password, u.getPassword())){
                isCheck = true;
                System.out.println("Login successful!!");
                break;
            }else{
                System.out.println("Login failed!!\n Username and password can incorrect!!\n Please enter username and password again!!");
                break;
            }
        }
        return isCheck;
    }
}
