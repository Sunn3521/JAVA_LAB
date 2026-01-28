class TotalAverage 
{
	static int a,b;
	static int total;
	static double average;
	static void calculate()
	{
		total=a+b;
		average=total/2.0;
	}
	public static void main(String[] args) 
	{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		calculate();
		System.out.println("first number:"+a);
		System.out.println("second number:"+b);
		System.out.println("total:"+total);
		System.out.println("average:"+average);
	}
}
