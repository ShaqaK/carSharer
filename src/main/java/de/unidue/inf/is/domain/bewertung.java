package de.unidue.inf.is.domain;
import java.time.LocalDate;

public class bewertung {
    private int id;
    private char textnachricht;
    private LocalDate erstellungsdatum;
    private int rating;

    public bewertung(){

    }

    public bewertung(int id, char textnachricht, LocalDate erstellungsdatum, int rating) {
        this.id = id;
        this.textnachricht = textnachricht;
        this.erstellungsdatum = erstellungsdatum;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTextnachricht() {
        return textnachricht;
    }

    public void setTextnachricht(char textnachricht) {
        this.textnachricht = textnachricht;
    }

    public LocalDate getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(LocalDate erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
