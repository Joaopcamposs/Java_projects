package televisor;

public abstract class Televisor {
    private int codigo;
    private int tamanho;
    private int canal;
    private int volume;
    private boolean estado;

    public Televisor(int codigo, int tamanho, int canal, int volume, boolean estado) {
        this.codigo = codigo;
        this.tamanho = tamanho;
        this.canal = canal;
        this.volume = volume;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String todosAtributos;
        todosAtributos = "Código: "+this.codigo+" Tamanho: "+this.tamanho+" Canal: "+this.canal+" Volume: "+this.volume;
        if(this.isEstado()) {
            todosAtributos = todosAtributos+" Estado: ligado";
        }else{
            todosAtributos = todosAtributos+" Estado: desligado";
        }
        return(todosAtributos);
    }
}
