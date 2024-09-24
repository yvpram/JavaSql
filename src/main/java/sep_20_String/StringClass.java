package sep_20_String;

public class StringClass {
	public static void main(String[] args) {
//		String str= "i am java developer";
//		System.out.println(str.hashCode());//610807241
//		str=str+"jjklk";
//		System.out.println(str.hashCode());//-2085514815
//		System.out.println(str);//i am java developerjjklk
//		str= "jjklk";
//		System.out.println(str.hashCode());//101157354
//		System.out.println(str);// it print only "jjklk" it not print  "i am java developer"
//		
		StringBuffer sb= new  StringBuffer();
		sb.append("hello");
		System.out.println(sb.hashCode());//1556956098
		sb.append("cat");
		System.out.println(sb.hashCode());//1556956098
		System.out.println(sb);//it print both "hellocat"
		
		StringBuilder sbu= new  StringBuilder();
		sbu.append("hello");
		System.out.println( sbu.hashCode());//125130493
		 sbu.append("cat");
		System.out.println( sbu.hashCode());//125130493
		System.out.println( sbu);//it print both "hellocat"
		
	}
	

}
