package Files;

import java.io.*;

public class PhoneNumberApp {
    public static void main(String[] args) {
        // This will read a text file and will retrieve phone number
        // Valid phone number:
        // 10 digits long
        // Area code cannot start in 0 or 9
        // There can be 911 in the phone

        String fileName = "C:\\Users\\worko\\Documents\\BecomingJuniorSoftwareDev\\Files\\PhoneNumber.txt";
        File file = new File(fileName);
        String[] phoneNums = new String[9];
        String phoneNum = null;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNums.length; i++) {
                phoneNums[i] = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + fileName);
        } catch (IOException d) {
            System.out.println("ERROR: File can not be read " + fileName);
        }

        // Valid phone number:
        // 10 digits long
        // Area code cannot start in 0 or 9
        // There can be 911 in the phone
        for (int i = 0; i < phoneNums.length; i++) {
            phoneNum = phoneNums[i];
            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if (phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
                    throw new AreaCodeException(phoneNum);
                }
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, n + 1).equals("9")) {
                        if (phoneNum.substring(n + 1, n + 3).equals("11")) {
                            throw new EmergencyException(phoneNum);
                        }
                    }
                }
                System.out.print("Your entry at " + i + " was Successful: ");
                System.out.println(phoneNum);
            } catch (TenDigitsException e) {
                System.out.println("ERROR: Phone number is not 10 digits");
                System.out.println(e.ToString());
            } catch (AreaCodeException e) {
                System.out.println("Error: Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("Error: Invalid 911 sequence found");
                System.out.println(e.toString());
            }
        }
    }
}

class TenDigitsException extends Exception{
    private String num;
    TenDigitsException(String num){
        this.num = num;
    }
    public String ToString(){
        return ("TenDigitsException : " + num);
    }
}

class AreaCodeException extends Exception{
    private String num;
    AreaCodeException(String num){
        this.num = num;
    }
    public String ToString(){
        return ("AreaCodeException : " + num);
    }
}

class EmergencyException extends Exception{
    private String num;
    EmergencyException(String num){
        this.num = num;
    }
    public String ToString(){
        return ("EmergencyException : " + num);
    }
}