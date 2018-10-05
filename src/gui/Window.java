package gui;

import javax.swing.JFrame;


public class Window extends JFrame  {
	 static int players;
	    public Window() {   
	        setTitle("Pinga ponga");
	        setDefaultCloseOperation(3);
	        setSize(800+16, 600+38);
	        setLocationRelativeTo(null);   
	        setResizable(true);    
	    }

	   public void setRenderer(Renderer a){
	       add(a);
	       setVisible(true);
	    }
}
