package j8spec.examples;

import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.context;
import static j8spec.J8Spec.it;

@RunWith(J8SpecRunner.class)
public class ExpectedExceptionExampleTest {{

    context("division", () -> {
        it("does not divide by zero", c -> c.expected(IllegalArgumentException.class), () -> {
            Calculator calculator = new Calculator();

            calculator.divide(10, 0);
        });
    });
}}
