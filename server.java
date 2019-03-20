import java.net.*;
import java.io.*;
import java.lang.*;

class TcpJavaServer{

      public static void main (String args[]) throws IOException
      {
      String data="Whatsupp?";
      ServerSocket srvr = new ServerSocket(9002);
      Socket skt = srvr.accept();
      System.out.println("Client said: " +skt.getInputStream()+"\n");
      PrintWriter out = new PrintWriter(skt.getOutputStream(),true);
      out.print(data);
      out.close();
      skt.close();
      srvr.close();
      }
}
