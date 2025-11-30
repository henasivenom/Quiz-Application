package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
	Score(String username, int score) {
		
		
		setBounds(600,150,750,550);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);
		
		JLabel heading = new JLabel("Thankyou " + username + "for playing Simple Minds");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font("Raleman", Font.PLAIN,26));
		add(heading);
		
		JLabel scored = new JLabel("Your score is " + score);
		scored.setBounds(350, 200, 300, 30);
		scored.setFont(new Font("Raleman", Font.PLAIN,26));
		add(scored);
		
		
		JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}
	public static void main(String[] args) {
	new Score("User" , 0);

	}

}
