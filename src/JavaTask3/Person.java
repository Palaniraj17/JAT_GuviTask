package JavaTask3;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person person = new Person("Palaniraj", 25);
		System.out.println("The user name is : " + person.getName());
		System.out.println("The user age is : " + person.getAge());
	}

}