
package banksystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Text {
  public static boolean WriteToTabDelimitedFile(String[] data, String FileName) {
 try {
FileWriter fileWritter = new FileWriter(FileName);
// loop through all your data and print it to the file
     try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
    // loop through all your data and print it to the file
    for (String data1 : data) {
        bufferWritter.write(data1 + "\t");
    }
         bufferWritter.write("\n");
     }
 } catch (IOException e) {
System.out.println("Error Printing Tab Delimited File");
return false;
 }
 return true;
}
public static boolean appendToTabDelimitedFile (String[] data, String FileName) {
 try{
File file =new File(FileName);
if(!file.exists()) //if file doesn’t exists, return false
return false;
FileWriter fileWritter = new FileWriter(file.getName(),true);
     try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
    for (String data1 : data) {
        bufferWritter.write(data1 + "\t");
    }
         bufferWritter.write("\n");
     }
 } catch (IOException e){
 }
 return true;
}
public static String [] readFromTabDelimitedFile (String FileName) {
 List<String> lines = new ArrayList<>();
 try {
FileReader fileReader = new FileReader(FileName);
     try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
         String line = null;
         while ((line = bufferedReader.readLine()) != null)
             lines.add(line);
     }
 } catch (IOException e) {
 }
 return lines.toArray(new String[lines.size()]);
}
public static void main (String[] args) {
 // Example Use of the above functions
 String[] data= {"Course", "Lecturer","TA"};
 WriteToTabDelimitedFile(data, "courses.txt");
 data[0] = "CS243";data[1] = "Manal";data[2] = "Hend";
 appendToTabDelimitedFile(data, "courses.txt");
 data[0] = "CS244";data[1] = "Manal";data[2] = "Maiada";
 appendToTabDelimitedFile(data, "courses.txt");
 String[] readData = readFromTabDelimitedFile("courses.txt");
      for (String readData1 : readData) {
          String[] tokens = readData1.split("\t");
     for (String token : tokens) {
         System.out.print(token + "\t");
     }
          System.out.println();
      }
}  
}


    

