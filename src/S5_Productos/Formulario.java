/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S5_Productos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class Formulario extends javax.swing.JFrame {

    ArrayList <ProductoCongelado> arrayCongelados = new ArrayList (); 
        
    ArrayList <ProductoFresco> arrayFrescos = new ArrayList (); 
        
    ArrayList <ProductoRefrigerado> arrayRefrigerados = new ArrayList ();
    
    String tipoProducto = "";
    
    String[] vecTemp;
    
    public Formulario() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarjCTipoProductos();
        cargarTxt();
    }
    
    public void cargarTxt ()
    {
        String[] ubicaciones = {"Fresco.txt","Refrigerado.txt","Congelado.txt"};
        
        for (int i = 0; i<ubicaciones.length;i++)
        {
            File file = new File ("src/PracticaSemanaV/producto"+ubicaciones[i]);

            String listo = "";

            try 
            {
               Scanner in = new Scanner(file);

               in.nextLine();
               while (in.hasNextLine())
               {
                   listo+=in.nextLine();
               }

               vecTemp = listo.split("#");

                if (i == 0)
                {
                    introducirProFrescos();
                }
                else
                {
                    if (i==1)
                    {
                       introducirProRefrigerados();
                        
                    }
                    else
                    {
                       introducirProCongelados();
                    }
                }
                
                System.out.println("Datos cargados con exito");
            }
            catch (FileNotFoundException e)
            {
                System.out.println("No se encontro el archivo: "+e);         
            }
        
        }
    }
    
     public void introducirProFrescos ()
    {
        int numProductos = (vecTemp.length+1)/6;
        
        int i = 0;
        int contador = 0;
        while (contador<numProductos)
        {
            arrayFrescos.add
            (new ProductoFresco 
            (vecTemp[i],
            vecTemp[i+1],
            Integer.parseInt(vecTemp[i+2]),
            Double.parseDouble(vecTemp[i+3]),
            vecTemp[i+3],
            vecTemp[i+4]));
            
            contador++;
            i+=6;
        }
    }
    
    public void introducirProRefrigerados ()
    {
        int numProductos = (vecTemp.length+1)/5;
        
        int i = 0;
        int contador = 0;
        
        while (contador<numProductos)
        {
            {
                arrayRefrigerados.add
                (new ProductoRefrigerado
                (vecTemp[i],
                vecTemp[i+1],
                Integer.parseInt(vecTemp[i+2]),
                Double.parseDouble(vecTemp[i+3]),
                vecTemp[i+4]));
                
                i+=5;
                contador++;
            }
        }
    }
    
    public void introducirProCongelados ()
    {
        int numProductos = (vecTemp.length+1)/5;
        
        int i = 0;
        int contador = 0;
        
        while(contador<numProductos)
        {
            arrayCongelados.add(
            new ProductoCongelado(
            vecTemp[i],
            vecTemp[i+1],
            Integer.parseInt(vecTemp[i+2]),
            Double.parseDouble(vecTemp[i+3]),
            Double.parseDouble(vecTemp[i+4])));
            
            i+=5;
            contador++;
        }
    }
    
    public void llenarjCTipoProductos ()
    {
        String[] vecTipoProducto = {"Productos Frescos","Productos Refrigerados","Productos Congelados"};
        
        jCTipoProductos.setModel(new DefaultComboBoxModel(vecTipoProducto));
    }
    
    public void llenarjCProductos ()
    {
        int elementoSelec =  jCTipoProductos.getSelectedIndex();
        
        String[] productos = new String[10];
        
        if (elementoSelec == 0)
        {
            int i = 0;
            while (i<arrayFrescos.size())
            {
                productos[i]=arrayFrescos.get(i).getNombre();
                i++;
            }
        }
        else
        {
            if (elementoSelec == 1)
            {
            int i = 0;
                while (i<arrayRefrigerados.size())
                {
                    productos[i]=arrayRefrigerados.get(i).getNombre();
                    i++;
                }
            }
            else
            {
                int i = 0;
                while (i<arrayCongelados.size())
                {
                    productos[i]=arrayCongelados.get(i).getNombre();
                    i++;
                }
            }
        }
        
        jCProductos.setModel(new DefaultComboBoxModel(productos));
    }
    
    public void generarVenta()
    {
        int num = Integer.parseInt(jTCantProductos.getText());
        int precio = (int) buscarPrecio();
                
        jTTotalPagar.setText(num*precio+".00");
    }
    
    public double buscarPrecio ()
    {
        int tipo = jCTipoProductos.getSelectedIndex();
        int elem = jCProductos.getSelectedIndex();
        double precio =0;
        
        if (tipo==0)
        {
            precio = arrayFrescos.get(elem).getPrecio();
        }
        else
        {
            if (tipo==1)
            {
                precio = arrayRefrigerados.get(elem).getPrecio();
            }
            else
            {
                precio = arrayCongelados.get(elem).getPrecio();
            }
        }
        jTPrecio.setText(precio+" c/u");
        return precio;
    }
    
    public void limpiar()
    {
        jCTipoProductos.setSelectedIndex(0);
        jCProductos.setSelectedIndex(0);
        jTCantProductos.setText("1,2,3,...");
        jTPrecio.setText("x c/u");
        jTTotalPagar.setText("total a pagar");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCTipoProductos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCProductos = new javax.swing.JComboBox();
        jTCantProductos = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTTotalPagar = new javax.swing.JTextField();
        jBRegistrarCompra = new javax.swing.JButton();
        jBAgregarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra");

        jCTipoProductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCTipoProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCTipoProductosItemStateChanged(evt);
            }
        });
        jCTipoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCTipoProductosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCTipoProductosMouseExited(evt);
            }
        });
        jCTipoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoProductosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad de elementos a comprar");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo de Producto");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Producto");

        jCProductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCProductosMouseClicked(evt);
            }
        });

        jTCantProductos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTCantProductos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCantProductos.setText("1,2,3,...");

        jTPrecio.setEditable(false);
        jTPrecio.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPrecio.setText("precio x elemento");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");

        jBComprar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBComprar.setText("Comprar");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total a pagar");

        jTTotalPagar.setEditable(false);
        jTTotalPagar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTotalPagar.setText("total");

        jBRegistrarCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBRegistrarCompra.setText("Registar otra compra");
        jBRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarCompraActionPerformed(evt);
            }
        });

        jBAgregarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAgregarProductos.setText("Agregar Productos");
        jBAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jBComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBRegistrarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCTipoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jTTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jCTipoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBRegistrarCompra)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAgregarProductos)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBComprar)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
       try
       {
            if (Integer.parseInt(jTCantProductos.getText())>0)
            {
           generarVenta();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Debe comparar como minimo 1 producto");
            }
    }catch (NumberFormatException e)
    {
        JOptionPane.showMessageDialog(null, "No se puede dejar espacio cantidad vacio");
    }
        
    }//GEN-LAST:event_jBComprarActionPerformed

    private void jBAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAgregarProductosActionPerformed

    private void jCTipoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCTipoProductosMouseClicked
       
    }//GEN-LAST:event_jCTipoProductosMouseClicked

    private void jCTipoProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCTipoProductosItemStateChanged
        
    }//GEN-LAST:event_jCTipoProductosItemStateChanged

    private void jCTipoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoProductosActionPerformed
       llenarjCProductos();
    }//GEN-LAST:event_jCTipoProductosActionPerformed

    private void jCProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCProductosMouseClicked
        
    }//GEN-LAST:event_jCProductosMouseClicked

    private void jCTipoProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCTipoProductosMouseExited
        
    }//GEN-LAST:event_jCTipoProductosMouseExited

    private void jBRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarCompraActionPerformed
       limpiar();
    }//GEN-LAST:event_jBRegistrarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarProductos;
    private javax.swing.JButton jBComprar;
    private javax.swing.JButton jBRegistrarCompra;
    private javax.swing.JComboBox jCProductos;
    private javax.swing.JComboBox jCTipoProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTCantProductos;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTTotalPagar;
    // End of variables declaration//GEN-END:variables
}
