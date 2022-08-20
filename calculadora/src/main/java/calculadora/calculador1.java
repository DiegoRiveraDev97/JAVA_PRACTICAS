/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego, david, nicole.
 */
public class calculador1 extends javax.swing.JFrame {

    
    public calculador1() {
        initComponents();
    }
    
    public boolean Validacion(){
        //METODO DE VALIDACION POR MEDIO DE TRY-CATCH PARA VALIDAR NUMEROS O CARACTERES DIFERENTES
        int n1,n2;
        
        try{
            n1 = Integer.parseInt(num1.getText());
            n2 = Integer.parseInt(num2.getText());
            return true;
            
        }catch(Exception e){
            return false;
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num2 = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        btnres = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnsum = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        btnres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnres.setText("-");
        btnres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresActionPerformed(evt);
            }
        });

        btnmul.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnmul.setText("x");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btndiv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnsum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnsum.setText("+");
        btnsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        limpiar.setText("limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        resultado.setText("    0");

        jLabel1.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel1.setText("Calculadora de Diego, David, Nicole");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsum)
                                    .addComponent(btnmul))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndiv)
                            .addComponent(btnres))
                        .addGap(27, 27, 27)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiar)
                        .addGap(60, 60, 60))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void btnsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumActionPerformed
        //BOTON SUMA, RECONOCE LOS NUMEROS Y REALIZA LA OPERACION CORRESPONDIENTE
        if(Validacion()==true){
            
            int result;
            result = Integer.parseInt(num1.getText())+ Integer.parseInt(num2.getText());
            resultado.setText(String.valueOf(result));
        }else{//DE LO CONTRARIO ENVIA UN MENSAJE AL USUARIO
            JOptionPane.showMessageDialog(null, "Valores erroneos, intente de nuevo");
        }
        
        
    }//GEN-LAST:event_btnsumActionPerformed

    private void btnresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresActionPerformed
      //BOTON RESTA, RECONOCE LOS NUMEROS Y REALIZA LA OPERACION CORRESPONDIENTE 
        if(Validacion()==true){
            
            int result;
            result = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
            resultado.setText(String.valueOf(result));
        }else{//DE LO CONTRARIO ENVIA UN MENSAJE AL USUARIO
            JOptionPane.showMessageDialog(null, "Valores erroneos, intente de nuevo");
        }
        
        
        
    }//GEN-LAST:event_btnresActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        if(Validacion()==true){
            //BOTON MULTIPLICACION, RECONOCE LOS NUMEROS Y REALIZA LA OPERACION CORRESPONDIENTE
            int result;
            result = Integer.parseInt(num1.getText())* Integer.parseInt(num2.getText());
            resultado.setText(String.valueOf(result));
        }else{//DE LO CONTRARIO ENVIA UN MENSAJE AL USUARIO
            JOptionPane.showMessageDialog(null, "Valores erroneos, intente de nuevo");
        }
        
        
        
    }//GEN-LAST:event_btnmulActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        if(Validacion()==true){
          //BOTON DIVISION, RECONOCE LOS NUMEROS Y REALIZA LA OPERACION CORRESPONDIENTE  
            int result;
            result = Integer.parseInt(num1.getText())/ Integer.parseInt(num2.getText());
            resultado.setText(String.valueOf(result));
        }else{//DE LO CONTRARIO ENVIA UN MENSAJE AL USUARIO
            JOptionPane.showMessageDialog(null, "Valores erroneos, intente de nuevo");
        }
    }//GEN-LAST:event_btndivActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        //BOTON LIMPIAR, RECONOCE EL EVENTO Y REALIZA LA LIMPIEZA DE LOS CAMPOS 
        num1.setText(null);
        num2.setText("  ");
        
        resultado.setText("0");//RETORNA A CERO EN CAMPO DEL RESULTADO
        
        
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(calculador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //METODO PRINCIPAL QUE ARRANCA EL PROGRAMA
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnres;
    private javax.swing.JButton btnsum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
