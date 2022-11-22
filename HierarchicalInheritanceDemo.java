//java program to demonstrate Hierarchical inheritance
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
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing....");
	}
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cat c=new Cat();
      c.meow();
      c.eat();
     // c.bark(); Error
	}

}
