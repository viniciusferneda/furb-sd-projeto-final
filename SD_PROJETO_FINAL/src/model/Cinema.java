package model;

public class Cinema {

	private int id;
	private String nome;
	private int idFilme;
	private String nomeFilme;
	private int horario;
	private int capacidade;
		
	public Cinema(int id, String nome, int idFilme, String nomeFilme, int horario, int capacidade) {
		this.id = id;
		this.nome = nome;
		this.idFilme = idFilme;
		this.nomeFilme = nomeFilme;
		this.horario = horario;
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
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
