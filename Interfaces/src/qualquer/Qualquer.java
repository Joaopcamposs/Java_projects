package qualquer;

import televisor.Modem;

public class Qualquer implements Modem
{
    private int nada;
    public Qualquer(int nada) {
        this.nada = nada;
    }

    public int getNada() {
        return nada;
    }

    public void setNada(int nada) {
        this.nada = nada;
    }

    @Override
    public String conectarInternet() {
        return("Qualaquer um se conecta.");
    }

    @Override
    public String toString() {
        return("Qualquer? "+this.nada);
    }
}
