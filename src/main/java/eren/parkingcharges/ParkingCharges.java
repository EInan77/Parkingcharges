/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.parkingcharges;

import java.util.Scanner;

/**
 *
 * @author ereni
 */
public class ParkingCharges {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double runningTotal = 0.0;
        
        System.out.print("Enter the number of hours parked:" + '\n');
        System.out.print("Enter 0 to end program");
        double hours = input.nextDouble();
        
        while (hours > 0) {
            double charge = calculateCharges(hours);
            runningTotal += charge;
            System.out.printf("The charge for this customer is $%.2f%n", charge);
            System.out.printf("Running total for receipts from yesterday are $%.2f%n", runningTotal);
            
            System.out.print("Enter new amount of hours parked ");
            hours = input.nextDouble();
            
        }
        
        
    }
    
    public static double calculateCharges(double hours) {
        double minFee = 2.0;
        double addFee = 0.5;
        double maxFee = 10.0;
        double charge = 0.0;
        
        if (hours <= 3.0) {
            charge = minFee;
        } else if (hours <= 24.0) {
            charge = minFee + ((hours - 3.0) * addFee);
           
        } else {
            charge = maxFee;
        }
        
        return charge;
    }
}