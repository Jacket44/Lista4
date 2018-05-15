package sample;

public class Test {

    public static void main(String[] args) {
        int n;

        try {
            Primes primes = new Primes();
            primes.createTabel(Integer.parseInt(args[0]));

            for (int i = 1; i < args.length; i++) {
                try {
                    n = Integer.parseInt(args[i]);
                    System.out.println(n + " - " + primes.number(n));
                } catch (NumberFormatException ex) {
                    System.out.println(args[i] + " - not an int");
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println(args[i] + " - out of range");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(args[0] + " - not an int");
            System.exit(1);
        } catch (IllegalArgumentException ex) {
            System.out.println(args[0] + " - out of range");
            System.exit(1);
        } catch (NegativeArraySizeException ex) {
            System.out.println(args[0] + " - out of range");
            System.exit(1);
        }
    }


}
