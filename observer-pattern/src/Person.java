
public class Person implements Observer {
	private String personName;

	public Person(String personName,Subject subject) {
		super();
		this.personName = personName;
		subject.registerObserver(this);
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(String availability) {
		System.out.println("Hello  " + 
						 this.getPersonName() + 
						 " Product is now " 
						 + availability);
	}

}
