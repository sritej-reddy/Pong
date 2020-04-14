package my_pong;

import java.awt.*;

public class Paddle {
	int x;
	static boolean allow = true;

	public Paddle() {
		if (allow) {
			this.x = 300;

			allow = false;
		} else {
			this.x = 300;
			allow=true;
		}
	}

	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		if(allow) {
			g.fillRect(this.x, 585, 60, 15);
			allow=false;
		}
		else {
			g.fillRect(this.x, 20, 60, 15);
			allow=true;
		}
	}

	public void moveRight() {
		if (this.x < 540)
			this.x += 5;
		
	}

	public void moveLeft() {
		if (this.x > 7)
			this.x -= 5;
	}
	public void run()
	{
		while(true)
		{}
		
	}

}
