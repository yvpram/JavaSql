package sep_19_Multithreading;
class Class1{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(" it is class 1 "+i);
		}
			
	}
}
class  Class2{
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(" it is class 2 "+i);
		}

	}
}
public class NON_Multithreading {

	public static void main(String[] args) {
		Class1 class1= new Class1();
		class1.run();
		Class2 class2= new Class2();
		class2.run();
	}

}
/***
 * in this case
 */
