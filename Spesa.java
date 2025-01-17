import java.util.HashMap;

public class Spesa {
    private HashMap<String, Prodotto> listaProdotti;

    // Constructor
    public Spesa() {
        this.listaProdotti = new HashMap<>();
    }

    // Method to add a product to the shopping list
    public void aggiungiProdotto(Prodotto prodotto) {
        listaProdotti.put(prodotto.getCodiceABarre(), prodotto);
    }

    // Method to remove a product from the shopping list
    public void rimuoviProdotto(String codiceABarre) {
        listaProdotti.remove(codiceABarre);
    }

    // Method to get a product from the shopping list
    public Prodotto getProdotto(String codiceABarre) {
        return listaProdotti.get(codiceABarre);
    }

    // Method to print all products in the shopping list
    public void stampaListaProdotti() {
        for (Prodotto prodotto : listaProdotti.values()) {
            System.out.println("Codice a Barre: " + prodotto.getCodiceABarre());
            System.out.println("Descrizione: " + prodotto.getDescrizione());
            System.out.println("Quantita: " + prodotto.getQuantita());
            System.out.println("Costo: " + prodotto.getCosto());
            System.out.println();
        }
    }
}