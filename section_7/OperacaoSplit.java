// Operação Split
// Mateus 23/03/2023

public class OperacaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";
        
        // Usando a função split para dividir uma string em substrings com base 
        // no separador " "
        String[] vect = s.split(" ");

        // imprime o conteúdo dos vetores
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        
        String word1 = vect[0]; // variavel word1 recebeu vect[0]
        String word2 = vect[1]; // variavel word2 recebeu vect[1]
        String word3 = vect[2]; // variavel word3 recebeu vect[2]

        // imprime o conteudo das variáveis
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}