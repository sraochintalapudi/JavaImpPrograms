//java program to demonstrate single inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating....");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping....");
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BabyDog bd=new BabyDog();
      bd.weep();
      bd.bark();
      bd.eat();
	}

}
