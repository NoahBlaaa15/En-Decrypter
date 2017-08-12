package de.noahblaaa.main;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame{

	
private static final long serialVersionUID = -8019192867207677177L;

	/*Everything here is made by NoahBlaaa15. If you want to use any of this code, please pn me
	 * on Youtube: https://www.youtube.com/channel/UCTzSxm3EIKCe1Ne2Ho2ul9g
	 * 
	 *First realase on August 12th
	 *Copyright by NoahBlaaa15
	*/
	private JButton b = new JButton("Verschlüsseln");
	private JButton e = new JButton("Entschlüsseln");
	private JButton r = new JButton("Reset");
	private JButton w = new JButton("Website");
	private JButton rp = new JButton("Random");
	private JButton rn = new JButton("Random");
	
	private JLabel t = new JLabel("Nachricht:");
	private JLabel c = new JLabel("Schlüssel:");
	
	private JTextField ln = new JTextField();
	
	private JTextField lp = new JTextField();
	
	private JTextField tf = new JTextField();
	
	private JTextField ft = new JTextField();
	
	//Made by NoahBlaaa15
	@SuppressWarnings("unused")
	public String Gen(String ilen) {
		//Made by NoahBlaaa15
		SecureRandom r = new SecureRandom();
		Integer len = Integer.parseInt(ilen);
		String Zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String Buchstaben = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Zahlen = "1234567890";
		
		StringBuilder pass = new StringBuilder(len);
		
		
		for (int i = 1;i<=len;i++){
			pass.append(Zeichen.charAt(r.nextInt(Zeichen.length())));
		}
		return pass.toString();
	}
	//Made by NoahBlaaa15
	private void en() {
		//Made by NoahBlaaa15
		String tff = tf.getText();
		String ftt = ft.getText();
		

		tff = tff.replaceAll("Ä", "4545");
		tff = tff.replaceAll("Ö", "4343");
		tff = tff.replaceAll("Ü", "4242");
		tff = tff.replaceAll("A", "4141");
		tff = tff.replaceAll("B", "4040");
		tff = tff.replaceAll("C", "3939");
		tff = tff.replaceAll("D", "3838");
		tff = tff.replaceAll("E", "3737");
		tff = tff.replaceAll("F", "3636");
		tff = tff.replaceAll("G", "3535");
		tff = tff.replaceAll("H", "3434");
		tff = tff.replaceAll("I", "3232");
		tff = tff.replaceAll("J", "3131");
		tff = tff.replaceAll("K", "3030");
		tff = tff.replaceAll("L", "2929");
		tff = tff.replaceAll("M", "2828");
		tff = tff.replaceAll("N", "2727");
		tff = tff.replaceAll("O", "2626");
		tff = tff.replaceAll("P", "2525");
		tff = tff.replaceAll("Q", "2424");
		tff = tff.replaceAll("R", "2323");
		tff = tff.replaceAll("S", "2121");
		tff = tff.replaceAll("T", "2020");
		tff = tff.replaceAll("U", "1919");
		tff = tff.replaceAll("V", "1818");
		tff = tff.replaceAll("W", "1717");
		tff = tff.replaceAll("X", "1616");
		tff = tff.replaceAll("Y", "1515");
		tff = tff.replaceAll("Z", "1414");
		tff = tff.replaceAll("ä", "1313");
		tff = tff.replaceAll("ö", "1212");
		tff = tff.replaceAll("ü", "1010");
		tff = tff.replaceAll("a", "1001");
		tff = tff.replaceAll("b", "1011");
		tff = tff.replaceAll("c", "1111");
		tff = tff.replaceAll("d", "2002");
		tff = tff.replaceAll("e", "2022");
		tff = tff.replaceAll("f", "2222");
		tff = tff.replaceAll("g", "3003");
		tff = tff.replaceAll("h", "3033");
		tff = tff.replaceAll("i", "3333");
		tff = tff.replaceAll("j", "4004");
		tff = tff.replaceAll("k", "4044");
		tff = tff.replaceAll("l", "4444");
		tff = tff.replaceAll("m", "5005");
		tff = tff.replaceAll("n", "5055");
		tff = tff.replaceAll("o", "5555");
		tff = tff.replaceAll("p", "6006");
		tff = tff.replaceAll("q", "6066");
		tff = tff.replaceAll("r", "6666");
		tff = tff.replaceAll("s", "7007");
		tff = tff.replaceAll("t", "7077");
		tff = tff.replaceAll("u", "7777");
		tff = tff.replaceAll("v", "8008");
		tff = tff.replaceAll("w", "8088");
		tff = tff.replaceAll("x", "8888");
		tff = tff.replaceAll("y", "9009");
		tff = tff.replaceAll("z", "9099");
		
		tff = tff.replaceAll(" ", "123456789");
		tff = tff.replaceAll(",", "1234567899");
		tff = tff.replaceAll(";", "123456788999");
		tff = tff.replaceAll(":", "1234567888999");
		tff = tff.replaceAll("-", "12345677888999");
		tff = tff.replaceAll("=", "1234566777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		tff = tff.replace("+", "123456777888999");
		
		tf.setText(tff);
		
		ftt = ftt.replaceAll("Ä", "4545");
		ftt = ftt.replaceAll("Ö", "4343");
		ftt = ftt.replaceAll("Ü", "4242");
		ftt = ftt.replaceAll("A", "4141");
		ftt = ftt.replaceAll("B", "4040");
		ftt = ftt.replaceAll("C", "3939");
		ftt = ftt.replaceAll("D", "3838");
		ftt = ftt.replaceAll("E", "3737");
		ftt = ftt.replaceAll("F", "3636");
		ftt = ftt.replaceAll("G", "3535");
		ftt = ftt.replaceAll("H", "3434");
		ftt = ftt.replaceAll("I", "3232");
		ftt = ftt.replaceAll("J", "3131");
		ftt = ftt.replaceAll("K", "3030");
		ftt = ftt.replaceAll("L", "2929");
		ftt = ftt.replaceAll("M", "2828");
		ftt = ftt.replaceAll("N", "2727");
		ftt = ftt.replaceAll("O", "2626");
		ftt = ftt.replaceAll("P", "2525");
		ftt = ftt.replaceAll("Q", "2424");
		ftt = ftt.replaceAll("R", "2323");
		ftt = ftt.replaceAll("S", "2121");
		ftt = ftt.replaceAll("T", "2020");
		ftt = ftt.replaceAll("U", "1919");
		ftt = ftt.replaceAll("V", "1818");
		ftt = ftt.replaceAll("W", "1717");
		ftt = ftt.replaceAll("X", "1616");
		ftt = ftt.replaceAll("Y", "1515");
		ftt = ftt.replaceAll("Z", "1414");
		ftt = ftt.replaceAll("a", "1");
		ftt = ftt.replaceAll("b", "2");
		ftt = ftt.replaceAll("c", "3");
		ftt = ftt.replaceAll("e", "4");
		ftt = ftt.replaceAll("d", "5");
		ftt = ftt.replaceAll("f", "6");
		ftt = ftt.replaceAll("g", "7");
		ftt = ftt.replaceAll("h", "8");
		ftt = ftt.replaceAll("i", "9");
		ftt = ftt.replaceAll("j", "10");
		ftt = ftt.replaceAll("k", "11");
		ftt = ftt.replaceAll("l", "12");
		ftt = ftt.replaceAll("m", "13");
		ftt = ftt.replaceAll("n", "14");
		ftt = ftt.replaceAll("o", "15");
		ftt = ftt.replaceAll("p", "16");
		ftt = ftt.replaceAll("q", "17");
		ftt = ftt.replaceAll("r", "18");
		ftt = ftt.replaceAll("s", "19");
		ftt = ftt.replaceAll("t", "20");
		ftt = ftt.replaceAll("u", "21");
		ftt = ftt.replaceAll("v", "22");
		ftt = ftt.replaceAll("w", "23");
		ftt = ftt.replaceAll("x", "24");
		ftt = ftt.replaceAll("y", "25");
		ftt = ftt.replaceAll("z", "26");
		
		ftt = ftt.replaceAll(" ", "123456789");
		
		ftt = ftt.replaceAll(" ", "123456789");
		ftt = ftt.replaceAll(",", "1234567899");
		ftt = ftt.replaceAll(";", "123456788999");
		ftt = ftt.replaceAll(":", "1234567888999");
		ftt = ftt.replaceAll("-", "12345677888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replaceAll("=", "1234566777888999");
		
		String iftt = ftt;
		String itff = tf.getText().toString();
		
		BigInteger iiftt = new BigInteger(iftt);
		BigInteger iitff = new BigInteger(itff);
		
		BigInteger n = iitff.multiply(iiftt);
		
		String text = String.valueOf(n);
		
		tf.setText(text);
	}
	//Made by NoahBlaaa15
	private void de() {
		//Made by NoahBlaaa15
		String tfff = tf.getText();
		String ftt = ft.getText();

		ftt = ftt.replaceAll("Ä", "4545");
		ftt = ftt.replaceAll("Ö", "4343");
		ftt = ftt.replaceAll("Ü", "4242");
		ftt = ftt.replaceAll("A", "4141");
		ftt = ftt.replaceAll("B", "4040");
		ftt = ftt.replaceAll("C", "3939");
		ftt = ftt.replaceAll("D", "3838");
		ftt = ftt.replaceAll("E", "3737");
		ftt = ftt.replaceAll("F", "3636");
		ftt = ftt.replaceAll("G", "3535");
		ftt = ftt.replaceAll("H", "3434");
		ftt = ftt.replaceAll("I", "3232");
		ftt = ftt.replaceAll("J", "3131");
		ftt = ftt.replaceAll("K", "3030");
		ftt = ftt.replaceAll("L", "2929");
		ftt = ftt.replaceAll("M", "2828");
		ftt = ftt.replaceAll("N", "2727");
		ftt = ftt.replaceAll("O", "2626");
		ftt = ftt.replaceAll("P", "2525");
		ftt = ftt.replaceAll("Q", "2424");
		ftt = ftt.replaceAll("R", "2323");
		ftt = ftt.replaceAll("S", "2121");
		ftt = ftt.replaceAll("T", "2020");
		ftt = ftt.replaceAll("U", "1919");
		ftt = ftt.replaceAll("V", "1818");
		ftt = ftt.replaceAll("W", "1717");
		ftt = ftt.replaceAll("X", "1616");
		ftt = ftt.replaceAll("Y", "1515");
		ftt = ftt.replaceAll("Z", "1414");
		ftt = ftt.replaceAll("a", "1");
		ftt = ftt.replaceAll("b", "2");
		ftt = ftt.replaceAll("c", "3");
		ftt = ftt.replaceAll("e", "4");
		ftt = ftt.replaceAll("d", "5");
		ftt = ftt.replaceAll("f", "6");
		ftt = ftt.replaceAll("g", "7");
		ftt = ftt.replaceAll("h", "8");
		ftt = ftt.replaceAll("i", "9");
		ftt = ftt.replaceAll("j", "10");
		ftt = ftt.replaceAll("k", "11");
		ftt = ftt.replaceAll("l", "12");
		ftt = ftt.replaceAll("m", "13");
		ftt = ftt.replaceAll("n", "14");
		ftt = ftt.replaceAll("o", "15");
		ftt = ftt.replaceAll("p", "16");
		ftt = ftt.replaceAll("q", "17");
		ftt = ftt.replaceAll("r", "18");
		ftt = ftt.replaceAll("s", "19");
		ftt = ftt.replaceAll("t", "20");
		ftt = ftt.replaceAll("u", "21");
		ftt = ftt.replaceAll("v", "22");
		ftt = ftt.replaceAll("w", "23");
		ftt = ftt.replaceAll("x", "24");
		ftt = ftt.replaceAll("y", "25");
		ftt = ftt.replaceAll("z", "26");
		
		ftt = ftt.replaceAll(" ", "123456789");
		
		ftt = ftt.replaceAll(" ", "123456789");
		ftt = ftt.replaceAll(",", "1234567899");
		ftt = ftt.replaceAll(";", "123456788999");
		ftt = ftt.replaceAll(":", "1234567888999");
		ftt = ftt.replaceAll("-", "12345677888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replace("+", "123456777888999");
		ftt = ftt.replaceAll("=", "1234566777888999");
		
		BigInteger pass = new BigInteger(ftt);
		BigInteger n = new BigInteger(tfff);
		
		BigInteger ntext = n.divide(pass);
		
		String intext = String.valueOf(ntext);
		
		tf.setText(intext);
		
		String tff = tf.getText();
		
		
		tff = tff.replaceAll("4545", "Ä");
		tff = tff.replaceAll("4343", "Ö");
		tff = tff.replaceAll("4242", "Ü");
		tff = tff.replaceAll("4141", "A");
		tff = tff.replaceAll("4040", "B");
		tff = tff.replaceAll("3939", "C");
		tff = tff.replaceAll("3838", "D");
		tff = tff.replaceAll("3737", "E");
		tff = tff.replaceAll("3636", "F");
		tff = tff.replaceAll("3535", "G");
		tff = tff.replaceAll("3434", "H");
		tff = tff.replaceAll("3232", "I");
		tff = tff.replaceAll("3131", "J");
		tff = tff.replaceAll("3030", "K");
		tff = tff.replaceAll("2929", "L");
		tff = tff.replaceAll("2828", "M");
		tff = tff.replaceAll("2727", "N");
		tff = tff.replaceAll("2626", "O");
		tff = tff.replaceAll("2525", "P");
		tff = tff.replaceAll("2424", "Q");
		tff = tff.replaceAll("2323", "R");
		tff = tff.replaceAll("2121", "S");
		tff = tff.replaceAll("2020", "T");
		tff = tff.replaceAll("1919", "U");
		tff = tff.replaceAll("1818", "V");
		tff = tff.replaceAll("1717", "W");
		tff = tff.replaceAll("1616", "X");
		tff = tff.replaceAll("1515", "Y");
		tff = tff.replaceAll("1414", "Z");
		tff = tff.replaceAll("1001", "a");
		tff = tff.replaceAll("1011", "b");
		tff = tff.replaceAll("1111", "c");
		tff = tff.replaceAll("2002", "d");
		tff = tff.replaceAll("2022", "e");
		tff = tff.replaceAll("2222", "f");
		tff = tff.replaceAll("3003", "g");
		tff = tff.replaceAll("3033", "h");
		tff = tff.replaceAll("3333", "i");
		tff = tff.replaceAll("4004", "j");
		tff = tff.replaceAll("4044", "k");
		tff = tff.replaceAll("4444", "l");
		tff = tff.replaceAll("5005", "m");
		tff = tff.replaceAll("5055", "n");
		tff = tff.replaceAll("5555", "o");
		tff = tff.replaceAll("6006", "p");
		tff = tff.replaceAll("6066", "q");
		tff = tff.replaceAll("6666", "r");
		tff = tff.replaceAll("7007", "s");
		tff = tff.replaceAll("7077", "t");
		tff = tff.replaceAll("7777", "u");
		tff = tff.replaceAll("8008", "v");
		tff = tff.replaceAll("8088", "w");
		tff = tff.replaceAll("8888", "x");
		tff = tff.replaceAll("9009", "y");
		tff = tff.replaceAll("9099", "z");
		
		tff = tff.replaceAll("123456789", " ");
		tff = tff.replaceAll("1234567899", ",");
		tff = tff.replaceAll("123456788999", ";");
		tff = tff.replaceAll("1234567888999", ":");
		tff = tff.replaceAll("12345677888999", "-");
		tff = tff.replaceAll("123456777888999", "+");
		tff = tff.replaceAll("1234566777888999", "=");
		
		tf.setText(tff);
		
	}
	//Made by NoahBlaaa15
	public Menu() {
		//Made by NoahBlaaa15
		setSize(480,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("En/Decrypter - By NoahBlaaa15");
		setResizable(false);
		setLayout(null);
		
		ft.setBounds(135, 80, 200, 20);
		add(ft);
		
		tf.setBounds(135, 42, 200, 20);
		add(tf);
		
		ln.setBounds(444, 42, 25, 20);
		add(ln);
		
		lp.setBounds(444, 80, 25, 20);
		add(lp);
		
		t.setBounds(205, 20, 200, 25);
		add(t);
		
		c.setBounds(205, 58, 200, 25);
		add(c);
		
		b.setBounds(160, 112, 150, 25);
		add(b);
		
		e.setBounds(160, 140, 150, 25);
		add(e);
		
		r.setBounds(348, 126, 95, 25);
		add(r);
		
		w.setBounds(24, 126, 100, 25);
		add(w);
		
		rp.setBounds(342, 80, 95, 20);
		add(rp);
		
		rn.setBounds(342, 42, 95, 20);
		add(rn);
		
	tf.setText("Text");
	ft.setText("Key");
	ln.setText("10");
	lp.setText("10");
	
	w.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
	{
			 Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI("https://www.youtube.com/channel/UCTzSxm3EIKCe1Ne2Ho2ul9g"));
	            } catch (IOException | URISyntaxException b) {
	                b.printStackTrace();
	            }

	}
	});
	
	rn.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			String ipass = ln.getText();
			String text = Gen(ipass);
			tf.setText(text);
		}
	});
	
	rp.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			String ipass = lp.getText();
			String pass = Gen(ipass);
			ft.setText(pass);
		}
	});
	
	r.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e)
		{
			tf.setText("Text");
			ft.setText("Key");
		}
		});
	
	e.addActionListener(new ActionListener() 
			{
		public void actionPerformed(ActionEvent e)
			{
			de();
			}
			});
	
	
	b.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e)
		{
		en();
		}
		});
	
		}	
	
}