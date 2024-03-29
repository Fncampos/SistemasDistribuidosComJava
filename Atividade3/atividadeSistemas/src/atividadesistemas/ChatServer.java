package atividadesistemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    static ArrayList<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Servidor funcionando!");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            ClientHandler client = new ClientHandler(clientSocket);
            clients.add(client);
            client.start();
        }
    }

    public static void broadcast(String message, ClientHandler excludeClient) {
        for (ClientHandler client : clients) {
            if (client != excludeClient) {
                client.sendMessage(message);
            }
        }
    }
    
    
    public static void removeClient(ClientHandler client) {
        clients.remove(client);
    }
       
    
}

class ClientHandler extends Thread {
    private Socket clientSocket;
    private ChatServer chatServer;
    private String username;
    private boolean isConnected = true;
  

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.chatServer = chatServer;
        //notifyConnection("connected");
    }
    

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Connected to the chat room.");
            username = in.readLine();
            out.println("Welcome, " + username + "!"); 
            notifyConnection(" entrou no ");

            while (isConnected) {
                String message = in.readLine();
                
                if (message == null) {
                    isConnected = false;
                    break;
                }
                if (message.startsWith("#USERS")) {
                    StringBuilder userList = new StringBuilder("Connected users:");
                    for (ClientHandler client : ChatServer.clients) {
                        userList.append(", ").append(client.username);
                    	}
                    sendMessage(userList.toString());
                }
               
                ChatServer.broadcast(username + ": " + message, this);
                System.out.println(username + ": " + message);
                                               
            }
            
            notifyConnection(" saiu do ");
            ChatServer.removeClient(this);
            clientSocket.close();

        } catch (IOException e) {
            System.out.println("Error handling client: " + e);
        }
    }

    public void sendMessage(String message) {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println(message);
        } catch (IOException e) {
            System.out.println("Error sending message: " + e);
        }
    }
    
    public void notifyConnection(String status) {
        String message = username + status + "chat.";
        ChatServer.broadcast(message, this);
        System.out.println(message);
    }
}
