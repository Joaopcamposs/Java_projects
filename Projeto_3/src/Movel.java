public abstract class Movel
{
    private String codigo;
    private String material;
    private double peso;

    public Movel(String codigo, String material, double peso)
    {
        this.codigo = codigo;
        this.material = material;
        this.peso = peso;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    @Override
    public String toString()
    {
        return "Movel{" + "codigo=" + codigo + ", material=" + material + ", peso=" + peso + '}';
    }
}
