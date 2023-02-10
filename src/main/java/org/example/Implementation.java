package org.example;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
public class Implementation {
    public List<Integer> getAllPrimesLessThan(int sieveSize) {
        var sieve = new BitSet(sieveSize);
        sieve.set(0, sieveSize - 1, true);
        sieve.set(0, false);
        sieve.set(1, false);
        for (int i = 2; i * i < sieve.length(); i++) {
            if (sieve.get(i)) {
                for (int j = i * i; j < sieve.length(); j += i) {
                    sieve.set(j, false);
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < sieve.length(); i++) {
            if (sieve.get(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
        return primes;

    }

}
