import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas
{
    public static void main(String[] args)
    {
        // Evite usar Date (deprecated).
        Date data = new Date();
        System.out.print(" Data agora: "+data);

        // Momento atual.
        Calendar c = Calendar.getInstance();
        System.out.print("\n Data agora: "+c.getTime());
        System.out.print("\n Ano: "+c.get(Calendar.YEAR));
        System.out.print(" - Mês: "+(c.get(Calendar.MONTH)+1));
        System.out.print(" - Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));

        //Adicionando informações no Calendar.
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);
        System.out.print("\n\n Data/Hora inseridos: "+c.getTime());
        System.out.print("\n Ano: "+c.get(Calendar.YEAR));
        System.out.print(" - Mês: "+((c.get(Calendar.MONTH))+1));
        System.out.print(" - Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.print(" - Dia da semana: "+(c.get(Calendar.DAY_OF_WEEK)));

        // Teste simples.
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minuto = c.get(Calendar.MINUTE);
        int segundo =c.get(Calendar.SECOND);
        System.out.print("\n\n Agora-> Horas: "+hora+" - Minutos: "+minuto+" - Segundos: "+segundo);
        if((hora>=6) && (hora<12))
        {
            System.out.print("\n Bom Dia");
        }else if((hora>=12) && (hora<18)){
            System.out.print("\n Boa Tarde");
        }else if(hora>=18){
            System.out.print("\n Boa Noite");
        }

        // Também podemos inserir vários dados.
        //c.set(ano,mês,dia,hora,minuto,segundo).

        //c.set(1985,0,23,10,15,03);
        //System.out.print("\n\n Nascimento 01: "+c.getTime());
        c.set(1985,Calendar.MARCH,23,18,15,03);
        System.out.print("\n Nascimento 02: "+c.getTime());
        System.out.print("\n\n Dia da semana: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.print("\n Dia do ano: "+c.get(Calendar.DAY_OF_YEAR));
        System.out.print("\n Dia do mês: "+c.get(Calendar.MONTH));
        System.out.print("\n Ano: "+c.get(Calendar.YEAR));
        System.out.print("\n Hora: "+c.get(Calendar.HOUR));
        System.out.print("\n Hora do dia: "+c.get(Calendar.HOUR_OF_DAY));
        System.out.print("\n Segundo: "+c.get(Calendar.SECOND));

        //Comparação entre Calendars.
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        System.out.print("\n\n Comparação: "+a.compareTo(b));
        System.out.print("\n Comparação: "+a.compareTo(c));
        System.out.print("\n Comparação: "+c.compareTo(a));

        //Aumento ou decremento.
        a.set(2016,Calendar.FEBRUARY,27,10,10,10);
        System.out.print("\n\n A:"+a.getTime());

        a.add(Calendar.DAY_OF_MONTH,3);
        a.add(Calendar.MONTH,1);
        a.add(Calendar.YEAR,3);
        System.out.print("\n A:"+a.getTime());

        a.add(Calendar.DAY_OF_MONTH,-5);
        a.add(Calendar.MONTH,-5);
        a.add(Calendar.YEAR,-4);
        System.out.print("\n A:"+a.getTime());

        a.set(2018,Calendar.SEPTEMBER,10,10,10,10);
        System.out.print("\n Data A:"+a.getTime());
        a.add(Calendar.MONTH, -11);
        System.out.print("\n Data A após decremento:"+a.getTime());

        //Formato das datas.
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.print("\n\n Curto: "+df.format(a.getTime()));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.print("\n Médio: "+df.format(a.getTime()));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.print("\n Longo: "+df.format(a.getTime()));

        df = DateFormat.getDateInstance(DateFormat.FULL,new Locale("pt","br"));
        System.out.print("\n Brasil: "+df.format(a.getTime()));

        df = DateFormat.getDateInstance(DateFormat.FULL,new Locale("usa"));
        System.out.print("\n Estados Unidos: "+df.format(a.getTime()));

        SimpleDateFormat sdf1= new SimpleDateFormat("dd-MM-yyyy"); //você pode usar outras máscaras
        System.out.println("\n Formato data: "+sdf1.format(a.getTime()));
    }
}