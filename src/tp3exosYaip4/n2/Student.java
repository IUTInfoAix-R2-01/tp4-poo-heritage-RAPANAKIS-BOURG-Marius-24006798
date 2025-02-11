package tp3exosYaip4.n2;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student[program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
        Student student1 = new Student("John Doe", "123 Main St", "Program A", 1, 1000.0);
        Student student2 = new Student("Jane Smith", "456 Elm St", "Program B", 2, 2000.0);
        
        System.out.println(student1);
        System.out.println(student2);

        student1.setProgram("Program C");
        student1.setYear(3);
        student1.setFee(1500.0);
        System.out.println(student1);
    }
	
}
