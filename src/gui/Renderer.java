package gui;
 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
import javax.swing.JPanel;
import javax.swing.Timer;

public class Renderer extends JPanel implements ActionListener {
 
    protected ArrayList<Drawable> drawables=new ArrayList<Drawable>();
 

    // public static Animation test;
    private Timer timer;
 
    public Renderer() {
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        timer = new Timer(2, this);// comando que repete a funcao
                                    // actionPerformed();
        timer.start();
    }
 
  
 
    private void drawPictures(Graphics2D g, Drawable a) {
    	
        if (a != null) {
        	a.draw(g);  
        }
    }
 
    public void paint(Graphics g) {
    	 super.paint(g);
        Graphics2D a = (Graphics2D) g;
        
        if (drawables != null) {
            for (int i = 0; i < drawables.size(); i++) {
                drawPictures((Graphics2D) g.create(), drawables.get(i));
            }
        }
 
        Toolkit.getDefaultToolkit().sync();// nao sei direito o que faz, mas
                                            // parece que o jogo roda mais suave
                                            // com ele.
        a.dispose();// elimina lixo de memoria
    }
 

 
    public void addImage(Drawable i) {
        drawables.add(i);
        
    }
    
    public void clearImages() {
        drawables.clear();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        try {
            Thread.sleep((long) 16);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
 
}