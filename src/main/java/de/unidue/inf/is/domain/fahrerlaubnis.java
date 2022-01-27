package de.unidue.inf.is.domain;
import java.time.LocalDate;

public class fahrerlaubnis {
    private int fahrer;
    private int nummer;
    private LocalDate ablaufdatum;

    public fahrerlaubnis(int fahrer, int nummer, LocalDate ablaufdatum) {
        this.fahrer = fahrer;
        this.nummer = nummer;
        this.ablaufdatum = ablaufdatum;
    }
    public fahrerlaubnis(){

    }

    public int getFahrer() {
        return fahrer;
    }

    public void setFahrer(int fahrer) {
        this.fahrer = fahrer;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public LocalDate getAblaufdatum() {
        return ablaufdatum;
    }

    public void setAblaufdatum(LocalDate ablaufdatum) {
        this.ablaufdatum = ablaufdatum;
    }


}
