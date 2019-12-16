package iotest.算法测试;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket dsa = new ServerSocket(8888);
        Socket socket = dsa.accept();
        InputStream change = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = change.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("连接成功".getBytes());
        dsa.close();
        socket.close();

    }
}
