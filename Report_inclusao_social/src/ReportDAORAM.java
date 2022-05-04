import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ReportDAORAM {

    private List<Report> pessoas = new ArrayList<>();
    private long contador = 1;
    
    public ReportDAORAM() {
        if(pessoas.isEmpty()){
            this.criaPessoa();
        }  
    }

    public Report salvar(Report obj) {
        if (obj.getCodigo() == null) {
            return inserir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    private void criaPessoa() {
        CidadeDAORAM cidadeDAO = new CidadeDAORAM();
        List<Cidade> cidades = new ArrayList();
        cidades = cidadeDAO.getLista();
   
        Report pessoa1 = new Report();
        pessoa1.setEndereco("Praça da Abadia, 512");
        pessoa1.setCriacao(LocalDate.of(2018, Month.JUNE, 4));
        pessoa1.setCidade(cidades.get(0));
        pessoa1.setMissWhat("Calçada Rebaixada");
        pessoa1.setCodigo(contador);
        contador++;
        
        Report pessoa2 = new Report();
        pessoa2.setEndereco("Av Rondom Pacheco, 1025");
        pessoa2.setCriacao(LocalDate.of(2018, Month.FEBRUARY, 9));
        pessoa2.setCidade(cidades.get(1));
        pessoa2.setMissWhat("Sinal sonoro de pedestre");
        pessoa2.setCodigo(contador);
        contador++;

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
    }

    public List<Report> getLista() {
        return this.pessoas;
    }

    public Report inserir(Report pessoa) {
        pessoa.setCodigo(contador++);
        this.pessoas.add(pessoa);
        return pessoa;
    }

    public Report alterar(Report pessoa) {
        Iterator<Report> iterator = pessoas.iterator();
        while (iterator.hasNext()) {
            Report temp = iterator.next();
            if (pessoa.getCodigo().equals(temp.getCodigo())) {
                temp.setEndereco(pessoa.getEndereco());
                temp.setCriacao(pessoa.getCriacao());
                temp.setMissWhat(pessoa.getMissWhat());
                temp.setCidade(pessoa.getCidade());
                break;
            }
        }
        return pessoa;
    }

    public boolean remover(Report pessoa) {
        Iterator<Report> iterator = pessoas.iterator();
        boolean excluido = false;
        while (iterator.hasNext()) {
            Report temp = iterator.next();
            if (pessoa.getCodigo().equals(temp.getCodigo())) {
                iterator.remove();
                excluido = true;
                break;
            }
        }
        return excluido;
    }

    public Report localizar(Long codigo) {
        for (Report ctemp : pessoas) {
            if (ctemp.getCodigo().equals(codigo)) {
                return ctemp;
            }
        }
        return null;
    }
}
