public class Beispiel {

    public static void beispiel(int x) {

        while (x < 10) { // Knoten 2
            x++;
        }

        switch (x) { // Knoten 3

            case 10: // Knoten 4
                System.out.println("A");
                break;

            case 11: // Knoten 5
                System.out.println("B");
                break;

            default: // Knoten 6
                System.out.println("C");
                break;
        }
    }
}
