// Aula - Entrada de dados
// Mateus 13/03/2023
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Criando um objeto scanner para entrada de dados pelo teclado
        Scanner sc = new Scanner(System.in);

        // Declarando as variáveis e recebendo as entradas de dados
        char u;
        String x;
        int y;
        Double n;
        u = sc.next().charAt(0); 
        x = sc.next(); 
        y = sc.nextInt();
        n = sc.nextDouble();

        // Imprime os dados das variáveis
        System.out.println("Dados digitados: ");
        System.out.println(u);
        System.out.println(x);
        System.out.println(y);
        System.out.println(n);

        // Desalocando recursos usados pelo Scanner
        sc.close();
    }
}
