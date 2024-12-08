package task.collection;

public class Order {
  int id;
  int totalAmount;
  String customer;

  public Order(int id, String customer, int totalAmount) {
    this.id = id;
    this.customer = customer;
    this.totalAmount = totalAmount;
  }

  public int getTotalAmount() {
    return this.totalAmount;
  }
}
