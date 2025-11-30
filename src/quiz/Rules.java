package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	String name;
	JButton start, back;
		Rules(String name) {
			this.name = name;
			setLayout(null);
			getContentPane().setBackground(Color.white);
			
			JLabel heading = new JLabel("Welcome "+name+" to Simple Minds");
			heading.setBounds(50, 20,700,30);
			heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
			heading.setForeground(Color.blue);
			add(heading);
			
			JLabel rules = new JLabel();
			rules.setBounds(20, 90,1000,350);
			rules.setFont(new Font("Tahoma", Font.BOLD, 16));
			rules.setForeground(Color.blue);
			rules.setText(
					 "<html>" +
							    "1. You have 15 seconds per question — \"Speed is the new genius.\"<br><br>" +
							    "2. No teamwork allowed — \"Even Google can’t save you in 15 seconds.\"<br><br>" +
							    "3. All 10 questions are compulsory — \"Life gives options, this quiz doesn't.\"<br><br>" +
							    "4. If you don’t know the answer, guess — \"A wild guess is better than a blank page.\"<br><br>" +
							    "5. Stay calm — \"Pressure creates diamonds… or wrong answers.\"<br><br>" +
							    "6. Don’t stare at others’ screens — \"Success is personal, cheating is universal.\"<br><br>" +
							    "7. Don’t panic — \"Every topper was once confused too.\"<br><br>" +
							    "8. No Googling — \"Knowledge is power, Wi-Fi is cheating.\"<br><br>" +
							    "</html>"
	                );
			add(rules);
			
			back = new JButton("Back");
			back.setBounds(250,500,100,30);
			back.setBackground(new Color(30,144,254));
			back.setForeground(Color.white);
			back.addActionListener(this);
			add(back);
			
			start = new JButton("Start");
			start.setBounds(400,500,100,30);
			start.setBackground(new Color(30,144,254));
			start.setForeground(Color.white);
			start.addActionListener(this);
			add(start);
			
			
			setSize(800,650);
			setLocation(350,100);
			setVisible(true);
			}
		
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == start) {
				setVisible(false);
				new Quiz(name);
				
			}
			else {
				setVisible(false);
				new Login();
			}
		}
	public static void main(String[] args) {
		new Rules("");

	}

}
