public class Basic {

    public int add(int... addParam) {
        int sum = 0;
        for (int i = 0; i < addParam.length; i++) {
            sum = sum + addParam[i];
        }
        return sum;
    }

    public long add(long... addParam) {
        long sum = 0;
        for (int i = 0; i < addParam.length; i++) {
            sum = sum + addParam[i];
        }
        return sum;
    }

    public double add(double... addParam) {
        double sum = 0;
        for (int i = 0; i < addParam.length; i++) {
            sum = sum + addParam[i];
        }
        return sum;
    }

    public int substract(int... substractParam) {
        int sub = substractParam[0];
        for (int i = 1; i < substractParam.length; i++) {
            sub = sub - substractParam[i];
        }
        return sub;
    }

    public long substract(long... substractParam) {
        long sub = substractParam[0];
        for (int i = 1; i < substractParam.length; i++) {
            sub = sub - substractParam[i];
        }
        return sub;
    }

    public double substract(double... substractParam) {
        double sub = substractParam[0];
        for (int i = 1; i < substractParam.length; i++) {
            sub = sub - substractParam[i];
        }
        return sub;
    }


    public int multiply(int... multiplyParam) {
        int mult = 1;
        for (int i = 0; i < multiplyParam.length; i++) {
            mult *= multiplyParam[i];
        }
        return mult;
    }

    public long multiply(long... multiplyParam) {
        long mult = 1;
        for (int i = 0; i < multiplyParam.length; i++) {
            mult *= multiplyParam[i];
        }
        return mult;
    }

    public double multiply(double... multiplyParam) {
        double mult = 1;
        for (int i = 0; i < multiplyParam.length; i++) {
            mult *= multiplyParam[i];
        }
        return mult;
    }


    public double divide(int... divideParam) {
        double div = divideParam[0];
        for (int i = 1; i < divideParam.length; i++) {
            if (divideParam[i] == 0) {
                throw new IllegalArgumentException("Argument 'divideParam' is 0");
            } else {
                div /= divideParam[i];
            }
        }
        return div;
    }

    public double divide(long... divideParam) {
        double div = divideParam[0];
        for (int i = 1; i < divideParam.length; i++) {
            if (divideParam[i] == 0) {
                throw new IllegalArgumentException("Argument 'divideParam' is 0");
            } else {
                div /= divideParam[i];
            }
        }
        return div;
    }

    public double divide(double... divideParam) {
        double div = divideParam[0];
        for (int i = 1; i < divideParam.length; i++) {
            if (divideParam[i] == 0) {
                throw new IllegalArgumentException("Argument 'divideParam' is 0");
            } else {
                div /= divideParam[i];
            }
        }
        return div;
    }

}
