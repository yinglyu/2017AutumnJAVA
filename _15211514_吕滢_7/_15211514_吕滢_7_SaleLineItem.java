public class _15211514_吕滢_7_SaleLineItem {
    private int copies;
    private _15211514_吕滢_7_BookSpecification prodSpec;
    private _15211514_吕滢_7_IPricingStrategy strategy;

    public _15211514_吕滢_7_SaleLineItem(_15211514_吕滢_7_BookSpecification prodSpec,
                                        int copies) {
        this.copies = copies;
        this.prodSpec = prodSpec;
        this.strategy = _15211514_吕滢_7_PricingStrategyFactory.getInstance()
                .getPricingStrategy(prodSpec.getType());
    }

    public int getCopies() {
        return copies;
    }

    public double getPrice() {
        return prodSpec.getPrice();
    }

    public String getBookName() {
        return prodSpec.getTitle();
    }

    public double getSubTotal() {
        return strategy.getSubTotal(this);
    }

}