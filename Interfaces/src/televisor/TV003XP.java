package televisor;

public class TV003XP extends Televisor implements ControleRemoto, Modem {
    private boolean plasma;

    public TV003XP(int codigo, int tamanho, int canal, int volume, boolean estado, boolean plasma) {
        super(codigo, tamanho, canal, volume, estado);
        this.plasma = plasma;
    }

    public boolean isPlasma() {
        return plasma;
    }

    public void setPlasma(boolean plasma) {
        this.plasma = plasma;
    }

    @Override
    public void aumentarVolumeADistancia() {
        if(this.getVolume()<50) {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void diminuirVolumeADistancia() {
        if(this.getVolume()>0) {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarTelevisaoADistancia() {
        if(!this.isEstado()) {
            this.setEstado(true);
        }
    }

    @Override
    public void desligarTelevisaoADistancia() {
        if(this.isEstado()) {
            this.setEstado(false);
        }
    }

    @Override
    public String toString() {
        String mostra;
        if(this.plasma) {
            mostra = " Plasma: ligado";
        }else{
            mostra = " Plasma: desligado";
        }
        return(super.toString()+mostra+"[ TV 03]");
    }

    @Override
    public String conectarInternet() {
        return("Estamos conectados à Internet");
    }
}
