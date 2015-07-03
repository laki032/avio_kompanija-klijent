package view.panel;

import javax.swing.JOptionPane;
import model.Kontroler;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Lazar Vujadinovic
 */
public class Logovanje extends javax.swing.JPanel {

    /**
     * Creates new form Logovanje
     */
    public Logovanje() {
        initComponents();
        srediFormu();
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
        jLabel2 = new javax.swing.JLabel();
        jtxtIme = new javax.swing.JTextField();
        jbtLogInOut = new javax.swing.JButton();
        errLogIn = new javax.swing.JLabel();
        jlblAdmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPass = new javax.swing.JPasswordField();
        jbtPass = new javax.swing.JButton();
        jlblPass = new javax.swing.JLabel();

        jLabel1.setText("Ime administratora: ");

        jLabel2.setText("Password administratora: ");

        jtxtIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtIme.setMinimumSize(new java.awt.Dimension(6, 25));
        jtxtIme.setPreferredSize(new java.awt.Dimension(6, 25));

        jbtLogInOut.setText("Uloguj se");
        jbtLogInOut.setPreferredSize(new java.awt.Dimension(77, 25));
        jbtLogInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLogInOutActionPerformed(evt);
            }
        });

        errLogIn.setText(" ");

        jlblAdmin.setText(" ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPass.setBorder(null);
        jPass.setMinimumSize(new java.awt.Dimension(6, 25));
        jPass.setPreferredSize(new java.awt.Dimension(6, 25));
        jPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPassKeyReleased(evt);
            }
        });

        jbtPass.setBackground(new java.awt.Color(255, 255, 255));
        jbtPass.setBorder(null);
        jbtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtPassMouseReleased(evt);
            }
        });

        jlblPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass.png")); // NOI18N
        jlblPass.setMaximumSize(new java.awt.Dimension(22, 22));
        jlblPass.setMinimumSize(new java.awt.Dimension(22, 22));
        jlblPass.setPreferredSize(new java.awt.Dimension(22, 22));
        jlblPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlblPassMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jlblPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jbtPass)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtLogInOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(400, 400, 400))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jbtLogInOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(errLogIn)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLogInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLogInOutActionPerformed
        try {
            errLogIn.setText(" ");
            ulogovan = (boolean) Kontroler.getINSTANCE().vratiIzMape("adminUlogovan");
            if (ulogovan) {
                izlogujSe();
            } else {
                ulogujSe();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtLogInOutActionPerformed

    private void jbtPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPassMouseReleased
        jPass.setEchoChar('*');
        jbtPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass.png"));
        jlblPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass.png"));
    }//GEN-LAST:event_jbtPassMouseReleased

    private void jbtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPassMousePressed
        jPass.setEchoChar((char) 0);
        jbtPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass2.png"));
        jlblPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass2.png"));
    }//GEN-LAST:event_jbtPassMousePressed

    private void jPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassKeyReleased
        if (jPass.getPassword().length > 0) {
            jbtPass.setVisible(true);
            jlblPass.setVisible(true);
        } else {
            jbtPass.setVisible(false);
            jlblPass.setVisible(false);
        }
    }//GEN-LAST:event_jPassKeyReleased

    private void jlblPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPassMousePressed
        jPass.setEchoChar((char) 0);
        jbtPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass2.png"));
        jlblPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass2.png"));
     }//GEN-LAST:event_jlblPassMousePressed

    private void jlblPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPassMouseReleased
        jPass.setEchoChar('*');
        jbtPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass.png"));
        jlblPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lazar\\Documents\\NetBeansProjects\\PS-Projekat\\AvioKompanija\\Pass.png"));
    }//GEN-LAST:event_jlblPassMouseReleased

    private void ulogujSe() {
        try {
            String kIme = jtxtIme.getText();
            char[] kS = jPass.getPassword();
            String kSifra = "";
            for (int i = 0; i < kS.length; i++) {
                kSifra += kS[i];
            }

            if (kIme.isEmpty() || kSifra.isEmpty()) {
                throw new Exception("Korisničko ime ili šifra nisu dobro uenti! Pokušajte ponovo!");
            }

            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.LOGIN);
            zahtev.setParametar(kIme + "/" + kSifra);

            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            ulogovan = (boolean) odgovor.getRezultat();

            Kontroler.getINSTANCE().staviUMapu("adminUlogovan", ulogovan);

            if (ulogovan) {
                jtxtIme.setEditable(false);
                jPass.setEditable(false);
                jbtLogInOut.setText("Izloguj se");
                jlblAdmin.setText("Uspešno ste se ulogovali. Dobrodošli!");
                jbtPass.setVisible(false);
                jlblPass.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Korisničko ime ili šifra nisu dobro uenti! Pokušajte ponovo!", "GRESKA", JOptionPane.ERROR_MESSAGE);
                jlblAdmin.setText(" ");
                jbtPass.setVisible(true);
                jlblPass.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void izlogujSe() {
        String ime = jtxtIme.getText();
        jtxtIme.setText("");
        jPass.setText("");
        jtxtIme.setEditable(true);
        jPass.setEditable(true);
        try {
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.LOGOUT);
            zahtev.setParametar(ime);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            if (odgovor.getIzuzetak() != null) {
                throw (Exception) odgovor.getIzuzetak();
            }
            Kontroler.getINSTANCE().staviUMapu("adminUlogovan", false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
        jbtLogInOut.setText("Uloguj se");
        jlblAdmin.setText(" ");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JButton jbtLogInOut;
    private javax.swing.JButton jbtPass;
    private javax.swing.JLabel jlblAdmin;
    private javax.swing.JLabel jlblPass;
    private javax.swing.JTextField jtxtIme;
    // End of variables declaration//GEN-END:variables

    private boolean ulogovan;

    private void srediFormu() {
        try {
            ulogovan = (boolean) Kontroler.getINSTANCE().vratiIzMape("adminUlogovan");
            jPass.setEchoChar('*');
            jbtPass.setVisible(false);
            jlblPass.setVisible(false);

            if (ulogovan) {
                jbtLogInOut.setText("Izloguj se");
            } else {
                jbtLogInOut.setText("Uloguj se");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }
}