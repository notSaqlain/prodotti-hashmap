import java.util.HashMap;

public class Spesa {
    private HashMap<String, Prodotto> listaProdotti;

    
    public Spesa() {
        this.listaProdotti = new HashMap<>();
    }
    
    public void aggiungiProdotto(Prodotto prodotto) {
        listaProdotti.put(prodotto.getCodiceABarre(), prodotto);
    }

    
    public void rimuoviProdotto(String codiceABarre) {
        listaProdotti.remove(codiceABarre);
    }

    
    public Prodotto getProdotto(String codiceABarre) {
        return listaProdotti.get(codiceABarre);
    }

    public int calcolaTotale() {
        int totale = 0;
        for (Prodotto prodotto : listaProdotti.values()) {
            totale += prodotto.getCosto() * prodotto.getQuantita();
        }
        return totale;
    }

    
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