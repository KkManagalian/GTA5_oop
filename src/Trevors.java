import javax.swing.JOptionPane;

public class Trevors extends GalvenaisTels {

	double SarkanDumi;
	
	public Trevors(double SarkanDumi) {
		
		SarkanDumi=10.00;
	}
	
	public double SarkanDumi() {
		return 10.00;
	}
	
	public double ReturnSpeja() {
		return SarkanDumi;
	}
	
	public double SpejuStiprin() {
		
		if(SarkanDumi!=30.00) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			SarkanDumi+=2.00;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return SarkanDumi;
	}
	
}
