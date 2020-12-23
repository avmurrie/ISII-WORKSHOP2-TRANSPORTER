package ec.edu.espol.workshops.second;

public class CarInsurance {

	private int ageClient;
	private char genClient;
	private char marriedStatus;
	private char licenseClient;
	protected static final int BASE = 500;

	public CarInsurance(int age, char gen, char marriedStatus,char licenseClient) {
		 this.ageClient = age;
		 this.genClient = gen;
		 this.marriedStatus = marriedStatus;
		 this.licenseClient = licenseClient;
	}

	
  public int getAgeClient() {
    return ageClient;
  }
	public void setAgeClient(int ageClient) {
		this.ageClient = ageClient;
	}
	public char getGenClient() {
		return genClient;
	}
	public void setGenClient(char genClient) {
		this.genClient = genClient;
	}
	public int getMarriedStatus() {
		return marriedStatus;
	}
	public void setMarriedStatus(char marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	
	public int getLicenseClient() {
		return licenseClient;
	}
	public void setLicenseClient(char licenseClient) {
		this.licenseClient = licenseClient;
	}
	
	//return the value of the insurance charge or -1 if not applicable

	public int insurate() {
		return (this.calcularPrime(this.ageClient, this.genClient, this.marriedStatus, this.licenseClient));
	}
	
	public static int calcularPrime(int age, char gender, char married, char license) {
		if(Character.toUpperCase(license)!='Y') {			
			return -1;
		}	
		else if(Character.toUpperCase(gender) !='M' && Character.toUpperCase(gender) !='F') {
			return -1;
		}
		else if(Character.toUpperCase(married) !='Y' && Character.toUpperCase(married) !='N') {
			return -1;
		}
		else if(age<25 && Character.toUpperCase(gender) =='M' && Character.toUpperCase(married)=='N') {
			return BASE+1500;
		}
		else if(Character.toUpperCase(gender)=='F' || Character.toUpperCase(married)=='Y') {
			return BASE-200;
		}
		else if(age>45 && age<65) {
			return BASE-100;
		}
		return BASE;
	}
	
	
	//return true or false if customer information does not meet the requirements
	public boolean validarPolitica() {
		if(this.getAgeClient()>80 || this.getAgeClient() < 18) {
			return false;
		}
		else if(Character.toUpperCase(this.getLicenseClient())!='Y') {			
			return false;
		}
		else if(Character.toUpperCase(this.getLicenseClient())=='Y') {			
			return true;
		}		
		return false;
	}

	
	

}

