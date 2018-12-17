/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.memoria;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    //Ultimo elemento do arraylist deve ser -1
    private ArrayList<InfoProcesso> mem = new ArrayList<InfoProcesso>();
    private int TAM_MAX = 50;
    private int TAM_LIVRE = 50;
    private DefaultTableModel modelo;
    private InfoProcesso fim = new InfoProcesso(-1, -1);
    
    public TelaInicial() {
        initComponents();
        this.setTitle("Gerenciador de Memoria");
        this.setLocationRelativeTo(null);
        TableMemoria.setFillsViewportHeight(true);
        txtTamMem.setText(Integer.toString(TAM_MAX));
        modelo = (DefaultTableModel) TableMemoria.getModel();
        
        //Tudo com ID = 0 será espaço livre
        mem.add(new InfoProcesso(0, TAM_MAX));
        mem.add(fim);
        atualizarTabela();
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
        btnRemoveSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btnRemoveSelect.setText("Remove Selec.");
        btnRemoveSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTamMem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRemoveSelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveSelect)
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
        int tipo = dlg.getTipo();
        
        if(!(aux.getID() < 1 || aux.getTamanho() < 1)){
            addProcessos(aux, tipo);
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
        
        if(novo < TAM_MAX && novo > 0){
            if(Integer.parseInt(lblMemLivre.getText()) >= TAM_MAX - novo){
                int tirar = TAM_MAX - novo;
                for(int i = mem.size() - 1;i >= 0 && tirar > 0;i--){
                    if(mem.get(i).getID() == 0){
                        for(int j = mem.get(i).getTamanho();mem.get(i).getTamanho() > 0 && tirar > 0;j--){
                            tirar--;
                            mem.get(i).setTamanho(mem.get(i).getTamanho() - 1);
                        }
                    }
                    
                    if(mem.get(i).getTamanho() == 0){
                        mem.remove(mem.get(i));
                    }
                }
                
                TAM_MAX = novo;
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Não foi possivel diminuir a Memoria.", "Algo deu Errado", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            mem.add(mem.indexOf(fim), new InfoProcesso(0, novo - TAM_MAX));
            TAM_MAX += novo - TAM_MAX;
        }
        
        juntaVazio();
        atualizarTabela();
        lblTamMem.setText(Integer.toString(TAM_MAX));
    }//GEN-LAST:event_btnMudaMemActionPerformed

    private void btnRemoveSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSelectActionPerformed
        // TODO add your handling code here:
        int row = TableMemoria.getSelectedRow();
        
        if(row != -1){
            int id = (Integer) modelo.getValueAt(row, 0);
            
            for(InfoProcesso aux : mem){
                if(aux.getID() == id){
                    aux.setID(0);
                    break;
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nenhum processo selecionado",
                    "Não Foi Possivel Remover", JOptionPane.ERROR_MESSAGE);
        }
        
        juntaVazio();
        atualizarTabela();
        
    }//GEN-LAST:event_btnRemoveSelectActionPerformed
    
    public void addProcessos(InfoProcesso proc, int tipo){
        
        int index = getIndex(tipo, proc.getTamanho());
        
        for(InfoProcesso aux : mem){
            if(aux.getID() == proc.getID()){
                index = -2;
            }
        }
        
        if(index > -1){
            mem.get(index).setTamanho(mem.get(index).getTamanho() - proc.getTamanho());
            mem.add(index, proc);
        }else if(index == -2){
            String msg2 = "Processo com o mesmo ID já existe";
            JOptionPane.showMessageDialog(rootPane, msg2, "Não foi possivel alocar", JOptionPane.ERROR_MESSAGE);
        }else{
            String msg = "Sem Espaço Para o Processo";
            JOptionPane.showMessageDialog(rootPane, msg, "Não foi possivel alocar", JOptionPane.ERROR_MESSAGE);
        }
        
        atualizarTabela();
        
    }
    
    public void juntaVazio(){
        
        for(int i = 0;i < mem.size();i++){
            if(!(i - 1 == -1) || !(i + 1 == mem.size())){
                if(mem.get(i).getID() == 0){
                    if(mem.get(i + 1).getID() == 0){
                        mem.get(i).setTamanho(mem.get(i).getTamanho() + mem.get(i + 1).getTamanho());
                        mem.remove(i + 1);
                    }else if(mem.get(i - 1).getID() == 0){
                        mem.get(i).setTamanho(mem.get(i).getTamanho() + mem.get(i - 1).getTamanho());
                        mem.remove(i - 1);
                    }
                }
            }
        }
        
    }
    
    public void atualizarTabela(){
        
        int livre = 0;
        
        modelo.setRowCount(0);
        
        for(InfoProcesso aux : mem){
            if(aux.getID() != -1){
                if(aux.getTamanho() != 0){
                    modelo.addRow(new Object[]{aux.getID(), aux.getTamanho()});
                    if(aux.getID() == 0){
                        livre += aux.getTamanho();
                    }
                }else{
                    mem.remove(aux);
                }
            }else{
                break;
            }
        }
        lblMemLivre.setText(Integer.toString(livre));
    }
    
    private int getIndex(int tipo, int tam){
        switch(tipo){
            case 0:{
                for(InfoProcesso t : mem){
                    if((t.getID() == 0) && (t.getTamanho() >= tam)){
                        return mem.indexOf(t);
                    }
                }
                return -1;
            }
            
            case 1:{
                InfoProcesso menor = new InfoProcesso(-1, TAM_MAX);
                for(InfoProcesso t : mem){
                    if((t.getID() == 0) && (t.getTamanho() >= tam) && (t.getTamanho() < menor.getTamanho())){
                        menor = t;
                    }
                }
                
                if(menor.getID() != -1){
                    return mem.indexOf(menor);
                }else{
                    return -1;
                }
            }
            
            case 2:{
                InfoProcesso maior = new InfoProcesso(-1, 0);
                for(InfoProcesso t : mem){
                    if((t.getID() == 0) && (t.getTamanho() >= tam) && (t.getTamanho() > maior.getTamanho())){
                        maior = t;
                    }
                }
                
                if(maior.getID() != -1){
                    return mem.indexOf(maior);
                }else{
                    return -1;
                }
            }
            
            default:{
                String msg = "Algo deu errado";
                JOptionPane.showMessageDialog(rootPane, msg, "Desculpa", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
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
    private javax.swing.JButton btnRemoveSelect;
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
