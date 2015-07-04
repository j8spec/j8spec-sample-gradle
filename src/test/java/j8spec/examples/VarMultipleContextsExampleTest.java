package j8spec.examples;

import j8spec.Var;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import java.math.BigInteger;

import static j8spec.J8Spec.*;
import static j8spec.Var.var;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class VarMultipleContextsExampleTest {{

    Var<Calculator> calculator = var();

    beforeEach(() -> {
        var(calculator, new Calculator());
    });

    context("integer values", () -> {
        Var<Integer> intValue1 = var();
        Var<Integer> intValue2 = var();

        beforeEach(() -> {
            var(intValue1, 1);
            var(intValue2, 3);
        });

        it("adds two values", () -> {
            assertThat(var(calculator).add(var(intValue1), var(intValue2)), is(4));
        });
    });

    context("big integer values", () -> {
        Var<BigInteger> bigIntValue1 = var();
        Var<BigInteger> bigIntValue2 = var();

        beforeEach(() -> {
            var(bigIntValue1, new BigInteger("1"));
            var(bigIntValue2, new BigInteger("3"));
        });

        it("adds two values", () -> {
            assertThat(var(calculator).add(var(bigIntValue1), var(bigIntValue2)), is(4));
        });
    });
}}
