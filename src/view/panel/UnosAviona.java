package view.panel;

import domain.Avion;
import domain.TipAviona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import model.Kontroler;
import util.Akcija;
import util.TransferKlasa;
import view.table.TableModelAvioni;

/**
 *
 * @author Lazar Vujadinovic
 */
public class UnosAviona extends javax.swing.JPanel {

    /**
     * Creates new form UnosAviona
     */
    public UnosAviona() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNaziv = new javax.swing.JTextField();
        jtxtBrojPutnika = new javax.swing.JTextField();
        jtxtGodProizvodnje = new javax.swing.JTextField();
        jtxtNosivost = new javax.swing.JTextField();
        jComboTipAviona = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAvioni = new javax.swing.JTable();
        jbtZapamti = new javax.swing.JButton();
        jbtResetuj = new javax.swing.JButton();
        jbtSacuvaj = new javax.swing.JButton();
        jbtBrisi = new javax.swing.JButton();
        errNaziv = new javax.swing.JLabel();
        errGodPR = new javax.swing.JLabel();
        errBrPut = new javax.swing.JLabel();
        errNosivost = new javax.swing.JLabel();
        errObrisi = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Naziv(Oznaka):");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 110, -1));

        jLabel3.setText("Godina proizvodnje:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 110, -1));

        jLabel4.setText("Broj putnika:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 110, -1));

        jLabel5.setText("Nosivost:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, 90, -1));

        jLabel6.setText("Tip aviona:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 90, -1));
        add(jtxtNaziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, 80, -1));
        add(jtxtBrojPutnika, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 110, 80, -1));
        add(jtxtGodProizvodnje, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 62, 80, -1));
        add(jtxtNosivost, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 158, 80, -1));

