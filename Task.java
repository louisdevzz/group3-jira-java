package group1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task {
    public enum STATUS{TODO,PENDING,COMPLETED}
    private int pid;
    private String topic;
    private String from_date;
    private String to_date;
    private String description;
    private String assignment;
    private String create_at;
    private STATUS status;
    private String comment;
    private String tags;

    public Task(int pid, String topic, String from_date, String to_date, String description, String assignment, String create_at, STATUS status, String comment, String tags) {
        this.pid = pid;
        this.topic = topic;
        this.from_date = from_date;
        this.to_date = to_date;
        this.description = description;
        this.assignment = assignment;
        this.create_at = create_at;
        this.status = status;
        this.comment = comment;
        this.tags = tags;
    }

    public int getPid() {
        return pid;
    }

    public String getTopic() {
        return topic;
    }

    public String getFrom_date() {
        String rs_from_date = null;
        try{
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date finish = format.parse(from_date);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            rs_from_date = df.format(finish);
        }catch (ParseException e){
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        return rs_from_date;
    }

    public String getTo_date() {
        String rs_to_date = null;
        try{
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date finish = format.parse(to_date);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            rs_to_date = df.format(finish);
        }catch (ParseException e){
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        return rs_to_date;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignment() {
        return assignment;
    }

    public String getCreate_at() {
        return create_at;
    }

    public STATUS getStatus() {
        return status;
    }

    public String getComment() {
        return comment;
    }

    public String getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Task{" +
                "pid='" + pid + '\'' +
                ", topic='" + topic + '\'' +
                ", from_date='" + from_date + '\'' +
                ", to_date='" + to_date + '\'' +
                ", description='" + description + '\'' +
                ", assignment='" + assignment + '\'' +
                ", create_at='" + create_at + '\'' +
                ", status=" + status +
                ", comment='" + comment + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
