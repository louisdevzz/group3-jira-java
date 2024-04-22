package group1;

import java.util.Date;

public class Project {
    enum STATUS {DOING,COMPLETED}
    private String id;
    private String title;
    private String description;
    private Date time_finish;
    private STATUS status;
    private String manager;
    private Date create_at;
    private String comment;
    private String tags;
    private String userId;

    public Project(String id, String title, String description, Date time_finish, STATUS status, String manager, Date create_at, String comment, String tags, String userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.time_finish = time_finish;
        this.status = status;
        this.manager = manager;
        this.create_at = create_at;
        this.comment = comment;
        this.tags = tags;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getTime_finish() {
        return time_finish;
    }

    public void setTime_finish(Date time_finish) {
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

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
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
}
