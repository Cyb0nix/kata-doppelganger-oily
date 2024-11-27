package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafeCalculatorTest {

  Authorizer authorizer = () -> true;

  @Test
  void should_not_throw_when_authorized() {
    // When
    SafeCalculator calculator = new SafeCalculator(authorizer);

    // Then
    int result = calculator.add(1, 2);

    // Expect
    assertEquals(3, result);
  }
}
