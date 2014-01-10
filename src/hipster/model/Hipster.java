package hipster.model;

/**
 * 
 * @author Devvin Kraatz
 * @version 1.3 11/20/13
 */
public class Hipster
{
	/**
	 * THe name of the Hipster
	 */
	private String name;
	/**
	 * The type of the Hipster
	 */
	private String hipsterType;
	/**
	 * The Hipster's catch-phrase
	 */
	private String hipsterPhrase;
	/**
	 * the collection for the Hipster's books
	 */
	private String[] hipsterBooks;

	/**
	 * Creates a default Hipster object with values based on me.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Devvin";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Cheezy";
		
		fillTheBooks();
	}

	/**
	 * Creates a Hipster Object with the specified parameters to fill the
	 * component data members.
	 * 
	 * @param name
	 *            The name of the created Hipster.
	 * @param hipsterType
	 *            The type of the created Hipster.
	 * @param hipsterPhrase
	 *            The catch-phrase of this created Hipster.
	 * @param hipsterBooks
	 *            An array of books for the Hipster.
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase,
			String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	
	/**
	 * Getter method to get the name.
	 * 
	 * @return The name of the Hipster.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Getter method for the type of Hipster
	 * 
	 * @return The hipster type of the Hipster
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * Getter method for the Hipster Phrase
	 * 
	 * @return The hipster phrase of the Hipster
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/*
	 * Getter method for the array of Hipster books.
	 * 
	 * @return The array of the Hipster
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * Setter method to change the name of the Hipster.
	 * 
	 * @param name
	 *            THe new name value for the Hipster.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Setter method to change the type of the Hipster.
	 * 
	 * @param hipsterType
	 *            The new type of Hipster.
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * Setter method to change the phrase of the Hipster.
	 * 
	 * @param hipsterPhrase
	 *            The new phrase of Hipster.
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * Setter method for the array of books for the Hipster.
	 * 
	 * @param hipsterBooks
	 *            The new array of books.
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	/**
	 * Helper method to fill the book array for the Hipster.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "The Scarlet Letter";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "Ender's Game";
		hipsterBooks[4] = "City of Bones";
	}

}
