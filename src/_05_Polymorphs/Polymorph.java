package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
  protected  int x;
  protected int y;
  protected int Width;
  protected int Height;
    public Polymorph(int x, int y, int Width,int  Height){
   	 this.x = x;
   	 this.y = y;
   	 this.Width = Width;
   	 this.Height = Height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
