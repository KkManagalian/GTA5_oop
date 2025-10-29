import javax.swing.JOptionPane;

public class Misijas {
	{	
	int izvele;
	String MisIzvele;
	String[] MisVeids= {"SkaļaS","Klusa"};
	
	MisIzvele=(String)JOptionPane.showInputDialog(null,
			"Izvēlies misiju veidu", "Misiju veida izvēle",
			JOptionPane.QUESTION_MESSAGE, null, MisVeids, MisVeids[0]);
	
	switch(MisIzvele) {
	
	case "Skaļa":
	izvele=JOptionPane.showConfirmDialog(null, "Vai izvēlēsieties komandas biedrus?");
	
	if(izvele==0) {
		izvele=Integer.parseInt(JOptionPane.showInputDialog(null, "Kuru komandas biedru izvēlēsieties?\n"
				+ "1 - Braucejs"
				+ "\n2 - Savejs"));
		switch(izvele) {
		case 1:
			PaliguGen.Braucejs();
			break;
		case 2:
			PaliguGen.Savejs();
			break;
		}
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