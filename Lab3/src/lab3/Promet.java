package lab3;



public class Promet {
	private final double iznosDug;
	private final double iznosPot;
	private final String valuta;
	private final boolean storno;
	

	private Promet(double id,double ip,String v, boolean s) {
		iznosDug=id;
		iznosPot=ip;
		valuta=v;
		storno=s;
	}
	static public Promet KreirajPotraznjaP (double ip,String v) {
		return new Promet(0, ip, v, false);
	}
	static public Promet KreirajDugovniP(double id,String v) {
		return new Promet(id, 0, v, false);		
	}
	public double getIznosDug() {
        return iznosDug;
    }

    public double getIznosPot() {
        return iznosPot;
    }

    public String getValuta() {
        return valuta;
    }

    public boolean isStorno() {
        return storno;
    }
}
