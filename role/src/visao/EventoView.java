package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class EventoView extends JFrame {
	public EventoView() {
        setTitle("rolê");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("gap rel 0, ins 0, wrap 1", "[500px,grow]", "[80px][grow]"));
        
        JPanel panel = new HeaderView();
        contentPane.add(panel, "cell 0 0,grow");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		contentPane.add(panel_1, "cell 0 1 1 2,grow");
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new EventoDetailView("✨", "Rolê na Fac", "de 23 de maio às 22:00 a 24 de maio às 4:00", new Color(249, 236, 170));
		panel_2.add(panel_3);
		
		JPanel panel_4 = new InsumosDetailView();
		panel_2.add(panel_4);
		
		JPanel panel_5 = new ParticipantesDetailView();
		panel_1.add(panel_5);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		EventoView tela = new EventoView();
		tela.setVisible(true);
	}
}
