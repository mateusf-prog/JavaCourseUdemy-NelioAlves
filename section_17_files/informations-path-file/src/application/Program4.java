package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String argd[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // get informations of the path file with get methods
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getName());

        sc.close();        
    }
}
