package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	public BluePolymorph(int x, int y, int Width, int Height) {
		super(x, y, Width, Height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, Width, Height);
	}

    @Override
    public void update() {
        
    }
	
}
