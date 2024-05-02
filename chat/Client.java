package group1.chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = (args.length > 0 ? host = args[0] : "localhost");
        try {
            Socket socket = new Socket(host, 8080);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(
                    socket.getOutputStream()));

            // create new thread to receive data from server
            Printer read_t = new Printer(in);
            read_t.start();

//            main thread will read data from console and send to server
            Scanner scanner = new Scanner(System.in);
            String line = null;
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                out.println(line);
                out.flush();
                if (line.toUpperCase().equals("BYE"))
                    break;
            }
//            read_t.close();
//            out.close();
//            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

