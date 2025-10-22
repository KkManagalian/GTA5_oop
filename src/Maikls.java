import javax.swing.JOptionPane;

public class Maikls extends GalvenaisTels {

	Double BraukPalenin;
	
	public Maikls(Double BraukPalenin) {
		
		BraukPalenin=10.00;
	}
	
	
	public Double SpejuStiprin(Double BraukPalenin) {
	
	if(BraukPalenin!=30.00) {
		JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
		BraukPalenin+=5.00;
	}else {
		JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
	}
	
	return BraukPalenin;
}
	
}
