import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" + "-----------Serie------------" + "\n");
        Serie galactica = new Serie("Battlestar Galactica", "When an old enemy, the Cylons, resurface and obliterate " +
                "the 12 colonies," + "\n" + "the crew of the aged Galactica protect a small civilian fleet - the last" +
                " of humanity..", LocalDate.of(2005, 1, 14));

        //Regissør
        Person jc = new Person("James", "Cameron");
        Person mr = new Person("Michael", "Rymer");

        //Episode
        Episode thirtythree = new Episode(1,1, "33", 42, LocalDate.of(2005, 1, 14), "Beskrivelse", mr);
        Episode water = new Episode(1, 2, "Water", 42, LocalDate.of(2005, 1, 14), "Besekrivelse", mr);

        //Legg til sesonger og episoder
        galactica.leggTilEpisode(thirtythree);
        galactica.leggTilEpisode(water);


        System.out.println(galactica.toString());

        //Henter alle episoder
        System.out.println("\n" + "------------ALLE EP-----------" + "\n");
        galactica.hentAlleEpisoder();

        //Antall episoder
        System.out.println("\n" + "-----------ANTALL EP------------" + "\n");
        System.out.println(galactica.antallEpisoder());

        //Roller
        Person sw = new Person("Sam", "Worthington");
        Person zs = new Person("Zoe", "Saldana");

        Person ks = new Person("Katee", "Sackhoff");
        Person jb = new Person("Jamie", "Bamber");

        Rolle js = new Rolle("Jake", "Sully", sw);
        Rolle nb = new Rolle("Neytiri", "Blue", zs);

        Rolle kt = new Rolle("Kara", "Thrace", ks);
        Rolle la = new Rolle("Lee", "Adama", jb);


        //Film
        System.out.println("\n" + "------------FILM-----------" + "\n");

        Film avatar = new Film("Avatar", 150, LocalDate.of(2009 , 12, 10), "A paraplegic marine dispatched to " +
                "the moon Pandora on a unique mission becomes torn..", jc);

        System.out.println(avatar.toString());

        /*System.out.println("Filmen: " + avatar.getTittel() + " - " + avatar.getBeskrivelse() + " varer i " + avatar
                .getSpilleTid() + " " + "min " + "og " + "utgitt" + " i " + "- " + avatar.getUtgivelsesdato() + " - " +
                "Regissert av: " + jc.hentFultNavn());*/




        //Legg til roller
        ArrayList<Rolle> filmRoller = new ArrayList<>();

        filmRoller.add(js);
        filmRoller.add(nb);

        avatar.leggTilMangeRoller(filmRoller);
        //System.out.println(avatar.getRoller());

        ArrayList<Rolle> serieRoller = new ArrayList<>();

        serieRoller.add(kt);
        serieRoller.add(la);

        thirtythree.leggTilMangeRoller(serieRoller);
        water.leggTilMangeRoller(serieRoller);
        //System.out.println(thirtythree.getRoller());

        System.out.println("\n" + "---------Henter Roller-----------");
        for (Rolle enRolle : galactica.hentCast()){
            System.out.println(enRolle);
        }
    }
}