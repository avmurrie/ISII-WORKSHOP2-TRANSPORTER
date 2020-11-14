package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
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
 @Then("Show 500")
 public void Show_500() {
 assertEquals(500, prime);
 }
 
 
 
 
 
 @Given("age is over 80 years old")
 public void age_is_over_80_years_old() {
	 this.age=81;
 }
 
 @And("is not married")
 public void is_not_married() {
	 this.marriedStatus='N';
 }
 @And("is female not married")
 public void is_female_not_married() {
	 this.gender='F';
 }
 @And("have a valid driving license female customer")
 public void have_a_valid_driving_license_female_customer() {
	 this.statusLicense='Y';
 }
 
 @When("Calculate the insurance prime over 80")
 public void calculate_the_insurance_prime_over_80() {
	 prime= CarInsurance.calcularPrime(age,gender,marriedStatus,statusLicense);
 }
 @Then("Show -1")
 public void Show_1() {
 assertEquals(-1, prime);
 }
 
 
 @Given("is customer {char}")
 public void is_customer(char gender) {
	 this.gender=gender;
 }
 @When("Calculate the insurance prime female")
 public void calculate_the_insurance_prime_female() {
	 prime= CarInsurance.calcularPrime(50,gender,'Y','Y');
 }
 @Then("Show prime 300")
 public void Show_prime_300() {
 assertEquals(300, prime);
 }
 
 
}