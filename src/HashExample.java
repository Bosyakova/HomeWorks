import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashExample {
    public static void main(String[] args){
        Map <Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < 100; i++){
            numbers.put(i, i*2);
        }
           System.out.println(numbers);

    }
}
