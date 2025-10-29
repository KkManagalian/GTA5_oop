import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Misijas {
	
	public static ArrayList<Integer> KomBiedri = new ArrayList<>();
	
	static void Misija(){	
	int izvele,Lim1=0,Lim2=0;
	String MisIzvele;
	String[] MisVeids= {"Skaļa","Klusa"};
	
	MisIzvele=(String)JOptionPane.showInputDialog(null,
			"Izvēlies misiju veidu", "Misiju veida izvēle",
			JOptionPane.QUESTION_MESSAGE, null, MisVeids, MisVeids[0]);
	
	switch(MisIzvele) {
	
	case "Skaļa":
	izvele=JOptionPane.showConfirmDialog(null, "Vai izvēlēsieties komandas biedrus?");
	
	if(izvele==0) {
		do {
		izvele=Integer.parseInt(JOptionPane.showInputDialog(null, "Kuru komandas biedru izvēlēsieties?\n"
				+ "1 - Braucejs"
				+ "\n2 - Savejs"));
		switch(izvele) {
		case 1:
			if(Lim1==0) {
			Lim1=PaliguGen.Braucejs();
			KomBiedri.add(Lim1);
			}else {
				JOptionPane.showMessageDialog(null, "Jums jau ir braucējs");
			}
			break;
		case 2:
			if(Lim2==0) {
			Lim2=PaliguGen.Savejs();
			KomBiedri.add(Lim2);
			}else {
				JOptionPane.showMessageDialog(null, "Jums jau ir braucējs");
			}
			break;
		}
		}while(KomBiedri.size()!=2);
		GalvenaisTels.IzpildMis+=1;
		
	}
	if(izvele==1) {
		
	}
	break;
	
	case "Klusa":
		izvele=JOptionPane.showConfirmDialog(null, "Vai izvēlēsieties komandas biedrus?");
		
		if(izvele==0) {
			izvele=Integer.parseInt(JOptionPane.showInputDialog(null, "Kuru komandas biedru izvēlēsieties?\n"
					+ "1 - Braucejs"
					+ "\n2 - Hakers"));
			switch(izvele) {
			case 1:
				PaliguGen.Braucejs();
				break;
			case 2:
				PaliguGen.Hakers();
				break;
			}
		}
		break;
	
	}
	}
}