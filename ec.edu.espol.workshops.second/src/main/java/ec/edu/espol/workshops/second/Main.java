package ec.edu.espol.workshops.second;

import java.util.Scanner;


public class Main {
	public static void main(String[] args)  {
		CarInsurance usuario;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Welcome");
        try {
        	System.out.println("Age of the customer");
        	int edad=sc.nextInt();
        	System.out.println("Gender of the customer (F Femae / M Male) ");
        	char gen=sc.next().charAt(0);
        	System.out.println("Marital status of the customer (Y Married / N Not married)");
        	char estado=sc.next().charAt(0);
        	System.out.println("Have the customer valid driving license? (Y Yes / N No)");
        	char licencia=sc.next().charAt(0);

        	usuario= new CarInsurance(edad,gen,estado,licencia);
        	if(usuario.validarPolitica()) {
        		System.out.println("The value of the premium is:"+	usuario.calcularPrima());
        	}
        	else {
        		System.out.println("The customer does not apply to a valid premium");
        	}
        }        catch(Exception e){
        	System.out.println("Invalid data");
        }
        
	}
}
