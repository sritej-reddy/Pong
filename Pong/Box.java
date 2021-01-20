package my_pong;

import java.awt.*;

public class Box implements Runnable {
	int x, y, xdir, ydir;
	Pong pong;
	Paddle p;

	public Box() {
		this.xdir = 1;
		this.ydir = 1;
		this.x = 0;
		this.y = 250;

	}

	public void draw(Graphics g) {

		g.setColor(Color.RED);
		g.fillRect(x, y, 15, 15);
	}

	public void move() {

		x += xdir;
		y += ydir;
		if (x < 0) {
			xdir = 1;
			x += xdir;
		} else if (x > 580) {
			xdir = -1;
			x += xdir;
		}
		if (y < 27) {
			ydir = 1;
			y += ydir;
		} else if ((x > p.x - 10 && x < p.x + 65) && y > 575) {
			ydir = -1;
			y += ydir;

		} else if (y > 580) {
			System.exit(0);
		}
		pong.repaint();

	}

	@Override
	public void run() {
		while (true) {

			try {
				move();
				Thread.sleep(5);

			} catch (Exception e) {
				System.out.println("roor");
			}
		}
	}
}
