package Files;

import java.io.*;
import java.nio.file.Files;

public class Write {
    public static void main(String[] args){
         // 1. Define the path we want to write
        // File is not there so java will create one for us
        String fileName = "C:\\Users\\worko\\Documents\\BecomingJuniorSoftwareDev\\Files\\FileToWrite.txt";
        String message = "I am writing data that will be placed to a file";

        // 2. Create the file in Java
        File file = new File(fileName);

        try{
       // 3. Open the file
        FileWriter fw = new FileWriter(file);

        // 4. Write to the file
        fw.write(message);

        // 5. Close the resources
        fw.close();

        // 6. Now we open the file again and read from it
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String text = br.readLine();
        System.out.println(text);

        } catch(IOException e) {
            System.out.println("Error: Could not read file " + fileName);
            e.printStackTrace();
        }finally{
            System.out.println("Closing the fileWriter");
        }
    }
}
