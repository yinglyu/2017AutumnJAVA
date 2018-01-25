public class _15211514_吕滢_7_PricingStrategyFactory {
    private static _15211514_吕滢_7_PricingStrategyFactory instance;
    private _15211514_吕滢_7_StrategyCatalog strategyCatalog;

    private _15211514_吕滢_7_PricingStrategyFactory() {  }

    public static _15211514_吕滢_7_PricingStrategyFactory getInstance() {
        if (instance == null)
            return instance = new _15211514_吕滢_7_PricingStrategyFactory();
        else
            return instance;
    }

    public _15211514_吕滢_7_IPricingStrategy getPricingStrategy(int bookType) {
        return strategyCatalog.getStrategy(bookType);
    }

    public void setCatalog(_15211514_吕滢_7_StrategyCatalog strategyCatalog) {
        this.strategyCatalog = strategyCatalog;
    }

}