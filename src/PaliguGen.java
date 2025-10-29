import java.util.Random;

import javax.swing.JOptionPane;

public class PaliguGen {

	static Random rand = new Random();
	
	public static String Vardi() {
		String [] vardi = {"Elizabete","Jānis","Miķelis","Rodricks","Ingars","Gustmans","Melda"};
		
		return vardi[rand.nextInt(7)];
	}
	
	public static int Savejs() {
		int izvele=0;
		int JaNe;
		do {
			int limenis=rand.nextInt(10)+1;
			JaNe=JOptionPane.showConfirmDialog(null,""+ 
					Vardi()+" ar šaušanas līmeni: "+limenis+
					"\nNaudas daļa ko paņems: "+Math.round((12*(0.3*limenis)))+"%","Šāvēju izvēle",JOptionPane.YES_NO_OPTION);
			izvele+=1;
			if(JaNe==0) {
				return limenis;
			}else {
				if(izvele==2) {
					return 0;
				}
			}
		}while(JaNe!=0);
		return 0;
	}
	
	public static int Braucejs() {
		int izvele=0;
		int JaNe;
		do {
			int limenis=rand.nextInt(10)+1;
			JaNe=JOptionPane.showConfirmDialog(null,""+ 
					Vardi()+" ar braukšanas līmeni: "+limenis+
					"\nNaudas daļa ko paņems: "+Math.round((8*(0.3*limenis)))+"%","Braucēju izvēle",JOptionPane.YES_NO_OPTION);
			izvele+=1;
			if(JaNe==0) {
				return limenis;
			}else {
				if(izvele==2) {
					return 0;
				}
			}
		}while(JaNe!=0);
		return 0;
	}
	
	public static int Hakers() {
		int izvele=0;
		int JaNe;
		do {
			int limenis=rand.nextInt(10)+1;
			JaNe=JOptionPane.showConfirmDialog(null,""+ 
					Vardi()+" ar hakošanas līmeni: "+limenis+
					"\nNaudas daļa ko paņems: "+Math.round((8*(0.3*limenis)))+"%","Hakeru izvēle",JOptionPane.YES_NO_OPTION);
			izvele+=1;
			if(JaNe==0) {
				return limenis;
			}else {
				if(izvele==2) {
					return 0;
				}
			}
		}while(JaNe!=0);
		return 0;
	}
}