public class Automovel {
    private String nome, fabricante;
    private double potencia;

    public Automovel() {
        this.nome = "";
        this.fabricante = "";
        this.potencia = 0;
    }

    public Automovel(String nome, String fabricante, double potencia) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}