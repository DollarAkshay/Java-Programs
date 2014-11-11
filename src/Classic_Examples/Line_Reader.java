/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classic_Examples;

import java.io.*;

/**
 *
 * @author $Akshay$
 */
import java.io.*;

public class Line_Reader {

public static void main(String[] args){
String string="";
String file ="textFile.txt";

        //reading   
try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                string+=line+"\n";
            }
            br.close(); 
        }       
        catch (Exception e){
            System.out.println(e.toString());
        }

        //writing
        try {
            FileWriter fw = new FileWriter (file);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter fileOut = new PrintWriter (bw); 
            fileOut.println (string+"\n test of read and write !!"); 
            fileOut.close();
            System.out.println("the file " + file + " is created!"); 
        }
        catch (Exception e){
            System.out.println(e.toString());
        }       
    }
}