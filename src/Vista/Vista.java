/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author ghost
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public int block;
    public int cementoa1;
    public int cementob1;
    public int cementoc1;
    public int cementoa2;
    public int cementob2;
    public int cementoc2;
    public int cementoa3;
    public int cementob3;
    public int cementoc3;

    public Vista() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_block = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_c2 = new javax.swing.JTextField();
        txt_b2 = new javax.swing.JTextField();
        txt_a2 = new javax.swing.JTextField();
        txt_a1 = new javax.swing.JTextField();
        txt_b1 = new javax.swing.JTextField();
        txt_c1 = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        txt_b = new javax.swing.JTextField();
        txt_a = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        stock_c = new javax.swing.JTextField();
        stock_a = new javax.swing.JTextField();
        stock_g = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblFaltanteCemento = new javax.swing.JLabel();
        lblFaltanteArena = new javax.swing.JLabel();
        lblFaltanteGranzon = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora Para fabricación de Block");

        jLabel5.setText("Ingrese la cantidad de block que desea fabricar (por ciento)");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo A");

        jLabel3.setText("Tipo B");

        jLabel4.setText("Tipo C");

        jLabel9.setText("Saco");

        jLabel10.setText("Metro cubico");

        jLabel6.setText("Cemento");

        jLabel11.setText("Metro cubico");

        jLabel7.setText("Arena");

        jLabel8.setText("Granzon(piedrin fino)");

        txt_c2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_c2.setFocusable(false);
        txt_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c2ActionPerformed(evt);
            }
        });

        txt_b2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_b2.setFocusable(false);
        txt_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_b2ActionPerformed(evt);
            }
        });

        txt_a2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_a2.setFocusable(false);
        txt_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_a2ActionPerformed(evt);
            }
        });

        txt_a1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_a1.setFocusable(false);
        txt_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_a1ActionPerformed(evt);
            }
        });

        txt_b1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_b1.setFocusable(false);
        txt_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_b1ActionPerformed(evt);
            }
        });

        txt_c1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_c1.setFocusable(false);
        txt_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c1ActionPerformed(evt);
            }
        });

        txt_c.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_c.setFocusable(false);
        txt_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cActionPerformed(evt);
            }
        });

        txt_b.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_b.setFocusable(false);
        txt_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bActionPerformed(evt);
            }
        });

        txt_a.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_a.setFocusable(false);
        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txt_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cemento(Sacos)", null},
                {"Arena (m3)", null},
                {"Granzon (m3)", null}
            },
            new String [] {
                "Material", "Stock actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_stock.setFocusable(false);
        jScrollPane1.setViewportView(tbl_stock);

        stock_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock_c.setToolTipText("");

        stock_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        stock_g.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Ingrese la cantidad de material existente");

        btn_actualizar.setText("Actualizar Stock");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        lblFaltanteCemento.setText("Faltante de Cemento: 0");

        lblFaltanteArena.setText("Faltante de Arena: 0");

        lblFaltanteGranzon.setText("Faltante de Granzon: 0");

        lblMensaje.setText("Introduzca valores para el calculo.");

        jLabel14.setText("Cemento");

        jLabel15.setText("Arena");

        jLabel16.setText("Granzon");

        btn_limpiar.setText("Limpiar campos");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_block, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_calcular))
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(btn_actualizar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stock_c, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stock_a, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(stock_g, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFaltanteGranzon)
                                    .addComponent(lblFaltanteCemento)
                                    .addComponent(lblFaltanteArena)
                                    .addComponent(lblMensaje)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpiar)
                                .addGap(168, 168, 168))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblMensaje)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stock_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_calcular)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFaltanteCemento)
                        .addGap(15, 15, 15)
                        .addComponent(lblFaltanteArena)
                        .addGap(16, 16, 16)
                        .addComponent(lblFaltanteGranzon)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed

    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bActionPerformed

    private void txt_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cActionPerformed

    private void txt_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_a1ActionPerformed

    private void txt_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_b1ActionPerformed

    private void txt_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c1ActionPerformed

    private void txt_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_a2ActionPerformed

    private void txt_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_b2ActionPerformed

    private void txt_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c2ActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        //variable general para calculo de blocks
        block = (int) Float.parseFloat(this.txt_block.getText());
        //asignacion a variables haciendo la operacion de material
        cementoa1 = 1 * block;
        cementob1 = 2 * block;
        cementoc1 = 3 * block;
        cementoa2 = 3 * block;
        cementob2 = 4 * block;
        cementoc2 = 5 * block;
        cementoa3 = 2 * block;
        cementob3 = 3 * block;
        cementoc3 = 4 * block;
        
        //Asignacion de valores a los recuadros de total
        txt_a.setText(String.valueOf(cementoa1));
        txt_b.setText(String.valueOf(cementob1));
        txt_c.setText(String.valueOf(cementoc1));
        txt_a1.setText(String.valueOf(cementoa2));
        txt_b1.setText(String.valueOf(cementob2));
        txt_c1.setText(String.valueOf(cementoc2));
        txt_a2.setText(String.valueOf(cementoa3));
        txt_b2.setText(String.valueOf(cementob3));
        txt_c2.setText(String.valueOf(cementoc3));
    
        // Valores necesarios para la producción (pueden ser calculados o ingresados)
        int cementoNecesario = cementoa1+cementoa2+cementoa3;
        int arenaNecesaria = cementob1+cementob2+cementob3;
        int granzonNecesario = cementoc1+cementoc2+cementoc3;

        // Obtener el stock actual de la tabla
        int stockCemento = (int) tbl_stock.getValueAt(0, 1);
        int stockArena = (int) tbl_stock.getValueAt(1, 1);
        int stockGranzon = (int) tbl_stock.getValueAt(2, 1);

        // Restar los materiales necesarios
        int stock_c = stockCemento - cementoNecesario;
        int stock_a = stockArena - arenaNecesaria;
        int stock_g = stockGranzon - granzonNecesario;

     /*   // Verificar si hay faltantes y mostrar en las etiquetas
        lblFaltanteCemento.setText("Faltante de Cemento: " + (stock_c < 0 ? Math.abs(stock_c) : 0));
        lblFaltanteArena.setText("Faltante de Arena: " + (stock_a < 0 ? Math.abs(stock_a) : 0));
        lblFaltanteGranzon.setText("Faltante de Granzón: " + (stock_g < 0 ? Math.abs(stock_g) : 0));

        // Si no hay faltante, actualizar el stock en la tabla
        tbl_stock.setValueAt(Math.max(stock_c, 0), 0, 1);
        tbl_stock.setValueAt(Math.max(stock_a, 0), 1, 1);
        tbl_stock.setValueAt(Math.max(stock_g, 0), 2, 1);
            */
     
     boolean faltaMaterial = false;

                if (stock_c < 0) {
                    lblFaltanteCemento.setText("Faltante de Cemento: " + Math.abs(stock_c));
                    faltaMaterial = true;
                } else {
                    lblFaltanteCemento.setText("Faltante de Cemento: 0");
                }

                if (stock_a < 0) {
                    lblFaltanteArena.setText("Faltante de Arena: " + Math.abs(stock_a));
                    faltaMaterial = true;
                } else {
                    lblFaltanteArena.setText("Faltante de Arena: 0");
                }

                if (stock_g < 0) {
                    lblFaltanteGranzon.setText("Faltante de Granzón: " + Math.abs(stock_g));
                    faltaMaterial = true;
                } else {
                    lblFaltanteGranzon.setText("Faltante de Granzón: 0");
                }

                // Mostrar mensaje si hace falta material
                if (faltaMaterial) {
                    lblMensaje.setText("<html>El material no es suficiente, necesita las siguientes cantidades<br> para fabricar lo deseado:");
                } else {
                    lblMensaje.setText("El material es suficiente para la producción.");
                    // Si el stock es suficiente, actualizar el stock en la tabla
                    tbl_stock.setValueAt(stock_c, 0, 1);
                    tbl_stock.setValueAt(stock_a, 1, 1);
                    tbl_stock.setValueAt(stock_g, 2, 1);
                }

    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        int stockCemento = Integer.parseInt(stock_c.getText());
        int stockArena = Integer.parseInt(stock_a.getText());
        int stockGranzon = Integer.parseInt(stock_g.getText());

        // Actualizar la tabla con los valores ingresados
        tbl_stock.setValueAt(stockCemento, 0, 1);
        tbl_stock.setValueAt(stockArena, 1, 1);
        tbl_stock.setValueAt(stockGranzon, 2, 1);

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       
                //Asignacion de valores a los recuadros de total
        txt_a.setText(String.valueOf(""));
        txt_b.setText(String.valueOf(""));
        txt_c.setText(String.valueOf(""));
        txt_a1.setText(String.valueOf(""));
        txt_b1.setText(String.valueOf(""));
        txt_c1.setText(String.valueOf(""));
        txt_a2.setText(String.valueOf(""));
        txt_b2.setText(String.valueOf(""));
        txt_c2.setText(String.valueOf(""));
        txt_c2.setText(String.valueOf(""));
        txt_block.setText(String.valueOf(""));
                            lblFaltanteCemento.setText("Faltante de Cemento: 0");
                            lblFaltanteArena.setText("Faltante de Arena: 0");
                            lblFaltanteGranzon.setText("Faltante de Granzón: 0");
                            lblMensaje.setText("Introduzca valores para el calculo.");
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFaltanteArena;
    private javax.swing.JLabel lblFaltanteCemento;
    private javax.swing.JLabel lblFaltanteGranzon;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField stock_a;
    private javax.swing.JTextField stock_c;
    private javax.swing.JTextField stock_g;
    private javax.swing.JTable tbl_stock;
    protected javax.swing.JTextField txt_a;
    protected javax.swing.JTextField txt_a1;
    protected javax.swing.JTextField txt_a2;
    protected javax.swing.JTextField txt_b;
    protected javax.swing.JTextField txt_b1;
    protected javax.swing.JTextField txt_b2;
    private javax.swing.JTextField txt_block;
    protected javax.swing.JTextField txt_c;
    protected javax.swing.JTextField txt_c1;
    protected javax.swing.JTextField txt_c2;
    // End of variables declaration//GEN-END:variables

    private String sincero(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
