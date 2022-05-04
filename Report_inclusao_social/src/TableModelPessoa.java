import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelPessoa extends AbstractTableModel {

    private List<Report> listaDePessoa;
    private final String[] colunas = {"Código", "Endereço", "Cidade", "Falta: ","Criação"};
    

    public TableModelPessoa() {
        this.listaDePessoa = new ArrayList<>();
    }

    /**
     * Retorna uma linha completa da tabela
     *
     * @param rowIndex
     * @return Cidade
     */
    public Report get(int rowIndex) {
        return this.listaDePessoa.get(rowIndex);
    }

    /**
     * Adiciona uma Report a tabela (cria uma linha)
     *
     * @param cidade
     */
    public void add(Report pessoa) {
        this.listaDePessoa.add(pessoa);
        fireTableDataChanged();
    }
    
    /**
     * Edita uma Report na tabela (cria uma linha)
     *
     * @param cidade
     */
    public void edita(Report pessoa) {
        int position = 0;
        for (int i = 0; i < listaDePessoa.size(); i++) {
            Report get = listaDePessoa.get(i);
            if (get.getCodigo().equals(pessoa.getCodigo())) {
                position = i;
                break;
            }
        }
        this.listaDePessoa.set(position, pessoa);     
        fireTableDataChanged();
    }

    /**
     * Remove uma cidade da tabela (remove uma linha)
     *
     * @param rowIndex
     */
    public void remove(int rowIndex) {
        this.listaDePessoa.remove(rowIndex);
        fireTableDataChanged();
    }

    /**
     * Retorna a quantidade de linhas da tabela
     *
     * @return int
     */
    @Override
    public int getRowCount() {
        return this.listaDePessoa.size();
    }

    /**
     * Retorna o numero de colunas da tabela
     *
     * @return int
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Retorna o valor especifico de uma celula
     *
     * @param rowIndex
     * @param columnIndex
     * @return Object
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        //switch na coluna
        switch (columnIndex) {

            //codigo
            case 0:
                return this.listaDePessoa.get(rowIndex).getCodigo();

            //Nome
            case 1:
                return this.listaDePessoa.get(rowIndex).getEndereco();

            //Cidade
            case 2:
                return this.listaDePessoa.get(rowIndex).getCidade().getNome();
            
            //Salario
            case 3: 
                return this.listaDePessoa.get(rowIndex).getMissWhat();
            
            //Nascimento
            case 4: 
                return this.listaDePessoa.get(rowIndex).getCriacao();

            default:
                return this.listaDePessoa.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
}
