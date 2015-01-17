package Persistence;

import Model.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GABY
 */
public class FileImageListLoader {
    private String path;

    public FileImageListLoader(String path) {
        this.path = path;
    }
    
    private List<Image> loadImages(){
        List<Image> list = new ArrayList<>();
        
        for (String file : new File(path).list()) {
            list.add(new ProxyImage((ImageLoader) new FileImageLoader(path+"/"+file)));
        }
        return list;
        
    }
    
}
