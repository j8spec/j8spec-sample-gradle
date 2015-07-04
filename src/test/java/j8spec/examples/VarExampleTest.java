package j8spec.examples;

import j8spec.Var;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.beforeEach;
import static j8spec.J8Spec.it;
import static j8spec.Var.var;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class VarExampleTest {{

    Var<Calculator> calculator = var();

    beforeEach(() -> {
        var(calculator, new Calculator());
    });

    it("adds two integers", () -> {
        assertThat(var(calculator).add(1, 3), is(4));
    });
}}
