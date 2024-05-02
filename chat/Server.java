import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.TreeMap;

public class Server {
    public static void main(String[] agrs){
        try {
            TreeMap<String,PrintWriter> sockets = new TreeMap<>();
            ServerSocket server = new ServerSocket(8080);
            while (true){
                Socket client = server.accept();
                new Handling(client,sockets).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
