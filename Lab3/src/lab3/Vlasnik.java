package lab3;

public class Vlasnik {
	private String ime;
	private String prezime;
	private String oib;
	private String adresa;

	public Vlasnik(String oib, String ime, String prezime) {
	       this.oib = oib;
	       this.ime = ime;
	       this.prezime = prezime;
    }
	    // constructor sa svim poljima
	 public Vlasnik(String oib, String ime, String prezime, String adresa) {
	      this.oib = oib;
	      this.ime = ime;
	      this.prezime = prezime;
	      this.adresa = adresa;
	}
//getters
public String getOib() {
    return oib;
}

public String getIme() {
    return ime;
}

public String getPrezime() {
    return prezime;
}

public String getAdresa() {
    return adresa;
}

//setters
public void setIme(String ime) {
    this.ime = ime;
}

public void setPrezime(String prezime) {
    this.prezime = prezime;
}

public void setAdresa(String adresa) {
    this.adresa = adresa;
}
}