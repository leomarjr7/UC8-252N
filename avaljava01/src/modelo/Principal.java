
package modelo;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

   
    public Principal() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Novo");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Editar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem3.setText("Desfazer");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Refazer");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exibir");

        jMenuItem5.setText("Zoom");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator1);

        jMenuItem6.setText("Régua");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");

        jMenuItem7.setText("Sobre o sistema");
        jMenuItem7.setToolTipText("Sistema Avaliação Java Swing Versão 1.0 Desenvolvido pelos alunos");
        jMenuItem7.addActionListener(this::jMenuItem7ActionPerformed);
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        novoAluno tela2 = new novoAluno();
        tela2.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       JOptionPane.showMessageDialog(this, "Sistema Avaliação Java Swing\n" +
"Versão 1.0\n" +
"Desenvolvido pelos alunos");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
