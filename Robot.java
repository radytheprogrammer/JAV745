package seneca;

public abstract class Robot {
	
	public String name = null;

	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(String name) {
		this.name = name;
	}
	
	
	public void speak() {
		System.out.println("Beep Beep");
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + "]";
	}

}
