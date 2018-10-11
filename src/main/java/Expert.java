public class Expert extends Basic {

    public int pow(int numar, int exponent) {
        int result = numar;
        if (exponent == 0) {
            result = 1;
        }
        for (int i = 1; i < exponent; i++) {
            result = result * numar;
        }
        return result;
    }

    public double pow(double numar, int exponent) {
        double result = numar;
        if (exponent == 0) {
            result = 1;
        }
        for (int i = 1; i < exponent; i++) {
            result = result * numar;
        }
        return result;
    }

    public int factorial(int numar1) {
        int fact = 1;
        for (int i = 1; i <= numar1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double factorial(double numar1) {
        double fact = 1;
        for (int i = 1; i <= numar1; i++) {
            fact = fact * i;
        }
        return fact;

    }
}

