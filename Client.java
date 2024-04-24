package group1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Client {
    @SuppressWarnings("unchecked")
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Create Project");
            System.out.println("2. Login");
            System.out.println("3. Chat");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
//                    System.out.println("Enter project details:");
//                    System.out.print("Title: ");
//                    String title = scanner.nextLine();
//
//                    System.out.print("Description: ");
//                    String description = scanner.nextLine();
//
//                    System.out.print("Time to finish: ");
//                    String timeFinishString = scanner.nextLine();
//                    Date timeFinish = null;
//                    try{
//                        timeFinish = new SimpleDateFormat("dd/MM/yyyy").parse(timeFinishString);
//                    }catch (ParseException e){
//                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
//                        continue;
//                    }
//
//                    System.out.print("Status: ");
//                    String in_status = scanner.nextLine();
//                    Project.STATUS status = null;
//                    if(Objects.equals(in_status, "todo")){
//                        status = Project.STATUS.TODO;
//                    }
//                    else if(Objects.equals(in_status, "completed")){
//                        status = Project.STATUS.COMPLETED;
//                    }else if(Objects.equals(in_status,"pending")){
//                        status = Project.STATUS.PENDING;
//                    }
//                    System.out.print("Manager: ");
//                    String manager = scanner.nextLine();
//
//                    System.out.print("Created At (dd/MM/yyyy): ");
//                    String createdAtString = scanner.nextLine();
//                    Date createdAt = null;
//                    try {
//                        createdAt = new SimpleDateFormat("dd/MM/yyyy").parse(createdAtString);
//                    } catch (ParseException e) {
//                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
//                        continue;
//                    }
//
//                    System.out.print("Comment: ");
//                    String comment = scanner.nextLine();
//
//                    System.out.print("Tags (comma-separated): ");
//                    String[] tagsArray = scanner.nextLine().split(",");
                    ArrayList<String> tags = new ArrayList<>();
                    tags.add("web3");
//                    System.out.print("User ID: ");
//                    String userId = scanner.nextLine();

                    management.createProject("potlock","potlock","2012-10-20",Project.STATUS.TODO,"nhan","2012-10-20","nhan admin",tags,"huu nhan");
                    break;
                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
