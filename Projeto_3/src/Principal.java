import java.util.ArrayList;
import java.util.Scanner;

public class Principal
{

    public static void main(String[] args)
    {
        Scanner l = new Scanner(System.in);
        ArrayList <Movel> mov = new ArrayList<>();
        int opc;

        do
        {
            opc = menu(l);
            switch (opc)
            {
                case 1:
                    opc = submenu(l);
                    String codigo,material;
                    double peso;

                    System.out.println("Codigo:");
                    codigo = l.next();
                    System.out.println("Material:");
                    material = l.next();
                    System.out.println("Peso:");
                    do {peso = l.nextDouble();} while(peso<0);
                    switch (opc)
                    {
                        case 1:
                            int pernas;
                            boolean encosto;
                            System.out.println("Pernas(+3 pernas):");
                            do{pernas = l.nextInt();}while(pernas <3);
                            System.out.println("Encosto(true ou false):");
                            encosto = l.nextBoolean();
                            mov.add(new Cadeira(pernas,encosto, codigo,material, peso));
                            break;
                        case 2:
                            String tamanho;
                            double suportado;
                            System.out.println("Tamanho(solteiro, casado,king):");
                            do{tamanho = l.next();}while(!"Solteiro".equals(tamanho)&&!"casado".equals(tamanho)&& !"king".equals(tamanho));
                            System.out.println("Peso Suportado:");
                            do{suportado = l.nextDouble();}while(suportado<0);
                            mov.add(new Cama(tamanho,suportado, codigo,material, peso));
                            break;
                        case 3:
                            double altura;
                            int compartimentos;
                            System.out.println("Altura:");
                            do{altura = l.nextDouble();}while(altura<0);
                            System.out.println("Compartimentos:");
                            do {compartimentos = l.nextInt();}while(compartimentos<1);
                            mov.add(new Estante(altura,compartimentos, codigo,material, peso));
                            break;
                    }
                    break;

                case 2:
                    opc = submenu(l);
                    if(opc ==1)
                    {
                        for(Movel m: mov)
                        {
                            if(m instanceof Cadeira)
                            {
                                System.out.println(m.toString());
                            }
                        }
                    }
                    if(opc == 2)
                    {
                        for(Movel m: mov)
                        {
                            if(m instanceof Cama)
                            {
                                System.out.println(m.toString());
                            }
                        }
                    }
                    if(opc ==3)
                    {
                        for(Movel m: mov)
                        {
                            if(m instanceof Estante)
                            {
                                System.out.println(m.toString());
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite um codigo:");
                    String cod = l.next();
                    for(Movel m: mov)
                    {
                        if(m.getCodigo().equals(cod))
                        {
                            mov.remove(m);
                        }
                    }
                    break;

                case 4:
                    mov.clear();
                    System.out.println("Limpo :)");
                    break;

                case 5:
                    int qt=0;
                    Movel sel = null;
                    for(Movel m: mov)
                    {
                        if(m instanceof Estante)
                        {
                            Estante est = (Estante) m;
                            if(qt < est.getCompartimentos())
                            {
                                sel = m;
                                qt = est.getCompartimentos();
                            }
                        }
                    }
                    if(sel != null){System.out.println(sel.toString());}
                    break;

                case 6:
                    int q=0;

                    for(Movel m: mov)
                    {
                        if(m instanceof Cama)
                        {
                            Cama cam = (Cama)m;

                            if("king".equals(cam.getTamanho()))
                            {
                                q ++;
                            }
                        }
                    }
                    System.out.println("Camas King: "+q);
                    break;

                case 7:
                    for(Movel m: mov)
                    {
                        if(m instanceof Cadeira)
                        {
                            Cadeira cad = (Cadeira) m;
                            if(cad.getEncosto())
                            {
                                System.out.println(m.toString());
                            }
                        }
                    }
                    break;
            }
        } while (opc != 8);
    }

    public static int menu(Scanner l)
    {
        int opc = 0;
        do
        {
            System.out.println("1- Inserir quantos o usuário quiser ");
            System.out.println("2- Mostrar quantos o usuário quiser");
            System.out.println("3- Remover um elemento");
            System.out.println("4- Limpar o ArrayList");
            System.out.println("5- Verificar qual é a estante com maior número de compartimentos");
            System.out.println("6- Verificar quantas camas King estão disponíveis no estoque");
            System.out.println("7- Mostrar os dados das cadeiras com encosto");
            System.out.println("8- Sair ");
            opc = l.nextInt();
        } while (opc < 0 || opc > 8);
        return opc;
    }

    public static int submenu(Scanner l)
    {
        int opc = 0;
        do
        {
            System.out.println("1- Cadeira ");
            System.out.println("2- Cama");
            System.out.println("3- Estante");
            opc = l.nextInt();
        } while (opc < 0 || opc > 3);
        return opc;
    }
}