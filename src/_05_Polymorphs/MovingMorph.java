package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y, int Width, int Height) {
		super(x, y, Width, Height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int choice = rand.nextInt(4);
		if (choice ==0) {
			x=x-1;
		}
		if (choice ==1) {
			x=x+1;
		}
		if (choice ==2) {
			y=y-1;
		}
		if (choice ==3) {
			y=y+1;
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(x, y, Width, Height);
	}

}
