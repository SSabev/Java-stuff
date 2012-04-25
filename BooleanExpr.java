public class BooleanExpr
{
	public static void main(String[] args)
	{
		boolean a = Boolean.parseBoolean(args[0]);
		boolean b = Boolean.parseBoolean(args[1]);
		boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("phi: " + phi);
	}
}