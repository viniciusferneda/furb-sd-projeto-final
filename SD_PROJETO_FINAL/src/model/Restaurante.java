package model;

public class Restaurante {

	private int id;
	private String nome;
	private int capacidade;
	
	public Restaurante(int id, String nome, int capacidade) {
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
