public class ExercicioVariaveis {
    public static void main(String[] args) {
        int inteiro = 10;
        long longo = 100000000L;
        float flutuante = 3.14f;
        double duplo = 4.16759265359;
        char caractere = 'D';
        boolean booleano = true;
        byte bytes = 127;
        short curto = 32000;

        System.out.println("Valor da variável inteiro " + inteiro);
        System.out.println("Valor da variável longo " + longo);
        System.out.println("Valor da variável flutuante" + flutuante);
        System.out.println("Valor da variável duplo " + duplo);
        System.out.println("Valor da variável caractere " + caractere);
        System.out.println("Valor da variável booleano: " + booleano);
        System.out.println("Valor da variável bytes " + bytes);
        System.out.println("Valor da variável curto" + curto);

        // Utilizando caracteres especiais
        System.out.println("String com caractere de nova linha:\nTexto em nova linha");
        System.out.println("String com caractere de tabulação:\tTexto com tabulação");
        System.out.println("String com aspas duplas:\"Texto entre aspas\"");
        System.out.println("String com barra invertida:\\Texto com barra invertida");
    }
}