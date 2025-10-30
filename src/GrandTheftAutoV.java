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
		boolean unikalsF = false;
		boolean unikalsT = false;
		boolean unikalsM = false;
		String[] darbibas = {"Izvēlies personu", "Dzēst personu", "Personu saraksts", "Sākt misiju", "Aizvērt programmu"};
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
				izvele = (String)JOptionPane.showInputDialog(null, "Kuru personu gribi izvēlēties? (var izveidot tikai 1 no katra)", "Izvēlne", JOptionPane.QUESTION_MESSAGE, null, veidi, veidi[0]);
				if(izvele == null)
					break;
				if(unikalsF == true && izvele == "Frenklins" || izvele == "Trevors" && unikalsT == true || izvele == "Maikls" && unikalsM == true) {
					JOptionPane.showMessageDialog(null, "Persona jau eksistē!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}else{
					
				izvelesID = Arrays.asList(veidi).indexOf(izvele);
				
				String masina = GalvenaisTels.virknesParbaude("Ievadi mašīnas nosaukumu", "Bravado Buffalo");
				
				double nauda = GalvenaisTels.skaitlaParbaude("Ievadi sākuma naudu (no 1000-10000)", 1000.00, 10000.00);
				
				int ieroci = (int) GalvenaisTels.skaitlaParbaude("Cik būs ieroči?", 1, 59);
				
				
				if(izvelesID == 0) {
					persona = new GalvenaisTels(izvelesID, ieroci, nauda, masina);
					unikalsF = true;
				}else if(izvelesID == 1) {
					persona = new GalvenaisTels(izvelesID, ieroci, nauda, masina);
					unikalsT = true;
				}else{
					persona = new GalvenaisTels(izvelesID, ieroci, nauda, masina);
					unikalsM = true;
				}
				personas.add(persona);	
				}
				break;
			case 1:
				if(personas.size()>0) {
					int ID = GalvenaisTels.personasIzvele(personas);
					personas.remove(ID);
					JOptionPane.showMessageDialog(null, "Persona tika izdzēsta!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Sarakstā nav neviens!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 2:
				if(personas.size()>0) {
					String str = "Personu skaits: "+personas.size()+"\n_______________________________\n";
					for(int i = 0; i <personas.size(); i++) {
						str += ((GalvenaisTels)personas.get(i)).izvadit()+"\n_______________________________\n";
					}
					JTextArea ta = new JTextArea (str, 10, 40);
					ta.setEditable(false);
					JScrollPane sp = new JScrollPane(ta);
					sp.setVerticalScrollBarPolicy(
							ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					JOptionPane.showMessageDialog(ta, sp, "Riteņi",
							JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "Sarakstā nav neviens cilvēks!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 3:
				//Valter, te izveido case, lai var darīt misijas!
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Programma apturēta!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while(izvelesID != 5);
	}
}
