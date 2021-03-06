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
 * @author bruiz9
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList <Persona> v = new ArrayList();
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
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdListarMujeres = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("AGREGAR PERSONAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Basicos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Identificación:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setText("Primer Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setText("Primer Apellido:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, -1));

        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, -1));
        jPanel2.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, -1));

        jLabel5.setText("Sexo: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino\t", "Femenino\t", "Indefinido" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, -1));

        cmdListarMujeres.setText("Listar Mujeres");
        cmdListarMujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListarMujeresActionPerformed(evt);
            }
        });
        jPanel3.add(cmdListarMujeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 90));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 410, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(485, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        Persona p;
        long identificacion;
        String primer_nombre,primer_apellido,sexo;
        
        identificacion = Long.parseLong(txtIdentificacion.getText());
        primer_nombre = txtPrimerNombre.getText();
        primer_apellido = txtPrimerApellido.getText();
        sexo = cmbSexo.getSelectedItem().toString();
        
        p = new Persona(identificacion, primer_nombre, primer_apellido,sexo);
        
        v.add(p);
        JOptionPane.showMessageDialog(this, "Persona agregada exitosamente!");
        txtIdentificacion.setText("");
        txtPrimerNombre.setText("");
        txtPrimerApellido.setText("");
        txtIdentificacion.requestFocusInWindow();
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        txtResultado.setText("");
        
        if(v.isEmpty()){
            txtResultado.setText("No hay persona que mostrar!");
        }else{
        
        for (int i = 0; i < v.size(); i++) {
            aux="Persona No. "+i+"\n"
            + "Identificacion: "+v.get(i).getIdentificacion()+"\n"
            + "Primer Nombre: "+v.get(i).getPrimer_nombre()+"\n"
            + "Primer Apellido: "+v.get(i).getPrimer_apellido()+"\n"
            + "Sexo: "+v.get(i).getSexo()+"\n\n";
            
            txtResultado.append(aux);
        }
        }
        txtResultado.requestFocusInWindow();
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int op;
        op=JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar las personas?","Pregunta",JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_OPTION){
            v.clear();
            txtResultado.setText("");
            txtIdentificacion.setText("");
            txtPrimerNombre.setText("");
            txtPrimerApellido.setText("");
            txtIdentificacion.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdListarMujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListarMujeresActionPerformed
        int cont=0,contm=1;
        String aux;
        txtResultado.setText("");
        
        if(v.isEmpty()){
            txtResultado.setText("No hay persona que mostrar!");
        }else{
            
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).getSexo().equalsIgnoreCase("Femenino")){
                aux="Persona No. "+(i+1)+"\n"
            
            + "Identificacion: "+v.get(i).getIdentificacion()+"\n"
            + "Primer Nombre: "+v.get(i).getPrimer_nombre()+"\n"
            + "Primer Apellido: "+v.get(i).getPrimer_apellido()+"\n"
            + "Sexo: "+v.get(i).getSexo()+"\n\n";
            
            txtResultado.append(aux);
            cont++;
            }
          }
        if(cont==0){
        txtResultado.setText("No hay mujeres que mostar.");
        }else{
            contm++;
            txtResultado.setText("La cantidad de mujeres son: "+contm);
        }
        }
        txtResultado.requestFocusInWindow();
    }//GEN-LAST:event_cmdListarMujeresActionPerformed

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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
