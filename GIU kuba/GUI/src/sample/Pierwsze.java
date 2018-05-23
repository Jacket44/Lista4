package sample;

class Pierwsze {
    static int[] Pierwsze;
    static int args;
    static String Stage = "white";
    static String Czc = "black";

    static void tablica(int n) {
        int sum = 0;
        for (int y = 2; y < n; y++) {
            if (prime(y)) {
                sum++;
            }
        }
        Pierwsze = new int[sum];
        int x = 0;
        for (int y = 2; x < sum; y++) {
            if (prime(y)) {
                Pierwsze[x] = y;
                x++;
            }
        }
    }

    static int liczba(int m) {
        return Pierwsze[m];
    }

    static boolean prime(int prime) {
        for (int i = 2; i < prime; i = i + 1) {
            if (prime % i == 0) return false;
        }
        return true;
    }
}
