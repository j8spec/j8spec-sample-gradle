package j8spec.examples;

import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
@DefinedOrder
public class DefinedOrderExampleTest {

    private int result = 0;

    {
        describe("operations", () -> {
            it("adds two integers", () -> {
                Calculator calculator = new Calculator();

                result = calculator.add(1, 3);

                assertThat(result, is(4));
            });

            it("depends on the previous example", () -> {
                Calculator calculator = new Calculator();

                result = calculator.add(result, 3);

                assertThat(result, is(7));
            });
        });
    }
}
