package test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @program: scalastudy
 * @package: test
 * @filename: Client.java
 * @create: 2020/10/08 18:27
 * @author: 29314
 * @description: .
 **/

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 6567);

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            Object o = objectInputStream.readObject();
            A a = (A)o;

            System.out.println(a.getP());
            System.out.println(a.getA());

            objectInputStream.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
