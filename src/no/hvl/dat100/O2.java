package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
public class O2 {
	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++) {
			int pSum = Integer.parseInt(showInputDialog("Poengsum: "));

				if ((pSum <= 100)&&(90 <= pSum)){
					System.out.println("Karakter: A");}
				else if ((pSum <= 89)&&(80 <= pSum)){
					System.out.println("Karakter: B");}
				else if ((pSum <= 79)&&(60 <= pSum)){
					System.out.println("Karakter: C");}
				else if ((pSum <= 59)&&(50 <= pSum)){
					System.out.println("Karakter: D");}
				else if ((pSum <= 49)&&(pSum >= 40)){
					System.out.println("Karakter: E");}
				else if ((pSum <= 39)&&(pSum >= 0)){
					System.out.println("Karakter: F");}
				else {
					System.out.println("Ugyldig poengsum! Les inn verdi på nytt");}
                 i--;
				}	


			}			
}
	           
	  
	   