public class QuadraticSolver
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = b*b - 4*a*c;
		if (a != 0)
		{
			if (d > 0)
			{
				double x1 = (-b + Math.sqrt(d))/(2*a);
				double x2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println(x1);
				System.out.println(x2);
			}
			else System.out.println("Equation is not solvable for real x.");
		}
		else System.out.println("A = 0. Cannot solve equation.");
	}
}