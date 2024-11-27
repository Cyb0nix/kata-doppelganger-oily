package info.dmerej;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SafeCalculatorTest {

  Authorizer authorizer = () -> true;

  @Mock
  private Authorizer authorizerMock;

  @Test
  void should_not_throw_when_authorized() {
    // When
    SafeCalculator calculator = new SafeCalculator(authorizer);

    // Then
    int result = calculator.add(1, 2);

    // Expect
    assertEquals(3, result);
  }

  @Test
  void should_not_throw_when_authorized_mock() {
    // Given
    when(authorizerMock.authorize()).thenReturn(true);
    SafeCalculator calculator = new SafeCalculator(authorizerMock);

    // When
    int result = calculator.add(1, 2);

    // Then
    assertEquals(3, result);
  }
}
