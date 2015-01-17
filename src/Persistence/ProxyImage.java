
package Persistence;

import Model.Bitmap;
import Model.Image;

/**
 *
 * @author GABY
 */
class ProxyImage extends Image {
    private final ImageLoader loader;
    private Image realImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    
    public Bitmap getBitmap(){
        checkImage();
        return realImage.getBitmap();
    }

    private void checkImage() {
        if(realImage != null) return;
        realImage = loader.load();
    }
}
