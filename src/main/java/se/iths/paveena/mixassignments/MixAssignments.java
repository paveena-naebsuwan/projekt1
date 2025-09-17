package se.iths.paveena.mixassignments;

public class MixAssignments {
    public static void main(String[] args) {
        // 1. Hitta maxvärde i en int-array
        int[] numbers = {56, 12, 9, 105, 24};
        int maxNum = findMax(numbers);
        System.out.println("Det största talet i arrayen är: " + maxNum);

        // 2. Jämför två double-värden
        double maxDouble = biggestDouble(59.90, 98.50);
        System.out.println("\nDet största double-värdet av: " + maxDouble);

        // 3. Skriv ut förnamn och efternamn
        printName("Lisa", "Manobal");
    }

    //1.1 Metoden tar emot arrayen som parameter, loopar igenom varje element,
    //jämför med det nuvarande värdet, sedan returnera det största värdet
    public static int findMax(int[] arr) {
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

    //2.1 Metoden tar emot värden och returnerar det största värdet med hjälp av en Math.max
    public static double biggestDouble(double num1, double num2) {
        return Math.max(num1, num2);
    }

    //3.1 Metoden tar emot två strängar och skriver ut för -efternamn med ett mellanslag
    public static void printName(String firstName, String lastName) {
        System.out.println("\nFavorite singer: " + firstName + " " + lastName);
    }
}