package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicturePanel extends JPanel
{

	private Image baseImage;
	private ImageIcon pictureSource;
	private int width;
	private int height;
	
	public void setPictureSource(URL imagePath)
	{
	this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Creates a PicturePanel object with the specified URL path, width, and height.
	 * @param imageURL The URL address for the picture.
	 * @param width The width of the panel.
	 * @param height The height of the panel.
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}

	/**
	 * Overrides the paintComponent method of JPanel to drrae the image to fill the entire panel.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
}
