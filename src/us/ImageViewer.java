/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us;

import Model.Image;

/**
 *
 * @author GABY
 */
public interface ImageViewer {
    public Image getImage();
    public void setImage(Image image);
    public void showNextImage();
    public void showPrevImage();
    
    
}
