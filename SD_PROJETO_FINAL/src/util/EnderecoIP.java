package util;

public enum EnderecoIP {

	LOCALHOST("localhost"),
	IP("192.168.0.1");
	
	private String ip;
	
	EnderecoIP(String ip){
		this.ip = ip;
	}

	public String getIP() {
		return ip;
	}
}
