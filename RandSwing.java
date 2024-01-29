import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.Random;

public class RandSwing implements ActionListener{
	JFrame f;
	JLabel jl1,jl2,jl3;
	JTextField jtf;
	JButton jb;
	RandSwing(){
		f= new JFrame("NUMBER GUESSING GAME");
		JTextField tf = new JTextField();
		jl1=new JLabel("NUMBER IN THE RANGE 1 TO 100...");
		jl1.setBounds(50,50,300,20);
		jl2 = new JLabel("Guess the number:");
		jl2.setBounds(50,100,200,20);
		jl3 = new JLabel();
		jl3.setBounds(50,250,500,30);
		jtf = new JTextField(); 
		jtf.setBounds(50,150,50,20);
		jb= new JButton("Check");
		jb.setBounds(50,200,100,20);
		jb.addActionListener(this);
		f.add(jl1); f.add(jl2); f.add(jl3); f.add(jtf); f.add(jb);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
	}
	Random rand = new Random();
	int num = rand.nextInt(100);
	public void actionPerformed(ActionEvent e){
		String s= jtf.getText();
		int guess = Integer.parseInt(s);
		if(num== guess)
		{
			jl3.setText("CONGRATULATIONS..!! YOU GUESSED THE NUMBER.. :) " );
		}
		else if( num > guess)
		{
			jl3.setText("NUMBER IS GREATER THAN "+guess);
			jtf.setText("");	 
		}
		else if( num < guess)
		{
			jl3.setText("NUMBER IS LESSER THAN " +guess);
			jtf.setText("");
		}
	}
	public static void main(String args[])
	{
		new RandSwing();
	}
}