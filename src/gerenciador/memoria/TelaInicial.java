/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.memoria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    private ArrayList<InfoProcesso> mem = new ArrayList();
    private int TAM_MAX = 50;
    private int TAM_LIVRE = 50;
    
    public TelaInicial() {
        initComponents();
        this.setTitle("Gerenciador de Memoria");
        this.setLocationRelativeTo(null);
        TableMemoria.setFillsViewportHeight(true);
        txtTamMem.setText(Integer.toString(TAM_MAX));
        
        //Tudo com ID = 0 será espaço livre
        mem.add(new InfoProcesso(0, TAM_MAX));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableMemoria = new javax.swing.JTable();
        btnAddProc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMudaMem = new javax.swing.JButton();
        txtTamMem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblTamMem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMemLivre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMemoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableMemoria);

        btnAddProc.setText("Adicionar Processo");
        btnAddProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Espaços de Mem. :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tam. Mem. :");

        btnMudaMem.setText("Mudar");
        btnMudaMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudaMemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tam. da Memoria: ");

        lblTamMem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTamMem.setText("50");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Livre :");

        lblMemLivre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMemLivre.setText("50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTamMem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTamMem))
                    .addComponent(btnMudaMem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblTamMem)
                    .addComponent(jLabel5)
                    .addComponent(lblMemLivre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddProc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTamMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMudaMem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProcActionPerformed
        // TODO add your handling code here:
        PegarInfos dlg = new PegarInfos(this, rootPaneCheckingEnabled);
        dlg.setVisible(true);
        InfoProcesso aux = dlg.getValorProcesso();
        
        if(!(aux.getID() < 1 || aux.getTamanho() < 1)){
            addProcessos(aux);
        }else if(!dlg.wasCanceled()){
            String msg = "Alguma coisa deu errado, tente denovo !!";
            JOptionPane.showMessageDialog(rootPane, msg, "Algo Aconteceu", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddProcActionPerformed

    //Ainda não Está em completo funcionamento
    private void btnMudaMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudaMemActionPerformed
        // TODO add your handling code here:
        int novo = Integer.parseInt(txtTamMem.getText());
        
        int soma = 0;
        for(InfoProcesso n : mem){
            soma += n.getTamanho();
        }
        
        if(novo < soma){
            String msg = "Espaço não suficiente para processos ja alocados";
            JOptionPane.showMessageDialog(rootPane, msg, "Algo deu Errado", JOptionPane.ERROR_MESSAGE);
        }else{
            TAM_MAX = novo;
        }
        
        lblTamMem.setText(Integer.toString(TAM_MAX));
    }//GEN-LAST:event_btnMudaMemActionPerformed

    public void addProcessos(int id, int tam){
        
        if(!(tam > TAM_LIVRE)){
            mem.add(new InfoProcesso(id, tam));
            lblMemLivre.setText(Integer.toString(id));
        }else{
            String msg = "Sem Espaço Para o Processo";
            JOptionPane.showMessageDialog(rootPane, msg, "Não foi possivel alocar", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void addProcessos(InfoProcesso proc){
        
        if(!(proc.getTamanho() > TAM_LIVRE)){
            mem.add(new InfoProcesso(proc.getID(), proc.getTamanho()));
            lblMemLivre.setText(Integer.toString(proc.getID()));
        }else{
            String msg = "Sem Espaço Para o Processo";
            JOptionPane.showMessageDialog(rootPane, msg, "Não foi possivel alocar", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMemoria;
    private javax.swing.JButton btnAddProc;
    private javax.swing.JButton btnMudaMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMemLivre;
    private javax.swing.JLabel lblTamMem;
    private javax.swing.JTextField txtTamMem;
    // End of variables declaration//GEN-END:variables
}
