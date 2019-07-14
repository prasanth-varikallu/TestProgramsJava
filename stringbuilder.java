import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stringbuilder {

    private static int i = 1;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        stringbuilder s = new stringbuilder();
        int b = s.i;

        sb.append(1);
        sb.append(2);

        List<Integer> list = Arrays.asList(1);

        Optional<Integer> x = list.stream()
                .filter(stringbuilder::isGrt3)
                .filter(stringbuilder::isEven)
                .map(e -> e * 2)
                .findFirst();

        System.out.println(x.isPresent());



//        System.out.println(sb.reverse().toString());

    }

    private static boolean isGrt3(int number) {
        return number > 3;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }


}
