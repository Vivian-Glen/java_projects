/*In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan*/
public class CarLoan {
	public static void main(String[] args) {
 int carLoan = 10000;
 int loanLength = 3;
 int interestRate = 5;
 int downPayment = 2000;
 if(loanLength <= 0 || interestRate <= 0){
  System.out.println("Error! You must take out a valid car loan.");
 }
 else if(downPayment >= carLoan){
System.out.println("The car can be paid in full");
 }
 else{
// calculating payment amount
int remainingBalance = carLoan - downPayment;
//since we need monthly payment
int months = loanLength*12;
// monthly payment without interest
int monthlyBalance = remainingBalance/months;
// The interest for the loan amount
int interest = monthlyBalance * 100;
// Total including the interest to be paid
int monthlyPayment = monthlyBalance+ interest;
System.out.println("The Monthly Payment for the car loan to be paid is:"+ monthlyPayment);
 }

	}
}
