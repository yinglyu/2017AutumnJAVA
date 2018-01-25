

public abstract class _15211514_吕滢_7_IPricingStrategy {
    protected String id;
    protected String name;

    public abstract double getSubTotal(_15211514_吕滢_7_SaleLineItem saleLineItem);
    public abstract String getDiscount();

    public String getId() { return id; }
    public String getName() { return name; }
}