package my_pong;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pong extends Frame implements KeyListener {
	/**
	 * 
	 */
	Image i1;
	Graphics gra1;
	static Box b;
	static Thread box, paddle;
	static Paddle p;
	private static final long serialVersionUID = 1L;

	Pong() {
		setTitle("pong game");
		setSize(600, 600);
		setResizable(false);
		setVisible(true);
		setBackground(Color.CYAN);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(this);
	}

	public void paint(Graphics g) {

		if (i1 == null) {
			i1 = createImage(600, 600);
			gra1 = i1.getGraphics();
		}
		gra1.setColor(this.getBackground());
		gra1.fillRect(0, 0, 600, 600);
		gra1.setColor(this.getForeground());
		p.draw(gra1);
		b.draw(gra1);
		g.drawImage(i1, 0, 0, this);
	}

	public static void main(String[] args) {
		Pong pong = new Pong();

		b = new Box();
		b.pong = pong;
		p = new Paddle();
		p = new Paddle();
		b.p = p;
		box = new Thread(b);
		box.start();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == arg0.VK_LEFT)
			p.moveLeft();
		else if (arg0.getKeyCode() == arg0.VK_RIGHT)
			p.moveRight();// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
