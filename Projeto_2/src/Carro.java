public class Carro extends Automovel
{
    private boolean completo;

    public Carro() {
        this.completo = false;
    }

    public Carro(boolean completo, String nome, String fabricante, double potencia) {
        super(nome, fabricante, potencia);
        this.completo = completo;
    }

    public boolean getCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }
}
