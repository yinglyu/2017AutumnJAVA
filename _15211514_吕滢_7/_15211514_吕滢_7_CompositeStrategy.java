import java.util.ArrayList;

public abstract class _15211514_吕滢_7_CompositeStrategy extends  _15211514_吕滢_7_IPricingStrategy {
    protected ArrayList<_15211514_吕滢_7_IPricingStrategy> strategies;

    public String getDiscount() {
        StringBuilder stringBuilder = new StringBuilder();

        // 生成序列化信息
        for (_15211514_吕滢_7_IPricingStrategy strategy : strategies) {
            stringBuilder.append(strategy.getId());
            stringBuilder.append(" | ");
        }
        // 删除末尾多余的符号
        stringBuilder.deleteCharAt(stringBuilder.length() - 3);
        return stringBuilder.toString();
    }

    public _15211514_吕滢_7_CompositeStrategy(String id, String name) {
        this.id = id;
        this.name = name;
        strategies = new ArrayList();
    }

    public void add(_15211514_吕滢_7_IPricingStrategy iPricingStrategy) {
        strategies.add(iPricingStrategy);
    }
}