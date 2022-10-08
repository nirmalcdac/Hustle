import java.util.Arrays;
import java.util.List;

public class TestParallelStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sunday", "Monday", "January", "Wednesday", "February", "December", "Saturday", "Monday", "Friday");
        names.parallelStream()
                .filter(name -> name.endsWith("day"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

//FRIDAY
//MONDAY
//SATURDAY
//WEDNESDAY
//SUNDAY
//MONDAY

//MONDAY
//WEDNESDAY
//FRIDAY
//SUNDAY
//MONDAY
//SATURDAY

//MONDAY
//WEDNESDAY
//SUNDAY
//SATURDAY
//MONDAY
//FRIDAY

//WEDNESDAY
//SUNDAY
//MONDAY
//MONDAY
//SATURDAY
//FRIDAY