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
public abstract class ImageCommand implements Command{
    private final ImageViewer imageViewer;

    public ImageCommand(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    public ImageViewer getImageViewer() {
        return imageViewer;
    }
}
