import java.time.LocalDate;

public class Film extends Produksjon{

    public Film(String tittel, int spilleTid, LocalDate utgivelsesdato, String beskrivelse, Person regissor){
        super(tittel, spilleTid, utgivelsesdato, beskrivelse, regissor);
    }

    @Override
    public String toString() {
        return getTittel() + "\n" + " - " + getBeskrivelse() + " - " + "\n" + "Varer i " + getSpilleTid() + " min" +
                "\n" + "Utgitt i - " + getUtgivelsesdato() + "\n" + "Regissert av - " + getRegissor();
    }
}
