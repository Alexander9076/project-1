/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the ecsditor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author Casey
 */
public class Temperature {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Enter the Celsius value:");
        //Scanner sc = new Scanner(System.in);
        double celsius = 9;
        System.out.println("Celsius: "+celsius);
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.println("Fahrenheit: "+fahrenheit);
		double kelvin = celsius + 273.0;
        System.out.println("Kelvin: "+kelvin);
    }
    
}
