package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;
import ec.edu.espol.workshops.second.CarInsurance;

public class StepsDefs {
 private int age;
 private char marriedStatus;
 private char gender;
 private char statusLicense;
 private int prime;
 
 
 
 
 @Given("is married")
 public void is_married() {
	 marriedStatus='Y';
 }
 
 @And("is under 44 years old")
 public void is_under_44_years_old() {
	 age=44;
 }
 @And("is male")
 public void is_male() {
	 gender='M';
 }
 @And("have a valid driving license")
 public void have_a_valid_driving_license() {
	 statusLicense='Y';
 }
 
 @Given("is {char}")
 public void is(char marriedStatus) {
	 this.marriedStatus=marriedStatus;
 }
 
 @And("is under {int} years old")
 public void is_under(int age) {
	 this.age=age;
 }
 @And("is {char}")
 public void isg(char gender) {
	 this.gender=gender;
 }
 @And("have a {char}")
 public void have_a(char statusLicense) {
	 this.statusLicense=statusLicense;
 }
 
 @When("Calculate the insurance prime")
 public void calculate_the_insurance_prime() {
	 //prime= CarInsurance.calcularPrima();
 }
 @Then("show {int}")
 public void show(int expectedAnswer) {
 assertEquals(expectedAnswer, prime);
 }
 
 
 @Given("age is over 80 years old")
 public void age_is_over_80_years_old() {
	 age=80;
 }
 
 @And("is not married")
 public void is_not_married() {
	 marriedStatus='N';
 }
 @And("is male")
 public void is_female() {
	 gender='F';
 }
 @And("have a valid driving license")
 public void have_a_valid_driving_license2() {
	 statusLicense='Y';
 }
 
 @Given("is over {int} years old")
 public void is_over_years_old(int age) {
	 this.age=age;
 }
 
@And ("is {char}")
 public void ism(char marriedStatus) {
	 this.marriedStatus=marriedStatus;
 }

 @And("is {char}")
 public void isf(char gender) {
	 this.gender=gender;
 }
 @And("have a {char}")
 public void have_a_valid(char statusLicense) {
	 this.statusLicense=statusLicense;
 }
 
 @When("Calculate the insurance prime")
 public void calculate_the_insurance_prime2() {
	 //prime= 
 }
 @Then("show {int}")
 public void show2(int expectedAnswer) {
 assertEquals(expectedAnswer, prime);
 }
 
 
 @Given("is female")
 public void is_female2() {
	 this.gender='F';
 }
 
 @Given("is female")
 public void is_f(char gender) {
	 this.gender=gender;
 }
 @When("Calculate the insurance prime")
 public void calculate_the_insurance_prime3() {
	// prime= 
 }
 @Then("show {int}")
 public void show3(int expectedAnswer) {
 assertEquals(expectedAnswer, prime);
 }
 
 
}