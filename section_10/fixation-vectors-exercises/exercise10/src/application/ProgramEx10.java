package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Peoples1;

public class ProgramEx10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char gender;
        int countM=0, countF=0, res;
        double averageHeightF=0.0, greaterHeight = 0.0, lowerHeight=0.0, height;

        System.out.print("How many people will be entered? ");
        res = sc.nextInt();

        Peoples1[] vect = new Peoples1[res];

        // creating and storing people in the vector
        for (int i=0; i<res; i++) {
            System.out.println("Height and gender(M/F) of the person: ");
            gender = sc.next().charAt(0);
            height = sc.nextDouble();
            Peoples1 person = new Peoples1(gender, height);
            vect[i] = person;
        }
        
        // greater height and less 
        for (int i=0; i<res; i++) {
            if (vect[i].getHeight() > greaterHeight) {
                greaterHeight = vect[i].getHeight();
            }
        }

        // lower height
        lowerHeight = vect[0].getHeight();
        for (int i=1; i<res; i++) {
            if (vect[i].getHeight() < lowerHeight) {
                lowerHeight = vect[i].getHeight();
            }
        }

        // height average women
        for (int i=0; i<res; i++) {
            if (vect[i].getGender() == 'F') {
                countF += 1;
                averageHeightF += vect[i].getHeight();
            } else {
                countM += 1;
            }
        }

        // average women height 
        averageHeightF = averageHeightF / countF;

        System.out.printf("Lower height: %.2f%n", lowerHeight);
        System.out.printf("Greater height: %.2f%n", greaterHeight);
        System.out.printf("Average height of women: %.2f%n", averageHeightF);
        System.out.printf("number of men: %d%n", countM);

        sc.close();
    }
}
