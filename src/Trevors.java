import javax.swing.JOptionPane;

public class Trevors extends GalvenaisTels {

	Double SarkanDumi;
	
	public Trevors(Double SarkanDumi) {
		
		SarkanDumi=10.00;
	}
	
	public Double SpejuStiprin(Double SarkanDumi) {
		
		if(SarkanDumi!=30.00) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			SarkanDumi+=5.00;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return SarkanDumi;
	}
	
}
