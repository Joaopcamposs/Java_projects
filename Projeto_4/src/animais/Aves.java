package animais;

public class Aves extends Animal
{
    private float tamBico;

    public Aves()
    {
        super();
        tamBico = 0;
    }

    public Aves(int codigo, float peso, boolean estado, boolean caça, float tamBico)
    {
        super(codigo, peso, estado, caça);
        this.tamBico = tamBico;
    }

    public float getTamBico() {
        return tamBico;
    }

    public void setTamBico(float tamBico) {
        this.tamBico = tamBico;
    }

    //metodo voar
    public String Voar(int codigo)
    {
        String voar = "\n\nVoando...";
        return voar;
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

        return ("\n\nCodigo: "+this.getCodigo()+"\nPeso: "+this.getPeso()+"\nEstado: "+auxEst+"\nCaça: "+auxCaça+"\nTamanho do bico: "+this.getTamBico()+"");
    }
}