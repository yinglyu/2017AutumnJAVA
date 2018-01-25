import java.util.ArrayList;
import java.util.Observer;
import java.util.Vector;

public class _15211514_吕滢_7_Sale implements _15211514_吕滢_7_Subject {
    private ArrayList<_15211514_吕滢_7_Observer> observers;
    private ArrayList<_15211514_吕滢_7_SaleLineItem> saleLineItems;

    public _15211514_吕滢_7_Sale() {
        observers = new ArrayList();
        saleLineItems = new ArrayList();
    }

    public double getTotal() {
        double sum = 0;
        for (_15211514_吕滢_7_SaleLineItem item : saleLineItems) {
            sum += item.getSubTotal();
        }
        return sum;
    }

    public Vector<Vector<Object>> getTable() {
        Vector<Vector<Object>> table = new Vector();

        // 构建二维数组，用于显示表格信息
        for (_15211514_吕滢_7_SaleLineItem item : saleLineItems) {
            Vector<Object> row = new Vector();

            row.add(item.getBookName());
            row.add(item.getCopies());
            row.add(item.getPrice());

            table.add(row);
        }

        return table;
    }

    @Override
    public void removeObserver(_15211514_吕滢_7_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void registerObserver(_15211514_吕滢_7_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (_15211514_吕滢_7_Observer item : observers) {
            item.update(this);
        }
    }

    public void addItem(_15211514_吕滢_7_SaleLineItem item) {
        saleLineItems.add(item);
        notifyObservers();
    }

}