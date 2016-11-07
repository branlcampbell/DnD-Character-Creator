package dndcharactercreator.main;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TopPanel extends JPanel
{
	private static final long serialVersionUID = -8018976534076012638L;
	private JButton button;
	
	public TopPanel()
	{
		setLayout(new FlowLayout());
		add(button);
	}
	
}
