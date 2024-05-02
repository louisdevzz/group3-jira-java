import java.io.BufferedReader;
import java.io.IOException;

public class Printer extends Thread{
    private BufferedReader in;
    private boolean stop;
    public Printer(BufferedReader in){
        this.in = in;
        this.stop = false;
    }

    public void run(){
        try {
            String str = null;
            while (!stop && (str = in.readLine())!= null)
                System.out.println(str);
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void close(){
        stop = true;
    }
}
