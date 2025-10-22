import javax.swing.JOptionPane;

public class Maikls extends GalvenaisTels {

	double BraukPalenin;
	
	public Maikls(double BraukPalenin) {
		BraukPalenin=10.00;
	}
	
	
	public double BraukPalenin() {
		return 10.00;
	}
	
	public double ReturnSpeja() {
		return BraukPalenin;
	}
	
	public double SpejuStiprin() {
		
		if(BraukPalenin!=30.00) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			BraukPalenin+=2.00;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return BraukPalenin;
	}
	
}
