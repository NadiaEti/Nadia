package practice_mentor;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.println("Qty of Cucumbers");
		 int QCucumbers = sc.nextInt();
		 System.out.println("Price per Cucumbers box: ");
		 double PCucumbers = sc.nextDouble();
		 double totalCucumbers = QCucumbers*PCucumbers;
		 System.out.println("Price for Cucumber : "+totalCucumbers );
		 
		 System.out.println("");
		 sc.close();
	}
}
