package dndcharactercreator.main;

import java.awt.BorderLayout;
import javax.swing.*;

public class MainFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4135721588763930988L;

	public MainFrame()
	{
		super("5th Edition Character Creator");
		setLayout(new BorderLayout());
		add(new CenterPanel(), BorderLayout.CENTER);
	}
}
