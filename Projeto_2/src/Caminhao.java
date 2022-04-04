public class Caminhao extends Automovel
{
    private double suportado;

    public Caminhao() {
        this.suportado = 0;
    }

    public Caminhao(double suportado, String nome, String fabricante, double potencia) {
        super(nome, fabricante, potencia);
        this.suportado = suportado;
    }

    public double getSuportado() {
        return suportado;
    }

    public void setSuportado(double suportado) {
        this.suportado = suportado;
    }
}