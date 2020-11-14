package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import java.lang.String;

import static org.junit.Assert.*;


public class StepsDefs {
 private int age;
 private char marriedStatus;
 private char gender;
 private char statusLicense;
 private int prime;
 
  
 
 @Given ("is under {int} years old")
 public void is_under_years_old(int age) {
	 this.age=age;
 }
 @When("Calculate the insurance prime")
 public void Calculate_the_insurance_prime() {
	 prime= CarInsurance.calcularPrime(age,'M',marriedStatus,'Y');
 }
 @Then("Show {int}")
 public void Show_500(int correctPrime) {
 assertEquals(correctPrime, prime);
 }
 
 
  
 @Given("The customer is over {int} years old")
 public void the_customer_is_over_years_old(int age) {
	 this.age=age;
 }
 
 @And("is married {string}")
 public void is_married(String marriedStatus) {
	 char married= marriedStatus.equals("no")?'N':'Y';
	 this.marriedStatus=married;
 }
 @And("is gender {string}")
 public void is_gender(String gender) {
	 char gen= gender.equals("female")?'F':'M';
	 this.gender=gen;
 }
 @And("have a {string}")
 public void have_a(String license) {
	 char statusLicense= license.equals("Yes")?'Y':'N';
	 this.statusLicense=statusLicense;
 }
 
 @When("Calculate the insurance prime customer over 80")
 public void calculate_the_insurance_prime_over_80() {
	 prime= CarInsurance.calcularPrime(age,gender,marriedStatus,statusLicense);
 }
 @Then("Show insurance {int}")
 public void Show_1(int correctPrime) {
 assertEquals(correctPrime, prime);
 }
 
 
 @Given("the customer is female")
 public void the_customer_is_female() {
	 this.gender='f';
 }
 @When("Calculate the insurance prime for a customer female")
 public void calculate_the_insurance_prime_for_a_customer_female() {
	 prime= CarInsurance.calcularPrime(25,gender,'n','y');
 }
 @Then("Show prime")
 public void show_prime() {
 assertEquals(300, prime);
 }

 
 @Given("The costumer is under 18 years old")
 public void the_customer_is_under_18_years_old() {
	 this.age=17;
 }
 
 @And("is male")
 public void is_male() {
	this.gender='m';
 }
 @When("Calculate the insurance prime for a customer under 18 years old")
 public void Calculate_the_insurance_prime_for_a_customer_under_18_years_old() {
	 prime= CarInsurance.calcularPrime(age,gender,'n','y');
 }
 @Then("Show prime customer")
 public void show_prime_customer() {
 assertEquals(-1, prime);
 }

 
 
}