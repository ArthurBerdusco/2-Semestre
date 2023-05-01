package com.senac.lojainformatica.view;
import com.senac.lojainformatica.dao.ComputadorDAO;
import com.senac.lojainformatica.utils.Validador;
import com.senac.lojainformatica.model.Computador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaComputador extends javax.swing.JFrame {

    public TelaComputador() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEspecificacao = new javax.swing.JPanel();
        lblHD = new javax.swing.JLabel();
        cboHD = new javax.swing.JComboBox<>();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblProcess = new javax.swing.JLabel();
        cboProcess = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arthur Silva - Computadores");

        pnlEspecificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Computador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHD.setText("HD:");

        cboHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "HD Seagate - 1TB", "SSD Kingston - 512GB", "SSD Adata -  256GB", "HD WD - 500GB", "SSD Sandisk - 1TB" }));

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca.setText(Computador.getMarca());

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");

        lblProcess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProcess.setText("Processador:");

        cboProcess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProcess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Intel Core i7-12800H", "Intel Core i7-11370H", "Intel Core i7-1185G7", "Intel Core i5-13600K", "AMD Ryzen 5 3600", "AMD Ryzen 7 5800X", "AMD Ryzen 9 7950X" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEspecificacaoLayout = new javax.swing.GroupLayout(pnlEspecificacao);
        pnlEspecificacao.setLayout(pnlEspecificacaoLayout);
        pnlEspecificacaoLayout.setHorizontalGroup(
            pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProcess, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cboHD, javax.swing.GroupLayout.Alignment.LEADING, 0, 249, Short.MAX_VALUE)
                        .addComponent(cboProcess, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMarca)))
                .addGap(41, 41, 41))
        );
        pnlEspecificacaoLayout.setVerticalGroup(
            pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                        .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))
                        .addGap(18, 18, 18)
                        .addComponent(cboHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHD))
                .addGap(18, 18, 18)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcess))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database.png"))); // NOI18N
        jButton2.setText("Consultar Banco");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEspecificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Validador validador = new Validador();
        if(validador.validarComboBox(cboHD) == true && validador.validarComboBox(cboProcess) == true){
            Computador comp = new Computador();
            comp.setHD(cboHD.getSelectedItem().toString());
            comp.setProcessador(cboProcess.getSelectedItem().toString());

            boolean salvarComp = ComputadorDAO.salvar(comp);
            if(salvarComp == true){
                JOptionPane.showMessageDialog(this, "Computador adicionado com sucesso");
            }else{
                JOptionPane.showMessageDialog(this, "Não foi possivel adicionar o computado no banco de dados");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Preencha os campos de seleção");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new TelaConsultaComputador().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComputador().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboHD;
    private javax.swing.JComboBox<String> cboProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JPanel pnlEspecificacao;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
