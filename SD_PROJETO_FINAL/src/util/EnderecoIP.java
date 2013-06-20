package util;

public enum EnderecoIP {

	LOCALHOST("localhost"),
	IP("localhost");
	
	private String ip;
	
	EnderecoIP(String ip){
		this.ip = ip;
	}

	public String getIP() {
		return ip;
	}
}
