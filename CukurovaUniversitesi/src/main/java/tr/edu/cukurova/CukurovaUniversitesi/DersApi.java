package tr.edu.cukurova.CukurovaUniversitesi;

import java.util.*;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/ders")
public class DersApi {

	
	@GetMapping("/listele")
	public List<Ders> listele(){
		return DersVeriServisi.dersleriGetir();
	}
	
	@GetMapping("/ekle")
	public Ders dersEkle(@RequestParam String adi) {
		Ders ders= new Ders(adi);
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
		
}

