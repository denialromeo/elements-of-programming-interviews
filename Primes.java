import java.util.ArrayList;

public class Primes {
  public static ArrayList<Integer> primesTo (int n) {
    ArrayList<Boolean> sieve = new ArrayList<Boolean>();
    for (int i = 0; i < n - 2; i++) {
      sieve.add(true);
    }
    for (int i = 0; i < sieve.size(); i++) {
      if (sieve.get(i)) {
        for (int j = 2 * (i + 2); j < sieve.size() + 2; j += (i + 2)) {
          sieve.set(j - 2, false);
        }
      }
    }
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int i = 0; i < sieve.size(); i++) {
      if (sieve.get(i)) {
        primes.add(i + 2);
      }
    }
    return primes;
  }

  public static void main(String[] args) {
    System.out.println(primesTo(100));
  }
}