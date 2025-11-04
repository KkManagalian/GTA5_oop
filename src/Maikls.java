import javax.swing.JOptionPane;

public class Maikls extends GalvenaisTels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int BraukPalenin;
	
	public Maikls(int BraukPalenin, int izvelesID, int ieroci, double nauda, String masina) {
		super(izvelesID, ieroci, nauda, masina);
		Maikls.BraukPalenin=BraukPalenin();
	}
	
	
	public int BraukPalenin() {
		return 10;
	}
	
	public static int ReturnSpeja() {
		return BraukPalenin;
	}
	
	public static int SpejuStiprin() {
		
		if(BraukPalenin!=30) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			BraukPalenin+=2;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return BraukPalenin;
	}
	
}
