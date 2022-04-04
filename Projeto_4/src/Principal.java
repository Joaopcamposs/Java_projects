import animais.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int opc=1;
        int opc2=0;
        int codigo;
        float peso, tempCorpo, tamBico;
        boolean estado, caça, hibernado;
        estado = caça = hibernado = false;

        ArrayList<Animal> listaAnimais = new ArrayList<>();

        while(opc!=0)
        {
            opc = menu();

            switch(opc)
            {
                case 1://inserir
                    opc2 = subMenu();
                    System.out.print("\nDigite o codigo do animal: ");
                    codigo = entrada.nextInt();

                    System.out.print("\nDigite o peso do animal: ");
                    peso = entrada.nextFloat();

                    System.out.print("\nEstado do animal (0-Dormindo ou 1-Acordado): ");
                    int auxEstado = entrada.nextInt();
                    if(auxEstado == 1)
                        estado = true;
                    if(auxEstado == 0)
                        estado = false;

                    System.out.print("\nO animal esta caçando?(0-Nao ou 1-Sim): ");
                    int auxCaça = entrada.nextInt();

                    if(estado == false)  //validando
                    {
                        System.out.print("\nO animal esta dormindo e nao pode estar caçando!");
                        caça = false;
                    }

                    else
                    {
                        if(auxCaça == 1)
                            caça = true;
                        if(auxCaça == 0)
                            caça = false;
                    }

                    if(opc2 == 1)
                    {
                        System.out.print("\nTemperatura do corpo: ");
                        tempCorpo = entrada.nextFloat();

                        listaAnimais.add(new Repteis(codigo, peso, estado, caça, tempCorpo));
                        System.out.print("\nAdicionado com sucesso!");
                    }
                    if(opc2 == 2)
                    {
                        System.out.print("\nO animal esta hibernado?(0-Nao ou 1-Sim): ");
                        int auxHib = entrada.nextInt();

                        if(estado == true || caça == true)  //validando
                        {
                            System.out.print("\n\nO animal não pode estar hibernado!");
                            hibernado = false;
                        }

                        else
                        {
                            if(auxHib == 1)
                                hibernado = true;
                            if(auxHib == 0)
                                hibernado = false;
                        }

                        listaAnimais.add(new Mamiferos(codigo, peso, estado, caça, hibernado));
                        System.out.print("\nAdicionado com sucesso!");
                    }

                    if(opc2 == 3)
                    {
                        System.out.print("\nDigite o tamanho do bico: ");
                        tamBico = entrada.nextFloat();

                        listaAnimais.add(new Aves(codigo, peso, estado, caça, tamBico));
                        System.out.print("\nAdicionado com sucesso!");
                    }
                    break;

                case 2:  //mostrar
                    opc2 = subMenu();

                    if(opc2 == 1)
                    {
                        for(int i=0;i<listaAnimais.size();i++)
                        {
                            Animal animal;
                            animal = listaAnimais.get(i);
                            if(animal instanceof Repteis)
                            {
                                //Transforma um "Animal" em "Repteis"
                                Repteis mostraRep;
                                mostraRep = (Repteis) animal;
                                System.out.print("Mostrando Repteis: "+mostraRep.toString());
                            }
                        }
                    }
                    if(opc2 == 2)
                    {
                        for(int i=0;i<listaAnimais.size();i++)
                        {
                            Animal animal;
                            animal = listaAnimais.get(i);
                            if(animal instanceof Mamiferos)
                            {
                                Mamiferos mostraMam;
                                mostraMam = (Mamiferos) animal;
                                System.out.print("Mostrando Mamiferos: "+mostraMam.toString());
                            }
                        }
                    }
                    if(opc2 == 3)
                    {
                        for(int i=0;i<listaAnimais.size();i++)
                        {
                            Animal animal;
                            animal = listaAnimais.get(i);
                            if(animal instanceof Aves)
                            {
                                Aves mostraAves;
                                mostraAves = (Aves) animal;
                                System.out.print("Mostrando Aves: "+mostraAves.toString());
                            }
                        }
                    }
                    break;

                case 3:  //alimentar
                    System.out.print("\nDigite o codigo do animal que deseja alimentar: ");
                    int cod = entrada.nextInt();
                    System.out.print("\nTipo de animal é mamifero?(1-SIM ou 2-NÃO): ");
                    int opc3 = entrada.nextInt();

                    if(opc3 == 1)
                    {
                        Mamiferos mamiferos = new Mamiferos() {};
                        mamiferos.alimentar(cod);
                    }
                    else
                    {
                        Animal animal = new Animal() {};
                        animal.alimentar(cod);
                    }
                    break;

                case 4: //remover algum
                    System.out.print("\nDigite o codigo do animal que deseja remover: ");
                    int code = entrada.nextInt();
                    Animal rem = new Animal() {};
                    boolean aviso = false;   //flag aviso
                    for(int i=0;i<listaAnimais.size();i++)
                    {
                        if(listaAnimais.get(i).getCodigo() == code)
                        {
                            rem = listaAnimais.get(i);
                            aviso = true;
                        }
                    }
                    listaAnimais.remove(rem);
                    if(aviso == true)
                        System.out.print("\n\nRemovido com sucesso!");
                    break;

                case 5:  //remover tudo
                    listaAnimais.removeAll(listaAnimais);
                    if(listaAnimais.isEmpty())
                        System.out.print("\n\nRemover tudo concluido com sucesso!");
                    break;

                case 6://verificar hibernado
                    System.out.print("\nDigite o codigo do animal que deseja verificar se esta hibernado: ");
                    code = entrada.nextInt();

                    Mamiferos aux2 = new Mamiferos() {};

                    boolean est = false;
                    est = aux2.VerificarHibernado(code, listaAnimais);

                    if(est)
                        System.out.print("\n\nO animal está HIBERNADO.");
                    if(!est)
                        System.out.print("\n\nO animal NÃO ESTÁ HIBERNADO.");
                    break;

                case 7://veridicar caçando
                    System.out.print("\nDigite o codigo do animal que deseja verificar se esta cacando: ");
                    code = entrada.nextInt();

                    Animal animal = new Animal() {};
                    est = false;
                    est = animal.VerificarCaça(code, listaAnimais);

                    if(est)
                        System.out.print("\n\nO animal esta CAÇANDO.");
                    if(!est)
                        System.out.print("\n\nO animal NÃO ESTÁ CAÇANDO");

                    break;

                case 8://verificar estado do animal, dormindo ou acordado - Animal
                    System.out.print("\nDigite o codigo do animal que deseja verificar se esta dormindo: ");
                    code = entrada.nextInt();

                    animal = new Animal() {};
                    est = animal.VerificarEstado(code, listaAnimais);
                    if(est)
                    {
                        System.out.print("\n\nO animal esta Acordado. Deseja mudar seu estado?(0-Nao ou 1-Sim): ");
                        int novoEst = entrada.nextInt();
                        if(novoEst == 1)
                        {
                            animal = new Animal() {};
                            animal.TrocarEstado(code, listaAnimais);
                        }
                    }
                    if(!est)
                    {
                        System.out.print("\n\nO animal esta Dormindo. Deseja mudar seu estado?(0-Nao ou 1-Sim): ");
                        int novoEst = entrada.nextInt();
                        if(novoEst == 1)
                        {
                            animal = new Animal() {};
                            animal.TrocarEstado(code, listaAnimais);
                        }
                    }
                    break;
            }
        }
    }

    public static int menu()
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\n======MENU======");
        System.out.print("\n0 - Sair");
        System.out.print("\n1 - Inserir");
        System.out.print("\n2 - Mostrar");
        System.out.print("\n3 - Alimentar");
        System.out.print("\n4 - Remover um animal");
        System.out.print("\n5 - Remover todos os animais");
        System.out.print("\n6 - Verificar se um animal esta hibernando");
        System.out.print("\n7 - Verificar se um animal esta caçando");
        System.out.print("\n8 - Verificar se um animal esta dormindo");
        System.out.print("\nSua opcao: ");

        int opc = entrada.nextInt();

        return opc;
    }

    public static int subMenu()
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\n======SUB-MENU======");
        System.out.print("\n1 - Repteis");
        System.out.print("\n2 - Mamiferos");
        System.out.print("\n3 - Aves");
        System.out.print("\nSua opcao: ");

        int opc2 = entrada.nextInt();

        return opc2;
    }
}