package ec.edu.espol.workshops.second;

public class CarInsurance {

	private int ageClient;
	private char genClient;
	private char marriedStatus;
	private char licenseClient;
	private static final int base = 500;
	
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
	
  public int calcularPrima() {
    if (this.getAgeClient() < 25 && this.getGenClient() == 'M' 
        && this.getMarriedStatus() == 'N') {
      return base + 1500;
    } else if (this.getGenClient() == 'F' || this.getMarriedStatus() == 'Y') {
      return base - 200;
    } else if (this.getAgeClient() > 45 && this.getAgeClient() < 65) {
      return base - 100;
    }
    return -1;
  }
	
	//return true or false if customer information does not meet the requirements
	public boolean validarPolitica() {
		if(this.getAgeClient() > 80) {
			return false;
		}
		else if(this.getLicenseClient() == 'Y') {
			return true;
		}
		return false;
	}

	
	

}
