// Estudo Switch case Java
// Mateus 20/03/2023

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String dia;

        /* Testando casos, se algum case "casar" com a variável o
        código correspondente é executado */
        switch (x)
        {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta" ;
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
        }
        
        System.out.println("Dia da semana: " + dia);
        input.close();
    }
}