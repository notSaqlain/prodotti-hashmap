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

        System.out.println("Totale: " + spesa.calcolaTotale());
    }
}