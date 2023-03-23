package esercizio;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor  // scrivendo questa riga (e importandola da lombok) creiamo
//automaticamente un constructor con tutte le proprietà come parametri
@Getter //con Getter invece crea automaticamente tutti i metodiget per le 
//proprietà di questa classe
@ToString //ci regala il metodo toString per stampara in console l'oggetto
public class Ordine {
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Prodotto> products;
	private Cliente cliente;
	
	
	//grazie a Lombok non serve più scrivere questo
//	public Ordine(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Prodotto> products, Cliente cliente) {
//		this.id = id;
//		this.status = status;
//		this.orderDate = orderDate;
//		this.deliveryDate = deliveryDate;
//		this.products = products;
//		this.cliente = cliente;
//	}
}
