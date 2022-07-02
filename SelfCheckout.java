import java.util.List;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class SelfCheckout extends javax.swing.JFrame {
    public SelfCheckout(List<CustomerInformation> customers, int cc) {
        this.customers = customers;
        this.currentCounter = cc;
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for(int x=0;x<5;x++){
            jTable1.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
            jTable2.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setText("Self Checkout System");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer IC", "Items", "Total Items", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(90);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(1).setMinWidth(90);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setMinWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(4).setMinWidth(90);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Queue 1");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Queue 2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer IC", "Items", "Total Items", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(90);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable2.getColumnModel().getColumn(1).setMinWidth(90);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable2.getColumnModel().getColumn(3).setMinWidth(90);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable2.getColumnModel().getColumn(4).setMinWidth(90);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Queue 3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer IC", "Items", "Total Items", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(90);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable3.getColumnModel().getColumn(1).setMinWidth(90);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable3.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable3.getColumnModel().getColumn(3).setMinWidth(90);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable3.getColumnModel().getColumn(4).setMinWidth(90);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable3.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add New Customer");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Checkout");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Remove Customer");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(372, 372, 372))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(selectedCustId == null){
            return;
        }
        
        CustomerInformation ci = null;
        
        for(CustomerInformation c : customers){
            if (c.getCustId() == Integer.parseInt(selectedCustId)){
                ci = c;
                break;
            }
        }
        
        ((DefaultTableModel)selectedTable.getModel()).removeRow(selectedRow);
        
        CheckoutDetails cd = new CheckoutDetails();
        cd.setDetails(ci);
        cd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable2.getSelectionModel().clearSelection();
        jTable3.getSelectionModel().clearSelection();
        int selectedRow = jTable1.getSelectedRow();
        selectedCustId = model.getValueAt(selectedRow, 0).toString();
        selectedTable = jTable1;
        this.selectedRow = selectedRow;
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        jTable1.getSelectionModel().clearSelection();
        jTable3.getSelectionModel().clearSelection();
        int selectedRow = jTable2.getSelectedRow();
        selectedCustId = model.getValueAt(selectedRow, 0).toString();
        selectedTable = jTable2;
        this.selectedRow = selectedRow;
    }//GEN-LAST:event_jTable2MousePressed

    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        jTable2.getSelectionModel().clearSelection();
        jTable1.getSelectionModel().clearSelection();
        int selectedRow = jTable3.getSelectedRow();
        selectedCustId = model.getValueAt(selectedRow, 0).toString();
        selectedTable = jTable3;
        this.selectedRow = selectedRow;
    }//GEN-LAST:event_jTable3MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddCustomer addCustomer = new AddCustomer(this);
        addCustomer.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Object[] columnData = new Object[jTable1.getRowCount()];  // One entry for each row
        String id = selectedTable.getValueAt(selectedRow, 0).toString();
        
        for(CustomerInformation ci : this.customers){
            if(ci.getCustId() == Integer.parseInt(id)){
                customers.remove(ci);
                break;
            }
        }
        
        ((DefaultTableModel)selectedTable.getModel()).removeRow(selectedRow);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void setTable1(Queue<CustomerInformation> queue1){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        
        // add row dynamically into the table      
        for (CustomerInformation ci : queue1) {
             dtm.addRow(new Object[] { ci.getCustId(), ci.getCustIc(), ci.getAllItems() ,ci.getTotalItems(), ci.getTotal(), "Checkout" });
        }
    }
    
    public void setTable2(Queue<CustomerInformation> queue2){
        DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
        
        // add row dynamically into the table      
        for (CustomerInformation ci : queue2) {
             dtm.addRow(new Object[] { ci.getCustId(), ci.getCustIc(), ci.getAllItems() ,ci.getTotalItems(), ci.getTotal(), "" });
        }
    }
        
    public void setTable3(Queue<CustomerInformation> queue3){
        DefaultTableModel dtm = (DefaultTableModel)jTable3.getModel();
        
        // add row dynamically into the table      
        for (CustomerInformation ci : queue3) {
             dtm.addRow(new Object[] { ci.getCustId(), ci.getCustIc(), ci.getAllItems() ,ci.getTotalItems(), ci.getTotal(), "" });
        }
    }
    
    public void addToSelectedTable(CustomerInformation ci){
        DefaultTableModel dtm = (DefaultTableModel)selectedTable.getModel();
        dtm.addRow(new Object[] { ci.getCustId(), ci.getCustIc(), ci.getAllItems() ,ci.getTotalItems(), ci.getTotal(), "Checkout" });
    }
    
    public void addCustomer(CustomerInformation ci){
        if(ci.getTotalItems() <= 5){
            ci.setCounterPaid(currentCounter);
            currentCounter++;
            currentCounter = currentCounter%2;
        } else{
            ci.setCounterPaid(2);
        }
        
        customers.add(ci);
        
        switch (ci.getCounterPaid()) {
            case 0:
                selectedTable = jTable1;
                break;
            case 1:
                selectedTable = jTable2;
                break;
            default:
                selectedTable = jTable3;
                break;
        }
        
        addToSelectedTable(ci);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private JButton button = new JButton();
    private String selectedCustId = null;
    private JTable selectedTable = null;
    private Integer selectedRow = null;
    private int currentCounter;
    
    private List<CustomerInformation> customers;
}