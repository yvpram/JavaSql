package sep_18_Exception;
class ABC{
	
}
class Message extends RuntimeException {
	public Message(String mes) {
		System.out.println(mes);
	}
}

public class Throw extends ABC{
	public int add(int i, int j) {
		return i+j;
	}
	public static void main(String[] args) {
		int a = 100, b = 2, c;
		c = a / b;
		if (c < 0) {
			throw new Message("with zerro we not divisible");
			// throw new ArithmeticException("with zerro we not divisible");
		}
		System.out.println(c);
		Throw  qwe= (Throw) new ABC();
		 qwe.add(5, 45);
		
	}

}
