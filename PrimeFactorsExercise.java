import java.util.LinkedList;
import java.util.List;

public class PrimeFactorsExercise {
    public List<Integer> generate(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                result.add(i);
            }
        }
        return result;
    }
}