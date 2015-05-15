package cs48.project.game.Space_Blasters;


import java.awt.image.BufferedImage;

public class SpriteSheet{
/*
 * @author Gabriel Romero
 * Tutorial/ Sample code from RealTutsGML
 *
 */    
    private BufferedImage image;

    public SpriteSheet(BufferedImage image){	
	
	this.image = image;
    }
    
    public BufferedImage grabImage(int col, int row, int width, int height){
	BufferedImage img = image.getSubimage((col * 32) - 32, (row * 32) - 32, width, height);
	return img;

    }
	
}

