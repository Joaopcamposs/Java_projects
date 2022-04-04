public class Onibus extends Automovel {
    private int lugares;
    private boolean banheiro;

    public Onibus() {
        this.lugares = 0;
        this.banheiro = false;
    }

    public Onibus(int lugares, boolean banheiro, String nome, String fabricante, double potencia) {
        super(nome, fabricante, potencia);
        this.lugares = lugares;
        this.banheiro = banheiro;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public boolean getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
}
