class MethodOverloadingDemo 
{
	float sum(float a,float b)
	{
		return a+b;
	}
	double sum(double a,double b,double c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		System.out.println("sum of two numbers(10+20):"+obj.sum(10,20));
		System.out.println("sum of three numbers(5+15+25):"+obj.sum(5,15,25));
	}
}