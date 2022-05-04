package televisor;

public class TV002XP extends Televisor implements ControleRemoto {
    private boolean RFID;

    public TV002XP(int codigo, int tamanho, int canal, int volume, boolean estado, boolean RFID) {
        super(codigo, tamanho, canal, volume, estado);
        this.RFID = RFID;
    }

    public boolean isRFID() {
        return RFID;
    }

    public void setRFID(boolean RFID) {
        this.RFID = RFID;
    }

    @Override
    public void aumentarVolumeADistancia() {
        if(this.getVolume()<100)
        {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void diminuirVolumeADistancia() {
        if(this.getVolume()>0)
        {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarTelevisaoADistancia() {
        if(!this.isEstado())
        {
            this.setEstado(true);
        }
    }

    @Override
    public void desligarTelevisaoADistancia() {
        if(this.isEstado())
        {
            this.setEstado(false);
        }
    }

    @Override
    public String toString() {
        String mostra;
        if(this.RFID)
        {
            mostra = " RFID: ligado";
        }else{
            mostra = " RFID: desligado";
        }
        return(super.toString()+mostra+"[ TV 02]");
    }
}
