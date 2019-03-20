import java.net.*;
import java.io.*;
import java.lang.*;

class TcpJavaServer{

      public static void main (String args[]) throws IOException
      {
            
      //Defining/opening connection
      ServerSocket srvr = new ServerSocket(9002);
      Socket skt = srvr.accept();
            
      //sending string
      String data="Whatsupp?";
      PrintWriter out = new PrintWriter(skt.getOutputStream(),true);
      out.print(data);
            
      //receivng string
      //InputStreamReader in = new InputStreamReader(skt.getInputStream());
      //BufferedReader bf= new BufferedReader(in);
      //String str=bf.readLine();
      System.out.println("We have connected with ip: " +skt.get+"\n");
            
      
      
      //closing connection
      out.close();
      skt.close();
      srvr.close();
      }
}
