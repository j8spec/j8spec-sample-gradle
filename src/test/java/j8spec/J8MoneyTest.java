package j8spec;

import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import java.math.BigInteger;

import static j8spec.J8Spec.*;
import static j8spec.Var.var;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class J8MoneyTest {{

    final Var<Money> money = var();

    beforeEach(() -> {
        var(money, new Money(10));
    });

    describe("conversions", () -> {
        it("converts to int", () -> {
            assertThat(var(money).toInt(), is(10));
        });

        it("converts to big integer", () -> {
            assertThat(var(money).toBigInt(), is(new BigInteger("10")));
        });
    });

    describe("arithmetic operations", () -> {
        final Var<Money> value = var();

        beforeEach(() -> {
            var(value, new Money(5));
        });

        it("adds a value", () -> {
            assertThat(var(money).plus(var(value)).toInt(), is(15));
        });

        it("subtracts a value", () -> {
            assertThat(var(money).subtract(var(value)).toInt(), is(5));
        });

        it("multiples by a value", () -> {
            assertThat(var(money).times(var(value)).toInt(), is(50));
        });

        describe("division", () -> {
            it("divides by a value", () -> {
                assertThat(var(money).dividesBy(var(value)).toInt(), is(2));
            });

            it("does not divide by zero", () -> {
                assertThat(var(money).dividesBy(new Money(0)).toInt(), is(2));
            });
        });

    });
}}
