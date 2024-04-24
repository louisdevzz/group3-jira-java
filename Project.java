package group1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Project {
    public enum STATUS {TODO,PENDING,COMPLETED}
    private String title;
    private String description;
    private String time_finish;
    private STATUS status;
    private String manager;
    private String create_at_string;
    private String comment;
    private String tags;
    private String userId;

    public Project(String title, String description, String time_finish, STATUS status, String manager, String create_at_string, String comment, String tags, String userId) {
        this.title = title;
        this.description = description;
        this.time_finish = time_finish;
        this.status = status;
        this.manager = manager;
        this.create_at_string = create_at_string;
        this.comment = comment;
        this.tags = tags;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime_finish() {
        String result = null;
        try{
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date finish = format.parse(time_finish);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            result = df.format(finish);
        }catch (ParseException e){
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        return result;
    }

    public void setTime_finish(String time_finish) {

        this.time_finish = time_finish;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getCreate_at_string() {
        String result = null;
        try{
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date create_at = format.parse(create_at_string);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            result = df.format(create_at);
        }catch (ParseException e){
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        return result;
    }

    public void setCreate_at_string(String create_at_string) {
        this.create_at_string = create_at_string;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", time_finish=" + time_finish +
                ", status=" + status +
                ", manager='" + manager + '\'' +
                ", create_at=" + create_at_string +
                ", comment='" + comment + '\'' +
                ", tags=" + tags +
                ", userId='" + userId + '\'' +
                '}';
    }
}
