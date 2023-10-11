package java8;
@FunctionalInterface
interface I {
	void demo();
}
public class Driver {
	public static void main(String[] args) {
		I ref = () -> {
			System.out.println("Lambda Expression");
			System.out.println("Java 8 feature");
		};
		ref.demo();
		I ref1 = () -> {
			System.out.println("different implementation");
		};
		ref1.demo();
	}
}
