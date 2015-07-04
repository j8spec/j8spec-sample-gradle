package j8spec.examples;

import java.math.BigInteger;

public class Calculator {

    public int add(int v1, int v2) {
        return v1 + v2;
    }

    public int add(BigInteger v1, BigInteger v2) {
        return v1.intValue() + v2.intValue();
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException();
        }
        return 0;
    }
}
