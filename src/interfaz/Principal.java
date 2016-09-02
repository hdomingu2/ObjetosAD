/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;
import clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author hdomingu2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Persona> v = new ArrayList();
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtPrimerNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        panel = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdListarMujeres = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agregar Personas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Basicos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel2.setText("Indetificacion");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel3.setText("Primer Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));
        jPanel2.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 70, -1));
        jPanel2.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, -1));

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 20));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "Indefinido" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 130, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 160));

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        panel.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        panel.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmdListarMujeres.setText("Listar Mujeres");
        panel.add(cmdListarMujeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        panel.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 140, 230));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 110));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 330, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(667, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        Persona p;
        long identificacion;
        String primer_nombre,primer_apellido,sexo;
        identificacion = Long.parseLong(txtIdentificacion.getText());
        primer_nombre = txtPrimerNombre.getText();
        primer_apellido = txtPrimerApellido.getText();
        sexo= cmbSexo.getSelectedItem().toString();
        
        p = new Persona(identificacion,primer_nombre,primer_apellido, sexo);
        v.add(p);
        JOptionPane.showMessageDialog(this,"Persona Agregada Exitosamente!");
         txtIdentificacion.setText("");
          txtPrimerNombre.setText("");
          txtPrimerApellido.setText("");
          txtIdentificacion.requestFocusInWindow();
  
        
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        txtResultado.setText("");
        if(v.isEmpty()){
            txtResultado.setText("No Hay Personas Que Mostrar");
        }else{
        for (int i = 0; i < v.size(); i++) {
            aux= "Persona No. "+(i+1)+"\n"
            + "Identificacion: "+v.get(i).getIndetificacion()+"\n"
            + "Primer nombre: "+v.get(i).getPrimer_nombre()+"\n"
            + "primer apellido: "+v.get(i).getPrimer_apellido()+"\n\n"
            + "sexo: "+v.get(i).getSexo()+"\n\n";
            txtResultado.append(aux);
        }
        }
        txtIdentificacion.requestFocusInWindow(); 
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
      int op;
      op = JOptionPane.showConfirmDialog(this,"¿Seguro que desea eliminar las personas?", "Pregunt",JOptionPane.YES_NO_OPTION);
      if(op == JOptionPane.YES_OPTION){
          v.clear();
          txtResultado.setText("");
          txtIdentificacion.setText("");
          txtPrimerNombre.setText("");
          txtPrimerApellido.setText("");
          txtIdentificacion.requestFocusInWindow();
      }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdListarMujeres;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
