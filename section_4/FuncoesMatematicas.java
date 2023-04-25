// Aula - Funções matemáticas
// Mateus 13/03/2023

public class FuncoesMatematicas {
    public static void main(String[] args) {
           double x = 3.0;
           double y = 4.0;
           double z = -5.0;
           double A, B, C;
           
           A = Math.sqrt(x);        // A recebe raiz quadrada de x(3.0)
           B = Math.sqrt(y);        // B recebe raiz quadrada de y(4.0)
           C = Math.sqrt(25.0);  // C recebe raiz quadrada de 25.0
           System.out.println("Raiz quadrada de " + x + " = " + A);
           System.out.println("Raiz quadrada de " + y + " = " + B);
           System.out.println("Raiz quadrada de 25 = " + C);

           A = Math.pow(x, y);           // A recebe potenciação de x elevado a y
           B = Math.pow(x, 2.0);       // B recebe potenciação de x elevado a 2.0
           C = Math.pow(5.0, 2.0);  // C recebe potenciação de 5.0 elevado a 2.0
           System.out.println(x + " elevado a " + y + " = " + A);
           System.out.println(x + " elevado ao quadrado = " + B);
           System.out.println("5 elevado ao quadrado = " + C);

           A = Math.abs(y);    // A recebe valor absoluto de y
           B = Math.abs(z);    // B recebe valor absoluto de z
           System.out.println("Valor absoluto de " + y + " = " + A);
           System.out.println("Valor absoluto de " + z + " =" + B);
    } 
}
