class Alpha{
	
}
class Beta extends Alpha{
	
}

class Animal{
	
	public Alpha accept() {
		return null;
	}
}
class Dog extends Animal{
	
	public Beta accept() {
		return null;
	}
}

public class Covariant {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.accept();

	}

}