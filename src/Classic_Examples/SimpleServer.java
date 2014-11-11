package Classic_Examples;

import java.io.*;
import java.net.*;

/**
 * Simple server using Java Sockets.
 * @author Jonathan Engelsma (http://www.cis.gvsu.edu/~engelsma)
 *
 */
public class SimpleServer {

public static void main(String[] args) {
		
try {
// First we create a server socket and bind it to port 9999.
ServerSocket myServerSocket = new ServerSocket(9999);

// wait for an incoming connection... 
System.out.println("Server is waiting for an incoming connection on host=" 
+ InetAddress.getLocalHost().getCanonicalHostName() 
+ " port=" + myServerSocket.getLocalPort());
Socket skt = myServerSocket.accept();
				
// ok, got a connection.  Let's use java.io.* niceties to read and write from the connection.
BufferedReader myInput = new BufferedReader(new InputStreamReader(skt.getInputStream()));
PrintStream myOutput = new PrintStream(skt.getOutputStream());	
			
// attempt to read input from the stream.
String buf = myInput.readLine();
			
// if we got input, print it out and write a message back to the remote client..
if (buf != null) {
System.out.println("Server read: [" + buf + "]");
myOutput.print("got it");
			}
			
// close the connection.
skt.close();
System.out.println("Server is exiting");
} catch (IOException ex) {
ex.printStackTrace();
System.out.println("Whoops, something bad happened!  I'm outta here.");
}

}

}
