package com.senac.lojainformatica.view;

import com.senac.lojainformatica.dao.ComputadorDAO;
import com.senac.lojainformatica.model.Computador;
import com.senac.lojainformatica.utils.Validador;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaEditarComputador extends javax.swing.JFrame {

    private static int idComputador;

    public TelaEditarComputador() {
        initComponents();
    }

    public TelaEditarComputador(int id, Computador comp) {
        initComponents();
        this.idComputador = id;
        txtMarca.setText(Computador.getMarca());
        cboHD.setSelectedItem(comp.getHD());
        cboProcess.setSelectedItem(comp.getProcessador());
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
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(492, 291));

        pnlEspecificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar computador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEspecificacaoLayout = new javax.swing.GroupLayout(pnlEspecificacao);
        pnlEspecificacao.setLayout(pnlEspecificacaoLayout);
        pnlEspecificacaoLayout.setHorizontalGroup(
            pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEspecificacaoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                        .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProcess, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboHD, javax.swing.GroupLayout.Alignment.LEADING, 0, 243, Short.MAX_VALUE)
                            .addComponent(cboProcess, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMarca)))
                    .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        pnlEspecificacaoLayout.setVerticalGroup(
            pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEspecificacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(34, 34, 34)
                .addGroup(pnlEspecificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlEspecificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Validador validador = new Validador();
        if (validador.validarComboBox(cboHD) == true && validador.validarComboBox(cboProcess) == true) {

            Computador comp = new Computador();
            comp.setHD(cboHD.getSelectedItem().toString());
            comp.setProcessador(cboProcess.getSelectedItem().toString());
            boolean alterar = ComputadorDAO.alterar(idComputador, comp);

            if (alterar == true) {
                JOptionPane.showMessageDialog(this, "Computador alterado com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível alterar o computador");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Preencha os campos de seleção");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cboHD;
    private javax.swing.JComboBox<String> cboProcess;
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JPanel pnlEspecificacao;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
