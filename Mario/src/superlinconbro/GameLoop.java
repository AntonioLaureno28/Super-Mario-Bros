package superlinconbro;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GameLoop extends JPanel {
	 private int width;
	 private int heigth;
	 private Background imagem;
	    
	 public GameLoop(){
	       imagem = new Background("res\\Fundo1.avif");
	 }
	    
	 @Override
	 public void paint(Graphics g){
		 super.paint(g);
		 imagem.draw(g, width, heigth);

	 }
	    
	 public void gamelLogic(ArrayList<Integer>input){
	        
	 }
	    
	 public void restart(){

	 }

}
