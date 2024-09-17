package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class O3 {



	public static void main(String[] args) {
		
int n;
boolean ulovlig;
String tallTxt = showInputDialog("Gi n=");
n=parseInt(tallTxt);
ulovlig = (n<0);
if (ulovlig)
	showMessageDialog(null, "Ugyldig n-verdi!");
while (ulovlig);


showMessageDialog( null, n + "! =" + fakultet(n));	
	}
	public static int fakultet(int maxTall) {
		int nFak = 1;
		for (int tall=1; tall<=maxTall; tall++)
			nFak = nFak * tall;
		return nFak;
		
	}

}

