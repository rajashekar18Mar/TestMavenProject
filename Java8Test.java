import java.util.List;
import java.util.Arrays;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li=Arrays.asList(1,2,3,4,9,10,5,6,7,8,1,1,1,1,1);
		//li.forEach(System.out::println);
		//int large=li.stream().min(Integer::compare).get();
		li.stream().filter(i->i%2==0).forEach(System.out::print);;
		//System.out.println(count);
		//commit1
		//commit2

	}

}
