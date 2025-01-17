public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("12345", "Descrizione del prodotto 1", 10, 5.99);
        Prodotto prodotto2 = new Prodotto("67890", "Descrizione del prodotto 2", 5, 3.49);

        Spesa spesa = new Spesa();

        spesa.aggiungiProdotto(prodotto1);
        spesa.aggiungiProdotto(prodotto2);

        spesa.stampaListaProdotti();

        spesa.rimuoviProdotto("12345");

        System.out.println("Dopo aver rimosso il prodotto:");
        spesa.stampaListaProdotti();

        System.out.println("Totale: $" + spesa.calcolaTotale());
    }

    public void menu() {
        System.out.println("1. Aggiungi prodotto");
        System.out.println("2. Rimuovi prodotto");
        System.out.println("3. Stampa lista prodotti");
        System.out.println("4. Calcola totale");
        System.out.println("5. Esci");
    }
}