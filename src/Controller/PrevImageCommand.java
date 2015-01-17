/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import us.ImageViewer;

/**
 *
 * @author GABY
 */
public class PrevImageCommand extends ImageCommand{

    public PrevImageCommand(ImageViewer imageViewer) {
        super(imageViewer);
    }

    
    @Override
    public void execute() {
        this.getImageViewer().showPrevImage();
    }
    
    
}
