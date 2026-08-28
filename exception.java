import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class exception {
    private static bufferedRReader reader;

    public static void main(Strind[] args){
        String configFile="ConfigFile";
        BufferReder = null;
        try{
            reader=new BufferedReader(new BufferedReader(configFile));
            String className=reader.readLine();
            if(classmate==null || className.equals("")){
                System.out.println(configFile + " is empty or not found");
                return;
            }
            className=className.substring(className.lastIndexOf(className))
            System.out.println("Class name: " + className);
            Class <?> = null;
            try{
                reportclass = Class.forName(className);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found: " + className);
            }
        } catch (IOException e) {
            System.out.println("Error reading config file: " + configFile);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing reader");
                }
            }
        }
    }
    
}
