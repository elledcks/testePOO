public class ExercicioVariaveis {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis de tipos primitivos
        
        // Tipos numéricos inteiros
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 1000000000L; // Utiliza L para indicar que é um literal long
        
        // Tipos numéricos de ponto flutuante
        float floatVar = 3.14f; // Utiliza f para indicar que é um literal float
        double doubleVar = 3.14159265359;
        
        // Tipo char
        char charVar = 'A'; // Caractere simples
        
        // Tipo booleano
        boolean booleanVar = true;
        
        // Impressão dos valores das variáveis
        System.out.println("Valor da variável byteVar: " + byteVar);
        System.out.println("Valor da variável shortVar: " + shortVar);
        System.out.println("Valor da variável intVar: " + intVar);
        System.out.println("Valor da variável longVar: " + longVar);
        System.out.println("Valor da variável floatVar: " + floatVar);
        System.out.println("Valor da variável doubleVar: " + doubleVar);
        System.out.println("Valor da variável charVar: " + charVar);
        System.out.println("Valor da variável booleanVar: " + booleanVar);
        
        // Utilização de caracteres especiais em strings
        String specialString = "Esta é uma string com caracteres especiais: ç, á, é, í, ó, ú, ã, õ, â, ê, î, ô, û.";
        System.out.println(specialString);
    }
}
