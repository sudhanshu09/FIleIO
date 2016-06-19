/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudhanshu.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sudhanshu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
try{
      //  File file = new File("d:/helloworld/hello.txt");

        /*        if (!file.isDirectory()){
         file.mkdir();
         System.out.println("Directory created");
         }
         else {
         //   file.delete();
         // System.out.println("Directory Removed");
         
         }*/
        /*  try{
         System.out.println("file.");
         System.out.println(file.createNewFile());
         }catch(IOException ioe ){
         System.out.println(ioe.getMessage());
         }*/
//      
//      FileWriter writer = new FileWriter("D:/helloworld/hello.txt");
//         writer.write("1,Ram,Shrestha,ram@yahoo.com,1 \r\n");
//         writer.write("2,Hari,Gurung,hari@yahoo.com,0 \r\n");
//         writer.write("1,Ram,Shrestha,ram@yahoo.com,1 \r\n");
//         writer.write("3,Ramu,Shrestha,,\r\n");
//         writer.write(",,,\r\n");
//         writer.write("This is hello world text \r\n");
//
//         writer.close();
        /*     FileReader reader=new FileReader("d:/helloworld/hello.txt");
         int i=0;
         while ((i=reader.read())!=-1){
         System.out.print((char)i);
            
         }
         reader.close();*/
        BufferedReader reader = new BufferedReader (new FileReader("d:/helloworld/hello.txt"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
   }catch(IOException ioe){           System.out.println(ioe.getMessage());
  }
}
}
