package application;

import java.io.File;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // received the folder path
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        // instantiates the folder path
        File path = new File(strPath);

        // list and print the folders in the path
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // list and print the files in the path
        File[] files = path.listFiles(File::isFile);
        System.out.println("FOLDERS:");
        for (File file : files) {
            System.out.println(file);
        }

        // create a sub-dir in the path especified
        boolean success = new File(strPath + "\\test").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
