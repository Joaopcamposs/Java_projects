package animais;

public class Repteis extends Animal
{
    private float tempCorpo;

    public Repteis()
    {
        super();
        tempCorpo = 0;
    }

    public Repteis(int codigo, float peso, boolean estado, boolean caça, float tempCorpo)
    {
        super(codigo, peso, estado, caça);
        this.tempCorpo = tempCorpo;
    }

    public float getTempCorpo() {
        return tempCorpo;
    }

    public void setTempCorpo(float tempCorpo) {
        this.tempCorpo = tempCorpo;
    }

    //metodo se defender
    public String Defender()
    {
        String def = "\n\nDefendendo-se";
        return def;
    }

    @Override
    public String toString()
    {
        String auxEst, auxCaça;
        if(isEstado() == true)
            auxEst = "Acordado";
        else
            auxEst = "Dormindo";
        if(isCaça() == true)
            auxCaça = "Caçando";
        else
            auxCaça = "Descansando";

        return ("\n\nCodigo: "+this.getCodigo()+"\nPeso: "+this.getPeso()+"\nEstado: "+auxEst+"\nCaça: "+auxCaça+"\nTemperatura do corpo: "+this.getTempCorpo()+"");
    }
}