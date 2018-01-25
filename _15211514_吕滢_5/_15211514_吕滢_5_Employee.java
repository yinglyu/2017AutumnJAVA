/*_15211514_吕滢_5_Employee.java*/




 public abstract class _15211514_吕滢_5_Employee//抽象类无法初始化
{
	
	protected String firstName,lastName,socialSecurityNumber;
	public void setGrossSales(double grossSales){

	}	

	public void setCommissionRate(double commissionRate){

	}	
	public void setWeeklySalary(double weeklySalary){

	
	}
	public void setWage(double wage){

	}	
	public void setBaseSalary(double baseSalary){

	}	
	
	public void setHours(int hours){

	}	
	public _15211514_吕滢_5_Employee(String firstName,String lastName,String socialSecurityNumber){
		this.firstName = firstName;
		this.lastName = lastName;	
		this.socialSecurityNumber = socialSecurityNumber;
	
	
	}
	

	
	public int property(){return -1;}//子类类型
	/*public double earning(){} //抽象方法可以有类型，抽象类中才能声明abstract */
	public abstract double earning();// 抽象方法不能有实体
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}

	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}


	public String toString() //返回姓名，社会保障号码
	{
		String aString=		"Employee\nName："+getFirstName()+" "+getLastName()+"\nSocial Security Number："+getSocialSecurityNumber(); 		
		return aString;
	}

}


class _15211514_吕滢_5_SalariedEmployee extends _15211514_吕滢_5_Employee{

	private double weeklySalary;

	public	_15211514_吕滢_5_SalariedEmployee( String firstName,String lastName,String socialSecurityNumber,double weeklySalary){
		//子类的构造方法中调用某一个父类构造方法,调用语句必须出现在子类构造方法的第一行，可调用超类super()
		super(firstName,lastName,socialSecurityNumber);	
		this.weeklySalary = weeklySalary;
		//this.firstName = firstName;
		//this.lastName = lastName;	
		//this.socialSecurityNumber = socialSecurityNumber;

	}

	public double earning(){
		return weeklySalary*4;
		
	}
	public int property(){return 0;}
	public void setWeeklySalary(double weeklySalary){
		this.weeklySalary = weeklySalary;
	}	
	public void setWeeklySalary(int weeklySalary){
		this.weeklySalary = weeklySalary;
	
	}
	public double getWeeklySalary(){
		return weeklySalary;
	}
	public String toString() //返回姓名，社会保障号码，周薪
	{
		String aString=	"Salaried " +super.toString() +"\nWeekly Salary:" + _15211514_吕滢_5_testTool.df.format(getWeeklySalary()); 	//super.关键字调用被覆盖的方法	
		return aString;
	}

}



class _15211514_吕滢_5_HourlyEmployee extends _15211514_吕滢_5_Employee{

	private double wage;//每小时的工钱
	private int	hours;//月工作小时数

	
	public	_15211514_吕滢_5_HourlyEmployee( String firstName,String lastName,String socialSecurityNumber,double wage,int	hours){
		//子类的构造方法中调用某一个父类构造方法,调用语句必须出现在子类构造方法的第一行，可调用超类super()
		super(firstName,lastName,socialSecurityNumber);		//._15211514_吕滢_5_Employee
		this.wage = wage;
		this.hours = hours;
		//this.firstName = firstName;
		//this.lastName = lastName;	
		//this.socialSecurityNumber = socialSecurityNumber;
	
	}

	public double earning(){
	
		return wage*hours;

	}
	public int property(){return 1;}
	public void setWage(double wage){
		this.wage = wage;
	}	
	public double getWage(){
		return wage;
	}
	
	public void setHours(int hours){
		this.hours = hours;
	}	
	public int getHours(){
		return hours;
	}
	
	public String toString() //返回姓名，社会保障号码，每小时的工钱，月工作小时数
	{
		String aString=	"Hourly " +super.toString() +"\nWage:" + _15211514_吕滢_5_testTool.df.format(getWage()) +"\nHours:"+ getHours() ; 	//super.关键字调用被覆盖的方法	
		return aString;
	}


}

class _15211514_吕滢_5_CommissionEmployee extends _15211514_吕滢_5_Employee{

	protected double grossSales, commissionRate;//销售额,提成比率
	


	public	_15211514_吕滢_5_CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double	commissionRate){
		//子类的构造方法中调用某一个父类构造方法,调用语句必须出现在子类构造方法的第一行，可调用超类super()
	
		super(firstName,lastName,socialSecurityNumber);	
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		//this.firstName = firstName;
		//this.lastName = lastName;	
		//this.socialSecurityNumber = socialSecurityNumber;
	
	}
	public double earning(){
	
		return grossSales*commissionRate; 

	}
	public int property(){return 2;}
	public void setGrossSales(double grossSales){
		this.grossSales = grossSales;
	}	
	public double getGrossSales(){
		return grossSales;
	}

	public void setCommissionRate(double commissionRate){
		this.commissionRate = commissionRate;
	}	
	public double getCommissionRate(){
		return commissionRate;
	}
	

	public String toString() //返回姓名，社会保障号码，销售额, 提成比率
	{
		String aString="Commission "	+super.toString() +"\nGross Sales:"+ _15211514_吕滢_5_testTool.df.format(getGrossSales()) +"\nCommission Rate:" + _15211514_吕滢_5_testTool.df.format(getCommissionRate()); 	//super.关键字调用被覆盖的方法	
		return aString;
	}


}


class _15211514_吕滢_5_BasePlusCommissionEmployee extends _15211514_吕滢_5_CommissionEmployee{
	private double baseSalary;//月基本工资




	public	_15211514_吕滢_5_BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double	commissionRate,double baseSalary){
		//子类的构造方法中调用某一个父类构造方法,调用语句必须出现在子类构造方法的第一行，可调用超类super()
	
		super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);//调用超类	
		this.baseSalary = baseSalary;
		//this.grossSales = grossSales;
		//this.commissionRate = commissionRate;
		//this.firstName = firstName;
		//this.lastName = lastName;	
		//this.socialSecurityNumber = socialSecurityNumber;
	
	}
	public double earning(){

		return  grossSales*commissionRate+baseSalary;

	}

	public int property(){return 3;}
	public void setBaseSalary(double baseSalary){
		this.baseSalary = baseSalary;
	}	
	public double getBaseSalary(){
		return baseSalary;
	}


	public String toString() //返回姓名，社会保障号码，销售额, 提成比率, 月基本工资
	{
		String aString=	"Base Plus " + super.toString() +"\nBase Salary:"+ _15211514_吕滢_5_testTool.df.format(getBaseSalary() ); 	//super.关键字调用被覆盖的方法	
		return aString;
	}


}



