/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package odontograma;

import clases.CapturarOdontograma;
import clases.DrawTooth;
import clases.MouseListenerGraphic;
import clases.MouseListenerGraphic2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JulFX
 */
public class FrmOdontograma extends javax.swing.JDialog {

    /**
     * Creates new form FrmOdontograma
     */
    public FrmOdontograma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        centrar();
        PanelDienteLeche();
        PanelDientePermanente();
        botonRojo.setActionCommand("Rojo");
        botonAzul.setActionCommand("Azul");
        botonBlanco.setActionCommand("Blanco");
    }
    
    private void centrar() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frame = this.getSize();
        setLocation((pantalla.width / 2 - (frame.width / 2)), pantalla.height / 2 - (frame.height / 2));

    }
    
    public JPanel getPanelDeDientes1() {
        
        return panelDientePermanente;
    }
    
    public JPanel getPanelDeDientes2() {
        return panelDienteLeche;
    }
    
    public JPanel getCheckBox() {
        return checkBox;
    }
    
    public void paintTooth(int diente, Color uno, Color dos, Color tres, Color cuatro, Color cinco) {

        if (diente <= 16) {
            panelDientePermanente.remove(panelDientePermanente.getComponent(diente + 15));

            DrawTooth tooth = new DrawTooth(diente, uno, dos, tres, cuatro, cinco);
            tooth.addMouseListener(new MouseListenerGraphic(tooth, this));
            panelDientePermanente.add(tooth, diente + 15);
            panelDientePermanente.getComponent(diente + 15).setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelDientePermanente.repaint();


        } else {
            panelDientePermanente.remove(panelDientePermanente.getComponent(diente + 31));


            DrawTooth tooth = new DrawTooth(diente, uno, dos, tres, cuatro, cinco);
            tooth.addMouseListener(new MouseListenerGraphic(tooth, this));
            panelDientePermanente.add(tooth, diente + 31);
            panelDientePermanente.getComponent(diente + 31).setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelDientePermanente.repaint();

        }
    }
    
    public void paintTooth2(int diente, Color uno, Color dos, Color tres, Color cuatro, Color cinco) {

        if (diente <= 10) {
            panelDienteLeche.remove(panelDienteLeche.getComponent(diente + 9));

            DrawTooth tooth = new DrawTooth(diente, uno, dos, tres, cuatro, cinco);
            tooth.addMouseListener(new MouseListenerGraphic2(tooth, this));
            panelDienteLeche.add(tooth, diente + 9);
            panelDienteLeche.getComponent(diente + 9).setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelDienteLeche.repaint();


        } else {
            panelDienteLeche.remove(panelDienteLeche.getComponent(diente + 19));


            DrawTooth tooth = new DrawTooth(diente, uno, dos, tres, cuatro, cinco);
            tooth.addMouseListener(new MouseListenerGraphic2(tooth, this));
            panelDienteLeche.add(tooth, diente + 19);
            panelDienteLeche.getComponent(diente + 19).setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelDienteLeche.repaint();

        }
    }
    
   public void PanelDientePermanente(){
       
       JPanel contentPane = panelDientePermanente;
        //panelDientePermanente.setLayout(new GridLayout(4, 16));
        int i = 1;
        int f11=18;
        int f12=21;
        int f31=48;
        int f32=31;
        while (i <= 64) {
            
            if (i <= 8) {
                contentPane.add(new JLabel(String.valueOf("     " + f11)));
                f11--;
                i++;
            }else if (i > 8 && i <= 16) {
                contentPane.add(new JLabel(String.valueOf("      " + f12)));
                i++;
                f12++;
            }
            else if (i > 32 && i <= 40) {
                contentPane.add(new JLabel(String.valueOf("      " + f31)));
                i++;
                f31--;
            }
            
            else if (i > 40 && i <= 48) {
                contentPane.add(new JLabel(String.valueOf("      " + f32)));
                i++;
                f32++;
            }

            while ((i > 16 && i <= 32) || (i > 48 && i <= 64)) {
                if (i > 16 && i <= 32) {
                    DrawTooth tooth = new DrawTooth(i - 16, null, null, null, null, null);
                    tooth.addMouseListener(new MouseListenerGraphic(tooth, this));
                    contentPane.add(tooth);

                    i++;
                } else if (i > 48 && i <= 64) {
                    DrawTooth tooth = new DrawTooth(i - 32, null, null, null, null, null);
                    tooth.addMouseListener(new MouseListenerGraphic(tooth, this));
                    contentPane.add(tooth);

                    i++;
                }

            }
        }
   }
   
   public void PanelDienteLeche(){
       
       JPanel contentPane = panelDienteLeche;
        //panelDientePermanente.setLayout(new GridLayout(4, 16));
        int i = 1;
        int f11=55;
        int f12=61;
        int f31=85;
        int f32=71;
        while (i <= 40) {
            
            if (i <= 5) {
                contentPane.add(new JLabel(String.valueOf("     " + f11)));
                i++;
                f11--;
            } else if (i > 5 && i <= 10) {
                contentPane.add(new JLabel(String.valueOf("      " + f12)));
                i++;
                f12++;
            }else if (i > 20 && i <= 25) {
                contentPane.add(new JLabel(String.valueOf("      " + f31)));
                i++;
                f31--;
            }else if (i > 25 && i <= 30) {
                contentPane.add(new JLabel(String.valueOf("      " + f32)));
                i++;
                f32++;
            }

            while ((i > 10 && i <= 20) || (i > 30 && i <= 40)) {
                if (i > 10 && i <= 20) {
                    DrawTooth tooth = new DrawTooth(i - 10, null, null, null, null, null);
                    tooth.addMouseListener(new MouseListenerGraphic2(tooth, this));
                    contentPane.add(tooth);

                    i++;
                } else if (i > 30 && i <= 40) {
                    DrawTooth tooth = new DrawTooth(i - 20, null, null, null, null, null);
                    tooth.addMouseListener(new MouseListenerGraphic2(tooth, this));
                    contentPane.add(tooth);

                    i++;
                }

            }
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

        grup = new javax.swing.ButtonGroup();
        panelContenedor = new javax.swing.JPanel();
        panelDientePermanente = new javax.swing.JPanel();
        panelDienteLeche = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btngua = new javax.swing.JButton();
        btnsal = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        checkBox = new javax.swing.JPanel();
        botonRojo = new javax.swing.JRadioButton();
        botonAzul = new javax.swing.JRadioButton();
        botonBlanco = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Odontograma");

        panelContenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelDientePermanente.setLayout(new java.awt.GridLayout(4, 16));

        panelDienteLeche.setLayout(new java.awt.GridLayout(4, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Derecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Izquierda");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDientePermanente, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(panelDienteLeche, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDientePermanente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addComponent(panelDienteLeche, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Opciones"));

        btngua.setText("Guardar");
        btngua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguaActionPerformed(evt);
            }
        });

        btnsal.setText("Salir");
        btnsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalActionPerformed(evt);
            }
        });

        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        grup.add(botonRojo);
        botonRojo.setText("Blanco");

        grup.add(botonAzul);
        botonAzul.setText("Rojo");

        grup.add(botonBlanco);
        botonBlanco.setText("Azul");

        javax.swing.GroupLayout checkBoxLayout = new javax.swing.GroupLayout(checkBox);
        checkBox.setLayout(checkBoxLayout);
        checkBoxLayout.setHorizontalGroup(
            checkBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, checkBoxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(checkBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAzul)
                    .addComponent(botonBlanco)
                    .addComponent(botonRojo))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        checkBoxLayout.setVerticalGroup(
            checkBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonAzul)
                .addGap(18, 18, 18)
                .addComponent(botonBlanco)
                .addGap(18, 18, 18)
                .addComponent(botonRojo)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btngua)
                    .addComponent(btncan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btncan, btngua, btnsal});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btngua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsal)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguaActionPerformed
        checkBox.requestFocusInWindow();
        CapturarOdontograma cap=new CapturarOdontograma();
        cap.savePane(panelContenedor, "C:\\Odontograma.jpeg");
        JOptionPane.showMessageDialog(this, "La imagen se ha guardado");
    }//GEN-LAST:event_btnguaActionPerformed

    private void btnsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        
    }//GEN-LAST:event_btncanActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOdontograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOdontograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOdontograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOdontograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmOdontograma dialog = new FrmOdontograma(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonAzul;
    private javax.swing.JRadioButton botonBlanco;
    private javax.swing.JRadioButton botonRojo;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btngua;
    private javax.swing.JButton btnsal;
    private javax.swing.JPanel checkBox;
    private javax.swing.ButtonGroup grup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelDienteLeche;
    private javax.swing.JPanel panelDientePermanente;
    // End of variables declaration//GEN-END:variables
}
