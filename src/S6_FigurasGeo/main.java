package S6_FigurasGeo;

import javax.swing.JTextField;

/**
 * @author Sergio Segura Vidal
 */

public class main extends javax.swing.JFrame 
{   
    public main() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static boolean selecArea = false;
    public static boolean selecPerimetro = false;
    public static boolean selecAmbas = false;
    public static String nombreFigura = "";
    public static int elementoSelect = 0;
    
    
    //Rectangulo rec = new Rectangulo ();
    //Linea lin = new Linea ();
    
    public void obtnenerSeleccionado ()
    {
        elementoSelect = jCFiguras.getSelectedIndex();
        nombreFigura = jCFiguras.getSelectedItem().toString();
    }
    
    public void opciones ()
    {
        selecArea = jRArea.isSelected();
        selecPerimetro = jRPerimetro.isSelected();
        selecAmbas = jRAmbas.isSelected();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBListo = new javax.swing.JButton();
        jCFiguras = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jRPerimetro = new javax.swing.JRadioButton();
        jRArea = new javax.swing.JRadioButton();
        jRAmbas = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione una figura");

        jBListo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBListo.setText("Listo");
        jBListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListoActionPerformed(evt);
            }
        });

        jCFiguras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCFiguras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Línea", "Cuadrado", "Rectángulo" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Operaciones");

        Opciones.add(jRPerimetro);
        jRPerimetro.setText("Perimetro");

        Opciones.add(jRArea);
        jRArea.setText("Area");

        Opciones.add(jRAmbas);
        jRAmbas.setSelected(true);
        jRAmbas.setText("Ambas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCFiguras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRArea)
                                        .addComponent(jRPerimetro)
                                        .addComponent(jRAmbas))
                                    .addComponent(jBListo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jCFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRPerimetro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRAmbas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jBListo)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListoActionPerformed
        obtnenerSeleccionado();
        opciones();
        PerdirDatos pd = new PerdirDatos();
        pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBListoActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Opciones;
    private javax.swing.JButton jBListo;
    private javax.swing.JComboBox jCFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRAmbas;
    private javax.swing.JRadioButton jRArea;
    private javax.swing.JRadioButton jRPerimetro;
    // End of variables declaration//GEN-END:variables
}
