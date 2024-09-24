package sep_21_FunctionInterfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionInterface {

	public static void main(String[] args) {
		// Function interface takes one input and and retain type and it gives void
		Function<String, Integer> fstr = (s) -> s.length();
		System.out.println(fstr.apply("google"));
		Function<Integer, Integer> fint = s -> s * 2;
		System.out.println(fint.apply(5));
		Function<String, String> fs = s -> s.concat(s);
		System.out.println(fs.apply("hi ram "));
		Function<Integer, String> fis = s -> s.toString();
		System.out.println(fis.apply(5));
		System.out.println();
		// BiFunction<
		BiFunction<String, String, String> bi = (t, u) -> t.concat(u);
		System.out.println(bi.apply("Google", "Search"));
		BiFunction<String, String, Integer> bee = (t, u) -> t.length() + u.length();
		System.out.println(bee.apply("ram", "sam"));
		BiFunction<Integer, Integer, Integer> innt = (t, u) -> u + t;
		System.out.println(innt.apply(8, 2));
		BiFunction<Integer, Integer, String> stre = (t, u) -> t.toString() + u.toString();
		System.out.println(stre.apply(5, 2));
		System.out.println(" ");
		//
		Consumer<String> s = su -> System.out.println(su);
		s.accept("google");
		Consumer<Integer> si = su -> System.out.println(su);
		si.accept(55);
		Consumer<Float> fo = su -> System.out.println(su);
		fo.accept(55.4545f);
		Consumer<Boolean> k = su -> System.out.println(su);
		k.accept(true);
		System.out.println();
		//BiConsumer
		BiConsumer<String, String> bc= (t, u) -> System.out.println(t.concat(u));
		bc.accept("ram", "sam");
		BiConsumer<String, Integer> bci= (t, u) -> System.out.println(t+u);
		bci.accept("ram", 5);
		BiConsumer<Integer, Integer> bcc= (t, u) -> System.out.println(t+u);
		bcc.accept(7, 5);
		//
		System.out.println();
		Predicate<Integer> p= t -> t==10;
		System.out.println(p.test(8));
		System.out.println(p.test(10));
		Predicate<String> pr= t -> t=="google";
		System.out.println(pr.test("test"));
		System.out.println(pr.test("google"));
		
		
		BiPredicate<String, String> bp= (w,e)-> w.equals(e);
		System.out.println(bp.test("ram", "sam"));
		System.out.println(bp.test("ram", "ram"));
		BiPredicate<Integer, Integer> bpl= (w,e)-> w.equals(e);
		System.out.println(bpl.test(2, 3));
		System.out.println(bpl.test(2, 2));
		
		System.out.println();
		Supplier<LocalDateTime> so= ()-> LocalDateTime.now();
		System.out.println(so.get());
		Supplier<LocalDate> soq= ()-> LocalDate.now();
		System.out.println(soq.get());
		Supplier<LocalTime> soy= ()-> LocalTime.now();
		System.out.println(soy.get());
		
		
	}

}
