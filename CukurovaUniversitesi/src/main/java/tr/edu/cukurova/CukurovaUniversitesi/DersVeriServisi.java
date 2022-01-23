package tr.edu.cukurova.CukurovaUniversitesi;

import java.util.ArrayList;
import java.util.List;

public class DersVeriServisi {

	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Matematik"));
		DERSLER.add(new Ders("Türkçe"));
		DERSLER.add(new Ders("Fen"));
		DERSLER.add(new Ders("Müzik"));
	}
	public static List<Ders> dersleriGetir(){
		return DERSLER;
	}
	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	public static void dersSil(String adi) {
	}


}
