import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10, "Blue");
        Pen pen2 = new Pen(10, "Blue");

        System.out.println(pen1);
        System.out.println(pen2);

        System.out.println(pen1.equals(pen2));
    }
}

class Pen {
    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price && color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}