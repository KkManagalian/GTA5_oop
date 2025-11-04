import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Misijas {
	
	private static ArrayList<Integer> KomBiedri = new ArrayList<>();
	private static Random rand = new Random();
	
	static int Aprekini() {
		int Max=180000;
		int pirmNem,otrNem;
		
		pirmNem=(int)Math.round((12*(0.3*KomBiedri.get(0))));
		otrNem=(int)Math.round((8*(0.3*KomBiedri.get(1))));
		
		int Panemtais;
		Panemtais=(int)(Max*((pirmNem*0.01)+(otrNem*0.01)));
		int Iespeja=rand.nextInt(100)+(pirmNem+otrNem);
		if(Iespeja>100) {
			Iespeja=100;
			Panemtais=Max;
		}
		
		int atb = JOptionPane.showConfirmDialog(null, "Iespējība ka izpildīsiet misiju ir "+Iespeja+"% \nVai gribat turpināt?","Pārliecība",JOptionPane.YES_NO_OPTION);
		switch(atb) {
		case 0:
		if(Iespeja>60) {
			JOptionPane.showMessageDialog(null, "Misija veiksmīgi pabeigta! \nTu paņēmi: "+Panemtais+"$","Rezultāts",JOptionPane.INFORMATION_MESSAGE);
			return Panemtais;
		}else {
			JOptionPane.showMessageDialog(null, "Misija neizdevās!","Rezultāts",JOptionPane.INFORMATION_MESSAGE);
			return 0;
		}
		case 1:
			return 0;
		}
		return 0;
	}
	
	static void Misija(ArrayList<Object> personas, String ID){	
	int izvele,Lim1=0,Lim2=0;
	String MisIzvele;
	String[] MisVeids= {"Skaļa","Klusa"};
	
	MisIzvele=(String)JOptionPane.showInputDialog(null,
			"Izvēlies misiju veidu", "Misiju veida izvēle",
			JOptionPane.QUESTION_MESSAGE, null, MisVeids, MisVeids[0]);
	
	if(MisIzvele==null) {
		JOptionPane.showMessageDialog(null, "Jūs pārdomājāt");
		MisIzvele="null";
	}
	
	switch(MisIzvele) {
	
	case "Skaļa":
	izvele=JOptionPane.showConfirmDialog(null, "Vai izvēlēsieties komandas biedrus?");
	
	if(izvele==0) {
		do {
		izvele=Integer.parseInt(JOptionPane.showInputDialog(null, "Kuru komandas biedru izvēlēsieties?\n"
				+ "1 - Braucejs"
				+ "\n2 - Savejs"));
		System.out.println(izvele);
		
		switch(izvele) {
		case 1:
			if(Lim1==0) {
			Lim1=PaliguGen.Braucejs();
			KomBiedri.add(Lim1);
			}else {
				JOptionPane.showMessageDialog(null, "Jums jau ir braucējs");
			}
			break;
		case 2:
			if(Lim2==0) {
			Lim2=PaliguGen.Savejs();
			KomBiedri.add(Lim2);
			}else {
				JOptionPane.showMessageDialog(null, "Jums jau ir šāvējs");
			}
			break;
		}
		}while(KomBiedri.size()!=2);
		
		Aprekini();
		GrandTheftAutoV.izpildMis+=1;
		KomBiedri.clear();
		
		
	}
	if(izvele==1) {
		JOptionPane.showMessageDialog(null, "Bez komandas biedriem misija būs tikai 50% no maksimālās efektivitātes");
		int Iespeja=0;
		if(ID=="Frenklins") {
			Iespeja=rand.nextInt(10)+Math.round(Frenklins.ReturnSpeja()/5);
		}else {
			if(ID=="Maikls") {
				Iespeja=rand.nextInt(10)+Math.round(Maikls.ReturnSpeja()/5);
			}else {
				if(ID=="Trevors") {
					Iespeja=rand.nextInt(10)+Math.round(Trevors.ReturnSpeja()/5);
				}
			}
		}
		int nauda=rand.nextInt(90000)+80000;
		if(Iespeja==10) {
			JOptionPane.showMessageDialog(null, "Misija veiksmīgi pabeigta! \nTu paņēmi: "+nauda+"$","Rezultāts",JOptionPane.INFORMATION_MESSAGE);
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Misija tev nesanāca! \nTev priekš slimnīcas sanāca maksāt: "+1000+"$","Rezultāts",JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	if(izvele==2) {
		break;
	}
	break;
	
	case "Klusa":
		izvele=JOptionPane.showConfirmDialog(null, "Vai izvēlēsieties komandas biedrus?");
		
		if(izvele==0) {
			do {
			izvele=Integer.parseInt(JOptionPane.showInputDialog(null, "Kuru komandas biedru izvēlēsieties?\n"
					+ "1 - Braucejs"
					+ "\n2 - Hakers"));
			switch(izvele) {
			case 1:
				if(Lim1==0) {
				Lim1=PaliguGen.Braucejs();
				KomBiedri.add(Lim1);
				}else {
					JOptionPane.showMessageDialog(null, "Jums jau ir braucējs");
				}
				break;
			case 2:
				if(Lim2==0) {
				Lim2=PaliguGen.Hakers();
				KomBiedri.add(Lim2);
				}else {
					JOptionPane.showMessageDialog(null, "Jums jau ir hakers");
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nederīga izvēle");
				break;
			}
			}while(KomBiedri.size()!=2);
		
			Aprekini();
			GrandTheftAutoV.izpildMis+=1;
			KomBiedri.clear();
			
		}
		if(izvele==1) {
			JOptionPane.showMessageDialog(null, "Bez komandas biedriem misija būs tikai 50% no maksimālās efektivitātes");
			int Iespeja=0;
			if(ID=="Frenklins") {
				Iespeja=rand.nextInt(10)+Math.round(Frenklins.ReturnSpeja()/5);
			}else {
				if(ID=="Maikls") {
					Iespeja=rand.nextInt(10)+Math.round(Maikls.ReturnSpeja()/5);
				}else {
					if(ID=="Trevors") {
						Iespeja=rand.nextInt(10)+Math.round(Trevors.ReturnSpeja()/5);
					}
				}
			}
			int nauda=rand.nextInt(90000)+80000;
			if(Iespeja==10) {
				JOptionPane.showMessageDialog(null, "Misija veiksmīgi pabeigta! \nTu paņēmi: "+nauda+"$","Rezultāts",JOptionPane.INFORMATION_MESSAGE);
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Misija tev nesanāca! \nTev priekš slimnīcas sanāca maksāt: "+1000+"$","Rezultāts",JOptionPane.INFORMATION_MESSAGE);

			}
		}
		if(izvele==2) {
			break;
		}
		break;
	
	case "null":
		break;
		
	}
	}
}