package com.senac.lojainformatica.view;

import com.senac.lojainformatica.dao.ComputadorDAO;
import com.senac.lojainformatica.model.Computador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaComputador extends javax.swing.JFrame {

    public TelaConsultaComputador() {
        initComponents();
        listarComputadores();
    }

    public void listarComputadores() {
        ArrayList<Computador> listaComputador = ComputadorDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel) tblComputador.getModel();
        modelo.setRowCount(0);
        for (Computador computador : listaComputador) {
            modelo.addRow(new String[]{
                String.valueOf(computador.getIdComputador()),
                Computador.getMarca(),
                computador.getHD(),
                computador.getProcessador()
            });
        }
    }

    public void filtrarComputadores(String processador) {
        DefaultTableModel modelo = (DefaultTableModel) tblComputador.getModel();
        modelo.setRowCount(0);
        ArrayList<Computador> listaComputadores = ComputadorDAO.listar(processador);
        if (listaComputadores.size() > 0) {
            for (Computador computador : listaComputadores) {
                modelo.addRow(new String[]{
                    String.valueOf(computador.getIdComputador()),
                    Computador.getMarca(),
                    computador.getHD(),
                    computador.getProcessador()
                });
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há nenhum computador cadastrado com essa processador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComputador = new javax.swing.JTable();
        lblFiltro = new javax.swing.JLabel();
        cboProcess = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Base de dados");

        pnlTbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computadores Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tblComputador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblComputador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "HD", "Processador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComputador.setRowHeight(25);
        jScrollPane1.setViewportView(tblComputador);
        tblComputador.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblComputador.getColumnModel().getColumn(1).setPreferredWidth(0);

        lblFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFiltro.setText("Filtrar por processador:");

        cboProcess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProcess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Intel Core i7-12800H", "Intel Core i7-11370H", "Intel Core i7-1185G7", "Intel Core i5-13600K", "AMD Ryzen 5 3600", "AMD Ryzen 7 5800X", "AMD Ryzen 9 7950X" }));
        cboProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProcessActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTblLayout = new javax.swing.GroupLayout(pnlTbl);
        pnlTbl.setLayout(pnlTblLayout);
        pnlTblLayout.setHorizontalGroup(
            pnlTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTblLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTblLayout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addGap(9, 9, 9)
                        .addComponent(cboProcess, 0, 201, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTblLayout.setVerticalGroup(
            pnlTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTblLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTblLayout.createSequentialGroup()
                        .addGroup(pnlTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFiltro)
                            .addComponent(cboProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProcessActionPerformed
        if (cboProcess.getSelectedIndex() != 0) {
            filtrarComputadores(cboProcess.getSelectedItem().toString());

        } else if (cboProcess.getSelectedIndex() == 0) {
            listarComputadores();
        }
    }//GEN-LAST:event_cboProcessActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (tblComputador.getSelectedRow() != -1) { //Validar se há um computador selecionado para editar
            Computador editComp = new Computador();
            int linhaSelecionada = tblComputador.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) tblComputador.getModel();
            int id = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            editComp.setHD(String.valueOf(modelo.getValueAt(linhaSelecionada, 2)));
            editComp.setProcessador(String.valueOf(modelo.getValueAt(linhaSelecionada, 3)));
            new TelaEditarComputador(id, editComp).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecione um computador");
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (cboProcess.getSelectedIndex() != 0) {
            filtrarComputadores(cboProcess.getSelectedItem().toString());

        } else if (cboProcess.getSelectedIndex() == 0) {
            listarComputadores();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tblComputador.getSelectedRow() != -1) { //Validar se há um computador selecionado para excluir
            Computador editComp = new Computador();
            int linhaSelecionada = tblComputador.getSelectedRow();

            DefaultTableModel modelo = (DefaultTableModel) tblComputador.getModel();
            int id = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());

            boolean compDeletado = ComputadorDAO.deletar(id);
            if (compDeletado == true) {
                JOptionPane.showMessageDialog(this, "Computador deletado com sucesso");
                listarComputadores();
            } else {
                JOptionPane.showConfirmDialog(this, "Erro ao deletatar computador");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor selecione um computador");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cboProcess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JPanel pnlTbl;
    private javax.swing.JTable tblComputador;
    // End of variables declaration//GEN-END:variables
}
