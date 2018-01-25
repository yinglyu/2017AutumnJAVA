/*_15211514_吕滢_3_EmployeeTest.java*/

public class _15211514_吕滢_3_EmployeeTest{
	public static void main (String args[]){
		_15211514_吕滢_3_Employee[] e = new _15211514_吕滢_3_Employee[10];
		int n;
		for (int i = 0; i < e.length; i++){
	
			n=(int)(Math.random()*4);//n的取值为0~3
			switch(n){
				case 0:e[i] = new _15211514_吕滢_3_SalaridEmployee(); break;
				case 1:e[i] = new _15211514_吕滢_3_HourlyEmployee(); break;
				case 2:e[i] = new _15211514_吕滢_3_CommisionEmployee(); break;
				case 3:e[i] = new _15211514_吕滢_3_BasePlusCommisionEmployee(); break;
				default:e[i] = null;
			}
		
		}
		for (int i = 0; i < e.length; i++){
				System.out.println(e[i].toString()); 		
				e[i].earning();
				System.out.println();
		}

	
	}


}