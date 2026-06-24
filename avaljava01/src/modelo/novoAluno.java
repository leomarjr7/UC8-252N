package modelo;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import tabela.Aluno;
import banco.BancoAluno;


public class novoAluno extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(novoAluno.class.getName());


    public novoAluno() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoTurma = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        campoID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        campoID.addActionListener(this::campoIDActionPerformed);

        campoNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        campoNome.addActionListener(this::campoNomeActionPerformed);

        campoTurma.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));
        campoTurma.addActionListener(this::campoTurmaActionPerformed);

        campoEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        campoEmail.addActionListener(this::campoEmailActionPerformed);

        btnAdicionar.setBackground(new java.awt.Color(153, 255, 153));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(this::btnAdicionarActionPerformed);

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Turma", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAluno);

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar)
                    .addComponent(btnExcluir))
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnAdicionar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(48, 48, 48)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
     
    Aluno aluno = new Aluno(
        Integer.parseInt(campoID.getText()),
        campoNome.getText(),
        campoTurma.getText(),
        campoEmail.getText()
    );

    BancoAluno.listaAlunos.add(aluno);

    DefaultTableModel modelo = (DefaultTableModel) tabelaAluno.getModel();

    modelo.addRow(new Object[] {
        aluno.getId(),
        aluno.getNome(),
        aluno.getTurma(),
        aluno.getEmail()
    });

    JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");

    campoID.setText("");
    campoNome.setText("");
    campoTurma.setText("");
    campoEmail.setText("");

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        
    }//GEN-LAST:event_campoIDActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTurmaActionPerformed
     
    }//GEN-LAST:event_campoTurmaActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        
    }//GEN-LAST:event_campoEmailActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tabelaAluno.getSelectedRow();

    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecione um aluno na tabela.");
        return;
    }

    int idSelecionado = (int) tabelaAluno.getValueAt(linhaSelecionada, 0);

    int resposta = JOptionPane.showConfirmDialog(
        null,
        "Deseja realmente excluir este aluno?",
        "Confirmar exclusão",
        JOptionPane.YES_NO_OPTION
    );

    if (resposta == JOptionPane.YES_OPTION) {

        for (Aluno aluno : BancoAluno.listaAlunos) {

            if (aluno.getId() == idSelecionado) {

                BancoAluno.listaAlunos.remove(aluno);

                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!");

                ((DefaultTableModel) tabelaAluno.getModel()).removeRow(linhaSelecionada);

                break;
            }
        }
    }
    }//GEN-LAST:event_btnExcluirActionPerformed


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> new novoAluno().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAluno;
    // End of variables declaration//GEN-END:variables

}