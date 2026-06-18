package my.sttpk2023;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNameWithoutFlush {
    public static void main(String[] args) {
        String firstName = "Zhamri";
        String lastName = "Che Ani";
        String fileName = "names.txt";

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("First Name: " + firstName);
            writer.newLine();
            writer.write("Last Name: " + lastName);
//            writer.flush(); // Ensure all data is written to the file
            System.out.println("Names written to file: " + fileName);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    // Simulating a potential issue by commenting out the close method
//                     writer.close();
                } catch (Exception e) {
                    System.err.println("An error occurred while closing the writer: " + e.getMessage());
                }
            }
        }
    }
}

