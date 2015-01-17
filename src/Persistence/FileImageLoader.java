/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Image;
import Model.RealImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import us.SwingBitmap;

/**
 *
 * @author GABY
 */
class FileImageLoader {
    private final String fileName;

    public FileImageLoader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
   
    public Image load(){
        return new RealImage(new SwingBitmap(loadBufferedImage()));
    }

    private BufferedImage loadBufferedImage() {
        try{
            return ImageIO.read(new File(fileName));
        }
        catch(IOException ex){
            return null;
        }
    }
    
}
