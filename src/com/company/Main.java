package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

                Scanner keyboard = new Scanner(System.in);
                //creating keyboard object from Scanner class
                double l = 0;
                double i = 0;
                double mp = 0;
                double bal = 0;
                int trm;

                // creating variables

                System.out.printf("Enter the loan amount: ");
                l = keyboard.nextDouble();

                System.out.printf("Enter the interest rate on the loan: ");
                i = keyboard.nextDouble();

                System.out.printf("Enter the term (years) for the loan payment: ");
                trm = keyboard.nextInt();

                System.out.printf("\n======================================\n");
                keyboard.close();

                //asking user to input values and storing in the respective variables.

            final double getMonthlyPayment;
                double rate = (i/ 100) / 12;
                double base = (1 + rate);
                double months = trm / 12;
                double result = 0.0;
                result = ((rate * l) / (1 - Math.pow(base, -months)));
// calculating to get the actual mortage amount in a year.

                mp = (l * i *trm);
                bal = -(mp*(trm*12));
                System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
                System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mp);
                //printing out the result- balance owed to bank and monthly payment to be done.
            }



            }



