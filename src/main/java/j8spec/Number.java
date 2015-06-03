package j8spec;

import java.math.BigInteger;

public class Number {

    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int toInt() {
        return value;
    }

    public Number plus(Number number) {
        return new Number(this.value + number.value);
    }

    public Number subtract(Number number) {
        return new Number(this.value - number.value);
    }

    public Number times(Number number) {
        return new Number(this.value * number.value);
    }

    public Number dividesBy(Number number) {
        return new Number(number.value / number.value);
    }

    public BigInteger toBigInt() {
        return new BigInteger(Integer.toString(value));
    }
}
