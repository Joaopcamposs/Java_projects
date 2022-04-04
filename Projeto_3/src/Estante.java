public class Estante extends Movel
{
    private double altura;
    private int compartimentos;

    public Estante(double altura, int compartimentos, String codigo, String material, double peso)
    {
        super(codigo, material, peso);
        this.altura = altura;
        this.compartimentos = compartimentos;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public int getCompartimentos()
    {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos)
    {
        this.compartimentos = compartimentos;
    }

    @Override
    public String toString()
    {
        return "Estante{" +"Codigo="+ getCodigo()+", material="+getMaterial()+", peso="+getPeso()+", altura=" + altura + ", compartimentos=" + compartimentos + '}';
    }
}
