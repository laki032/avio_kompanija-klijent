package view.table;

import domain.zaposleni.Zaposleni;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lazar Vujadinovic
 */
public class TableModelZaposleni extends AbstractTableModel {

    List<Zaposleni> lista;

    public TableModelZaposleni(List<Zaposleni> listaZaposlenih) {
        lista = listaZaposlenih;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zaposleni z = lista.get(rowIndex);
//        String x = "Avio mehanicar";
//        try {//ovaj deo ne radi kako treba
//            Pilot p = (Pilot) z;
//            x = "Pilot";
//        } catch (Exception e) {
//            //znaci da je mehanicar
//        }
        switch (columnIndex) {
            case 0:
                return z.getJmbg();
            case 1:
                return z.getImePrezime();
            case 2:
                return z.getGodinaRodjenja();
//            case 3:
//                return x;
            default:
                return "greska";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Zaposleni z = lista.get(rowIndex);
        if (columnIndex == 1) {
            z.setImePrezime(aValue.toString());
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "JMBG";
            case 1:
                return "Ime i prezime";
            case 2:
                return "Godina rodjenja";
//            case 3:
//                return "Pozicija";
            default:
                return "greska";
        }
    }

}
