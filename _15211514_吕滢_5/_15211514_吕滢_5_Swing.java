
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class _15211514_吕滢_5_Swing {
    public static void run (final JFrame f, final int width, final int height) {
        SwingUtilities.invokeLater(() -> {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(width, height);
            f.setVisible(true);
        });
    }

    public static void main(String[] args) {
        run(new SimpleMenus(), 400, 400);
    }

    public static double getAverage() {
        double total = 0;
        if (employees.size() == 0)
            return 0;

        for (Object employee : employees) {
            total += ((_15211514_吕滢_5_Employee)employee).earning();
        }

        return total / employees.size();
    }

    public static void addEmployee(_15211514_吕滢_5_Employee employee) {
        employees.add(employee);
    }

    private static ArrayList employees = new ArrayList<_15211514_吕滢_5_Employee>();
}


class SimpleMenus extends JFrame {
    public SimpleMenus() {
       
        JMenu menuInput = new JMenu("EmployeeInfoInput");// 设置EmployeeInfoInput

        JMenuItem item1 = new JMenuItem("CommisionEmployee");// 添加CommisionEmployee
        item1.addActionListener((e) -> {
            new CommisionEmployeeInput().setVisible(true);
        });
        menuInput.add(item1);

        
        JMenuItem item2 = new JMenuItem("BasePlusCommisionEmployee"); 	
         //添加BasePlusCommisionEmployee
        item2.addActionListener((e) -> {
            new BasePlusCommisionEmployeeInput().setVisible(true);
        });
        menuInput.add(item2);

        
        JMenu menuSearch = new JMenu("Search");// 设置Search菜单 
        JMenuItem item = new JMenuItem("AverageEarningQuery");
        item.addActionListener((e) -> {
            new AverageEarningSearch().setVisible(true);
        });
        menuSearch.add(item);

        
        JMenuBar md = new JMenuBar();
        md.add(menuInput);
        md.add(menuSearch);
        setJMenuBar(md);
    }
}

