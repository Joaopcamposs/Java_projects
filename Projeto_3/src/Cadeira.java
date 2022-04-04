public class Cadeira extends Movel
{
    private int pernas;
    private boolean encosto;

    public Cadeira(int pernas, boolean encosto, String codigo, String material, double peso)
    {
        super(codigo, material, peso);
        this.pernas = pernas;
        this.encosto = encosto;
    }

    public int getPernas()
    {
        return pernas;
    }

    public void setPernas(int pernas)
    {
        this.pernas = pernas;
    }

    public boolean getEncosto()
    {
        return encosto;
    }

    public void setEncosto(boolean encosto)
    {
        this.encosto = encosto;
    }

    @Override
    public String toString()
    {
        return "Cadeira{" +"Codigo="+ getCodigo()+", material="+getMaterial()+", peso="+getPeso()+", pernas=" + pernas + ", encosto=" + encosto + '}';
    }
}