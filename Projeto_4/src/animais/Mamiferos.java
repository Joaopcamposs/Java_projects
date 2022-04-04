package animais;

import java.util.ArrayList;

public class Mamiferos extends Animal
{
    private boolean hibernado;

    public Mamiferos()
    {
        super();
        this.hibernado = false;
    }

    public Mamiferos(int codigo, float peso, boolean estado, boolean caça, boolean hibernado)
    {
        super(codigo, peso, estado, caça);
        this.hibernado = hibernado;
    }

    public boolean isHibernado() {
        return hibernado;
    }

    public void setHibernado(boolean hibernado) {
        this.hibernado = hibernado;
    }

    @Override
    public void alimentar(int codigo)
    {
        System.out.print("\n\nTomando leite... Pronto, barriga cheia e azia a caminho.");
    }

    @Override
    public String toString()
    {
        String auxEst, auxCaça, auxHib;
        if(isEstado() == true)
            auxEst = "Acordado";
        else
            auxEst = "Dormindo";
        if(isCaça() == true)
            auxCaça = "Caçando";
        else
            auxCaça = "Descansando";
        if(isHibernado() == true)
            auxHib = "Hibernando";
        else
            auxHib = "Vida normal";

        return ("\n\nCodigo: "+this.getCodigo()+"\nPeso: "+this.getPeso()+"\nEstado: "+auxEst+"\nCaça: "+auxCaça+"\nHibernado: "+auxHib+"");
    }

    //verificar hibernado
    public boolean VerificarHibernado(int code, ArrayList<Animal> listaAnimais)
    {
        Mamiferos aux2 = new Mamiferos();

        for(int i=0;i<listaAnimais.size();i++)
        {
            if(listaAnimais.get(i).getCodigo() == code)
            {
                aux2 = (Mamiferos) listaAnimais.get(i);
            }
        }
        return aux2.hibernado;
    }
}