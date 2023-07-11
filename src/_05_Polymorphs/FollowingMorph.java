package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowingMorph extends Polymorph implements MouseMotionListener {

	public FollowingMorph(int x, int y, int Width, int Height) {
		super(x, y, Width, Height);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		 
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, Width, Height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX()-20;
		y = e.getY()-20;
	}

	

}
