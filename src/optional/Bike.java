package optional;

public class Bike {

	private String name;
	private String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "I am " + name + " and have model " + model;
	}
	
	
	
}
