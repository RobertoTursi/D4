package esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//IMPOSTAZIONE
		Cliente c1 = new Cliente(1, "cliente1", 2);
		Cliente c2 = new Cliente(2, "cliente2", 2);
		Cliente c3 = new Cliente(3, "cliente3", 2);

		Prodotto p1 = new Prodotto(1, "prodotto1", "book", 130d);
		Prodotto p2 = new Prodotto(1, "prodotto2", "boys", 10d);
		Prodotto p3 = new Prodotto(1, "prodotto3", "baby", 412d);
		Prodotto p4 = new Prodotto(1, "prodotto4", "boys", 63d);
		Prodotto p5 = new Prodotto(1, "prodotto5", "baby", 23d);
		
		
		List<Prodotto> p01 = new ArrayList<Prodotto>();
		p01.add(p3);
		p01.add(p2);
		p01.add(p1);
		
		Ordine o1 = new Ordine(1, "s1", LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), p01, c1);
	
		List<Prodotto> p02 = new ArrayList<Prodotto>();
		p01.add(p5);
		p01.add(p2);
		p01.add(p1);
		
		Ordine o2 = new Ordine(2, "s2", LocalDate.of(2021, 4, 20), LocalDate.of(2021, 3, 22), p02, c2);
	
		List<Prodotto> p03 = new ArrayList<Prodotto>();
		p01.add(p4);
		p01.add(p3);
		p01.add(p5);
		
		Ordine o3 = new Ordine(3, "s3", LocalDate.of(2021, 9, 17), LocalDate.of(2021, 9, 19), p03, c3);
	
		List<Ordine> ordini = new ArrayList<Ordine>();
		ordini.add(o1);
		ordini.add(o2);
		ordini.add(o3);
		
		//ESERCIZIO 1 
		// - Risoluzione difficile:
		
		//quando si fanno gli stream creare come prima cosa prima dell'uguale
		//ciò che vogliamo ottenere, in questo caso una lista di prodotti:
		List<Prodotto> l = ordini.stream() // --> Stream<Ordine>
				
				.map(ordine ->{return ordine.getProducts();}) //col map estraiamo
				//in questo caso una lista di liste di prodotti -->  Stream<List<Prodotto>>
				
				.flatMap(ordine -> ordine.stream()) // con flatMap estraiamo le 
				//singole liste  dalla lista di liste creata sopra con map --> Stream<Prodotto>
				
				.filter(p -> (p.getCategory().equals("book") && p.getPrice() > 100)) 
				//il filter prenderà solo i prodotto appartententi alla categoria
				//"book" con un prezzo maggiore di cento
				.distinct() //serve a togliere, qualora ci fossero, i duplicati
				//di un dato oggetto
				//dato che alla fine vogliamo ottenere una lista metteremo il collect: 
				.collect(Collectors.toList());
		
		System.out.println(l.toString());
		
		
   	    /// - Risoluzione facile:
				
			//Questo esercizio si può anche svolgere utilizzando un semplice
			//Stream.of() che prende tutti i prodotti e un filter per filtrarli
			//e un collect, come sopra per avere una lista
				List<Prodotto> prods = Stream.of(p1, p2, p3, p4, p5)
				.filter(p -> p.getCategory().equals("book") && p.getPrice() > 100)
				.collect(Collectors.toList());
				
				System.out.println(prods.toString());
				
				
		//ESERCIZIO 4
		
	}

}
