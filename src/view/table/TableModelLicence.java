package view.table;

import domain.association.Licenca;
import domain.association.Uloga;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lazar Vujadinovic
 */
public class TableModelLicence extends AbstractTableModel {

    List<Licenca> licence;

    public TableModelLicence(List<Licenca> licence) {
        this.licence = licence;
    }

    @Override
    public int getRowCount() {
        return licence.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Datum dobijanja";
            case 1:
                return "Tip aviona";
            default:
                return "greska";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Licenca l = licence.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return l.getDatumDobijanjaLicence();
            case 1:
                return l.getTipAviona().getNazivTipa();
            default:
                return "greska";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 0; //moze se samo promeniti datum
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            Licenca l = licence.get(rowIndex);
            Date d;
            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse(aValue.toString());
            } catch (ParseException ex) {
                //nije promenjen datum
                return;
            }
            l.setDatumDobijanjaLicence(d);
            fireTableDataChanged();
        }
    }

    public Licenca vratiLicencu(int r) {
        return licence.get(r);
    }

    public void novaLicenca(Licenca l) {
        licence.add(l);
        fireTableDataChanged();
    }
}
