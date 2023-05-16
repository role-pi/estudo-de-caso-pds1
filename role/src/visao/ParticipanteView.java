package visao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
public class ParticipanteView extends JFrame implements ActionListener {
    private JTextField nomeTextField;
    private JTextField emailTextField;

    public ParticipanteView() {
        setTitle("adicionar participante");
	    setSize(600, 350);
	    setLocationRelativeTo(null);
	
	    JPanel contentPane = new JPanel();
	    setContentPane(contentPane);
	    contentPane.setBackground(Color.WHITE);
	    contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
	    
	    Component verticalGlue = Box.createVerticalGlue();
	    contentPane.add(verticalGlue);
	    
	    JPanel panel_4 = new RoundedPanel();
	    contentPane.add(panel_4);
	    panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
	    panel_4.setBorder(new EmptyBorder(20, 20, 20, 20));
	    
        panel_4.setSize(new Dimension(500, 100));
        panel_4.setMaximumSize(new Dimension(600, 250));
        panel_4.setFont(new Font("Inter", Font.BOLD, 13));
	    
	    JPanel panel_2 = new JPanel();
	    panel_4.add(panel_2);
	    panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
	    
        JLabel nomeLabel = new JLabel("Nome");
        panel_2.add(nomeLabel);
        nomeTextField = new JTextField();
        panel_2.add(nomeTextField);
	    
	    Component verticalStrut_1_2 = Box.createVerticalStrut(5);
	    panel_4.add(verticalStrut_1_2);
	    
	    JPanel panel_1 = new JPanel();
	    panel_4.add(panel_1);
	    panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
	
	    JLabel descricaoLabel = new JLabel("Email");
	    panel_1.add(descricaoLabel);
	    emailTextField = new JTextField();
	    panel_1.add(emailTextField);
	        
        Component verticalStrut = Box.createVerticalStrut(20);
        panel_4.add(verticalStrut);
    
        JButton cadastrarButton = new JButton("Adicionar");
        cadastrarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cadastrarButton.addActionListener(this);
        panel_4.add(cadastrarButton);
	}
    
    @Override
	public void actionPerformed(ActionEvent e) {
		if (nomeTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nome não pode estar vazio."); 
		} else if (emailTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Email não pode estar vazio."); 
		} else {
			setVisible(false);
		}
	}
}