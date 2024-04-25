package group1;

public class Test {
    public static void main(String args[]) {
        User u = new User("1","vo huu nhan","nhanvo","123","10/10/2024");
        if(u.checkUser("nhanvo")){
            System.out.println("success!");
        }else{
            System.out.println("failed!!");
        }
    }
}
