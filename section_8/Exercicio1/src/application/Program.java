// Exercício 1 do capítulo
// Mateus 26/03/2023

package section_8.Exercicio1.src.application;

import java.util.Locale;
import java.util.Scanner;
import section_8.Exercicio1.src.entitites.Employee;

public class Program {
    public static void main(String[] args) {

        // Setando a localidade e criando objeto scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // isntanciando a classe Employee
        Employee employe = new Employee();

        // recebendo os dados de entrada
        System.out.print("Digite seu nome: ");
        employe.name = sc.next();
        System.out.print("Digite seu salário bruto: ");
        employe.grossSalary = sc.nextDouble();
        System.out.print("Digite o imposto: ");
        employe.tax = sc.nextDouble();

        // imprimindo os dados do objeto
        System.out.println();
        System.out.println("Employe: " + employe);
        System.out.println();

        // incrementando a porcentagem 
        System.out.println("Wich to percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employe.increaseSalary(percentage);

        // atualizando os dados e imprimindo
        System.out.println();
        System.out.println("Update data: " + employe);

        sc.close();
    }
}
