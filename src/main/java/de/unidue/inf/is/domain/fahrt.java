package de.unidue.inf.is.domain;
import java.sql.Timestamp;


public class fahrt {
	/*CREATE TABLE fahrt (
  	fid SMALLINT NOT NULL GENERATED ALWAYS AS IDENTITY,
  	startort VARCHAR(100) NOT NULL,
  	zielort VARCHAR(100) NOT NULL,
  	fahrtdatumzeit timestamp NOT NULL,
	maxPlaetze SMALLINT NOT NULL CHECK (maxPlaetze BETWEEN 1 AND 10),
	fahrtkosten DECIMAL(10,2) NOT NULL,
	status VARCHAR(11) NOT NULL CHECK (status IN ('offen', 'geschlossen')) DEFAULT 'offen',
  	anbieter SMALLINT NOT NULL,
  	transportmittel SMALLINT NOT NULL,
  	beschreibung CLOB (1M),
  	PRIMARY KEY (fid),
  	FOREIGN KEY (anbieter) REFERENCES benutzer(bid),
  	FOREIGN KEY (transportmittel) REFERENCES transportmittel(tid)
);*/
	public fahrt() {};
	/*public fahrt(int fid , int fahrtkosten , String startort, String zielort, int maxPlaetze, String beschreibung, int transportmittel , int anbieter, String beschreibung1, int fahrtdatumzit ) {
		//0,0,null,null,0,null,0,0,null,0
	}
	*/
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getStartort() {
		return startort;
	}
	public void setStartort(String startort) {
		this.startort = startort;
	}
	public String getZielort() {
		return zielort;
	}
	public void setZielort(String zielort) {
		this.zielort = zielort;
	}
	public Timestamp getFahrtdatumzeit() {
		return fahrtdatumzeit;
	}
	public void setFahrtdatumzeit(Timestamp timestamp) {
		this.fahrtdatumzeit = timestamp;
	}
	public int getMaxPlaetze() {
		return maxPlaetze;
	}
	public void setMaxPlaetze(int maxPlaetze) {
		this.maxPlaetze = maxPlaetze;
	}
	public float getFahrtkosten() {
		return fahrtkosten;
	}
	public void setFahrtkosten(float fahrtkosten) {
		this.fahrtkosten = fahrtkosten;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String string) {
		this.status = string;
	}
	public int getAnbieter() {
		return anbieter;
	}
	public void setAnbieter(int anbieter) {
		this.anbieter = anbieter;
	}
	public int getTransportmittel() {
		return transportmittel;
	}
	public void setTransportmittel(int transportmittel) {
		this.transportmittel = transportmittel;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	private int fid;
	private String startort;
	private String zielort;
	private Timestamp fahrtdatumzeit;
	private int maxPlaetze;
	private float fahrtkosten;
	private String status;
	private int anbieter;
	private int transportmittel;
	private String beschreibung;
	
	
	
	

}
