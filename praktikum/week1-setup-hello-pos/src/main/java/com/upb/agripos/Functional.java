import java.util.function.BiFunction;

public class HelloFunctional {
    public static void main(String[] args) {
        BiFunction<String, String, String> greet = (name, nim) ->
            "Hello World, I am " + name + "-" + nim;

        System.out.println(greet.apply("Rafi Kurniawan", "123456789"));
    }
}
