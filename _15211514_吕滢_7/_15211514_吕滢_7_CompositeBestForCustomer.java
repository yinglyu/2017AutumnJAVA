
public class _15211514_吕滢_7_CompositeBestForCustomer extends _15211514_吕滢_7_CompositeStrategy {

    public _15211514_吕滢_7_CompositeBestForCustomer(String id, String name) {
        super(id, name);
    }

    @Override
    public double getSubTotal(_15211514_吕滢_7_SaleLineItem saleLineItem) {
        double min = 1000000000;

        // 寻找最小的总价
        for (_15211514_吕滢_7_IPricingStrategy strategy : strategies) {
            min = Math.min(strategy.getSubTotal(saleLineItem), min);
        }

        return min;
    }
}