package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
     public static void main(String[] args) {

        String path = "c:\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
        }
        
     }
}
