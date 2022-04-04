import java.util.Scanner;

public class PessoaFisica
{
    private String CPF;
    private String nome;
    private String endereco;
    private char sexo;
    private String telefone;
    private int idade;
    private boolean impostoDeRenda;

    public PessoaFisica()
    {
        this.CPF = "0";
        this.nome = "NULO";
        this.endereco ="NULO";
        this.sexo = 'N';
        this.telefone = "NULO";
        this.idade = 0;
        this.impostoDeRenda = false;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getImpostoDeRenda() {
        return impostoDeRenda;
    }

    public void setImpostoDeRenda(boolean impostoDeRenda) {
        this.impostoDeRenda = impostoDeRenda;
    }

    public String testarCPF(String CPF,Scanner entrada)
    {
//        int a=0,c=0,b=0,d=0,e=0;
//        do
//        {
            System.out.println("Digite um CPF: ");
            CPF = entrada.next();
//            if(CPF.length()==11)
//            {
//                a = (int)CPF.charAt(0)-48;
//                b = (int)CPF.charAt(1)-48;
//                c = (int)CPF.charAt(2)-48;
//                d = (int)CPF.charAt(3)-48;
//                e = (int)CPF.charAt(10)-48;
//            }
//
//        }while((CPF.length()!=11) || (a%2==0) || (b+c!=d) || (e%2!=0) || nume(CPF)==false);
        return CPF;
    }

    public boolean nume(String CPF)
    {
        int n;
        for(int i=0; i<11;i++)
        {
            n = CPF.charAt(i);
            if(n<48 || n>57)
            {
                return(false);
            }
        }
        return(true);
    }

    public char testarSexo(char sexo,Scanner entrada)
    {
        do
        {
            System.out.println("Digite o sexo (M ou F): ");
            sexo = entrada.next().charAt(0);
        }while(sexo != ('M') && sexo != ('F') && sexo != ('m') && sexo != ('f'));

        return sexo;
    }

    public String testarNome(String nome,Scanner entrada)
    {
        entrada.nextLine();
        do
        {
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();
        }while(nom(nome)==false);
        return nome;
    }

    public boolean nom(String nome)
    {
        int n;
        for(int i=0; i<nome.length();i++)
        {
            n = nome.charAt(i);
            if((n<65 || n>122) && n!= 32 )
            {
                return(false);
            }
        }
        return(true);
    }

    public int testarIdade(int idade,Scanner entrada)
    {
        do
        {
            System.out.println("Idade: ");
            idade = entrada.nextInt();
        }while(idade<0);
        return idade;
    }

    public String testarTelefone(String telefone,Scanner entrada)
    {
        long tel,ddd;
        System.out.println("DDD :");
        ddd = entrada.nextLong();
        System.out.println("Telefone:");
        tel = entrada.nextLong();
        telefone = "+55("+ddd+")"+tel;
        return telefone;
    }

    public boolean testarRenda(boolean impostoDeRenda,Scanner entrada)
    {
        int n=0;
        String nov;
        do
        {
            System.out.println("Tem imposto de renda (S ou N): ");
            nov =entrada.next();
            if("S".equals(nov) ||"s".equals(nov))
            {
                impostoDeRenda=true;
                n=1;
            }
            else
            {
                if("N".equals(nov)|| "n".equals(nov))
                {
                    impostoDeRenda=false;
                    n=1;
                }
            }
        }while(n==0);
        return impostoDeRenda;
    }
}