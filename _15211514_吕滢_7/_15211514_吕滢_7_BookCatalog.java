
import java.util.ArrayList;
import java.util.Vector;


public class _15211514_吕滢_7_BookCatalog {
    private ArrayList<_15211514_吕滢_7_BookSpecification> books;

    public _15211514_吕滢_7_BookCatalog() {
        books = new ArrayList();
    }

    public Vector<Vector<Object>> getBooks() {
        Vector<Vector<Object>> table = new Vector();

        for (_15211514_吕滢_7_BookSpecification book : books) {
            Vector<Object> row = new Vector();

            row.add(book.getIsbn());
            row.add(book.getTitle());
            row.add(book.getPrice());
            switch(book.getType() + 1) {
                case 1:
                    row.add("非教材类计算机图书");
                    break;
                case 2:
                    row.add("教材类图书");
                    break;
                case 3:
                    row.add("连环画类图书");
                    break;
                case 4:
                    row.add("养生类图书");
                    break;
                case 5:
                    row.add("其他");
                    break;
                default:
                    System.out.println("[Error] bookType:" + book.getType());
            }

            table.add(row);
        }
        return table;
    }

    public void addBook(_15211514_吕滢_7_BookSpecification bookSpecification) {
        books.add(bookSpecification);
    }

    public _15211514_吕滢_7_BookSpecification getBookSpecification(String isbn) {
        for (_15211514_吕滢_7_BookSpecification book : books) {
            if (book.getIsbn().equals(isbn))
                return book;
        }
        return null;
    }
}