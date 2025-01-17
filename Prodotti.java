public class Prodotto {
    private String coodiceABarre; // Fixed typo: 'coodice' to 'codice'
    private String descrizione;
    private int quantita;
    private double costo;

    // Constructor
    public Prodotto(String codiceABarre, String descrizione, int quantita, double costo) {
        this.codiceABarre = codiceABarre;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.costo = costo;
    }

    // Getter for codiceABarre
    public String getCodiceABarre() { // Fixed typo: 'coodice' to 'codice'
        return codiceABarre;
    }

    // Setter for codiceABarre
    public boolean setCodiceABarre(String codiceABarre) { // Fixed typo: 'coodice' to 'codice'
        if (codiceABarre.length() >= 5) {
            this.codiceABarre = codiceABarre;
            return true;
        }
        return false;
    }

    // Getter for descrizione
    public String getDescrizione() {
        return descrizione;
    }

    // Setter for descrizione
    public void setDescrizione(String descrizione) {
        if (descrizione.length() >= 12) { // Ensure descrizione is at least 12 characters long
            this.descrizione = descrizione;
        }
    }

    // Getter for quantita
    public int getQuantita() {
        return quantita;
    }

    // Setter for quantita
    public void setQuantita(int quantita) {
        if (quantita > 0) { // Ensure quantita is strictly positive
            this.quantita = quantita;
        }
    }

    // Getter for costo
    public double getCosto() {
        return costo;
    }

    // Setter for costo
    public void setCosto(double costo) { // Fixed method name: setcosto to setCosto
        if (costo > 0) { // Ensure costo is strictly positive
            this.costo = costo;
        }
    }
}
