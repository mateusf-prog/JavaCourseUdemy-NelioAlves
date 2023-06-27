package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("João");

        // lista do tipo "um tipo ou qualquer supertipo" de Number
        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(23);

        // erro de compilação
       // Number x = myNums.get(0);
    }
}
