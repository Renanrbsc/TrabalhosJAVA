package game;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main extends Canvas implements Runnable {
	
	public static JFrame frame;
	private Thread thread; 
	private boolean estaRodando;
	private final int WIDTH = 160;
	private final int HEIGHT = 150;
	private final int SCALE = 4;

	public Main(){
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		frame = new JFrame();
		frame.add(this);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public synchronized void start(){
		thread = new Thread(this);
		estaRodando = true;
		thread.start();
	}

	public synchronized void stop(){
	}
	
	public void Tick(){
	}

	public void Render(){	
	}
	
	public static void main (String args[]){
		Main main = new Main();
		main.start();	
	}

	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		while(estaRodando){
			long now = System.nanoTime();
			delta+= (now - lastTime)/ ns;
			lastTime = now;
			if(delta >= 1){
				Tick();
				Render();
				frames++;
				delta--;
			}
			
			if(System.currentTimeMillis() - timer >= 1000){
				System.out.println("FPS: "+frames);
				frames = 0;
				timer+=1000;
			}
			
		}
		
	}

}