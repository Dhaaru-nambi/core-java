package pkg;
 
import java.util.List;
public class ArithmeticOperations {
	public static <T extends Number> Number add(T t1, T t2) {
		return (t1.doubleValue() + t2.doubleValue());
	}
	public static <T extends Number> Number sub(T t1, T t2) {
		return (t1.doubleValue() - t2.doubleValue());
	}

	public static <T extends Number> Number mul(T t1, T t2) {
		return (t1.doubleValue()*t2.doubleValue());
	}
	public static <T extends Number> Number div(T t1, T t2) {
		return (t1.doubleValue() / t2.doubleValue());
	}
 
	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();
 
		return new Double (d);
	}
	public static void main(String[] args) {
		// Adding 2 integers
		Integer i1 = new Integer (34), i2 = new Integer(43);
		System.out.println("Addition: " + ArithmeticOperations.add(i1, i2));
		System.out.println("Subtraction: " + ArithmeticOperations.sub(i1, i2));
		System.out.println("Multiplication:" + ArithmeticOperations.mul(i1, i2));
		System.out.println("Division: " + ArithmeticOperations.div(i1, i2));
	}
}