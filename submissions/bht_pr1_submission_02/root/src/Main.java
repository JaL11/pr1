/**
 * Main class of the Java program.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("<h3>bht_pr1_submission_02</h3>");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // name und alter sammeln + grussen
        System.out.println("Wie heisst du?");
        String name = scanner.nextLine();
        System.out.println("Hallo, " + name + "!");
        System.out.println("Wie alt bist du, " + name + "?");

        // alter vom nutzter bekommen
        int age = scanner.nextInt();
        // wird benoetigt um "/n" vom alter string korrekt zu verarbeiten
        scanner.nextLine();

        //logik um sport ratschlag auszugeben laut diagramm

        // alter zwischen 0 und 15
        if (age > 0 && age <= 15){

            System.out.println("Frag deine Eltern");


        // alter zwischen 16 und 25
        } else if (age >= 16 && age <= 25){

            System.out.println("Liebst du Aufregung?");
            String aufregung = scanner.nextLine();


            if (aufregung.equals("ja")){

                System.out.println("Machst du gerne Sport in einer Gruppe?");
                String gruppe = scanner.nextLine();


                if (gruppe.equals("ja")){
                    System.out.println("Handball");

                } else if (gruppe.equals("nein")){
                    System.out.println("Fallschirmspringen");

                } else {
                    //keine valide eingabe
                    System.out.println("Bitte geben sie \"ja\" oder \"nein\" ein. ");
                }


            } else if (aufregung.equals("nein")){

                System.out.println("Hast du viel Zeit?");
                String zeit = scanner.nextLine();


                if (zeit.equals("ja")){
                    System.out.println("Golf");

                } else if (zeit.equals("nein")) {
                    System.out.println("Joggen");

                } else {
                    //keine valide eingabe
                    System.out.println("Bitte geben sie \"ja\" oder \"nein\" ein. ");
                }

            } else {
                //keine valide eingabe
                System.out.println("Bitte geben sie \"ja\" oder \"nein\" ein. ");
            }
        // alter zwischen 26 und 40
        } else if (age >= 26 && age <= 40){

            System.out.println("Liebst du die Natur?");
            String natur = scanner.nextLine();

            if (natur.equals("ja")){
                System.out.println("Wandern");

            } else if (natur.equals("nein")){
                System.out.println("Yoga");

            } else {
                //keine valide eingabe
                System.out.println("Bitte geben sie \"ja\" oder \"nein\" ein. ");
            }

        // alter ueber 41
        } else if (age >= 41){
            System.out.println("Spreche bitte mit deinem Artzt");
        }

        // clean up
        scanner.close();
    }
}

