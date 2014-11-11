package Classic_Examples;

import java.io.*;
import java.net.*;

/**
 * Simple client using Java Sockets.
 * @author Jonathan Engelsma (http://www.cis.gvsu.edu/~engelsma)
 *
 */
public class SimpleClient {

public static void main(String[] args) {
		
// create a socket and find it to the host/port server is listening on.
String host;
int port;
if(args.length==0) {
host = "192.168.1.104";
port = 9999;         
}
else {
host = args[0];
String portStr = args[1];

try{
port = Integer.parseInt(portStr);
}catch (NumberFormatException nfe) {
System.out.println("Whoops, invalid port number.  Will default to 9999");
port = 9999;
}
}
        
try{
System.out.println("Client will attempt connecting to server at host=" + host + " port=" + port + ".");
Socket skt = new Socket(host,port);
// ok, got a connection.  Let's use java.io.* niceties to read and write from the connection.
BufferedReader myInput = new BufferedReader(new InputStreamReader(skt.getInputStream()));
PrintStream myOutput = new PrintStream(skt.getOutputStream());	
        
// write something to the server.
myOutput.print("Hello Sir!\n");
			
// see if the server writes something back.
String buf = myInput.readLine();
if(buf != null) {
System.out.println("Client received [" + buf + "] from the server!");				
}
			
skt.close();
System.out.println("Client is exiting.");
} catch (IOException ex) {
ex.printStackTrace();
System.out.println("Whoops, something bad happened!  I'm outta here.");
}
}
}
