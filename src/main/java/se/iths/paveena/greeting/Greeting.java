package se.iths.paveena.greeting;

public class Greeting {
    public static void main(String[] args) {

        // 1. Skapar en String-array med de angivna värdena
        String[] words = {"Hello", "World", "!"};

        //3. Anropar metoden för att skriva ut array
        printArray(words);
    }

    // 2. Metod som tar emot en String-array och skriver ut den
    public static void printArray(String[] arr) {
        System.out.println("Prints the array contents:\n");
        //Används for-each loop för att gå igenom varje element i array
        for (String word : arr) {
            System.out.println(word);
        }
    }
}