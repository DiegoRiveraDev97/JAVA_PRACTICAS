/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colores1;

import java.awt.Color;

/**
 *
 * @author Diego, Nicolle, David
 */
public class colortable extends javax.swing.JFrame {//HERENCIA DE LA LIBRERIA DE JAVA

    /**
     * Creates new form colortable
     */
    public colortable() {                  //Metodo para centralizar el lienzo
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Amarillo\t", "Azul", "Rojo", "Verde", "Negro", "Naranja", "Rosado", "Gris", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Applet de Diego, David, Nicole");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//LISTA QUE CONTIENE LA CANTIDAD DE COLORES QUE DISPONE EL PROGRAMA
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if(jList1.getSelectedIndex()==0){
            this.getContentPane().setBackground(Color.YELLOW);//ASIGNACION DE COLOR AMARILLO EN 0
        }
        if(jList1.getSelectedIndex()==1){
            this.getContentPane().setBackground(Color.BLUE);//ASIGNACION DE COLOR AZUL EN 1
        }
        if(jList1.getSelectedIndex()==2){
            this.getContentPane().setBackground(Color.RED);//ASIGNACION DE COLOR ROJO EN 2
        }
        if(jList1.getSelectedIndex()==3){
            this.getContentPane().setBackground(Color.GREEN);//ASIGNACION DE COLOR VERDE EN 3
        }
        if(jList1.getSelectedIndex()==4){
            this.getContentPane().setBackground(Color.BLACK);//ASIGNACION DE COLOR NEGRO EN 4
        }
        if(jList1.getSelectedIndex()==5){
            this.getContentPane().setBackground(Color.ORANGE);//ASIGNACION DE COLOR NARANJA EN 5
        }
        if(jList1.getSelectedIndex()==6){
            this.getContentPane().setBackground(Color.PINK);//ASIGNACION DE COLOR ROSADO EN 6
        }
        if(jList1.getSelectedIndex()==7){
            this.getContentPane().setBackground(Color.GRAY);//ASIGNACION DE COLOR GRIS EN 7
        }
        
        
    }//GEN-LAST:event_jList1ValueChanged

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
            java.util.logging.Logger.getLogger(colortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                     //METODO QUE EJECUTA EL PROGRAMA 
                new colortable().setVisible(true);//PERO NOSOTROS LO HEREDAMOS A OTRA CLASE MAIN 
            }                                     //HACIENDO USO DE LO APRENDIDO EN CLASE DE HERENCIA
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
