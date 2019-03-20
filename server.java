import java.net.*;
import java.io.*;
import java.lang.*;

class TcpJavaServer{

      public static void main (String args[]) throws IOException
      {
      String data="Whatsupp?";
      ServerSocket srvr = new ServerSocket(9002);
      Socket skt = srvr.accept();
      BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
      System.out.println("Client said: " +in.readLine()+"\n");
      PrintWriter out = new PrintWriter(skt.getOutputStream(),true);
      out.print(data);
      out.close();
      skt.close();
      srvr.close();
      }
}
