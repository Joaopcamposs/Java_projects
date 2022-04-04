public class Cama extends Movel
{
    private String tamanho;
    private double suportado;

    public Cama(String tamanho, double suportado, String codigo, String material, double peso)
    {
        super(codigo, material, peso);
        this.tamanho = tamanho;
        this.suportado = suportado;
    }

    public String getTamanho()
    {
        return tamanho;
    }

    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }

    public double getSuportado()
    {
        return suportado;
    }

    public void setSuportado(double suportado)
    {
        this.suportado = suportado;
    }

    @Override
    public String toString()
    {
        return "Cama{" +"Codigo="+ getCodigo()+", material="+getMaterial()+", peso="+getPeso()+", tamanho=" + tamanho + ", suportado=" + suportado + '}';
    }
}