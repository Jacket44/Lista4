package sample;

public class Primes {
    public int[] tab;

    public void createTabel(int n) {
        int k = 0;
        tab = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ifPrime(i)) {
                tab[k] = i;
                k++;
            }
        }
    }

    public int number(int m) {
        return tab[m];
    }

    public boolean ifPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
