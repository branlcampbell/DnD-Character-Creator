package dndcharactercreator.main;

import java.awt.BorderLayout;
import javax.swing.*;

public class MainFrame extends JFrame
{
	public MainFrame()
	{
		super("5th Edition Character Creator");
		setLayout(new BorderLayout());
		add(new CenterPanel(), BorderLayout.CENTER);
	}
}
