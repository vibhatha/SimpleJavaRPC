import java.io.*;
import java.net.*;

public class ReqServer
{ 
   public static void main(String[] args) throws Exception { 
    int socket = 3000;
    if(args.length == 0) {
      
    } else {
      socket = Integer.parseInt(args[0]);
    }    
    ServerSocket sersock = new ServerSocket(socket); 
    System.out.println("Server Started and Socket " + socket + " opened ..."); 
    Socket sock = sersock.accept( );    
    OutputStream ostream = sock.getOutputStream(); 
    PrintWriter pwrite = new PrintWriter(ostream, true);  
    InputStream istream = sock.getInputStream(); 
    BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
    String receiveMessage, sendMessage,fun;
    int a,b,c;
    while(true){
    fun = receiveRead.readLine();
    if(fun != null) 
       System.out.println("Operation : "+fun);
    a = Integer.parseInt(receiveRead.readLine());
    System.out.println("Parameter 1 : "+a);
    b = Integer.parseInt(receiveRead.readLine());
    if(fun.compareTo("add")==0){
     c=a+b;
     System.out.println("Addition = "+c);
     pwrite.println("Addition = "+c); 
   }
   
   if(fun.compareTo("sub")==0){
     c=a-b;
     System.out.println("Substraction = "+c);
     pwrite.println("Substraction = "+c); 
  }
  
  if(fun.compareTo("mul")==0) {
    c=a*b;
    System.out.println("Multiplication = "+c);
    pwrite.println("Multiplication = "+c); 
  }
 
  if(fun.compareTo("div")==0) {
    c=a/b;
    System.out.println("Division = "+c);
    pwrite.println("Division = "+c); 
  }

  System.out.flush();
  } 
 } 
}
