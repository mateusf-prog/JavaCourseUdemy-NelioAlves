package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    // qualquer tipo que extends Number > qualquer tipo que seja uma superclasse de Number
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> lsit) {
        for (Object obj : lsit) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}

/*
Resumindo:

? extends Number: permite que a lista seja de qualquer tipo que seja uma subclasse de Number. Apenas operações de leitura são permitidas.
? super Number: permite que a lista seja de qualquer tipo que seja uma superclasse de Number. Operações de leitura e escrita são permitidas. 

*/
