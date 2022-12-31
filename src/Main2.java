
interface Cricket
{
	default void play()
	{
		System.out.println("Play cricket");
	}
}

interface Hollyball
{
	default void play()
	{
		System.out.println("Play hollyball");
	}
}

public class Main2 implements Cricket, Hollyball
{
	public void play() 
	{
		//Cricket.super.play();
		System.out.println("Own implementation");
	}
	
	public static void main(String[] args) 
	{
		Main2 m2=new Main2();
		m2.play();
	}
}

/*
 * If we provide implementation of same method in two different interface and we implement by these two 
 * by another class then we need to override this method to avoid confusion that which should call. 
 * 
 * Also we can mention static method in interface from java 1.8 and simply we can call it by interface
 * name.that method name. Use of static method in interface is to group interface-related utils or 
 * factory methods. If we not using static method in interface then we need to make separate class and
 * store everything there. Also need to make class final and do private constructor.
*/