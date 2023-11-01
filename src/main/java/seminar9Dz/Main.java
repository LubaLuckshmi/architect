package seminar9Dz;

import com.sun.net.httpserver.HttpServer;
import seminar9Dz.controller.IUserController;
import seminar9Dz.controller.UserControllerList;
import seminar9Dz.model.UserHandler;


import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        IUserController userStorage = new UserControllerList();
        server.createContext("/user", new UserHandler(userStorage));
        server.start();
        System.out.println("Server started on port 8081");

    }
}