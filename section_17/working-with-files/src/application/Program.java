package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // create a object File with the path to file
        File file = new File("d:\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);     // create a object Scanner para for read to the file
            while (sc.hasNextLine()) {  // read the file, line to line
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc!= null) {
                sc.close();
            }
        }

        
    }
}