public class LineItem {
    String id;
    Product product;
    int quantity;

    public LineItem(String id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }
}
