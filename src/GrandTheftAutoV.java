import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GrandTheftAutoV {

	public static void main(String[] args) {
		String izvele;
		int izvelesID;
		String[] darbibas = {"Izvēlies personu", "Personu saraksts", "Dzēst personu", "Izsaukt metodi", "Aizvērt programmu"};
		String[] veidi = {"Frenklins", "Trevors", "Maikls"};
		String[] atbilde = {"Jā", "Nē"};
		ArrayList<Object> personas = new ArrayList<>();
		GalvenaisTels persona = null;
		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēlne", JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			if(izvele == null)
				break;
			izvelesID = Arrays.asList(darbibas).indexOf(izvele);
			switch(izvelesID) {
			case 0:
				izvele = (String)JOptionPane.showInputDialog(null, "Kuru personu gribi izvēlēties?", "Izvēlne", JOptionPane.QUESTION_MESSAGE, null, veidi, veidi[0]);
				if(izvele == null)
					break;
				izvelesID = Arrays.asList(veidi).indexOf(izvele);
				
				String masina = GalvenaisTels.virknesParbaude("Ievadi mašīnas nosaukumu", "Bravado Buffalo");
				
				double nauda = GalvenaisTels.skaitlaParbaude("Ievadi sākuma naudu (no 1000-10000)", 1000.00, 10000.00);
				
				int ieroci = (int) GalvenaisTels.skaitlaParbaude("Cik būs ieroči?", 1, 59);
				
				
				if(izvelesID == 0) {
					persona = new GalvenaisTels();
					//System.out.println(persona.getVards()+" "+persona.getKurss());
					String m = GalvenaisTels.virknesParbaude("Mašīnas nosaukumu ievade", "Bravado Buffalo");
					if(m == null)
						break;
					persona.setMasina(m);
					String u = GalvenaisTels.virknesParbaude("Studentu uzvārdu ievade", "Epstīns");
					if(u == null)
						break;
						ieroci = Integer.parseInt(JOptionPane.showInputDialog("Ievadi ieroču skaitu", 1));
						persona.setIeroci(ieroci);
						
							personas.add(persona);	
					break;
				break;
				}
			case 1:
				if(personas.size()>0) {
					int ritID = GalvenaisTels.personasIzvele(persona);
					personas.remove(ritID);
					JOptionPane.showMessageDialog(null, "Ritenis ir veiksmīgi dzēsts!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Sarakstā nav neviens ritenis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Programma apturēta!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while(izvelesID != 5);
	}
	}

}
