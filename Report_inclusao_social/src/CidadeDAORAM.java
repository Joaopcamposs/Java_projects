import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CidadeDAORAM {

    private List<Cidade> cidades = new ArrayList<>();
    
    private long contador = 1;

    public CidadeDAORAM() {
        List<Cidade> temp = this.criaCidades();
        for (Cidade c : temp) {
            this.salvar(c);
        }
    }

    private List<Cidade> criaCidades() {
        List<Cidade> temp = new ArrayList<>();

        Cidade cidade1 = new Cidade();
        cidade1.setUf("MG");
        cidade1.setNome("UBERABA");

        Cidade cidade2 = new Cidade();
        cidade2.setUf("MG");
        cidade2.setNome("UBERLÂNDIA");

        temp.add(cidade1);
        temp.add(cidade2);
        return temp;
    }

    public Cidade salvar(Cidade obj) {
        if (obj.getCodigo() == null) {
            return inserir(obj);
        } else {
            return alterar(obj);
        }
    }

    public List<Cidade> getLista() {
        return this.cidades;
    }

    public Cidade inserir(Cidade cidade) {
        cidade.setCodigo(contador++);
        this.cidades.add(cidade);
        return cidade;
    }

    public Cidade alterar(Cidade cidade) {
        Iterator<Cidade> iterator = cidades.iterator();
        while (iterator.hasNext()) {
            Cidade temp = iterator.next();
            if (cidade.getCodigo().equals(temp.getCodigo())) {
                temp.setNome(cidade.getNome());
                temp.setUf(cidade.getUf());
                break;
            }
        }
        return cidade;
    }

    public boolean remover(Cidade cidade) {
       return this.cidades.remove(cidade);
    }

    public Cidade localizar(Long codigo) {
        for (Cidade ctemp : cidades) {
            if (ctemp.getCodigo().equals(codigo)) {
                return ctemp;
            }
        }
        return null;
    }
}
