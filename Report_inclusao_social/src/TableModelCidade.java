import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelCidade extends AbstractTableModel {

    private List<Cidade> listaDeCidades;
    private final String[] colunas = {"Código", "Nome da Cidade", "UF"};
    

    public TableModelCidade() {
        this.listaDeCidades = new ArrayList<>();
    }

    /**
     * Retorna uma linha completa da tabela
     *
     * @param rowIndex
     * @return Cidade
     */
    public Cidade get(int rowIndex) {
        return this.listaDeCidades.get(rowIndex);
    }

    /**
     * Adiciona uma cidade a tabela (cria uma linha)
     *
     * @param cidade
     */
    public void add(Cidade cidade) {
        this.listaDeCidades.add(cidade);
        fireTableDataChanged();
    }
    
    /**
     * Edita uma cidade a tabela (cria uma linha)
     *
     * @param cidade
     */
    public void edita(Cidade cidade) {
        int position = 0;
        for (int i = 0; i < listaDeCidades.size(); i++) {
            Cidade get = listaDeCidades.get(i);
            if (get.getCodigo().equals(cidade.getCodigo())) {
                position = i;
                break;
            }
        }
        this.listaDeCidades.set(position, cidade);
            
        fireTableDataChanged();
    }

    /**
     * Remove uma cidade da tabela (remove uma linha)
     *
     * @param rowIndex
     */
    public void remove(int rowIndex) {
        this.listaDeCidades.remove(rowIndex);
        fireTableDataChanged();
    }

    /**
     * Retorna a quantidade de linhas da tabela
     *
     * @return int
     */
    @Override
    public int getRowCount() {
        return this.listaDeCidades.size();
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
                return this.listaDeCidades.get(rowIndex).getCodigo();

            //cidade
            case 1:
                return this.listaDeCidades.get(rowIndex).getNome();

            //uf
            case 2:
                return this.listaDeCidades.get(rowIndex).getUf();

            default:
                return this.listaDeCidades.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
}
