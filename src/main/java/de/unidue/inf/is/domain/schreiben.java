package de.unidue.inf.is.domain;

public class schreiben {
	/* CREATE TABLE schreiben (
  	benutzer SMALLINT NOT NULL,
  	fahrt SMALLINT NOT NULL,
  	bewertung SMALLINT NOT NULL,
  	PRIMARY KEY (benutzer, fahrt),
  	FOREIGN KEY (benutzer) REFERENCES benutzer(bid),
  	FOREIGN KEY (fahrt) REFERENCES fahrt(fid),
  	FOREIGN KEY (bewertung) REFERENCES bewertung(beid)
);

 */
	private int benutzer;
	private int fahrt;
	private int bewertung;
	public int getBenutzer() {
		return benutzer;
	}
	public void setBenutzer(int benutzer) {
		this.benutzer = benutzer;
	}
	public int getFahrt() {
		return fahrt;
	}
	public void setFahrt(int fahrt) {
		this.fahrt = fahrt;
	}
	public int getBewertung() {
		return bewertung;
	}
	public void setBewertung(int bewertung) {
		this.bewertung = bewertung;
	}
}
