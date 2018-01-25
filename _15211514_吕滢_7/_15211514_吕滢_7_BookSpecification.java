

import java.lang.String;

public class _15211514_吕滢_7_BookSpecification {
    private double price;
    private String title;
    private int type;
    private String isbn;

    public _15211514_吕滢_7_BookSpecification(double price, String title,
                                             int type, String isbn)
    {
        this.price = price;
        this.title = title;
        this.type = type;
        this.isbn = isbn;
    }

    public int getType() {
        return type;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}