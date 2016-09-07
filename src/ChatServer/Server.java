package ChatServer;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by N on 2016.09.07..
 */
public class Server {


    public Server(){
    }
    public void Start(){
        try {
            ServerSocket ss = new ServerSocket(7777);
            Throwable ex2 = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server s = new Server();
    }
}
