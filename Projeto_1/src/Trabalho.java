import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args)
    {
        String nome,CPF,telefone,end;
        char s;
        boolean impostoDeRenda;
        Scanner entrada = new Scanner(System.in);
        ArrayList <PessoaFisica> listaPessoa = new ArrayList<>();
        int opc=0,idade,n;
        while(opc != 7)
        {
            opc = menu(entrada);
            switch(opc)
            {
                case 1:
                    PessoaFisica uma = new PessoaFisica();

                    CPF=uma.testarCPF("", entrada);
//                    CPF = entrada.next();
                    uma.setCPF(CPF);
                    nome=uma.testarNome("", entrada);
                    uma.setNome(nome);
                    System.out.println("Digite o endereco:");
                    end = entrada.nextLine();
                    uma.setEndereco(end);
                    s = uma.testarSexo('N', entrada);
                    uma.setSexo(s);
                    telefone = uma.testarTelefone(" ", entrada);
                    uma.setTelefone(telefone);
                    idade = uma.testarIdade(0, entrada);
                    uma.setIdade(idade);
                    impostoDeRenda = uma.testarRenda(false, entrada);
                    uma.setImpostoDeRenda(impostoDeRenda);
                    listaPessoa.add(uma);
                    break;

                case 2:
                    if(listaPessoa.isEmpty())
                    {
                        System.out.println("\n Não há elementos");
                    }else{
                        for(int i=0; i<listaPessoa.size();i++)
                        {
                            PessoaFisica mostra = listaPessoa.get(i);
                            System.out.println("CPF: "+mostra.getCPF());
                            System.out.println("Nome:"+mostra.getNome());
                            System.out.println("Endereco:"+mostra.getEndereco());
                            System.out.println("Sexo:"+mostra.getSexo());
                            System.out.println("Telefone:"+mostra.getTelefone());
                            System.out.println("Idade: "+mostra.getIdade());
                            System.out.println("Imposto de Renda:"+ mostra.getImpostoDeRenda());
                        }
                    }
                    break;

                case 3:
                    if(listaPessoa.isEmpty()== false)
                    { boolean t=false;
                        for(int i=0; i<listaPessoa.size();i++)
                        {
                            PessoaFisica mostra = listaPessoa.get(i);
                            if(mostra.getImpostoDeRenda()==true)
                            {
                                System.out.println("CPF: "+mostra.getCPF());
                                System.out.println("Nome:"+mostra.getNome());
                                System.out.println("Endereco:"+mostra.getEndereco());
                                System.out.println("Sexo:"+mostra.getSexo());
                                System.out.println("Telefone:"+mostra.getTelefone());
                                System.out.println("Idade: "+mostra.getIdade());
                                System.out.println("Imposto de Renda:"+ mostra.getImpostoDeRenda());
                                t=true;
                            }
                        }
                        if(t==false)
                        {
                            System.out.println("Ninguem paga imposto de renda");
                        }
                    }
                    break;

                case 4:
                    do
                    {
                        System.out.println("Digite a posicao a ser removida: ");
                        n = entrada.nextInt();
                    }while(n<0 || n>=listaPessoa.size());
                    listaPessoa.remove(n);
                    break;
                case 5:
                    listaPessoa.clear();
                    System.out.println("TUDO LIMPO ;( ");
                    break;
                case 6:
                    PessoaFisica uma1 = new PessoaFisica();
                    CPF=uma1.testarCPF("", entrada);
                    uma1.setCPF(CPF);
                    nome=uma1.testarNome("", entrada);
                    uma1.setNome(nome);
                    System.out.println("Digite o endereco:");

                    end = entrada.nextLine();
                    uma1.setEndereco(end);
                    s = uma1.testarSexo('N', entrada);
                    uma1.setSexo(s);
                    telefone = uma1.testarTelefone(" ", entrada);
                    uma1.setTelefone(telefone);
                    idade = uma1.testarIdade(0, entrada);
                    uma1.setIdade(idade);
                    impostoDeRenda = uma1.testarRenda(false, entrada);
                    uma1.setImpostoDeRenda(impostoDeRenda);
                    do
                    {
                        System.out.println("Digite a posicao para adicionar:");
                        n = entrada.nextInt();
                    }while(n<0);
                    listaPessoa.add(n, uma1);
                    break;
            }
        }
    }

    public static int menu(Scanner entrada)
    {
        int opcao;
        System.out.println("\n --- MENU PESSOA FISICA--- ");
        System.out.println(" 1- Inserir");
        System.out.println(" 2- Mostrar");
        System.out.println(" 3- Verificar quem paga imposto de renda");
        System.out.println(" 4- Remoção em uma posição específica");
        System.out.println(" 5- Remover todos");
        System.out.println(" 6- Inserir em posicao especifica");
        System.out.println(" 7- Sair -> ");
        opcao = entrada.nextInt();
        return(opcao);
    }
}