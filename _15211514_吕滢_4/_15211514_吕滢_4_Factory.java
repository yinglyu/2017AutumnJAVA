/*_15211514_吕滢_4_Factory.java*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.*;//标准输入输出
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;



public class _15211514_吕滢_4_Factory{//need input 循环需要 根据输入停止 
	private static 
	Map<String, _15211514_吕滢_4_Employee> employees= new HashMap<String, _15211514_吕滢_4_Employee>();

	public  static _15211514_吕滢_4_Employee addEmployee( _15211514_吕滢_4_Employee emp){
	//	return emplyee;
	// if(already exist)
		String ssn = emp.getSocialSecurityNumber();

		if(employees.containsKey(ssn)){
			return null	;
		}
		else
			employees.put(ssn,emp);
		
		
		return emp;
	
	}


	public static void initEmployees() throws IOException{ 
		
		
		_15211514_吕滢_4_Employee[] eArray = new _15211514_吕滢_4_Employee[10];
		int n;
		String socialSecurityNumber = "0000";
		String name,firstName = "first",lastName ="last";
		for (int i = 0; i < eArray.length; i++){
	
			n=(int)(Math.random()*4);//n的取值为0~3
			
			
			switch(n){
				case 0:System.out.println("Salaried Employee");break;
				case 1:System.out.println("Hourly Employee"); break;
				case 2:System.out.println("Commission Employee"); break;
				case 3:System.out.println("Base Plus Commission Employee"); break;
				default:break;
			}
			
			
			System.out.print("Social Security Number:");
			BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
                       
                    
			try {
				socialSecurityNumber = in.readLine();	
				if (socialSecurityNumber.equals("0000")){
					System.out.println("输入结束");
					i = 9;
					n = -1;
				}
			} catch (IOException exc) {
				exc.printStackTrace();
			}			
			

			if (n > -1){
				System.out.print("Name:('first' 'last')");
				try {
					name = in.readLine();
					String[] temp = name.split(" ");
					firstName = temp[0];
					lastName = temp[1];
				} catch (IOException exc) {
					exc.printStackTrace();
				}			
			
			}
			



			switch(n){
				case 0:
				
					//可以输入姓名
					
					System.out.print("Weekly Salary:");
					double weeklySalary;
					weeklySalary = Double.parseDouble(in.readLine());
					eArray[i] = new _15211514_吕滢_4_SalariedEmployee(firstName,lastName,socialSecurityNumber,weeklySalary); 										
					eArray[i].earning();
					addEmployee(eArray[i]);
					break;
										
					
				case 1:
					System.out.print("Wage:");
					double wage;
					wage = Double.parseDouble(in.readLine());
					System.out.print("Hours:");
					int hours;
					hours = Integer.parseInt(in.readLine());
					eArray[i] = new _15211514_吕滢_4_HourlyEmployee(firstName,lastName,socialSecurityNumber,wage,hours); 
					eArray[i].earning();
					addEmployee(eArray[i]);
					break;
				case 2:
					System.out.print("Gross Sales:");
					double grossSales;
					grossSales = Double.parseDouble(in.readLine());
					System.out.print("Commission Rate:");
					double commissionRate;
					commissionRate = Double.parseDouble(in.readLine());	
					eArray[i] = new _15211514_吕滢_4_CommissionEmployee( firstName,lastName,socialSecurityNumber,grossSales,commissionRate);	
					eArray[i].earning();
					
					addEmployee(eArray[i]);
					
					break;			
				case 3:
					double baseSalary;//月基本工资
					System.out.print("Base Salary:");
					baseSalary = Double.parseDouble(in.readLine());
					System.out.print("Gross Sales:");
					grossSales = Double.parseDouble(in.readLine());
					System.out.print("Commission Rate:");
					commissionRate = Double.parseDouble(in.readLine());				
					eArray[i] = new _15211514_吕滢_4_BasePlusCommissionEmployee( firstName,lastName,socialSecurityNumber,grossSales,commissionRate,baseSalary); 
					eArray[i].earning();
					
					
					addEmployee(eArray[i]);
					break;
				default:break;

			}
			
			
		

		}
	
	}/**/
	
	public static _15211514_吕滢_4_Employee getEmployee( String empSecNum){
	
		if(employees.containsKey(empSecNum)){
				
			return employees.get(empSecNum);
		}

		else{
			
			return null;
		}
	}

	public static _15211514_吕滢_4_Employee deleteEmployee( String empSecNum){
		_15211514_吕滢_4_Employee e = getEmployee( empSecNum);
		employees.remove(empSecNum);
		return e;
	}

	
	
	public static _15211514_吕滢_4_Employee updateEmployee(String empSecNum ,_15211514_吕滢_4_Employee emp){
		if(employees.containsKey(empSecNum)){
			employees.put(empSecNum,emp);
			return employees.get(empSecNum);
		}

		else{
			
			return null;
		}
	
	}

	public static void printEmployees(){
	    Iterator it = employees.keySet().iterator();
	    while(it.hasNext()) {
	    	String key = (String)it.next();
	    	_15211514_吕滢_4_Employee e = getEmployee(key);
			System.out.println(e.toString()); 		
			e.earning();
			System.out.println();
	    }	
	
	}
	public static void main(String args[]) throws IOException{
    	boolean loop =true;
		BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
			

		initEmployees();
		printEmployees();

		_15211514_吕滢_4_Employee e;
        System.out.println("菜单如下，请输入 1~8代表您要执行的操作：");
        System.out.println("1. 查询  2. 更新  3. 删除");  
        System.out.println("4. 输出全部员工信息 5.退出程序 ");        	

        	while(loop){
        		System.out.print("请输入您的操作：");  
        		int command;
        		String empSecNum;
        		
        		command=Integer.parseInt(in.readLine());//读取命令
        		//System.out.println("command =" +command); 测试
        		if(command == 1){
					System.out.println("Social Security Number:");
					empSecNum = in.readLine();	
					e = getEmployee( empSecNum);
					if(e!=null){
						System.out.println(e.toString()); 		
						e.earning();
						System.out.println();						
					
					}else{
						System.out.println("Not exist."); 		
					}
			    }else if (command == 2){
					System.out.print("Social Security Number:");
					empSecNum = in.readLine();	
					e = getEmployee( empSecNum);
					String name, firstName= "first", lastName="last";
					if(e!=null){
						System.out.println(e.toString()); 		
						e.earning();
						System.out.println();						

						System.out.print("Name:('first' 'last')");
						try {

							name = in.readLine();
							String[] temp = name.split(" ");

							firstName = temp[0];
							lastName = temp[1];
						} catch (IOException exc) {
							exc.printStackTrace();
						}		
						e.setFirstName(firstName);
						e.setLastName(lastName);
						if(e.property() == 0){
							System.out.print("Weekly Salary:");
							double weeklySalary;
							try{
								weeklySalary = Double.parseDouble(in.readLine());
								e.setWeeklySalary(weeklySalary);
							}catch (Exception exc) {
								System.out.println("Wrong format.");
							}	
						
						}else 	if(e.property() == 1){
							System.out.print("Wage:");
							double wage;
							try{
								wage = Double.parseDouble(in.readLine());
								e.setWage(wage);
							}catch (Exception exc) {
								System.out.println("Wrong format.");
							}	
							
						
							System.out.print("Hours:");
							int hours;

							try{
								hours = Integer.parseInt(in.readLine());
								e.setHours(hours);
							}catch (Exception exc) {
								System.out.println("Wrong format.");
							}	

						}else 	if (e.property() > 1 &&e.property() < 4 ){
							System.out.print("Gross Sales:");
							double grossSales;
							try{
								grossSales = Double.parseDouble(in.readLine());
								e.setGrossSales(grossSales);
							}catch (Exception exc) {
								System.out.println("Wrong format.");
							}								
							
							
							System.out.print("Commission Rate:");
							double commissionRate;

							try{
								commissionRate = Double.parseDouble(in.readLine());		
								e.setCommissionRate(commissionRate);
							}catch (Exception exc) {
								System.out.println("Wrong format.");
							}								
							
							
							
							if (e.property() == 3){
								double baseSalary;
								System.out.print("Base Salary:");
								

								try{
									baseSalary = Double.parseDouble(in.readLine());
									e.setBaseSalary(baseSalary);
								}catch (Exception exc) {
									System.out.println("Wrong format.");
								}
							}								
						}else {
							System.out.println("Fault Class");
						}
						System.out.println(e.toString()); 		
						e.earning();
						System.out.println();
					
					}else{
						System.out.println("Not exist."); 		
					}
    			}else if (command == 3){
					System.out.print("Social Security Number:");
					empSecNum = in.readLine();	
					e = deleteEmployee( empSecNum);
					if(e!=null){
						System.out.println("Delete");	
						System.out.println(e.toString()); 		
						e.earning();
											
					
					}else{
						System.out.println("Not exist."); 		
					}
    			}
    			else if (command == 4){
    			   printEmployees();
    			}else if (command == 5){
    				loop = false	;     
    			}
    			else{
    				  System.out.println("错误的输入");
				}       	
        	}

      	
	   
	}



}

