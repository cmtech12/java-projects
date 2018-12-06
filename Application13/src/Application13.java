 class Person {
	 String name;
	 int age;
	 }
class Animal {
	String type;
	String describe;
	String purpose;
	
}
public class Application13 {

	public static void main(String[] args) {
	
	Person person1 = new Person ();
	person1.name = "Salome Moore";
	person1.age = 8;
	
	Person person2 = new Person ();
	person2.name = "Djozer Moore";
	person2.age = 7;
	
	Person person3 = new Person (); 
		person3.name = "Christopher Moore Jr.";
		person3. age = 17;
	
		
	Animal animal1 = new Animal ();
			animal1.type = "Sheep";
			animal1.describe = "Grazing animal that provides good and meat to polpulations.";
			animal1.purpose = "Provide meat in some socities and provides materials for clothing";
			
	Animal animal2 = new Animal ();
			animal2.type = "Cow";
			animal2.describe = "Grazing animal that provides many food products to market.";
			animal2.purpose = "Provides milk, beef, and other uses to market.";
			
	Animal animal3 = new Animal ();
			animal3.type = "Alligator";
			animal3.describe = "Lives in water and will general eat many types of animals.";
			animal3.purpose = "This animal provides meat and people use the skin of this animal for boots, belts, coats and other items";
			
			System.out.println(person3.name);
			System.out.println(person3.age);
			System.out.println(animal2.purpose);
			System.out.println(animal3.purpose);
	}
	

}
