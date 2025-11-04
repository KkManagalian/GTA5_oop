import javax.swing.JOptionPane;

public class Frenklins extends GalvenaisTels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int TemePalenin;
	
	public Frenklins(int TemePalenin, int izvelesID, int ieroci, double nauda, String masina) {
		super(izvelesID, ieroci, nauda, masina);
		Frenklins.TemePalenin=TemePalenin();
	}
	
	public int TemePalenin() {
		return 10;
	}
	
	public static int ReturnSpeja() {
		return TemePalenin;
	}
	
	public static int SpejuStiprin() {
		
		if(TemePalenin!=30) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			TemePalenin+=2;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return TemePalenin;
	}
	
}
