
interface Univeristy
{
	void state();
	
	default void central()
	{
		System.out.println("All university belongs to Maharashtra");
	}
}

public class Main1 implements Univeristy
{
	public void state() 
	{
		System.out.println("This is Pune univeristy");	
	}
	public static void main(String[] args) 
	{
		Main1 m1=new Main1();
		m1.central(); // Without implementation we can call because it is already overridden in child.
		m1.state();
	}
}

/* Rule - 2:
 * 
 * From java 1.8 we can mention default methods also with default keyword mandatory so we no need to add 
 * implementation with child, it can be add by-default only remaining method we need to provide 
 * implementation in child class. 
 */
