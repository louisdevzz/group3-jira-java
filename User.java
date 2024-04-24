package group1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class User {
    private String uid;
    private String full_name;
    private String username;
    private String password;
    private String create_at_string;

    public User(String uid,String full_name, String username, String password,String create_at_string) {
        this.uid = uid;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.create_at_string = create_at_string;
    }
    public String getUid() {
        return uid;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCreate_at(){
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

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", full_name='" + full_name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", create_at_string='" + create_at_string + '\'' +
                '}';
    }
}
