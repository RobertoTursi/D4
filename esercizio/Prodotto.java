package esercizio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Prodotto {
	
	private long id;
	private String name;
	private String category;
	private double price;
	
//	public Prodotto(long id, String name, String category, double price) {
//		this.id = id;
//		this.name = name;
//		this.category = category;
//		this.price = price;
//	}
		
	
}
