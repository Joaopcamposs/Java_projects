import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo
{
    public static void main(String[] args)
    {
        String caminho, texto;
        String mensagemDeErro = "Uai";
        caminho = "c://Leitura.txt";
        Scanner entrada = new Scanner(System.in);

        try {
            FileInputStream fis = new FileInputStream(caminho);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String s;
            do {
                s = br.readLine();
                if(s != null)
                {
                    System.out.println(s);
                }
            } while (s != null);
            br.close();
        }catch(IOException e) {
            System.out.print("\n Erro ao abrir o arquivo.");
            mensagemDeErro = "Eita, falhou para abrir!";
        }
        JOptionPane.showMessageDialog(null,mensagemDeErro);
        try {
            caminho = "c://Escrita1.txt";
            File file = new File(caminho);
            if(!file.exists())
            {
                System.out.println("Não há arquivo criado.");
                if(file.createNewFile())
                {
                    System.out.println("O arquivo foi criado");
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    System.out.print("\n Digite algo 01: ");
                    texto = entrada.nextLine();
                    bw.write(texto);
                    bw.newLine();
                    bw.close();
                    fw.close();
                }else{
                    System.out.println("O arquivo não foi criado.");
                }
            }else {
                System.out.println("Arquivo já existente");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                System.out.print("\n Acrescente no arquivo: ");
                texto = entrada.nextLine();
                bw.write(texto);
                bw.newLine();
                bw.close();
                fw.close();
            }
        } catch (IOException e) {
            System.out.print("Erro: "+e.toString());
        }
        //Outra forma de escrita.
        try {
            caminho = "c://Escrita2.txt";
            PrintStream ps = new PrintStream(caminho);
            System.out.print("\n Digite algo 02: ");
            texto = entrada.nextLine();
            ps.println(texto);
            ps.close();
        } catch (FileNotFoundException e) {
            System.out.print("Erro: "+e.toString());
        }
        entrada.close();
        System.out.print("Fim.");
    }
}