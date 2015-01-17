
package Model;

public abstract class Image {
    
    private Image prev;
    private Image next;

    public abstract Bitmap getBitmap();
    
    public Image getPrev() {
        return prev;
    }

    public Image getNext() {
        return next;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

    public void setNext(Image next) {
        this.next = next;
    }
    
    
    
}
