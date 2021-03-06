/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S7_Mensajes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class GUIMensajes extends javax.swing.JFrame {

    /**
     * Creates new form GUIMensajes
     */
    public GUIMensajes() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        manipularFrame(false);
    }
    
     public static ArrayList <Contactos> contactos = new ArrayList ();
    
     public void revisarContactos()
     {
         String numeroDigitado = jTDestinatario.getText();
         
         for (int i = 0; i<contactos.size();i++)
         {
            if (contactos.get(i).getNumTel().equals(numeroDigitado))
            {
                jTDestinatario.setText(contactos.get(i).getNombre()+" ("+contactos.get(i).getNumTel()+")");
            }
         }
     }
    
     public void agregarContacto(String nombre, String numTel, String fechCumpleannos)
     {
         contactos.add(new Contactos(nombre, numTel, fechCumpleannos));
     }
     
     public String verContactos ()
     {
         String listo = "";
         
         for (int i = 0;i<contactos.size();i++)
         {
             listo += contactos.get(i).getNombre()+"|"+contactos.get(i).getNumTel()+"\n";
         }
         
         if (listo.equals(""))
         {
             return "No se encontaron contactos";
         }
         
         return listo;
     }
     
    public void manipularFrame (boolean ver)
    {
        jLUbicacion.setVisible(ver);
        jTUbicacion.setVisible(ver);
    }
    
    public void leerEstado ()
    {
        if (jCTipoMensaje.getSelectedIndex() == 1)
        {
            manipularFrame(true);
        }
        else
        {
           manipularFrame(false);
        }
    }
    
    public void limpiar ()
    {
        jCTipoMensaje.setSelectedIndex(0);
        jTDestinatario.setText("/src/imgs/*.png");
        jTMensaje.setText("Digita tu mensaje....");
        jTDestinatario.setText("####-####");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCTipoMensaje = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMensaje = new javax.swing.JTextArea();
        jBEnviar = new javax.swing.JButton();
        jLUbicacion = new javax.swing.JLabel();
        jTDestinatario = new javax.swing.JTextField();
        jTUbicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione el tipo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCTipoMensaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SMS", "MMS" }));
        jCTipoMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoMensajeActionPerformed(evt);
            }
        });
        getContentPane().add(jCTipoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 192, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Destinatario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione el Tipo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Mensaje");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jTMensaje.setColumns(20);
        jTMensaje.setRows(5);
        jTMensaje.setText("Digita tu mensaje....");
        jScrollPane1.setViewportView(jTMensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 192, -1));

        jBEnviar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBEnviar.setText("Enviar");
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLUbicacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLUbicacion.setText("Ubicacion Imagen");
        getContentPane().add(jLUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jTDestinatario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTDestinatario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDestinatario.setText("####-####");
        jTDestinatario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDestinatarioFocusLost(evt);
            }
        });
        jTDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDestinatarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 40));

        jTUbicacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTUbicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUbicacion.setText("/src/imgs/*.png");
        jTUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jTUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 40));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        JOptionPane.showMessageDialog(null, "El mensaje se envio correctamente");
        int resp = JOptionPane.showOptionDialog(null, "??Desea enviar otro mensaje?"
            , null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, null, null);
        if (resp == 0)
        {
            limpiar();
        }
        else
        {
            JFMain main = new JFMain();
            main.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jTDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDestinatarioActionPerformed
       
    }//GEN-LAST:event_jTDestinatarioActionPerformed

    private void jCTipoMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoMensajeActionPerformed
        leerEstado();
    }//GEN-LAST:event_jCTipoMensajeActionPerformed

    private void jTUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUbicacionActionPerformed

    private void jTDestinatarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDestinatarioFocusLost
        revisarContactos();
    }//GEN-LAST:event_jTDestinatarioFocusLost

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
            java.util.logging.Logger.getLogger(GUIMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMensajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEnviar;
    private javax.swing.JComboBox jCTipoMensaje;
    private javax.swing.JLabel jLUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDestinatario;
    private javax.swing.JTextArea jTMensaje;
    private javax.swing.JTextField jTUbicacion;
    // End of variables declaration//GEN-END:variables
}
