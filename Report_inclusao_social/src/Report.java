import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Report implements Serializable {

    private Long codigo;
    private String endereco;
    private String missWhat;
    private LocalDate criacao;
    private Cidade cidade;

    public Report() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMissWhat() {
        return missWhat;
    }

    public void setMissWhat(String missWhat) {
        this.missWhat = missWhat;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }

    public String getCriacaoFormatado() {
        return criacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.getCodigo());
        hash = 71 * hash + Objects.hashCode(this.getCidade());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Report other = (Report) obj;
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + getCodigo() + ", nome=" + getEndereco()+ ", salario=" + getMissWhat()+ ", nascimento=" + getCriacaoFormatado() + ", cidade=" + getCidade() + '}';
    }
}
