package lab3;

import java.util.ArrayList;
import java.util.List;

public class BankovniRacun {
	private final String iBan;
	private Vlasnik vlasnik;
	private final double  pocetnoStanje;
	private double stanje;
	protected  List<Promet> prometi=new ArrayList<Promet>();	
	private String valuta;
	public BankovniRacun(String iBan, Vlasnik vlasnik, double pocetnoStanje, double stanje, Promet promet, String valuta) {
        this.iBan = iBan;
        this.vlasnik = vlasnik;
        this.pocetnoStanje = pocetnoStanje;
        this.stanje = stanje;
        prometi.add(promet);
        this.valuta = valuta;
    }
	//methods
    public void uplata(Promet promet){
        prometi.add(promet);
        stanje = stanje + promet.getIznosPot();
        
    }

    public void isplata(Promet promet){
        if(promet.getIznosDug() > stanje){
            System.out.println("Nedozvoljena transakcija,nemate pravo na minus");            
        }
        
       else {
    	prometi.add(promet);
		stanje = stanje - promet.getIznosDug();
	}       
       
    }

    
    public String getiBan() {
        return iBan;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public double getPocetnoStanje() {
        return pocetnoStanje;
    }

    public double getStanje() {
        return stanje;
    }

    public String getValuta(){
        return valuta;
    }

    @Override
    public String toString() {
        return "BankovniRacun{" +
                "stanje=" + stanje +
                '}';
    }
    
}
