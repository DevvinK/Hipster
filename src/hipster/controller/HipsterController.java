package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * 
 * @author Devvin Kraatz
 * @version 1.0 11/19/13 added constructor information
 */
public class HipsterController
{
	/**
	 * Creates a HipsterFrame named appFrame
	 */
	private HipsterFrame appFrame;
	/**
	 * Creates a Hipster object named selfHipster
	 */
	private Hipster selfHipster;
	/**
	 * Creates a Hipster array named cubicleHipster
	 */
	private Hipster[] cubicleHipster;
	/**
	 * Creates and int variable named hipsterCount
	 */
	private int hipsterCount;

	public HipsterController()
	{
		selfHipster = new Hipster();
		cubicleHipster = new Hipster[5];
		hipsterCount = 0;
	}

	/**
	 * Grabs the Hipster and names it getSelfHipster
	 * 
	 * @return Returns the selfHipster variable
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * Replacing the current Hipster.
	 * 
	 * @param selfHipster
	 *            The new Hipster to set.
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	public Hipster[] getCubicleHipster()
	{
		return cubicleHipster;
	}

	/**
	 * Used to start the application GUI for the Hipster program.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * 
	 * @param position
	 *            The location in the array. It must be between 0 and cubicleHipster.length.
	 * @return The Hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < cubicleHipster.length && position >= 0)
		{
			currentHipster = cubicleHipster[position];
		}

		return currentHipster;
	}

	/**
	 * Used to retrieve a random Hipster object from the array of class Hipsters.
	 * 
	 * @return Returns a currentHipster object
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * cubicleHipster.length);
		currentHipster = cubicleHipster[randomIndex];

		return currentHipster;
	}

	/**
	 * Creates and adds a Hopster to the array of class Hipsters from the specified values.
	 * 
	 * @param books
	 *            The array of books for the current Hipster.
	 * @param name
	 *            The name of the current Hipster.
	 * @param type
	 *            The type of the current Hipster.
	 * @param phrase
	 *            This Hipster's current phrase of Hipsterness.
	 */
	public void addHipster(String[] books, String name, String type, String phrase)
	{
		if (hipsterCount < cubicleHipster.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			cubicleHipster[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class id full you are too mainstream to be added");
		}
	}
}
