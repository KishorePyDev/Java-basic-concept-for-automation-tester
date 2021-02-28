package Constructor;

public class javaConstructor 
{

	
	int num1;
	int num2;
	
	public javaConstructor(int x,int y)
	{
		num1=x;
		num2=y;
	}
	
	public void multipe() 
	{
		System.out.println("Multiple of "+ num1+" & "+ num2+ " is "+num1*num2);
	}
	

	
	
	public static void main(String[] args) 
	{
		
		javaConstructor jc = new javaConstructor(5, 10);
		jc.multipe();
	}
	
}
