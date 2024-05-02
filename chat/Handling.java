import java.io.*;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;

public class Handling extends Thread {
    private Socket socket;
    private TreeMap<String, PrintWriter> all_out; // Use ConcurrentHashMap for thread safety
    private String myname;

    public Handling(Socket socket, TreeMap<String, PrintWriter> all_out) {
        this.socket = socket;
        this.all_out = all_out;
        this.myname = "DEFAULT";
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) { // AutoFlush for PrintWriter
            out.println("Hello! This is the Jira Chat Room. \nEnter BYE to exit.\nEnter your name: ");
            String name = in.readLine();
            this.myname = name;
            this.all_out.put(name, out);
            out.println("_Let's start your conversation_");
            // Loop for message entry and processing
            out.println("Enter your message:");
            while (true) {
                String str = in.readLine();
                if (str == null || str.toUpperCase().trim().equals("BYE")) break;
                // Send message to all in the chat room
                notifyAll(this.myname, str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                this.socket.close(); // Ensure socket is closed on exit
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.all_out.remove(this.myname); // Remove user from the list upon disconnection
        }
    }

    public void notifyAll(String name, String msg) {
        synchronized (this.all_out) {
            for (Map.Entry<String, PrintWriter> entry : this.all_out.entrySet()) {
                if (!entry.getKey().equals(name)) { // Send to all except self
                    entry.getValue().println("_Chat room_\n" + name + ": " + msg);
                }
            }
        }
    }
}
