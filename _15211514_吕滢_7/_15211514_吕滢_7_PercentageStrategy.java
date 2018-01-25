public class _15211514_吕滢_7_PercentageStrategy extends _15211514_吕滢_7_IPricingStrategy {
    private double discountPercentage;

    public String getDiscount() { return String.valueOf(discountPercentage); }

    _15211514_吕滢_7_PercentageStrategy(String id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getSubTotal(_15211514_吕滢_7_SaleLineItem saleLineItem) {
        return saleLineItem.getCopies() * ( saleLineItem.getPrice() * (100 - discountPercentage) / 100);
    }
}