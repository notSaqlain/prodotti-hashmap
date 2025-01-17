public class Prodotto {
    private String codiceABarre;
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
    public String getCodiceABarre() {
        return codiceABarre;
    }

    // Setter for codiceABarre
    public boolean setCodiceABarre(String codiceABarre) {
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
        if (descrizione.length() >= 12) {
            this.descrizione = descrizione;
        }
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        if (quantita > 0) {
            this.quantita = quantita;
        }
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if (costo > 0) {
            this.costo = costo;
        }
    }
}
