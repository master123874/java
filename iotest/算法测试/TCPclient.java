package iotest.算法测试;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPclient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("请求与服务器连接".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();

    }
}
