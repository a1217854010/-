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
	                write(("HTTP/1.1 200 OK\r\n" +  //��Ӧͷ��һ��
	                        "Content-Type: text/html; charset=utf-8\r\n" +  //�򵥷�һ��ͷ����Ϣ
	                        "\r\n"  //������������ָ�����ͷ���������
	                        +"<html>\r\n"
	                        +"<head>"
	                        +"<meta http-equiv="+"Content-Type"+" content="+"text/html; charset=utf-8 />"
	                        +"</head>"
	                        +"<h1>haohaohaahhaoahao</h1>\r\n"
	                        +"<body>"
	                        +"<p>���</p>"
	                        +"</body>"
	                        +"</html>"
	                		).getBytes());
	    }
	}
