class A
{
	void callme(){
		System.out.println("I belong to class A");
	}
}
class B extends A
{
	void callme(){
		System.out.println("I belong to class B");		
	}
}
class C extends A
{
	void callme(){
		System.out.println("I belong to class c");
	}
	void callme1(){
		System.out.println("I belong to class c");
	}	
}
class Dispatch
{
	public static void main(String[] args) 
	{
		A r;
		r=new A();
		r.callme();
		r=new B();
		r.callme();
		r=new C();
		r.callme();
	}
}
