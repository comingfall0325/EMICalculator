package day4;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter loan amount in USD");
		double pricipal = scanner.nextDouble();
		
		System.out.println("Enter annual interest rate (in %)");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter loan tenure in years");
		int tenureYears = scanner.nextInt();
		
		double monthlyInterestRate = annualInterestRate / (12 * 100);
		
		int tenureMonth = tenureYears * 12;
		
		//EMI = P x R x (1+R)^N / [(1+R)^N-1]
		double emi = (pricipal * monthlyInterestRate * Math.pow(monthlyInterestRate + 1, tenureMonth))
				/ (Math.pow(monthlyInterestRate + 1, tenureMonth) - 1);
		
		System.out.println("Your monthly payment is: " + emi);
		
		scanner.close();

	}

}
