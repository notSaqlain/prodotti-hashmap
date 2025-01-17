public class Main {
    public static void main(String[] args) {
        // Create some product instances
        Prodotto prodotto1 = new Prodotto("12345", "Descrizione del prodotto 1", 10, 5.99);
        Prodotto prodotto2 = new Prodotto("67890", "Descrizione del prodotto 2", 5, 3.49);

        // Create a shopping list (Spesa) instance
        Spesa spesa = new Spesa();

        // Add products to the shopping list
        spesa.aggiungiProdotto(prodotto1);
        spesa.aggiungiProdotto(prodotto2);

        // Print the shopping list
        spesa.stampaListaProdotti();

        // Remove a product from the shopping list
        spesa.rimuoviProdotto("12345");

        // Print the shopping list again
        System.out.println("After removing a product:");
        spesa.stampaListaProdotti();
    }
}