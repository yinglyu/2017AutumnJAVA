public class _15211514_吕滢_7_NoDiscountStrategy extends  _15211514_吕滢_7_IPricingStrategy {

    @Override
    public double getSubTotal(_15211514_吕滢_7_SaleLineItem saleLineItem) {
        return saleLineItem.getCopies() * saleLineItem.getPrice();
    }

    @Override
    public String getDiscount() {
        return "";
    }
}