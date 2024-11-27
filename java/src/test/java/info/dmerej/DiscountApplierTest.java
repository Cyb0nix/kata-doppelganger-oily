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


  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()
  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v2() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
  }

}
