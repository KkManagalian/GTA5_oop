import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class GalvenaisTels implements Serializable, Comparable<GalvenaisTels>{
	
	//Attribūti
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9222023328378505339L;
	public static int IzpildMis=0;
	
	public GalvenaisTels(int IzpildMis) {
		GalvenaisTels.IzpildMis=IzpildMis;
		
		
	}
	
		private String masina;
		private int ieroci = 1;
		private double nauda;
		private int izvelesID;
		public GalvenaisTels() { };
		
		public String getMasina() {
			return masina;
		}
		public double getNauda() {
			return nauda;
		}
		public int getIeroci() {
			return ieroci;
		}
		public String getIzvelesID() {
			if(izvelesID == 0) {
				return "Frenklins";
			}else if(izvelesID == 1){
				return "Trevors";
			}else{
				return "Maikls";
			}
		}
		public void setMasina(String masina) {
			this.masina = masina;
		}
		public void setNauda(double nauda) {
			this.nauda= nauda;
		}
		public void setIeroci(int ieroci) {
			this.ieroci = ieroci;
		}
		
		public GalvenaisTels(int izvelesID, int ieroci, double nauda, String masina) {
			this.izvelesID = izvelesID;
			this.ieroci = ieroci;
			this.nauda = nauda;
			this.masina = masina;
		}
		
		public String izvadit() {
			return "Personas vārds: "+getIzvelesID()+
					"\nNaudas daudzums: $"+getNauda()+
					"\nMašīnas modelis: "+getMasina()+
					"\nIeroču daudzums: "+getIeroci();
		}
		
		
			public static String virknesParbaude(String zinojums, String noklusejums) {
				String virkne;
				do {
					virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
					if(virkne == null)
						return null;
					virkne = virkne.trim();
				}while(!Pattern.matches("^[\\p{L} ]+$", virkne));
				return virkne;
			}
			public static String ievade;
			
			
			public static double skaitlaParbaude(String zinojums, double min, double max) {
				
				double skaitlis;
				while(true) {
					ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);
					if(ievade == null)
						return -1;
					try {
						skaitlis = Double.parseDouble(ievade);
						if(skaitlis<min || skaitlis>max) {
							JOptionPane.showMessageDialog(null, "Norādīts nederīgs intervāls", "Nekorekti dati", JOptionPane.WARNING_MESSAGE);
							continue;
						}
						return skaitlis;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Netika ievadīts vesels skaitlis", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			static int personasIzvele(ArrayList<Object> personas) {
				String[] Saraksts = new String[personas.size()];
				for (int i = 0; i < personas.size(); i++) {
				Saraksts[i] = (((GalvenaisTels)personas.get(i)).getIzvelesID())+" "
				+(((GalvenaisTels)personas.get(i)).getNauda())+" $";
				}
				String izveletais = (String)JOptionPane.showInputDialog(null, "Izvēlies riteni: ", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, Saraksts, Saraksts[0]);
				return Arrays.asList(Saraksts).indexOf(izveletais);
		}
	
	
	@Override
	public int compareTo(GalvenaisTels s) {
		return this.getMasina().compareTo(s.getMasina());
	}
	
	
}
