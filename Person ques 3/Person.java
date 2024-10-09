public class Person{
	private String firstName;
	private String lastName;
	private int age;
	Person(){
	}
	Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public boolean isEmpty(String value){
		return ( value == null ) ? true : false;
	}
	public String getFirstName(){
		return (firstName.isEmpty()) ? "" : firstName;
	}
	public String getLastName(){
		return (lastName.isEmpty()) ? "" : lastName;
	}
	public int getAge(){
		return age;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean isTeen(){
		return (age > 12 & age < 20) ? true : false;
	}
	public String getFullName(){
		return (isEmpty(firstName)|isEmpty(lastName)) ? (isEmpty(firstName) ? lastName : firstName) : firstName + " " + lastName;
	}
	public static void main (String args[]){
		Person person1 = new Person("Vaibhav", "Tomar", 21);
		Person person2 = new Person("Dhananjay", "Tomar", 15);
		Person person3 = new Person();
		person3.setLastName("Khan");
		person3.setAge(14);
		System.out.println("Name : " + person1.getFullName() + ", is teen : " + person1.isTeen());
		System.out.println("Name : " + person2.getFullName() + ",  is teen : " + person2.isTeen());
		System.out.println("Name : " + person3.getFullName() + ",  is teen : " + person2.isTeen());
	}
}