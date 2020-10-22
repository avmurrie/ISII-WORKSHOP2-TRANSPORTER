package ec.edu.espol.workshops.second;

public class CarInsurance {
	private int ageClient;
	private char[] sexClient = {'M','F'};
	private String[] maritalStatus= {"married","notMarried"};
	private boolean licenseCliente;
	private final int BASE = 500;
	
	public int getAgeClient() {
		return ageClient;
	}
	public void setAgeClient(int ageClient) {
		this.ageClient = ageClient;
	}
	
	public char[] getSexClient() {
		return sexClient;
	}
	public void setSexClient(char[] sexClient) {
		this.sexClient = sexClient;
	}
	
	

}
