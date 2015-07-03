package view.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import domain.Avion;
import domain.association.Uloga;
import domain.zaposleni.Pilot;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.Kontroler;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Lazar Vujadinovic
 */
public class PDFAvion {

    private File pdf;

    public File getPDF() {
        return pdf;
    }

    public void kreirajPDF(Avion a) throws Exception {
        TransferKlasa zahtev = new TransferKlasa();
        zahtev.setOperacija(Akcija.PRETRAZI_ULOGE_PO_KRITERIJUMU);
        zahtev.setParametar(a);
        Kontroler.getINSTANCE().posalji(zahtev);
        TransferKlasa odgovor = Kontroler.getINSTANCE().primi();

        List<Uloga> uloge = (List<Uloga>) odgovor.getRezultat();

        pdf = new File("izvestaj.pdf");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(pdf));
        document.open();
        addMetaData(document, a);
        addTitlePart(document, a);
        addContent(document, uloge);
        document.close();
    }

    private final Font naslov = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
    private final Font podnaslov = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
    private final Font standardni = new Font(Font.FontFamily.HELVETICA, 14, Font.NORMAL);
    private final Font smallBold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

    private void addMetaData(Document document, Avion a) {
        document.addTitle("PDF izvestaj");
        document.addSubject("Automatski kreiran PDF izvestaj za avion " + a);
        document.addKeywords("Java, PDF, iText, " + a);
        document.addAuthor("Lazar Vujadinovic");
        document.addCreator("Lazar Vujadinovic");
    }

    private void addTitlePart(Document document, Avion a) throws DocumentException {
        Paragraph preface = new Paragraph();

        preface.add(new Paragraph("Izvestaj o avionu: " + a, naslov));

        preface.add(new Paragraph(" "));

        preface.add(new Paragraph("Autor izvestaja: Lazar Vujadinovic, vreme: " + new SimpleDateFormat("d/M/yyyy. H:mm:ss").format(new Date()), smallBold));
        preface.add(new Paragraph(" "));
        preface.add(new Paragraph("Ovaj dokument daje uvid u osnovne karakteristike aviona "
                + "\nkao i evidenciju dodeljivanih uloga po datumima.", smallBold));

        preface.add(new Paragraph(" "));

        preface.add(new Paragraph("Osnovni podaci o avionu", standardni));
        preface.add(new Paragraph("Serijski broj: " + a.getAvionID(), standardni));
        preface.add(new Paragraph("Zvanicna oznaka(naziv) aviona: " + a.getOznaka(), standardni));
        preface.add(new Paragraph("Godina proizvodnje: " + a.getGodinaProizvodnje(), standardni));
        preface.add(new Paragraph("Broj putnika: " + a.getBrojPutnika(), standardni));
        if (a.getBrojPutnika() < 20) {
            preface.add(new Paragraph("Broj clanova posade: " + a.getBrojPutnika() / 2, standardni));
        } else {
            preface.add(new Paragraph("Broj clanova posade: " + a.getBrojPutnika() / 20, standardni));
        }
        preface.add(new Paragraph("Nosivost: " + a.getNosivost() + " tona", standardni));
        preface.add(new Paragraph("Tip kojem avion pripada: " + a.getTip().getNazivTipa(), standardni));
        preface.add(new Paragraph(" "));
        preface.add(new Paragraph("************************************************************************************************"));
        document.add(preface);
    }

    private void addContent(Document document, java.util.List<Uloga> uloge) throws DocumentException {
        if (uloge == null || uloge.isEmpty()) {
            Paragraph p = new Paragraph("Za ovaj avion nema dodeljenih uloga, ili une nisu dobro ucitane prilikom kreiranja izvestaja.");
            document.add(p);
        } else {
            for (Uloga u : uloge) {
                Paragraph par = new Paragraph("Datum: " + new SimpleDateFormat("dd/MM/yyyy.").format(u.getDatumLeta()), naslov);
                document.add(par);
                document.add(new Paragraph("Uloga: " + u.getNazivUloge()));
                Pilot p = u.getPilot();
                document.add(new Paragraph("Pilot: " + p.getImePrezime() + ", JMBG: [" + p.getJmbg()
                        + "], rodjen " + p.getGodinaRodjenja() + ". godine."));
                String zdrav;
                if (p.isProsaoTestZdravstvenogStanja()) {
                    zdrav = "sposoban.";
                } else {
                    zdrav = "nesposoban.";
                }
                document.add(new Paragraph("koji je dana: " + new SimpleDateFormat("dd/MM/yyyy.").format(p.getDatumPregleda()) + " na pregledu zdravstvenog stanja zaveden kao: " + zdrav));

                document.add(new Paragraph(" "));
            }
        }

    }

}
