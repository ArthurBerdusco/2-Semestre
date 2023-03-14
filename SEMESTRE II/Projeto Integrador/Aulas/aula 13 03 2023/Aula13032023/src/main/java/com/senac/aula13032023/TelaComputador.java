package com.senac.aula13032023;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaComputador extends javax.swing.JFrame {

    public TelaComputador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoPC = new javax.swing.ButtonGroup();
        btSO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rboPc = new javax.swing.JRadioButton();
        rboNotebook = new javax.swing.JRadioButton();
        rboServidor = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tglLinux = new javax.swing.JToggleButton();
        tglWindows = new javax.swing.JToggleButton();
        cboHD = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        chkMousePad = new javax.swing.JCheckBox();
        chkHeadSet = new javax.swing.JCheckBox();
        chkMochila = new javax.swing.JCheckBox();
        chkMouseGamer = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstServicos = new javax.swing.JList<>();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComputadores = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o tipo de Computador"));

        btTipoPC.add(rboPc);
        rboPc.setText("PC");

        btTipoPC.add(rboNotebook);
        rboNotebook.setText("Notebook");

        btTipoPC.add(rboServidor);
        rboServidor.setText("Servidor");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc_desktop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rboServidor)
                    .addComponent(rboPc)
                    .addComponent(rboNotebook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rboPc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rboNotebook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rboServidor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btSO.add(tglLinux);
        tglLinux.setText("Linux");
        tglLinux.setActionCommand("Linux");

        btSO.add(tglWindows);
        tglWindows.setText("Windows");
        tglWindows.setActionCommand("Windows");

        cboHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um HD...", "HDD 512GB", "HDD 1TB", "SSD 256GB", "SSD 512GB", "SSD 1TB" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione os acessórios"));

        chkMousePad.setText("MousePad");

        chkHeadSet.setText("HeadSet");

        chkMochila.setText("Mochila");

        chkMouseGamer.setText("Mouse Gamer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkMousePad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(chkHeadSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(chkMochila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(chkMouseGamer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMousePad)
                    .addComponent(chkHeadSet)
                    .addComponent(chkMochila)
                    .addComponent(chkMouseGamer))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lstServicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Garantia Estendida", "Suporte 24 hrs", "Proteção contra quedas", "Seguro contra furtos", "Antivírus" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstServicos);

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblComputadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Sistema Operacional", "HD", "Acessórios", "Serviços"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblComputadores);

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tglWindows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tglLinux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cboHD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglLinux, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        //Tipo PC
        String tipoPC = "";
        if (rboPc.isSelected()) {
            tipoPC = rboPc.getText();
        } else if (rboNotebook.isSelected()) {
            tipoPC = rboNotebook.getText();
        } else if (rboServidor.isSelected()) {
            tipoPC = rboServidor.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de computador!");
        }

        //Sistema Operacional
        String sistema = btSO.getSelection().getActionCommand();

        //Tipo HD
        String tipoHD = cboHD.getSelectedItem().toString();

        //Acessorios selecionados
        String acessorios = "";

        if (chkMousePad.isSelected()) {
            acessorios += chkMousePad.getText() + " ,";
        }

        if (chkMochila.isSelected()) {
            acessorios += chkMochila.getText() + " ,";
        }

        if (chkHeadSet.isSelected()) {
            acessorios += chkHeadSet.getText() + " ,";
        }

        if (chkMouseGamer.isSelected()) {
            acessorios += chkMouseGamer.getText() + " ,";
        }
        
        //Lista de serviços
        List<String> servicos =  lstServicos.getSelectedValuesList();
        
        String servicosSelecionados = "";
        
        for (String servico : servicos) {
            servicosSelecionados += servico + " ,";
        }

        //Adicionar a tabela de computadores
        DefaultTableModel modelo = (DefaultTableModel)tblComputadores.getModel();
        modelo.addRow(new String[]{
            tipoPC, 
            sistema, 
            tipoHD, 
            acessorios, 
            servicosSelecionados
        });

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)tblComputadores.getModel();
        
        int linhaSelecionada = tblComputadores.getSelectedRow();
        
        if(linhaSelecionada>=0){
            modelo.removeRow(linhaSelecionada);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha!");
        }
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btSO;
    private javax.swing.ButtonGroup btTipoPC;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cboHD;
    private javax.swing.JCheckBox chkHeadSet;
    private javax.swing.JCheckBox chkMochila;
    private javax.swing.JCheckBox chkMouseGamer;
    private javax.swing.JCheckBox chkMousePad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstServicos;
    private javax.swing.JRadioButton rboNotebook;
    private javax.swing.JRadioButton rboPc;
    private javax.swing.JRadioButton rboServidor;
    private javax.swing.JTable tblComputadores;
    private javax.swing.JToggleButton tglLinux;
    private javax.swing.JToggleButton tglWindows;
    // End of variables declaration//GEN-END:variables
}
