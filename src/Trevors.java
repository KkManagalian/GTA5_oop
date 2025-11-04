import javax.swing.JOptionPane;

public class Trevors extends GalvenaisTels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int SarkanDumi;
	
	public Trevors(int SarkanDumi, int izvelesID, int ieroci, double nauda, String masina) {
		super(izvelesID, ieroci, nauda, masina);
		Trevors.SarkanDumi=SarkanDumi();
	}
	
	public int SarkanDumi() {
		return 10;
	}
	
	public static int ReturnSpeja() {
		return SarkanDumi;
	}
	
	public static int SpejuStiprin() {
		
		if(SarkanDumi!=30) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			SarkanDumi+=2;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return SarkanDumi;
	}
	
}
