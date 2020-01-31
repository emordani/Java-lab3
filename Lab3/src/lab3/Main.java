package lab3;

public class Main {

	public static void main(String[] args) {
		 	Vlasnik v1 = new Vlasnik("1","Ivo","Ivic","Maksimir 22");
	        Vlasnik v2 = new Vlasnik("2","Mate","Matic","Maksimir 11");

	        BankovniRacun b1 = new BankovniRacun("1",v1,0.0,0.0,null,"HRK");
	        BankovniRacun b2 = new BankovniRacun("2",v2,0.0,0.0,null,"HRK");

	        b1.uplata(Promet.KreirajPotraznjaP(100.0,"HRK"));
	        System.out.println(b1);

	        b2.isplata(Promet.KreirajDugovniP(90.0,"HRK"));
	        System.out.println(b2);

	        BankovniRacun b3=b1;

	        b3.isplata(Promet.KreirajDugovniP(100.0,"HRK"));
	        System.out.println(b3);

	        b2.uplata(Promet.KreirajPotraznjaP(200.0,"HRK"));
	        System.out.println(b2);

	        b3 = new BankovniRacun("3",v1,0.0,0.0,null,"HRK");
	        b3.uplata(Promet.KreirajPotraznjaP(250.0,"HRK"));
	        System.out.println(b3);
	        
	        b3.isplata(Promet.KreirajDugovniP(100.0,"HRK"));
	        System.out.println(b3);
	        b3.uplata(Promet.KreirajPotraznjaP(250.0,"HRK"));
	        System.out.println(b3);
	        
	        b3.isplata(Promet.KreirajDugovniP(100.0,"HRK"));
	        System.out.println(b3);
	        b3.uplata(Promet.KreirajPotraznjaP(250.0,"HRK"));
	        System.out.println(b3);
	        
	        b3.isplata(Promet.KreirajDugovniP(100.0,"HRK"));
	        System.out.println(b3);
	         
	}

}
