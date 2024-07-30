import java.util.*;

//Programmer Name: Viraj Patel
//Date: 10/23/2017

public class LinearRegression
{
	public static ArrayList<Double> xy(ArrayList<Double> x, ArrayList<Double> y, int n)
	{
		ArrayList<Double> xyValues = new ArrayList<>();
		for(int z = 0; z < n; z++)
		{
			double v = x.get(z)*y.get(z);
			xyValues.add(v);
		}
		return xyValues;
	}

	public static ArrayList<Double> xSquared(ArrayList<Double> x, int n)
	{
		ArrayList<Double> xx = new ArrayList<>();
		for(int z = 0; z < n; z++)
		{
			double v = x.get(z)*x.get(z);
			xx.add(v);
		}
		return xx;
	}

	public static double sumOfX(ArrayList<Double> x, int n)
	{
		double sum = 0;
		for(int a = 0; a < n; a++)
		{
			sum = sum + x.get(a);
		}
		return sum;
	}

	public static double sumOfY(ArrayList<Double> y, int n)
	{
		double sum = 0;
		for(int a = 0; a < n; a++)
		{
			sum = sum + y.get(a);
		}
		return sum;
	}

	public static double sumProductOfXY(ArrayList<Double> x, ArrayList<Double> y, int n)
	{
		double sum = 0;
		for(int a = 0; a < n; a++)
		{
			sum = sum + (x.get(a) * y.get(a));
		}
		return sum;
	}

	public static double sumProductOfXX(ArrayList<Double> x, int n)
	{
		double sum = 0;
		for(int a = 0; a < n; a++)
		{
			sum = sum + (x.get(a) * x.get(a));
		}
		return sum;
	}

	public static double slopeOfB(int n, double xy, double xx, double x, double y)
	{
		double b;
		double d = x*x;
		b = ((n*xy) - ((x)*(y)))/((n*xx) - d);

		return b;
	}

	public static double interceptOfA(int n, double b, double x, double y)
	{
		double g;
		g = (y - (b*(x)))/n;

		return g;
	}

	public static void main(String [] args)
	{
		System.out.println("WELCOME TO \"VIRAJ'S LINEAR REGRESSION CALCULATOR\" AP STAT'S WIZARDS!");
		System.out.println();

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many values do you have: ");
			int totalValue = keyboard.nextInt();
		System.out.println();

		ArrayList<Double> xValues = new ArrayList<>();
		ArrayList<Double> yValues = new ArrayList<>();

		for(int i = 0; i < totalValue; i++)
		{
			System.out.println("Enter your X values: ");
				double x = keyboard.nextDouble();
					xValues.add(x);
			System.out.println("Enter your Y values: ");
				double y = keyboard.nextDouble();
					yValues.add(y);
			System.out.println();
		}

		ArrayList<Double> pOfXY = new ArrayList<>();
			pOfXY = xy(xValues, yValues, totalValue);
		ArrayList<Double> pOfXX = new ArrayList<>();
			pOfXX = xSquared(xValues, totalValue);

		double sumX = sumOfX(xValues, totalValue);
		double sumY = sumOfY(yValues, totalValue);
		double sumofYX = sumProductOfXY(xValues, yValues, totalValue);
		double sumofXX = sumProductOfXX(xValues, totalValue);
		double b = slopeOfB(totalValue, sumofYX, sumofXX, sumX, sumY);
		double a = interceptOfA(totalValue, b, sumX, sumY);

		System.out.println("N: " + totalValue);
		System.out.println("X-Values: " + xValues);
		System.out.println("Y-Values: " + yValues);
		System.out.println("SX: " + sumX);
		System.out.println("SY: " + sumY);
		System.out.println("SXY: " + sumofYX);
		System.out.println("SX2: " + sumofXX);
		System.out.println("Slope of B: " + b);
		System.out.println("Intercept of A: " + a);
		System.out.println();
		System.out.println("Equation(y=a+bx): y = " + a + " + " + b + "x");
		System.out.println();
	}
}