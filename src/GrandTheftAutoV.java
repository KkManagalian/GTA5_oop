import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import oop.Students;
import uzdevums1.MinkuTante;

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
						int ieroci = JOptionPane.showInputDialog("Ievadi ieroču skaitu", 1);
						persona.setIeroci(ieroci);
						
						String talr = "";
						do {
							talr = JOptionPane.showInputDialog("Ievadi telefona numuru", "+371");
						}while(talr == null || !Pattern.matches("^[+371]+[2-9]{1}[0-9]{7}$", talr));
							persona.setTalr(talr);
							
							
							String prog = (String)JOptionPane.showInputDialog(null , "Izvēlies studiju programmu", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, programmas, programmas[0]);
							if(prog == null)
								break;
							persona.setStudProg(prog);
							
							String aplNr = burti();
							JOptionPane.showMessageDialog(null, "Personas studentu apliecības numurs ir:"+aplNr);
							
							persona.setAplNr(aplNr);
							
							String k = (String)JOptionPane.showInputDialog(null, "Izvēlies studiju kursu", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, kurss, kurss[0]);
							if(k != null)
								persona.setKurss(Integer.parseInt(k));
							
							String atb = (String) JOptionPane.showInputDialog(null, "Vai "+persona.getVards()+" saņem stipendiju?", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]);
							if(atb == null)
								break;
							else if(atb.equals("Jā"))
								persona.setSanemStip(true);
							else
								persona.setSanemStip(false);
							
							atb = (String) JOptionPane.showInputDialog(null, "Vai "+persona.getVards()+" mācās bez maksas?", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]);
							if(atb == null)
								break;
							else if(atb.equals("Jā"))
								persona.setValstsFin(true);
							else
								persona.setValstsFin(false);
							
							studentuMasivs.add(persona);	
					break;
				break;
			case 1:
				if(personas.size()>0) {
					int ritID = Metodes.ritenaIzvele(riteni);
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
