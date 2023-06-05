package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
    public static void main(String args[]) {

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};

        // path of file
        String path = "C:\\Users\\mateu\\OneDrive\\Área de Trabalho\\out.txt";

        // create block try-with-resources and writting the datas in the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {  
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
