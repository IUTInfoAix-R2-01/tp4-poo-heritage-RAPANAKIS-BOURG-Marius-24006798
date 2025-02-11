package tp3exosYaip4.n2;

public class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person[name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
        Person person1 = new Person("John Doe", "123 Main St");
        Person person2 = new Person("Jane Smith", "456 Elm St");
        
        System.out.println(person1);
        System.out.println(person2);

        person1.setAddress("789 Oak St");
        System.out.println(person1);
    }
	
}
