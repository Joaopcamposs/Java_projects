import java.util.ArrayList;
import qualquer.Qualquer;
import televisor.FilhadaTV03;
import televisor.Modem;
import televisor.TV002XP;
import televisor.TV003XP;
import televisor.Televisor;

public class Main
{
    public static void main(String[] args)
    {
        TV003XP  tv3 = new TV003XP(123,50,3,10,true,true);
        TV002XP  tv2 = new TV002XP(854,40,8,25,true,false);
        Qualquer qualquer = new Qualquer(2);
        FilhadaTV03 filhaDaTV03 = new FilhadaTV03(123,50,3,10,true,true,9);

        filhaDaTV03.diminuirVolumeADistancia();

        ArrayList listaTudo = new ArrayList<>();
        listaTudo.add(tv3);
        listaTudo.add(qualquer);
        listaTudo.add(tv2);

        for(int i=0; i<listaTudo.size();i++)
        {
            if(listaTudo.get(i) instanceof Modem) {
                //Polimorfismo usando Interface...
                System.out.print("\n"+(listaTudo.get(i)).toString());
            }

            if(listaTudo.get(i) instanceof Televisor) {
                //Polimorfismo usando Classes...
                System.out.print("\n"+(listaTudo.get(i)).toString());
            }
        }
    }
}
