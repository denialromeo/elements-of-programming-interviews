import java.util.ArrayList;

public class Primes {
  public static ArrayList<Integer> primesTo (int n) {
    ArrayList<Boolean> sieve = new ArrayList<Boolean>();
    for (int i = 0; i < n; i++) {
      sieve.add(true);
    }
    for (int i = 2; i < sieve.size(); i++) {
      if (sieve.get(i)) {
        for (int j = 2 * i; j < sieve.size(); j += i) {
          sieve.set(j, false);
        }
      }
    }
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < sieve.size(); i++) {
      if (sieve.get(i)) {
        primes.add(i);
      }
    }
    return primes;
  }

  public static void main(String[] args) {
    System.out.println(primesTo(100));
  }
}
