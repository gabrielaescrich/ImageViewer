/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us;

import Model.Image;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author GABY
 */
public class ImagePanel extends JPanel implements ImageViewer{

    private Image image;
    private int initial;
    private int offset;

    public ImagePanel() {
        this.offset = 0;
        this.hookEvents();
    }
    
    
    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public void setImage(Image image) {
        this.image = image;
        repaint();
    }

    @Override
    public void showNextImage() {
        image = image.getNext();
        repaint();
    }

    @Override
    public void showPrevImage() {
        image = image.getPrev();
        repaint();
    }

    private void hookEvents() {
       this.addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {
           }

           @Override
           public void mousePressed(MouseEvent e) {
               initial = e.getX();
           }

           @Override
           public void mouseReleased(MouseEvent e) {
               if(offset > image.getBitmap().getWidth()/2){
                   showPrevImage();
               }else{
                   if(offset < -image.getBitmap().getWidth()/2){
                       showNextImage();
                   }
               }
               offset = 0;
               repaint();
           }

           @Override
           public void mouseEntered(MouseEvent e) {
           }

           @Override
           public void mouseExited(MouseEvent e) {
           }
       });
    }
    
    public void paint (Graphics graphics){
        if(image == null)return;
        super.paint(graphics);
        graphics.drawImage(getBufferedImage(image), offset, 0, null);
        if(offset == 0)return;
        if(offset < 0){
            graphics.drawImage(getBufferedImage(image.getNext()), image.getBitmap().getWidth() + offset, 0, null);
        }
        if( offset > 0){
            graphics.drawImage(getBufferedImage(image.getPrev()), offset - image.getBitmap().getWidth(), 0, null);
        }
    }

    private BufferedImage getBufferedImage(Image image) {
       SwingBitmap bitmap = (SwingBitmap) image.getBitmap();
       return bitmap.getBufferedImage();
    }
    
}
