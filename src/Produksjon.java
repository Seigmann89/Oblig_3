import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Produksjon {
    private String tittel;
    private int spilleTid;
    private LocalDate utgivelsesdato;
    private String beskrivelse;
    private Person regissor;
    private ArrayList<Rolle> roller;

    //Constructors

    public Produksjon() {
        this.tittel = "Tittel";
        this.spilleTid = new Random().nextInt(30 - 20) + 20;
        this.utgivelsesdato = LocalDate.now();
        this.beskrivelse = "Beskrivelse";
        this.regissor = regissor;
        this.roller = new ArrayList<>();
    }

    public Produksjon(String tittel, int spilleTid, Person regissor) {
        this.tittel = tittel;
        this.spilleTid = new Random().nextInt(30 - 20) + 20;
        this.regissor = regissor;
        this.roller = new ArrayList<>();
    }

    public Produksjon(String tittel, int spilleTid, LocalDate utgivelsesdato, String beskrivelse, Person regissor) {
        this.tittel = tittel;
        this.spilleTid = new Random().nextInt(30 - 20) + 20;
        this.utgivelsesdato = utgivelsesdato;
        this.beskrivelse = beskrivelse;
        this.regissor = regissor;
        this.roller = new ArrayList<>();
    }

    public Produksjon(int spilleTid, LocalDate utgivelsesdato) {
        this.spilleTid = spilleTid;
        this.utgivelsesdato = utgivelsesdato;
        this.roller = new ArrayList<>();
    }

    //Methods

    public void leggTilEnRolle(Rolle rolle) {
        this.roller.add(rolle);
    }

    public void leggTilMangeRoller(ArrayList<Rolle> rolle) {
        this.roller.addAll(rolle);
    }

    //Gettere

    public String getTittel() {
        return tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public int getSpilleTid() {
        return spilleTid;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public ArrayList<Rolle> getRoller() {
        return roller;
    }

    public Person getRegissor() {
        return regissor;
    }


    //Settere

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    public void setRoller(ArrayList<Rolle> roller) {
        this.roller = roller;
    }

    @Override
    public String toString() {
        return tittel + " - " + beskrivelse + " - " + spilleTid + " min" + " - " + regissor;
    }
}
