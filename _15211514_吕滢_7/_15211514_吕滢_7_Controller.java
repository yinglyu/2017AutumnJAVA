import java.util.Vector;
import java.util.HashMap;

public class _15211514_吕滢_7_Controller {
    private _15211514_吕滢_7_BookCatalog bookCatalog;
    private _15211514_吕滢_7_StrategyCatalog strategyCatalog;
    private _15211514_吕滢_7_Sale sale;

    public _15211514_吕滢_7_Controller() {
        bookCatalog = new _15211514_吕滢_7_BookCatalog();
        strategyCatalog = new _15211514_吕滢_7_StrategyCatalog();
        sale = new _15211514_吕滢_7_Sale();
        _15211514_吕滢_7_PricingStrategyFactory.getInstance().setCatalog(strategyCatalog);
    }

    public Vector<Vector<Object>> getStrategies() {
        return strategyCatalog.getStrategies();
    }

    public Vector<Vector<Object>> getBooks() {
        return bookCatalog.getBooks();
    }

    public void addBook(double price, String title, int type, String isbn) {
        bookCatalog.addBook(
            new _15211514_吕滢_7_BookSpecification(
                    price,
                    title,
                    type,
                    isbn
            )
        );
    }

    public boolean addCompositeStrategy(String id, String name, int bookType, String components) {
        _15211514_吕滢_7_CompositeStrategy compositeStrategy
                = new _15211514_吕滢_7_CompositeBestForCustomer(id, name);

        // 按“|”分割策略名
        for (String strategyId : components.split("\\|")) {
            _15211514_吕滢_7_IPricingStrategy strategy = strategyCatalog.getStrategy(strategyId.trim());
            if (strategy != null)
                compositeStrategy.add(strategy);
            else
                return false;
        }

        strategyCatalog.addStrategy(bookType, compositeStrategy);
        return true;
    }

    public boolean addSimpleStrategy(String id, String name, int strategyType,
                                  int bookType, double discount) {

        _15211514_吕滢_7_IPricingStrategy strategy;
        switch (strategyType + 1) {
            case 1:
                strategy = new _15211514_吕滢_7_PercentageStrategy(id, name, discount);
                break;
            case 2:
                strategy = new _15211514_吕滢_7_FlatRateStrategy(id, name, discount);
                break;
            default:
                strategy = new _15211514_吕滢_7_NoDiscountStrategy();
        }
        return strategyCatalog.addStrategy(bookType, strategy);
    }

    public void deleteStrategy(String id) {
        strategyCatalog.deleteStrategy(id);
    }

    public void updateStrategy(String id, String name, int strategyType,
                               int bookType, double discount) {
        _15211514_吕滢_7_IPricingStrategy strategy;
        switch (strategyType) {
            case 1:
                strategy = new _15211514_吕滢_7_PercentageStrategy(id, name, discount);
                break;
            case 2:
                strategy = new _15211514_吕滢_7_FlatRateStrategy(id, name, discount);
                break;
            default:
                strategy = new _15211514_吕滢_7_NoDiscountStrategy();
        }

        strategyCatalog.updateStrategy(bookType, strategy);
    }

    public void buyBook(String isbn, int number) throws Exception {
        sale.addItem(new _15211514_吕滢_7_SaleLineItem(
                bookCatalog.getBookSpecification(isbn),
                number
        ));
    }

    public _15211514_吕滢_7_Sale getSale() {
        return sale;
    }

}