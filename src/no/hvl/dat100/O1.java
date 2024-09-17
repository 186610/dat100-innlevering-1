package no.hvl.dat100;
import java.util.Scanner;
public class O1 {	    
public static double beregnTrinnskatt(double bruttoinntekt) {
	double[] trinn = {0, 208050, 292850, 670000, 937900, 1350000};
	        double[] satser = {0, 0.017, 0.04, 0.136, 0.166, 0.176};

	        double trinnskatt = 0;

	        for (int i = trinn.length - 1; i >= 0; i--) {
	            if (bruttoinntekt > trinn[i]) {
	                trinnskatt += (bruttoinntekt - trinn[i]) * satser[i];
	                bruttoinntekt = trinn[i];
	            }
	        }

	        return trinnskatt;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Skriv inn din bruttoinntekt: ");
	            double bruttoinntekt = scanner.nextDouble();
	            double trinnskatt = beregnTrinnskatt(bruttoinntekt);
	            System.out.printf("Du skal betale %.2f kr i trinnskatt.%n", trinnskatt);
	        } catch (Exception e) {
	            System.out.println("Ugyldig input. Vennligst skriv inn et tall.");
	        } finally {
	            scanner.close();
	        }
	    }
	}

