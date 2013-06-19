package util;

public enum Paths {
	
	RESTAURANTE("C:\\Documents and Settings\\vflima\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Restaurante.txt"),
	CINEMA("C:\\Documents and Settings\\vflima\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Cinema.txt"),
	TEATRO("C:\\Documents and Settings\\vflima\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Teatro.txt");

	private String path;
	
	Paths(String path){
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
}
