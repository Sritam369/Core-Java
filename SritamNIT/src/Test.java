import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	void main() {
		List<Integer> list = List.of(54,34,234,23,364,3);
		list.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
		.forEach(k -> System.out.print(k - 10 + " "));
	}
}