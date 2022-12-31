
interface Car
{
	default void speed()
	{
		System.out.println("Car having good speed");
	}
}

class Nexon_car
{
	public void speed()
	{
		System.out.println("Nexon having good speed");
	}
}

public class Main extends Nexon_car implements Car 
{
	public static void main(String[] args) 
	{
		Main m=new Main();
		m.speed();
	}
}


/* 
 * Rule - 1:
 * 
 * In interface we can take method implementation also from java 1.8 so if our Main class implements 
 * interface and extends class at a time then for same method class level method having high priority
 * if two method same in class as well as interface.
 * 
*/
