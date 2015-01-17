package Model;


public class RealImage extends Image{
    private Bitmap bitmap;

    public RealImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    
    @Override
    public Bitmap getBitmap(){
        return bitmap;
    }
}
