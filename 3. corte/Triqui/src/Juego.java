
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoolo Pinilla ID: 537249  
 *
 */
public class Juego extends javax.swing.JFrame {

    Tablero miTablero = new Tablero();
    int x = 0;
    int o = 0;
    int turno;
    int jugadas = 0;

    /**
     * Creates new form Juego
     */
    public Juego() {
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

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        boton00 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Reiniciar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        label1.setText("label1");

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        boton00.setBackground(new java.awt.Color(0, 0, 102));
        boton00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton00.setForeground(new java.awt.Color(255, 255, 0));
        boton00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton00MouseClicked(evt);
            }
        });
        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(0, 0, 102));
        boton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 0));
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 0, 102));
        boton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 0));
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton01.setBackground(new java.awt.Color(0, 0, 102));
        boton01.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton01.setForeground(new java.awt.Color(255, 255, 0));
        boton01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton01MouseClicked(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(0, 0, 102));
        boton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 0));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(0, 0, 102));
        boton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 0));
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
        });

        boton02.setBackground(new java.awt.Color(0, 0, 102));
        boton02.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton02.setForeground(new java.awt.Color(255, 255, 0));
        boton02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton02MouseClicked(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(0, 0, 102));
        boton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 0));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(0, 0, 102));
        boton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 0));
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu2.setText("Opciones");

        Reiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        jMenu2.add(Reiniciar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton00MouseClicked
        this.jugar(boton00, 0, 0);
    }//GEN-LAST:event_boton00MouseClicked

    private void boton01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton01MouseClicked
        this.jugar(boton01, 0, 1);
    }//GEN-LAST:event_boton01MouseClicked

    private void boton02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton02MouseClicked
        this.jugar(boton02, 0, 2);
    }//GEN-LAST:event_boton02MouseClicked

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        this.jugar(boton1, 1, 0);
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        this.jugar(boton2, 1, 1);
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        this.jugar(boton3, 1, 2);
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        this.jugar(boton4, 2, 0);
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        this.jugar(boton5, 2, 1);
    }//GEN-LAST:event_boton5MouseClicked

    private void boton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseClicked
        this.jugar(boton6, 2, 2);
    }//GEN-LAST:event_boton6MouseClicked

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton00ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por jugar =) ");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        boton00.setText("");
        boton01.setText("");
        boton02.setText("");
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
    }//GEN-LAST:event_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    void limpiarTableroGrafico() {

        boton00.setText("");
        boton01.setText("");
        boton02.setText("");
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");

    }

    private void jugar(JButton boton, int fila, int columna) {

        char simbolo = 'a';

        if (boton.getText().equals("")) {
            if (turno == 0) {
                simbolo = 'X';
                boton.setText("X");
                turno = 1;
            } else {
                simbolo = '0';
                boton.setText("O");
                turno = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "lleno ");
        }

        this.miTablero.M[fila][columna] = simbolo;

        int resultado = miTablero.calcularTriqui();

        if (resultado == 1) {
            if (simbolo == 'X') {

                x++;
            } else {
                o++;
            }

            JOptionPane.showMessageDialog(null, "triqui!!! Ganaror  : " + simbolo + "  resultados:" + x + " " + o);

            miTablero.limpiarTablero();
            this.limpiarTableroGrafico();
            turno = 0;
            jugadas = 0;
        }

        if (jugadas == 9) {

            JOptionPane.showMessageDialog(null, "empate");
            miTablero.limpiarTablero();
            this.limpiarTableroGrafico();
            turno = 0;
            jugadas = 0;
        }

        this.jugadas++;

    }

}