package controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class AlunoController extends AbstractController {
    
	@FXML
	private ImageView myImageView;
	
	//Mais info http://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm
	
    @FXML
	private void abrirArquivo() {
    	FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(stage);
		if (file != null) {
			BufferedImage bufferedImage;
			try {
				bufferedImage = ImageIO.read(file);
				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				myImageView.setImage(image);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
