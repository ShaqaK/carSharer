package de.unidue.inf.is.domain;
import java.security.Timestamp;



public class fahrerlaubnis {
	/*CREATE TABLE fahrerlaubnis (
  	fahrer SMALLINT NOT NULL,
  	nummer SMALLINT NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  	ablaufdatum timestamp NOT NULL,
  	?PRIMARY KEY (fahrer, nummer),
  	?FOREIGN KEY (fahrer) REFERENCES benutzer(bid)
);*/
	public fahrerlaubnis() {};
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
	public Timestamp getAblaufdatum() {
		return ablaufdatum;
	}
	public void setAblaufdatum(Timestamp ablaufdatum) {
		this.ablaufdatum = ablaufdatum;
	}
	private int fahrer;
	private int nummer;
	private Timestamp ablaufdatum;
	

}
