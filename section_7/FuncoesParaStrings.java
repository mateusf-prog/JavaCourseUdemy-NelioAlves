// Funções para strings
// Mateus 23/03/2023

public class FuncoesParaStrings {
    public static void main(String[] args) {
        String original = "  abcde FGHIJ ABC abc DEFG       ";

        // convertendo toda a string 'original' para letras minúsculas
        String s01 = original.toLowerCase();  
        System.out.println("-" + s01 + "-");

        // convertendo toda a string 'original' para letras maiúsculas
        String s02 = original.toUpperCase();
        System.out.println("-" + s02 + "-");

        // eliminando os espaços em branco no começo e final
        String s03 = original.trim();
        System.out.println("-" + s03 + "-");

        // gera uma nova String a partir do índice 7
        String s04 = original.substring(7);
        System.out.println("-" + s04 + "-");

        // gera uma string do índice 5 até o 9 somente
        String s05 = original.substring(5, 9);
        System.out.println("-" + s05 + "-");

        // sempre que achar a letra 'a' ele troca por 'X'
        String s06 = original.replace('a', 'X');
        System.out.println("-" + s06 + "-");

        // sempre que achar um 'abc' ele troca por 'XY'
        String s07 = original.replace("abc", "XY");
        System.out.println("-" + s07 + "-");

        // mostra a primeira ocorrencia dos caracteres 'bc'
        int i = original.indexOf("bc");
        System.out.printf("Primeira ocorrência do 'bc': %d%n", i);

        // mostra a ultima ocorrencia dos caracteres 'bc'
        int j = original.lastIndexOf("bc");
        System.out.printf("Ultima ocorrência do 'bc': %d%n", j);
    }
}