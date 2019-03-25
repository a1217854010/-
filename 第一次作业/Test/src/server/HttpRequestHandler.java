package server;
import java.io.IOException;
import java.net.Socket;

class HttpRequestHandler {
	    private Socket socket;

	    public HttpRequestHandler(Socket socket) {
	        this.socket = socket;
	    }

	    public void handle() throws IOException {
	        socket.getOutputStream().
	                write(("HTTP/1.1 200 OK\r\n" +  //响应头第一行
	                        "Content-Type: text/html; charset=utf-8\r\n" +  //简单放一个头部信息
	                        "\r\n"  //这个空行是来分隔请求头与请求体的
	                        +"<html>\r\n"
	                        +"<head>"
	                        +"<meta http-equiv="+"Content-Type"+" content="+"text/html; charset=utf-8 />"
	                        +"</head>"
	                        +"<h1>haohaohaahhaoahao</h1>\r\n"
	                        +"<body>"
	                        +"<p>你好</p>"
	                        +"</body>"
	                        +"</html>"
	                		).getBytes());
	    }
	}
