
package proynavegacion;
import java.sql.*;


public class FNavegarAutor extends javax.swing.JFrame {
static Connection conn=null;
static Statement st=null;
static ResultSet rs=null;


    public FNavegarAutor() {
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

        jbmostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtnomautor = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jtxtidautor = new javax.swing.JTextField();
        jtxtpaisautor = new javax.swing.JTextField();
        jtxtapelautor = new javax.swing.JTextField();
        jbprimero = new javax.swing.JButton();
        jbanterior = new javax.swing.JButton();
        jbsiguiente = new javax.swing.JButton();
        jbultimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbmostrar.setText("Mostrar Autores");
        jbmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmostrarActionPerformed(evt);
            }
        });

        jLabel1.setText("idautor");

        jLabel2.setText("Nomautor");

        jLabel3.setText("ApelAutor");

        jLabel4.setText("PaisAutor");

        jTextField2.setText("jTextField1");

        jbprimero.setText("Primero");
        jbprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprimeroActionPerformed(evt);
            }
        });

        jbanterior.setText("Anterior");
        jbanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbanteriorActionPerformed(evt);
            }
        });

        jbsiguiente.setText("Siguiente");
        jbsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsiguienteActionPerformed(evt);
            }
        });

        jbultimo.setText("Ultimo");
        jbultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtidautor, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(jtxtnomautor)
                                    .addComponent(jtxtapelautor)
                                    .addComponent(jtxtpaisautor)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbprimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbanterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbsiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbultimo)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbmostrar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbmostrar)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtidautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtnomautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtapelautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtpaisautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbprimero)
                    .addComponent(jbanterior)
                    .addComponent(jbsiguiente)
                    .addComponent(jbultimo))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbanteriorActionPerformed
        // TODO add your handling code here:
        try{
            rs.previous();
            //cargar los resultados de la consulta a los jtext
            jtxtidautor.setText(rs.getString(1));
            jtxtnomautor.setText(rs.getString(2));
            jtxtapelautor.setText(rs.getString(3));
            jtxtpaisautor.setText(rs.getString(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbanteriorActionPerformed

    private void jbmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmostrarActionPerformed
         // TODO add your handling code here:
         try{
             //establecer la conexion a la clase
             conn=Main.Enlace(conn);
             st=Main.sta(st);
             rs=Main.EnlEst(rs);
             rs.next();
             
             jtxtidautor.setText(rs.getString(1));
             jtxtnomautor.setText(rs.getString(2));
             jtxtapelautor.setText(rs.getString(3));
             jtxtpaisautor.setText(rs.getString(4));
         }catch (Exception e){
             System.out.println(e.getMessage());
         }        
    }//GEN-LAST:event_jbmostrarActionPerformed

    private void jbprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprimeroActionPerformed
        // TODO add your handling code here:
        try{
            rs.first();
            //cargar los resultados de la consulta a los jtext
            jtxtidautor.setText(rs.getString(1));
            jtxtnomautor.setText(rs.getString(2));
            jtxtapelautor.setText(rs.getString(3));
            jtxtpaisautor.setText(rs.getString(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbprimeroActionPerformed

    private void jbsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsiguienteActionPerformed
        // TODO add your handling code here:
        try{
            rs.next();
            //cargar los resultados de la consulta a los jtext
            jtxtidautor.setText(rs.getString(1));
            jtxtnomautor.setText(rs.getString(2));
            jtxtapelautor.setText(rs.getString(3));
            jtxtpaisautor.setText(rs.getString(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbsiguienteActionPerformed

    private void jbultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbultimoActionPerformed
        // TODO add your handling code here:
        try{
            rs.last();
            //cargar los resultados de la consulta a los jtext
            jtxtidautor.setText(rs.getString(1));
            jtxtnomautor.setText(rs.getString(2));
            jtxtapelautor.setText(rs.getString(3));
            jtxtpaisautor.setText(rs.getString(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbultimoActionPerformed

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
            java.util.logging.Logger.getLogger(FNavegarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FNavegarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FNavegarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FNavegarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNavegarAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbanterior;
    private javax.swing.JButton jbmostrar;
    private javax.swing.JButton jbprimero;
    private javax.swing.JButton jbsiguiente;
    private javax.swing.JButton jbultimo;
    private javax.swing.JTextField jtxtapelautor;
    private javax.swing.JTextField jtxtidautor;
    private javax.swing.JTextField jtxtnomautor;
    private javax.swing.JTextField jtxtpaisautor;
    // End of variables declaration//GEN-END:variables
}