        add(jComboTipAviona, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 204, 80, -1));

        jtblAvioni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblAvioni);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 11, 550, 260));

        jbtZapamti.setText("Kreiraj avion");
        jbtZapamti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtZapamtiActionPerformed(evt);
            }
        });
        add(jbtZapamti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 190, -1));

        jbtResetuj.setText("Resetuj polja forme");
        jbtResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetujActionPerformed(evt);
            }
        });
        add(jbtResetuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, 190, -1));

        jbtSacuvaj.setText("Sacuvaj avione");
        jbtSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSacuvajActionPerformed(evt);
            }
        });
        add(jbtSacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 289, 120, -1));

        jbtBrisi.setText("Obrisi avion");
        jbtBrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBrisiActionPerformed(evt);
            }
        });
        add(jbtBrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 289, 120, -1));

        errNaziv.setText(" ");
        add(errNaziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 190, -1));

        errGodPR.setText(" ");
        add(errGodPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, 190, -1));

        errBrPut.setText(" ");
        add(errBrPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 190, -1));

        errNosivost.setText(" ");
        add(errNosivost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 190, -1));

        errObrisi.setText(" ");
        add(errObrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 293, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetujActionPerformed
        resetujPoljaForme();
    }//GEN-LAST:event_jbtResetujActionPerformed

    private void jbtZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtZapamtiActionPerformed
        resetujErrorLabele();
        String brPut = jtxtBrojPutnika.getText().trim();
        String godPr = jtxtGodProizvodnje.getText().trim();
        String naziv = jtxtNaziv.getText().trim();
        String nos = jtxtNosivost.getText().trim();

        String brPutREGEX = "[0-9]+";
        String godPrREGEX = "[0-9]{4}";
        String nazivREGEX = ".+";
        String nosREGEX = "[0-9]+";

        if (!naziv.matches(nazivREGEX)) {
            errNaziv.setText("Obavezno polje!!!");
            return;
        }
        if (!godPr.matches(godPrREGEX)) {
            errGodPR.setText("Mora sadrzati tacno 4 cifre!!!");
            return;
        }
        if (!brPut.matches(brPutREGEX)) {
            errBrPut.setText("Mora biti broj!!!");
            return;
        }
        if (!nos.matches(nosREGEX)) {
            errNosivost.setText("Mora biti broj izrazen u tonama!!!");
            return;
        }

        Avion a = null;
        try {
            a = new Avion(-1, naziv, Integer.parseInt(godPr), Integer.parseInt(brPut), Integer.parseInt(nos), (TipAviona) jComboTipAviona.getSelectedItem());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }

        TableModel tm = jtblAvioni.getModel();
        TableModelAvioni tma = (TableModelAvioni) tm;
        tma.dodajNoviRed(a);
        JOptionPane.showMessageDialog(this, "Sistem je kreirao novi avion.", "Poruka", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbtZapamtiActionPerformed

    private void jbtBrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBrisiActionPerformed
        try {
            TableModel tm = jtblAvioni.getModel();
            TableModelAvioni tma = (TableModelAvioni) tm;
            tma.obrisi(jtblAvioni.getSelectedRow());
            errObrisi.setText("");
        } catch (Exception e) {
            errObrisi.setText("Morate odabrati avion!");
        }
    }//GEN-LAST:event_jbtBrisiActionPerformed

    private void jbtSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSacuvajActionPerformed
        try {
            TableModel tm = jtblAvioni.getModel();
            TableModelAvioni tma = (TableModelAvioni) tm;
            List<Avion> listaAviona = tma.vratiListuAviona();

            if (Kontroler.getINSTANCE().vratiIzMape("sk").equals("unosAviona")) {
                for (int i = 0; i < listaAviona.size(); i++) {
                    TransferKlasa zahtev = new TransferKlasa();
                    zahtev.setOperacija(Akcija.NOVI_AVION);
                    zahtev.setParametar(listaAviona.get(i));
                    Kontroler.getINSTANCE().posalji(zahtev);
                    TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
                    boolean ubacen = (boolean) odgovor.getRezultat();
                    JOptionPane.showMessageDialog(this, "Sistem je zapamtio podatke o novim avionima.", "Poruka", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (Kontroler.getINSTANCE().vratiIzMape("sk").equals("izmenaAviona")) {
                tma.sacuvajAvion();
                JOptionPane.showMessageDialog(this, "Sistem je uspeo da izmeni avion.", "Poruka", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti novi avion.", "Greska", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbtSacuvajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errBrPut;
    private javax.swing.JLabel errGodPR;
    private javax.swing.JLabel errNaziv;
    private javax.swing.JLabel errNosivost;
    private javax.swing.JLabel errObrisi;
    private javax.swing.JComboBox jComboTipAviona;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBrisi;
    private javax.swing.JButton jbtResetuj;
    private javax.swing.JButton jbtSacuvaj;
    private javax.swing.JButton jbtZapamti;
    private javax.swing.JTable jtblAvioni;
    private javax.swing.JTextField jtxtBrojPutnika;
    private javax.swing.JTextField jtxtGodProizvodnje;
    private javax.swing.JTextField jtxtNaziv;
    private javax.swing.JTextField jtxtNosivost;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        try {
            resetujErrorLabele();
            srediTabelu();

            String sk = Kontroler.getINSTANCE().vratiIzMape("sk").toString();
            if (sk.equals("unosAviona")) {
                for (TipAviona tip : listaTipova) {
                    jComboTipAviona.addItem(tip);
                }
            } else if (sk.equals("izmenaAviona")) {
                jbtResetuj.setVisible(false);
                jbtBrisi.setVisible(false);
                jbtZapamti.setVisible(false);
                jbtSacuvaj.setText("Sacuvaj izmene");

                Avion a = (Avion) Kontroler.getINSTANCE().vratiIzMape("avionZaIzmenu");

                jtxtBrojPutnika.setText(a.getBrojPutnika() + "");
                jtxtBrojPutnika.setEnabled(false);
                jtxtGodProizvodnje.setText(a.getGodinaProizvodnje() + "");
                jtxtGodProizvodnje.setEnabled(false);
                jtxtNaziv.setText(a.getOznaka());
                jtxtNaziv.setEnabled(false);
                jtxtNosivost.setText(a.getNosivost() + "");
                jtxtNosivost.setEnabled(false);
                jComboTipAviona.removeAllItems();
                jComboTipAviona.addItem(a.getTip().getNazivTipa());
                jComboTipAviona.setEnabled(false);

                TableModel tm = jtblAvioni.getModel();
                TableModelAvioni tma = (TableModelAvioni) tm;
                tma.dodajNoviRed(a);
            }
            jtblAvioni.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }

    List<TipAviona> listaTipova;

    private void srediTabelu() {
        List<Avion> listaAviona = new ArrayList<>();
        TableModel tm = new TableModelAvioni(listaAviona);
        jtblAvioni.setModel(tm);

        TableColumnModel tcm = jtblAvioni.getColumnModel();
        TableColumn tc = tcm.getColumn(4);
        jtblAvioni.setAutoCreateRowSorter(true);

        try {
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.VRATI_SVE_TIPOVE);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            listaTipova = (List<TipAviona>) odgovor.getRezultat();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
        JComboBox jcb = new JComboBox();

        jcb.setModel(new DefaultComboBoxModel(listaTipova.toArray()));
        tc.setCellEditor(new DefaultCellEditor(jcb));

        //sakrivanje kolone status
        tcm.getColumn(5).setMinWidth(0);
        tcm.getColumn(5).setMaxWidth(0);
        tcm.getColumn(5).setWidth(0);
        //sakrivanje kolone ID
        tcm.getColumn(6).setMinWidth(0);
        tcm.getColumn(6).setMaxWidth(0);
        tcm.getColumn(6).setWidth(0);
    }

    private void resetujPoljaForme() {
        jtxtBrojPutnika.setText("");
        jtxtGodProizvodnje.setText("");
        jtxtNaziv.setText("");
        jtxtNosivost.setText("");

        resetujErrorLabele();
    }

    private void resetujErrorLabele() {
        errBrPut.setText(" ");
        errGodPR.setText(" ");
        errNaziv.setText(" ");
        errNosivost.setText(" ");
        errObrisi.setText(" ");
    }

}
