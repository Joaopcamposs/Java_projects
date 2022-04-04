package animais;

import java.util.ArrayList;

public abstract class Animal
{
    private int codigo;
    private float peso;
    private boolean estado;
    private boolean caça;

    public Animal()
    {
        this.codigo = 0;
        this.peso = 0;
        this.estado = false;
        this.estado = false;
    }

    public Animal(int codigo, float peso, boolean estado, boolean caça)
    {
        this.codigo = codigo;
        this.peso = peso;
        this.estado = estado;
        this.caça = caça;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isCaça() {
        return caça;
    }

    public void setCaça(boolean caça) {
        this.caça = caça;
    }

    //metodo alimentar
    public void alimentar(int codigo)
    {
        System.out.print("\n\nAlimentando... Pronto animal de barriguinha cheia.");
    }

    //metodo verificar estado
    public Boolean VerificarEstado(int code, ArrayList<Animal> listaAnimais)
    {
        Animal aux = new Animal() {};

        for(int i=0;i<listaAnimais.size();i++)
        {
            if(listaAnimais.get(i).getCodigo() == code)
            {
                aux = listaAnimais.get(i);
            }
        }
        return aux.estado;
    }

    //metodo trocar estado
    public void TrocarEstado(int code, ArrayList<Animal> listaAnimais)
    {
        boolean est = false;

        for(int i=0;i<listaAnimais.size();i++)
        {
            if(listaAnimais.get(i).getCodigo() == code) //achando animal
            {
                Animal animal = listaAnimais.get(i);
                if(animal instanceof Mamiferos) //comparando se e mamifero
                {
                    est = listaAnimais.get(i).isEstado();
                    listaAnimais.get(i).setEstado(!est);
                    if(est == false && listaAnimais.get(i).isCaça() == true)
                    {
                        boolean caça2 = false;
                        listaAnimais.get(i).setCaça(caça2);
                    }

                    Mamiferos animal2 = (Mamiferos) listaAnimais.get(i);  //convertendo
                    if(animal2.isHibernado() == true)
                    {
                        boolean hib = false;
                        animal2.setHibernado(hib);
                    }

                    listaAnimais.remove(i);
                    listaAnimais.add(i,animal2);
                }
                else
                {
                    est = listaAnimais.get(i).isEstado();
                    listaAnimais.get(i).setEstado(!est);

                    if(est == false && listaAnimais.get(i).isCaça() == true)
                    {
                        boolean caça2 = false;
                        listaAnimais.get(i).setCaça(caça2);
                    }
                }
            }
        }
    }

    //verificar caça
    public boolean VerificarCaça(int code, ArrayList<Animal> listaAnimais)
    {
        Animal aux = new Animal() {};

        for(int i=0;i<listaAnimais.size();i++)
        {
            if(listaAnimais.get(i).getCodigo() == code)
            {
                aux = listaAnimais.get(i);
            }
        }
        return aux.caça;
    }
}