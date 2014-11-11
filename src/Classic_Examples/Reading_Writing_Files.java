/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classic_Examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author $Akshay$
 */
public class Reading_Writing_Files {
    
public static void main(String args[]){
// ~~~~  File on Desktop ~~~~
Path file = new File("C:\\Users\\$Akshay$\\Desktop\\java.txt").toPath();
System.out.println("Do you want to read or write (R/W) :");
Scanner i = new Scanner(System.in).useDelimiter("\n");
char x = i.next().toUpperCase().charAt(0);
byte[] txt;

if(x=='W'){
try {
System.out.println("Enter your input :");
txt = i.next().getBytes();
Files.write(file, txt);
}catch (IOException ex) {
JOptionPane.showMessageDialog(null,ex.getMessage());
}
}

else if(x=='R'){
try {
txt=Files.readAllBytes(file);
System.out.println(new String(txt, "UTF-8"));
} catch (IOException ex) {
JOptionPane.showMessageDialog(null,ex.getMessage());
}

}
}
}
