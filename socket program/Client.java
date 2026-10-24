
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in));

            System.out.print("Enter a message: ");
            String message = keyboard.readLine();

            out.println(message);

            String reply = in.readLine();
            System.out.println("Server says: " + reply);

            keyboard.close();
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
