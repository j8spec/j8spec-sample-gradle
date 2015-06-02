package j8spec;

import java.math.BigInteger;

public class Money {

    private final int value;

    public Money(int value) {
        this.value = value;
    }

    public int toInt() {
        return value;
    }

    public Money plus(Money money) {
        return new Money(this.value + money.value);
    }

    public Money subtract(Money money) {
        return new Money(this.value - money.value);
    }

    public Money times(Money money) {
        return new Money(this.value * money.value);
    }

    public Money dividesBy(Money money) {
        return new Money(money.value / money.value);
    }

    public BigInteger toBigInt() {
        return new BigInteger(Integer.toString(value));
    }
}
