
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ropali
 */
public class DragListener implements DropTargetListener{
    /*
    this class can be used to provide
    drag and drop feature to any JLabel*/
    
    JLabel label;
    private File DropImageFile;
    
    public File UserProfileImageFile;    
    public File UserSignImageFile;

    public DragListener(JLabel label) {
        this.label = label;
    }
    
  

    public void dragEnter(DropTargetDragEvent dtde) {
        
    }

    public void dragOver(DropTargetDragEvent dtde) {
        
    }

    public void dropActionChanged(DropTargetDragEvent dtde) {
        
    }

    public void dragExit(DropTargetEvent dte) {
        
    }

    //get the dropped image and set to label
    public void drop(DropTargetDropEvent dtde) {
        
        //accept dropped items
        dtde.acceptDrop(DnDConstants.ACTION_COPY);
                 
        //get the dropped item
        Transferable transferable = dtde.getTransferable();
        
        //get the data formats...which ew require images only
        DataFlavor[] dataFlavors = transferable.getTransferDataFlavors();
        
        for(DataFlavor f : dataFlavors){
            try {
                //check if the dropped items are of files type
                if(f.isFlavorJavaFileListType()){
                    //get list of files
                    List<File> files = (List<File>) transferable.getTransferData(f);
                    
                    for(File file : files){
                        displayImage(file);
                        DropImageFile = file;
                    }                    
                }
                
            } catch (Exception e) {
            }
        }        
        
        if(this.label.getText() == "")
        {
        UserProfileImageFile = DropImageFile;
        }
        
        if(this.label.getText() == "")
        {
        UserSignImageFile =DropImageFile;
        }
    }

    private void displayImage(File filePath) {
        try {
            BufferedImage bufferedImage = ImageIO.read(filePath);
            
            BufferedImage customImage = CustomImageSize.resize(bufferedImage, label.getWidth(), label.getHeight());
            //create imageIcon
            ImageIcon imageIcon = new ImageIcon(customImage);
            label.setIcon(imageIcon);
            
        } catch (IOException ex) {
            Logger.getLogger(DragListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
