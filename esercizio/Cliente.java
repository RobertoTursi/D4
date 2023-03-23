package esercizio;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Cliente {
	private long id;
	private String nome;
	private int tier;
	
//	public Cliente(long id, String nome, int tier) {
//		this.id = id;
//		this.nome = nome;
//		this.tier = tier;
//	}
}
