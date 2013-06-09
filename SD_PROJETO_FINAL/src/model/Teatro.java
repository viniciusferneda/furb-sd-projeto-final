package model;

public class Teatro {

	private int id;
	private String nome;
	private int idPeca;
	private String nomePeca;
	private int horario;
	private int capacidade;
	
	public Teatro(int id, String nome, int idPeca, String nomePeca, int horario, int capacidade) {
		this.id = id;
		this.nome = nome;
		this.idPeca = idPeca;
		this.nomePeca = nomePeca;
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
	public int getIdPeca() {
		return idPeca;
	}
	public void setIdPeca(int idPeca) {
		this.idPeca = idPeca;
	}
	public String getNomePeca() {
		return nomePeca;
	}
	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
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
