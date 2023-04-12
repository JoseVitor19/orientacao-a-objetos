package Aula2;

public class Exemplo1 {
    public static void main(String[] args) {
        // Manipulação de Strings
        String nome = "Jose";
        String nome1 = new String("jose");

        char[] temp = {'J', 'o', 's', 'e'};
        String nome2 = new String(temp);

        // Comparação de Strings
        System.out.println(nome+" "+nome1);
        //Comparando memória
        System.out.println("Igual: " + (nome==nome1));
        //Compara e difere Maiúsculo e Minúsculo
        System.out.println("Igual: " + (nome.equals(nome1)));
        //Compara ignorando Maiúsculo e Minúsculo
        System.out.println("Igual: " + (nome.equalsIgnoreCase(nome1)));

        //CompareTo
        String a = "Aac !", b = "Abc !";
        System.out.println("a compareTo b: "+a.compareTo(b));
        //valor < 0 - 1ª String é menor que a 2ª
        //valor > 0 - 1ª String é maior que a 2ª
        //valor = 0 - as duas Strings são iguais

        //Concatenar
        String nova = a+" - "+b;
        String nova1 = a.concat(" = ");

        //Dividir - Separação
        String frase = "Hoje eh terca-feira";
        String[] vetor = frase.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);

        //Tamanho da String
        int qtd = frase.length();
        System.out.println(qtd);

        //CharAt
        //Verificar se uma letra/caracter existe em uma posição
        System.out.println(frase.charAt(0));
        boolean r = (frase.charAt(0)+"").equals("H");
        System.out.println(r);

        //SubString
        //Retorna um pedaço da string
        System.out.println(frase.substring(4));
        System.out.println(frase.substring(0,4));

        //Maiúsculo
        System.out.println(frase.toUpperCase());
        //Minúsculo
        System.out.println(frase.toLowerCase());

        //Replace
        //Substituir
        System.out.println(frase.replace("e", "i"));
        System.out.println(frase.replace("terca", "quarta"));

        //IndexOf
        //Retorna o indíce da primeira ocorrência
        System.out.println(frase.indexOf("e"));
        //Retorna o indíce da última ocorrência
        System.out.println(frase.lastIndexOf("feira"));
        //Retorna a primeira ocorrência apartir de um indice
        System.out.println(frase.indexOf("e", 3));
    }
}
