package televisor;

public class FilhadaTV03 extends TV003XP {
    private int atributoDafilhaDa3;

    public FilhadaTV03(int codigo, int tamanho, int canal, int volume, boolean estado, boolean plasma, int atributoDafilhaDa3)
    {
        super(codigo, tamanho, canal, volume, estado, plasma);
        this.atributoDafilhaDa3 = atributoDafilhaDa3;
    }
    public int getAtributoDafilhaDa3()
    {
        return atributoDafilhaDa3;
    }
    public void setAtributoDafilhaDa3(int atributoDafilhaDa3)
    {
        this.atributoDafilhaDa3 = atributoDafilhaDa3;
    }
}
