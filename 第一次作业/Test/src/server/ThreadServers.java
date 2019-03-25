package server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServers {
	public static void testServer(){
	System.out.println("等待客户端连接。。。");
	ServerSocket ss = null;
	try{
		ss = new ServerSocket(8888);
		Socket socket = null;
		while(true){
			socket=ss.accept();
			 new ServerSocketThread(socket).start();
			
		          }
	
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
		testServer();
	}

}
