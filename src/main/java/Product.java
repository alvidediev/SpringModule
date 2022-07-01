public class Product {

    private String type;
    private int size;

    public Product(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
