package hipster.view;

import hipster.controller.HipsterController;
import hipster.view.HipsterPanel;

import javax.swing.JFrame;

/**
 * Main GUI framework for the hipster Project.
 * 
 * @author Devvin Kraatz
 * @version 1.0 11/19/13 Added documentation and supporting methods.
 */
public class HipsterFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private HipsterController baseController;
	/**
	 * The applications main panel for GUI.
	 */
	private HipsterPanel hipsterPanel;

	/**
	 * Creates a HipsterFrame object with a linked HipsterController for the MVC
	 * paradigm.
	 * 
	 * @param baseController
	 *            The referring controller.
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		hipsterPanel = new HipsterPanel(baseController);

		setupFrame();
	}

	/**
	 * Sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(hipsterPanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
