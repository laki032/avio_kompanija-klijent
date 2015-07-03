package view.table;

import domain.association.Uloga;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lazar Vujadinovic
 */
public class TableModelUloge extends AbstractTableModel {

    List<Uloga> uloge;
    String sk;

    public TableModelUloge(List<Uloga> uloge, String sk) {
        this.uloge = uloge;
        this.sk = sk;
    }

    @Override
    public int getRowCount() {
        return uloge.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Datum leta";
            case 1:
                return "Uloga zaposlenog u avionu";
            case 2:
                if (sk.equals("pregledUlogaZaPilota")) {
                    return "Naziv aviona";
                } else {
                    return "Ime zaposlenog";
                }
            default:
                return "greska";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uloga u = uloge.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getDatumLeta();
            case 1:
                return u.getNazivUloge();
            case 2:
                if (sk.equals("pregledUlogaZaPilota")) {
                    return u.getAvion();
                } else {
                    return u.getPilot();
                }
            default:
                return "greska";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1; //moze se samo promeniti naziv uloge
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 1) {
            Uloga u = uloge.get(rowIndex);
            u.setNazivUloge(aValue.toString());
            fireTableDataChanged();
        }
    }

    public Uloga vratiUlogu(int r) {
        return uloge.get(r);
    }

    public void novaUloga(Uloga u) {
        uloge.add(u);
        fireTableDataChanged();
    }

}
