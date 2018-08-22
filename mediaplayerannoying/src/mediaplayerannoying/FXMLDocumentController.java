/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayerannoying;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author KRS
 */
public class FXMLDocumentController implements Initializable {
    
   
    
     private String filepath;
    private MediaPlayer mp;
    @FXML
    private Label label;
    @FXML
    private MediaView mediaView;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        
       
      
       filepath="file:/C:/Users/KRS/Videos/Movavi%20Library/tutorialBangla.mp4";
      /* else
       {
            FileChooser.ExtensionFilter filter=new FileChooser.ExtensionFilter("Mp4 file please","*.mp4");
        fileChooser.getExtensionFilters().add(filter);
        File file=fileChooser.showOpenDialog(null);
        filepath=file.toURI().toString();
       }*/
        if (filepath!=null) {
            Media media=new Media(filepath);
            mp=new MediaPlayer(media);
            mediaView.setMediaPlayer(mp);
            mp.play();
            System.out.println("hello "+filepath);
            
        }
    }
     @FXML
    private void handleButtonAction2(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        
       
      
       filepath="file:/C:/Users/KRS/Videos/Movavi%20Library/tutorialEnglish.mp4";
      /* else
       {
            FileChooser.ExtensionFilter filter=new FileChooser.ExtensionFilter("Mp4 file please","*.mp4");
        fileChooser.getExtensionFilters().add(filter);
        File file=fileChooser.showOpenDialog(null);
        filepath=file.toURI().toString();
       }*/
      mp.stop();
        if (filepath!=null) {
            Media media=new Media(filepath);
            mp=new MediaPlayer(media);
            mediaView.setMediaPlayer(mp);
            mp.play();
            System.out.println("hello "+filepath);
            
        }
    }
     @FXML
    private void handleButtonAction3(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        
       
      mp.stop();
      
           FileChooser.ExtensionFilter filter=new FileChooser.ExtensionFilter("Mp4 file please","*.mp4");
        fileChooser.getExtensionFilters().add(filter);
        File file=fileChooser.showOpenDialog(null);
        filepath=file.toURI().toString();
          try {
             
         
      
        if (filepath!=null) {
            Media media=new Media(filepath);
            mp=new MediaPlayer(media);
            mediaView.setMediaPlayer(mp);
            mp.play();
            System.out.println("hello ");
            
        }
        } catch (Exception e) {
              System.out.println("Koi baat nahi");
         }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
