package inheritanceconcepts;

public class Emp {
	
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println(id+", "+name);
		System.out.println(address.city+", "+address.country+", "+address.state);
	}
	
	public static void main(String args[]) {
		
		Address addr1 = new Address("Bangalore","Karnataka","India");
		Address addr2 = new Address("Kolkata","West Bengal","India");
		
		Emp e1 = new Emp(1001,"Karthik",addr1);
		Emp e2 = new Emp(2002,"Rini",addr2);
		
		e1.display();
		e2.display();
	}
}