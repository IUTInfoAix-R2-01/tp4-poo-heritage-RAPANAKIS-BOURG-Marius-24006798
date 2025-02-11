package tp3exosYaip4.n2;

public class Staff extends Person {

	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public double getPay() {
		return pay;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff[school=" + school + ", pay=" + pay + "]";
	}
	
	public static void main(String[] args) {
        Staff staff1 = new Staff("John Doe", "123 Main St", "School A", 5000.0);
        Staff staff2 = new Staff("Jane Smith", "456 Elm St", "School B", 6000.0);
        
        System.out.println(staff1);
        System.out.println(staff2);

        staff1.setSchool("School C");
        staff1.setPay(5500.0);
        System.out.println(staff1);
    }
	
	
}