class BasePlusCommisionEmployeeInput extends JDialog {
    public BasePlusCommisionEmployeeInput() {
        setSize(340, 270);
        setLayout(new FlowLayout());
        Box baseBox = Box.createVerticalBox();
        // 先加入一个不可见的 Strut，从而使顶部留出一定的空间
        baseBox.add(Box.createVerticalStrut(10));



        Box firstNameBox = Box.createHorizontalBox();
        firstNameBox.add(new JLabel("FirstName"));
        firstNameBox.add(Box.createHorizontalStrut(20));
        JTextField firstNameField = new JTextField(10);
        firstNameBox.add(firstNameField);
        firstNameBox.add(new JLabel("(String)"));
        baseBox.add(firstNameBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box lastNameBox = Box.createHorizontalBox();
        lastNameBox.add(new JLabel("LastName"));
        lastNameBox.add(Box.createHorizontalStrut(20));
        JTextField lastNameField = new JTextField(10);
        lastNameBox.add(lastNameField);
        lastNameBox.add(new JLabel("(String)"));
        baseBox.add(lastNameBox);
        baseBox.add(Box.createVerticalStrut(5));



        Box socialSecurityNumberBox = Box.createHorizontalBox();
        socialSecurityNumberBox.add(new JLabel("SSNumber"));
        socialSecurityNumberBox.add(Box.createHorizontalStrut(20));
        JTextField socialSecurityNumberField = new JTextField(10);
        socialSecurityNumberBox.add(socialSecurityNumberField);
       	socialSecurityNumberBox.add(new JLabel("(String)"));
        baseBox.add(socialSecurityNumberBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box grossSalesBox = Box.createHorizontalBox();
        grossSalesBox.add(new JLabel("GrossSales"));
        grossSalesBox.add(Box.createHorizontalStrut(20));
        JTextField grossSalesField = new JTextField(10);
        grossSalesBox.add(grossSalesField);
        grossSalesBox.add(new JLabel("(double)"));
        baseBox.add(grossSalesBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box commissionRateBox = Box.createHorizontalBox();
        commissionRateBox.add(new JLabel("CommissionRate"));
        commissionRateBox.add(Box.createHorizontalStrut(20));
        JTextField commissionRateField = new JTextField(10);
        commissionRateBox.add(commissionRateField);
        commissionRateBox.add(new JLabel("(double)"));
        baseBox.add(commissionRateBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box baseSalaryBox = Box.createHorizontalBox();
        baseSalaryBox.add(new JLabel("BaseSalary"));
        baseSalaryBox.add(Box.createHorizontalStrut(20));
        JTextField baseSalaryField = new JTextField(10);
        baseSalaryBox.add(baseSalaryField);
        baseSalaryBox.add(new JLabel("(double)"));
        baseBox.add(baseSalaryBox);
        baseBox.add(Box.createVerticalStrut(18));


        Box buttonBox = Box.createHorizontalBox();
        JButton addEmployee = new JButton("Add");
        addEmployee.addActionListener((e) -> {
            try {
                _15211514_吕滢_5_Swing.addEmployee(
                        new _15211514_吕滢_5_BasePlusCommissionEmployee(
                                firstNameField.getText(),
                                lastNameField.getText(),
                                socialSecurityNumberField.getText(),
                                Integer.parseInt(grossSalesField.getText()),
                                Double.parseDouble(commissionRateField.getText()),
                                Double.parseDouble(baseSalaryField.getText())
                        ));
                dispose();
            } catch (Exception except) {
                JOptionPane.showMessageDialog(null, "输入格式错误");
            }

        });
        JButton close = new JButton("Conceal");
        close.addActionListener((e) -> {
            this.dispose();
        });

        buttonBox.add(addEmployee);
        buttonBox.add(Box.createHorizontalStrut(40));
        buttonBox.add(close);
        baseBox.add(buttonBox);

        add(baseBox);
    }
}

class CommisionEmployeeInput extends JDialog {
    public CommisionEmployeeInput() {
        setSize(340, 250);
        setLayout(new FlowLayout());
        Box baseBox = Box.createVerticalBox();
       
       
        baseBox.add(Box.createVerticalStrut(10));




        Box firstNameBox = Box.createHorizontalBox();
        firstNameBox.add(new JLabel("FirstName"));
        firstNameBox.add(Box.createHorizontalStrut(20));
        JTextField firstNameField = new JTextField(10);
        firstNameBox.add(firstNameField);
        firstNameBox.add(new JLabel("(String)"));
        baseBox.add(firstNameBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box lastNameBox = Box.createHorizontalBox();
        lastNameBox.add(new JLabel("LastName"));
        lastNameBox.add(Box.createHorizontalStrut(20));
        JTextField lastNameField = new JTextField(10);
        lastNameBox.add(lastNameField);
        lastNameBox.add(new JLabel("(String)"));
        baseBox.add(lastNameBox);
        baseBox.add(Box.createVerticalStrut(5));

        Box socialSecurityNumberBox = Box.createHorizontalBox();
        socialSecurityNumberBox.add(new JLabel("SSNumber"));
        socialSecurityNumberBox.add(Box.createHorizontalStrut(20));
        JTextField socialSecurityNumberField = new JTextField(10);
        socialSecurityNumberBox.add(socialSecurityNumberField);
       	socialSecurityNumberBox.add(new JLabel("(String)"));
        baseBox.add(socialSecurityNumberBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box grossSalesBox = Box.createHorizontalBox();
        grossSalesBox.add(new JLabel("GrossSales"));
        grossSalesBox.add(Box.createHorizontalStrut(20));
        JTextField grossSalesField = new JTextField(10);
        grossSalesBox.add(grossSalesField);
        grossSalesBox.add(new JLabel("(double)"));
        baseBox.add(grossSalesBox);
        baseBox.add(Box.createVerticalStrut(5));

        Box commissionRateBox = Box.createHorizontalBox();
        commissionRateBox.add(new JLabel("CommissionRate"));
        commissionRateBox.add(Box.createHorizontalStrut(20));
        JTextField commissionRateField = new JTextField(10);
        commissionRateBox.add(commissionRateField);
        commissionRateBox.add(new JLabel("(double)"));
        baseBox.add(commissionRateBox);
        baseBox.add(Box.createVerticalStrut(5));


        Box buttonBox = Box.createHorizontalBox();
        JButton addEmployee = new JButton("Add");
        addEmployee.addActionListener((e) -> {
            try {
                _15211514_吕滢_5_Swing.addEmployee(
                        new  _15211514_吕滢_5_CommissionEmployee(
                                firstNameField.getText(),
                                lastNameField.getText(),
                                socialSecurityNumberField.getText(),
                                Double.parseDouble(grossSalesField.getText()),
                                Double.parseDouble(commissionRateField.getText())
                        ));
                dispose();
            } catch (Exception except) {
                JOptionPane.showMessageDialog(null, "输入格式错误");
            }

        });
        JButton close = new JButton("Conceal");
        close.addActionListener((e) -> {
            this.dispose();
        });

        buttonBox.add(addEmployee);
        buttonBox.add(Box.createHorizontalStrut(40));
        buttonBox.add(close);
        baseBox.add(buttonBox);

        add(baseBox);
    }
}

class AverageEarningSearch extends JDialog {
    public AverageEarningSearch() {
        setSize(200, 100);
        setLayout(new FlowLayout());
        add(new JLabel("Average Earning: " +
                String.valueOf(_15211514_吕滢_5_Swing.getAverage())));
    }
}