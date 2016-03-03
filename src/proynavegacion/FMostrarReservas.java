
package proynavegacion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FMostrarReservas extends javax.swing.JFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rr=null;  
    
    DefaultTableModel modelo = new DefaultTableModel();

    public FMostrarReservas() {
        initComponents();
        this.jTable1.setModel(modelo);
        
        try{
            //ejecuta la conexion
            conn=Main.Enlace(conn);
            //ejecuta la consulta
            rr=Main.EnlEstRes(rr);
            //volcamos los resultados de rs a rsmetadata
            ResultSetMetaData rsMd=rr.getMetaData();
            //la cantidad de columnas que tiene la consulta
            int cantidadColumnas=rsMd.getColumnCount();
            //establecer como cabeceras el nombre de las columnas
            for(int i=1; i <= cantidadColumnas; i++){
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //creando las filas para el jTable
            while (rr.next()){
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i< cantidadColumnas; i++){
                    fila[i]=rr.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            rr.close();
            conn.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jbIngresarCliente = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("RESERVAS");

        jbIngresarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbIngresarCliente.setText("Ingresar Reserva");
        jbIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarClienteActionPerformed(evt);
            }
        });

        jbRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbIngresarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegresar)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIngresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FCrearReserva FCrearReserva = new FCrearReserva();
        FCrearReserva.setVisible(true);
        FCrearReserva.pack();
    }//GEN-LAST:event_jbIngresarClienteActionPerformed

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FMenu FMenu = new FMenu();
        FMenu.setVisible(true);
        FMenu.pack();
    }//GEN-LAST:event_jbRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FMostrarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMostrarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMostrarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMostrarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMostrarReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbIngresarCliente;
    private javax.swing.JButton jbRegresar;
    // End of variables declaration//GEN-END:variables
}