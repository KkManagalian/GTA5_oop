import javax.swing.JOptionPane;

public class Frenklins extends GalvenaisTels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double TemePalenin;
	
	public Frenklins(double TemePalenin) {
		this.TemePalenin=TemePalenin();
	}
	
	public double TemePalenin() {
		return 10.00;
	}
	
	public double ReturnSpeja() {
		return TemePalenin;
	}
	
	public double SpejuStiprin() {
		
		if(TemePalenin!=30.00) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			TemePalenin+=2.00;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return TemePalenin;
	}
	
}
