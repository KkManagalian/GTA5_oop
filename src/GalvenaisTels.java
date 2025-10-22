import java.io.Serializable;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class GalvenaisTels implements Serializable, Comparable<GalvenaisTels>{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6562614819634012097L;
	//Attribūti
	
	private String masinas;
	private int ieroci = 1;
	private double nauda;
	
	public GalvenaisTels() { };
	
	public String getMasinas() {
		return masinas;
	}
	public double getNauda() {
		return nauda;
	}
	public int getIeroci() {
		return ieroci;
	}
	public void setVards(String masinas) {
		this.masinas = masinas;
	}
	public void setUzvards(double nauda) {
		this.nauda= nauda;
	}
	public void setPersKods(int ieroci) {
		this.ieroci = ieroci;
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

		@Override
		public int compareTo(GalvenaisTels s) {
			return this.getMasinas().compareTo(s.getMasinas());
		}
	}
