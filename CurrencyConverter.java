import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, code, euro, yen, ringgit, rupee;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Hi, Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1:Rupee \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 73.80;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 
			pound = amount / 102.61;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
 
			euro = amount / 88.73;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
 
			yen = amount / 0.68;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
 
			ringgit = amount / 17.93;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion
 
			rupee = amount * 73.83;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
 
			pound = amount * 0.72;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.83;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
 
			yen = amount * 109.30;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.12;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion
 
			rupee = amount * 102.63;
			System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.39;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
 
			euro = amount * 1.16;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
 
			yen = amount * 151.95;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 5.72;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion
 
			rupee = amount * 88.71;
			System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.20;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.86;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
 
			yen = amount * 131.38;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.95;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		} else if (code == 5) {
 
			// For Yen Conversion
 
			rupee = amount * 0.68;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.009;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.006;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
 
			ringgit = amount * 0.038;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion
 
			rupee = amount * 17.92;
			System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.24;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");
 
			pound = amount * 0.17;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");
 
			euro = amount * 0.20;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");
 
			yen = amount * 26.53;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		} else {
			System.out.println("Invalid input");
		}
		
	}
 
}
