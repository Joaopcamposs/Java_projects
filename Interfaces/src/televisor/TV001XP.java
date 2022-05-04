package televisor;

public class TV001XP extends Televisor {
    private boolean bluetooth;

    public TV001XP(int codigo, int tamanho, int canal, int volume, boolean estado, boolean bluetooth) {
        super(codigo, tamanho, canal, volume, estado);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        String denteAzul;
        if(this.bluetooth)
        {
            denteAzul = " Estado bluetooth: ligado";
        }else{
            denteAzul = " Estado bluetooth: desligado";
        }
        return(super.toString()+denteAzul+"[ TV 01]");
    }
}
