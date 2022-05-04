public class CRUDPrincipal extends javax.swing.JFrame {
    private CidadeDAORAM cidadeDAORAM = null;
    private ReportDAORAM pessoaDAORAM = null;

    public CidadeDAORAM getCidadeDAORAM() {
        return cidadeDAORAM;
    }

    public void setCidadeDAORAM(CidadeDAORAM cidadeDAORAM) {
        this.cidadeDAORAM = cidadeDAORAM;
    }

    public ReportDAORAM getPessoaDAORAM() {
        return pessoaDAORAM;
    }

    public void setPessoaDAORAM(ReportDAORAM pessoaDAORAM) {
        this.pessoaDAORAM = pessoaDAORAM;
    }

    public CRUDPrincipal() {
        initComponents();
        this.cidadeDAORAM = new CidadeDAORAM();
        this.pessoaDAORAM = new ReportDAORAM();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuPessoas = new javax.swing.JMenuItem();
        menuCidades = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ajuda ao Deficiente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("OPERAÇÃO INCLUSÃO SOCIAL\n\n\nBem Vindo, Usuário\n\nEste programa é dedicado aos usuá-\nrios que possuem alguma difiucul-\ndade de locomoção, ou apenas aos\nsimpatizantes com o assunto.\n\n\nINSTRUÇÕES:\n1 - Adicione \"Reportações\" na aba\n   'CRUD Reports'\n2 - Caso sua cidade não esteja na\n   lista, você póde adiciona-la na\n   aba 'CRUD Cidades'\n\n\nObrigado pela colaboração, e por\nutilizar nosso sistema!!");
        jScrollPane2.setViewportView(jTextArea2);

        menuCadastros.setText("Cadastros");
        menuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrosActionPerformed(evt);
            }
        });

        menuPessoas.setText("CRUD Reports");
        menuPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPessoasActionPerformed(evt);
            }
        });
        menuCadastros.add(menuPessoas);

        menuCidades.setText("CRUD Cidades");
        menuCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuCidades);

        barraMenu.add(menuCadastros);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPessoasActionPerformed
        CRUDReport formPessoa = new CRUDReport(); //
        
        formPessoa.setLocationRelativeTo(null);
        formPessoa.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        formPessoa.setResizable(false);
        formPessoa.setVisible(true);    
        formPessoa.setCidadeDAORAM(cidadeDAORAM);
        formPessoa.setPessoaDAORAM(pessoaDAORAM);
        formPessoa.initializePersonalComponents();
    }//GEN-LAST:event_menuPessoasActionPerformed

    private void menuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrosActionPerformed
    }//GEN-LAST:event_menuCadastrosActionPerformed

    private void menuCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesActionPerformed
    
        CRUDCidade formCidade = new CRUDCidade();
        
        formCidade.setLocationRelativeTo(null);
        formCidade.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        formCidade.setResizable(false);
        formCidade.setVisible(true);   
        formCidade.setCidadeDAORAM(cidadeDAORAM);
        formCidade.initializePersonalComponents();
    }//GEN-LAST:event_menuCidadesActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUDPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CRUDPrincipal formPrincipal = new CRUDPrincipal();
                formPrincipal.setVisible(true);
                formPrincipal.setLocationRelativeTo(null);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCidades;
    private javax.swing.JMenuItem menuPessoas;
    // End of variables declaration//GEN-END:variables
}
