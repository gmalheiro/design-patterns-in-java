import java.util.ArrayList;
import java.util.Iterator;

public class ObserverPatternMain {

	public static void main(String[] args) {
		Product samsungTv = new Product("Samsung OLED TV", "OLED TV", "5000$","Not available");
		
		Person david = new Person("David",samsungTv);
		
		Person john = new Person("John",samsungTv);
		
		ArrayList<Observer> subscribers = samsungTv.getObservers();
		
		System.out.println("subscribers list: " + subscribers);
		
		for (Iterator<Observer> iterator = subscribers.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println("This person has subscribed : " + person.getPersonName());
		}
		
		System.out.println();
		System.out.println("Samsung OLED TV current state: " + samsungTv.getAvailability());
		System.out.println();
		
		samsungTv.setAvailability("Available");
	}

}
