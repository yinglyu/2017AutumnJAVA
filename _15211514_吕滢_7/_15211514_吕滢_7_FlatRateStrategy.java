

public class _15211514_吕滢_7_FlatRateStrategy extends _15211514_吕滢_7_IPricingStrategy {
    private double discountPerBook;

    public String getDiscount() { return String.valueOf(discountPerBook); }

    public _15211514_吕滢_7_FlatRateStrategy(String id, String name, double discountPerBook) {
        this.id = id;
        this.name = name;
        this.discountPerBook = discountPerBook;
    }

    @Override
    public double getSubTotal(_15211514_吕滢_7_SaleLineItem saleLineItem) {
        return saleLineItem.getCopies() * ( saleLineItem.getPrice() - discountPerBook);
    }
}