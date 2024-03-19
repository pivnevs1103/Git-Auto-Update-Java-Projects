package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadCVS {
    public static void main(String[] args) throws FileNotFoundException {
        // This method will read date from CVS file

        List<String[]> data = new ArrayList<>();
        String file = "C:\\Users\\worko\\Documents\\BecomingJuniorSoftwareDev\\Files\\accounts.CVS";
        String dataRow;
        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Read the data as long as it's not empty
            while((dataRow = br.readLine()) != null){
                // Parse data by commas
                String[] line = dataRow.split(",");
                // Add the data to collection
                data.add(line);
            }
            br.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        for(String[] account : data){
            System.out.print("[ ");
            for(String field : account){
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}

