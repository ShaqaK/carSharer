package de.unidue.inf.is.domain;

public class reservieren {
	/*CREATE TABLE reservieren (
		  	kunde SMALLINT NOT NULL,
		  	fahrt SMALLINT NOT NULL,
		  	anzPlaetze SMALLINT NOT NULL CHECK (anzPlaetze BETWEEN 1 AND 2),
		  	PRIMARY KEY (kunde, fahrt),
		  	FOREIGN KEY (kunde) REFERENCES benutzer(bid),
		  	FOREIGN KEY (fahrt) REFERENCES fahrt(fid)
		);*/
	public reservieren() {};
	public int getKunde() {
		return kunde;
	}
	public void setKunde(int kunde) {
		this.kunde = kunde;
	}
	public int getFahrt() {
		return fahrt;
	}
	public void setFahrt(int fahrt) {
		this.fahrt = fahrt;
	}
	public int getAnzPlaetze() {
		return anzPlaetze;
	}
	public void setAnzPlaetze(int anzPlaetze) {
		this.anzPlaetze = anzPlaetze;
	}
	private int kunde;
	private int fahrt;
	private int anzPlaetze;
	
}
