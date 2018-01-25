import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unchecked")
public class _15211514_吕滢_7_MainUI extends JFrame {
    public _15211514_吕滢_7_Controller controller;

    public _15211514_吕滢_7_MainUI() {
        controller = new _15211514_吕滢_7_Controller();
        InitUI();
    }

    private void InitUI() {
        
        JMenu menuManage = new JMenu("管理");
        
        JMenuItem addBook = new JMenuItem("增加图书");
        addBook.addActionListener((e) -> {
            new _15211514_吕滢_7_AddBookUI(controller);
        });
        menuManage.add(addBook);

        
        JMenuItem strategy = new JMenuItem("策略维护");
        strategy.addActionListener((e) -> {
            new _15211514_吕滢_7_StrategiesUI(controller);
        });
        menuManage.add(strategy);

        
        JMenu menuBuy = new JMenu("购买");
        JMenuItem buy = new JMenuItem("购买图书");
        buy.addActionListener((e) -> {
             new _15211514_吕滢_7_BuyUI(controller);
        });
        menuBuy.add(buy);

        
        JMenuBar md = new JMenuBar();
        md.add(menuManage);
        md.add(menuBuy);
        setJMenuBar(md);
    }


    public static void run (final JFrame f, final int width, final int height) {
        SwingUtilities.invokeLater(() -> {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(width, height);
            f.setVisible(true);
        });
    }

    public static void main(String[] args) {
        run(new _15211514_吕滢_7_MainUI(), 400, 280);
    }
}