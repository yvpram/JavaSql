package sep_18_Exception;

class QWE{
	
}
public class UnCheckedExption extends QWE{
	public int add(int i, int j) {
		return i+j;
	}
	public static void main(String[] args) {
		try {
		 UnCheckedExption  qwe= (UnCheckedExption) new QWE();
		 qwe.add(5, 45);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int a=50,b=0,c;
			c=a/b;
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			String s= "ram";
			s.charAt(5);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			int a[]= {1,2,3};
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			String s= null;
			s.charAt(0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
