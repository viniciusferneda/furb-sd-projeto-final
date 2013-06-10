package util;

public enum Paths {
	
	RESTAURANTE("C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Restaurante.txt"),
	CINEMA("C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Cinema.txt"),
	TEATRO("C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Teatro.txt");

	private String path;
	
	Paths(String path){
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
}
