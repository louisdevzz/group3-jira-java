package group1;


import java.text.SimpleDateFormat;
import java.util.*;

public class Client {

    @SuppressWarnings("unchecked")
    public static void main (String[] args){
        Boolean isLogin = false;
        String userid = null;
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Create Project");
            System.out.println("2. Register");
            System.out.println("3. Login");
            System.out.println("4. Chat");
            System.out.println("5. Show All Project");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    if(isLogin){
                        System.out.println("Enter project details:");
                        System.out.print("Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Description: ");
                        String description = scanner.nextLine();

                        System.out.print("Time to finish (dd/MM/yyyy): ");
                        String timeFinish = scanner.nextLine();

                        System.out.print("Status: ");
                        String in_status = scanner.nextLine();
                        Project.STATUS status = null;
                        if(Objects.equals(in_status, "todo")){
                            status = Project.STATUS.TODO;
                        }
                        else if(Objects.equals(in_status, "completed")){
                            status = Project.STATUS.COMPLETED;
                        }else if(Objects.equals(in_status,"pending")){
                            status = Project.STATUS.PENDING;
                        }
                        System.out.print("Manager: ");
                        String manager = scanner.nextLine();

                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        String createdAt = df.format(new Date());

                        System.out.print("Comment: ");
                        String comment = scanner.nextLine();

                        System.out.print("Tags (...,...): ");
                        String tags = scanner.nextLine();

                        management.createProject(title,description,timeFinish,status,manager,createdAt,comment,tags,userid);
                        break;
                    }else{
                        System.out.println("Please login before create project!!");
                        break;
                    }

                case "2":
                    System.out.println("Enter information register!!!");

                    System.out.print("Username: ");
                    String username = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    System.out.print("Full Name: ");
                    String fullName = scanner.nextLine();

                    // Generate random UID
                    String uid = generateRandomUID(username);

                    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                    String created_at = f.format(new Date());

                    management.createUser(uid,fullName,username,password,created_at);
                    break;
                case "3":
                    if(isLogin){
                        System.out.println("You was login and you can access functions!");
                    }else{
                        System.out.println("Enter information that login!!");

                        System.out.print("Username: ");
                        String user = scanner.nextLine();

                        System.out.print("Password: ");
                        String pass = scanner.nextLine();

                        List<User> users = management.userList();
                        for(User u: users){
                            if(Objects.equals(user,u.getUsername())){
                                userid = u.getUid();
                            }
                        }

                        isLogin = management.checkLogin(user,pass);
                    }
                    break;
                case "5":
                    management.loadProject();
                    break;
                case "6":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static String generateRandomUID(String username) {
        // Generate random portion
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Change 100 to desired range
        String randomPart = String.format("%04d", randomNumber); // Adjust padding as needed

        // Concatenate username and random portion
        return username +"-"+ randomPart;
    }
}
