package nl.degraaf.springbootlessons;

public class Main {

    public static void main(String[] args) {

        int n = 5;

        //for loop voor herhalingen. wordt vaak gebruikt als je weet hoeveel loops je hebt
        // int i =1 (begin) i <= n (eind) i++ (wat te doen, dus plus 1 telkens)
        for (int i = 1; i <= n; i++){
            System.out.println("Hallo!");
        }

        //while loop is een criterium. wordt vaak gebruikt  niet zeker weet hoeveel loops er zijn en een maximun opstelt.
        // i ( is aantal keer herhalen) i <= n (wanneer het einde) i++ de opdracht uitvoeren
        int i = 3;
        while (i <= n) {
            System.out.println("Doeg!");
            i++;
        }

        //do while als je achteraf wilt checken of het nog een keer gedaan moet worden
        i = 2;
        do {
            System.out.println("Goedemorgen!");
            i += 1;
        } while (i <= n);

        //if statement (true or false), als een waarde iets is dan bepaalde actie uitvoeren
        int getal = 56;
        if (getal < 10) {
            System.out.println("Kleiner dan 10");
        } else {
            if (getal < 20) {
                System.out.println("Kleiner dan 10, maar kleiner dan 20.");
            } else {
                System.out.println("Groter dan 20");
            }
        }

        //if statements( true or false) met tekst

        String naam = "Ramona";
        String geslacht = "o";

        if (geslacht.equals("m")) {
            System.out.println("Beste meneer " + naam);
        } else {
            System.out.println("Beste mevrouw " + naam);
        }

        //switch case(meerkeuze) statement hier hoef je bij text geen .equals te doen omdat hij altijg vergelijkt met het statement.
        switch (geslacht) {
            case "m":
                System.out.println("Beste meneer " + naam);
                break;
            case "v":
                System.out.println("Beste mevrouw " + naam);
                break;
            default:
                System.out.println("Beste " + naam);
                break;

        }
    }
}
