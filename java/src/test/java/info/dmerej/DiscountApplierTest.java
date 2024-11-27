package info.dmerej;

import org.junit.jupiter.api.Test;

public class DiscountApplierTest {

  static class NotifierClassV1 implements Notifier {
    public int count = 0;
    @Override
    public void notify(User user, String message) {
      count++;
    }
  }

  static class NotifierClassV2 implements Notifier {
    public List<String> users = new ArrayList<>();
    @Override
    public void notify(User user, String message) {
      users.add(user.name());
    }
  }

  @Mock
  Notifier notifierMock;


  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()
  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v2() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1_mock() {
    //Given
    List<User> users = List.of(new User("Alice", "alice@test.com"), new User("Bob", "bob@test.com"));
    when(notifierMock.notify(any(),any())).thenThrow()
    DiscountApplier discountApplier = new DiscountApplier(notifierMock);

    //When
    discountApplier.applyV1(10, users);

    //Then
  }

}
