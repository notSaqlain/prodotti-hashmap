

public class Main {
    public static void main(String[] args) {
        Spesa spesa = new Spesa();
        int scelta;
        do {
            menu();
            scelta = InputOutputUtility.leggiNumero("Scelta: ");
            switch (scelta) {
                case 1:
                    String codiceABarre = InputOutputUtility.leggiStringaNonVuota("Codice a barre: ");
                    String descrizione = InputOutputUtility.leggiStringaNonVuota("Descrizione: ");
                    int quantita = InputOutputUtility.leggiNumero("Quantita: ");
                    double costo = InputOutputUtility.leggiNumero("Costo: ");
                    Prodotto prodotto = new Prodotto(codiceABarre, descrizione, quantita, costo);
                    spesa.aggiungiProdotto(prodotto);
                    break;
                case 2:
                    String codice = InputOutputUtility.leggiStringaNonVuota("Codice a barre: ");
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
        
    }

    public static void menu() {
        System.out.println("1. Aggiungi prodotto");
        System.out.println("2. Rimuovi prodotto");
        System.out.println("3. Stampa lista prodotti");
        System.out.println("4. Calcola totale");
        System.out.println("5. Esci");
    }
}