import javax.swing.JOptionPane;

public class Frenklins extends GalvenaisTels {

	private Double TemePalenin;
	
	public Frenklins(Double TemePalenin) {
		
		TemePalenin=TemePalenin();
	}
	
	public Double TemePalenin() {
		
		return 10.00;
	}
	
	public Double SpejuStiprin(Double Temepalenin) {
		
		if(TemePalenin!=30.00) {
			JOptionPane.showMessageDialog(null, "Maksimālais limits spējai atīstīts","Attīstījums",JOptionPane.INFORMATION_MESSAGE);
			TemePalenin+=5.00;
		}else {
			JOptionPane.showMessageDialog(null, "Spēja ir maksimāli attīstīta!","Informācija",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return TemePalenin;
	}
	
}
