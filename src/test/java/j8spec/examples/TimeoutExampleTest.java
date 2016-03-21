package j8spec.examples;

import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.it;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class TimeoutExampleTest {{

    it("indicates if a number is prime", c -> c.timeout(500, MILLISECONDS), () -> {
        Calculator calculator = new Calculator();

        assertThat(calculator.isPrime(Integer.MAX_VALUE), is(false));
    });
}}
