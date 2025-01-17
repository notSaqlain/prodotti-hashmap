import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spesa spesa = new Spesa();
        Scanner scanner = new Scanner(System.in);
        int scelta;
        do {
            menu();
            System.out.print("Scelta: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Input non valido. Scelta: ");
                scanner.next();
            }
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Codice a barre: ");
                    String codiceABarre = scanner.nextLine();
                    while (codiceABarre.trim().isEmpty()) {
                        System.out.print("Input non può essere vuoto. Codice a barre: ");
                        codiceABarre = scanner.nextLine();
                    }

                    System.out.print("Descrizione: ");
                    String descrizione = scanner.nextLine();
                    while (descrizione.trim().isEmpty()) {
                        System.out.print("Input non può essere vuoto. Descrizione: ");
                        descrizione = scanner.nextLine();
                    }

                    System.out.print("Quantita: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Input non valido. Quantita: ");
                        scanner.next();
                    }
                    int quantita = scanner.nextInt();

                    System.out.print("Costo: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Input non valido. Costo: ");
                        scanner.next();
                    }
                    double costo = scanner.nextDouble();

                    Prodotto prodotto = new Prodotto(codiceABarre, descrizione, quantita, costo);
                    spesa.aggiungiProdotto(prodotto);
                    break;

                case 2:
                    System.out.print("Codice a barre: ");
                    String codice = scanner.nextLine();
                    while (codice.trim().isEmpty()) {
                        System.out.print("Input non può essere vuoto. Codice a barre: ");
                        codice = scanner.nextLine();
                    }
                    spesa.rimuoviProdotto(codice);
                    break;

                case 3:
                    spesa.stampaListaProdotti();
                    break;

                case 4:
                    System.out.println("Totale: $" + spesa.calcolaTotale());
                    break;

                case 5:
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 5);

        scanner.close();
    }

    public static void menu() {
        System.out.println("1. Aggiungi prodotto");
        System.out.println("2. Rimuovi prodotto");
        System.out.println("3. Stampa lista prodotti");
        System.out.println("4. Calcola totale");
        System.out.println("5. Esci");
    }
}