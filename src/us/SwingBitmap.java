/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us;

import Model.Bitmap;
import java.awt.image.BufferedImage;

/**
 *
 * @author GABY
 */
public class SwingBitmap implements Bitmap{
    private BufferedImage bufferedImage;

    public SwingBitmap(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
    
    public int getWidth(){
        return bufferedImage.getWidth();
    }
    
    public int getHeight(){
        return bufferedImage.getHeight();
    }
}


