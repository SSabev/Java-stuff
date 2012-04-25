import java.awt.Color;

public class ImageEditor
{
	
	public static Color colorFromGrey(int grey)
	{
		return new Color(grey,grey,grey);
	}
	
	public static int greyFromColor(Color c)
	{		
		int grey = (int) (c.getRed() + c.getGreen() + c.getBlue())/3;
		return grey;
	}
	
	public static Picture makeGreyscale(Picture p)
	{
		Picture newP = new Picture(p.width(),p.height());
		int y = 0;
		
		for (int i = 0; i < p.width(); i++)
		{
			for (int j = 0; j < p.height(); i++)
			{
				Color colour = p.get(i,j);
				y = greyFromColor(colour);
				
				colour = colorFromGrey(y);
				
				newP.set(i,j,colour);
			}
		}
		return newP;
	}
	
	public static Picture threshold(Picture p, int thresh)
	{
		Picture newP = new Picture(p.width(),p.height());
		int y = 0;
		
		for (int i = 0; i < p.width(); i++)
		{
			for (int j = 0; j < p.height(); i++)
			{
				Color colour1 = p.get(i,j);
				y = greyFromColor(colour1);
				
				if ( y > thresh)
				{
					colour1 = colorFromGrey(y);
					newP.set(i,j,colour1);
				}
				else 
				{
					Color colour_new = new Color(0,0,0);
					newP.set(i,j,colour_new);
				}
				
			}
		}
		
		return newP;
	}
	
	public static Picture adjustPicture(Picture p, double adjustR, double adjustG, double adjustB )
	{
		Picture newP = new Picture(p.width(),p.height());
		
		for (int i = 0; i < p.width(); i++)
		{
			for (int j = 0; j < p.height(); i++)
			{
				Color colour2 = p.get(i,j);
				int newR = (int) (colour2.getRed() * adjustR);
				int newG = (int) (colour2.getGreen() * adjustG);
				int newB = (int) (colour2.getBlue() * adjustB);
				
				Color colour_new_again = new Color(newR, newG, newB);
				
				newP.set(i,j,colour_new_again);
			}
		}
		
		return newP;
	}
	
	
	public static void main(String[] args)
	{
		Picture p = new Picture("lion2.jpg");
		//Picture p = new Picture( "spider.jpg");
		p.show();
		
		Picture thres = threshold(p, 140);
		thres.show();
		
		
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
		
		
		Picture redComponent = adjustPicture(p, 1.0,0.0,0.0);
		redComponent.show();
		
		//Picture redComponent_grey = makeGreyscale(adjustPicture(p, 0.0,0.0,1.0));
		//threshold(redComponent_grey, 35).show();
		
	}
}