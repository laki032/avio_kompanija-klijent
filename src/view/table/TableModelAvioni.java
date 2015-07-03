package view.table;

import domain.Avion;
import domain.TipAviona;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Kontroler;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Lazar Vujadinovic
 */
public class TableModelAvioni extends AbstractTableModel {

    private List<Avion> listaAviona;

    public TableModelAvioni(List<Avion> listaAviona) {
        this.listaAviona = listaAviona;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Oznaka";
            case 1:
                return "Godina proizvodnje";
            case 2:
                return "Broj putnika";
            case 3:
                return "Nosivost (t)";
            case 4:
                return "Tip";
            case 5:
                return "Status";
            case 6:
                return "ID";
            default:
                return "greska";
        }
    }

    @Override
    public int getRowCount() {
        return listaAviona.size();
    }

    @Override
    public int getColumnCount() {
        //5 vidljivih, 6. je status za dodavanje, 7 ID koji se koristi pri izmeni i brisanju
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Avion a = listaAviona.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getOznaka();
            case 1:
                return a.getGodinaProizvodnje();
            case 2:
                return a.getBrojPutnika();
            case 3:
                return a.getNosivost();
            case 4:
                return a.getTip();
            case 6:
                return a.getAvionID();
            default:
                return status;
        }
    }
    //proveriti da li je ok ovako ili je bolje sa nizom statusa za svaki avion
    private String status;

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Avion a = listaAviona.get(rowIndex);
        switch (columnIndex) {
            case 0:
                a.setOznaka(aValue.toString());
                break;
            case 1:
                a.setGodinaProizvodnje(Integer.parseInt(aValue.toString()));
                break;
            case 2:
                a.setBrojPutnika(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                a.setNosivost(Integer.parseInt(aValue.toString()));
                break;
            case 4:
                a.setTip((TipAviona) aValue);
                break;
            case 5:
                status = aValue.toString();
                break;
        }
    }

    public void obrisi(int red) {
        listaAviona.remove(red);
        fireTableDataChanged();
    }

    public void dodajNoviRed(Avion a) {
        listaAviona.add(a);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        try {
            if (Kontroler.getINSTANCE().vratiIzMape("sk").equals("pregledAviona")) {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
        return columnIndex <= 4;
    }

    public List<Avion> vratiListuAviona() {
        return listaAviona;
    }

    public void sacuvajAvion() throws Exception {
        TransferKlasa zahtev = new TransferKlasa();
        zahtev.setOperacija(Akcija.SACUVAJ_IZMENU_AVIONA);
        zahtev.setParametar(listaAviona.get(0));
        Kontroler.getINSTANCE().posalji(zahtev);
        TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
        
        if (odgovor.getIzuzetak() != null) {
            throw (Exception) odgovor.getIzuzetak();
        }
    }

}
