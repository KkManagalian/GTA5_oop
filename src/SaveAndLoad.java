
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class SaveAndLoad {
	
	public static void saglabat(String info) {
	try {	
		
		String failaNosaukums = (String)JOptionPane.showInputDialog(null, "Ievadi faila nosaukumu","Fails1");
		
		FileWriter fw = new FileWriter(failaNosaukums, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(info);
		pw.println("++++++++++++++++++++++++++\n");
		pw.close();
		JOptionPane.showMessageDialog(null, "Ierakstīts failā: "+failaNosaukums);
		
	}catch(IOException e){
		JOptionPane.showMessageDialog(null, "Kļūda ierakstot failā!", "kļūda", JOptionPane.ERROR_MESSAGE);
	}
	}
	
	public static void nolasit() {
		
		String failaNosaukums = (String)JOptionPane.showInputDialog(null, "Ievadi faila nosaukumu ko vēlaties lasīt","Fails1");
		
		String teksts, str = "";
		try {
			FileReader fr = new FileReader(failaNosaukums);
			BufferedReader br = new BufferedReader(fr);
			while((teksts = br.readLine()) != null) {
				str += teksts+"\n";
			}
			br.close();
			
			JTextArea ta = new JTextArea(str, 10, 40);
			ta.setEditable(false);
			JScrollPane sp = new JScrollPane(ta);
			sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			JOptionPane.showMessageDialog(ta, sp, "Saglabātie faili", JOptionPane.PLAIN_MESSAGE);
			
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Kļūda lasot failu!", "kļūda", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}