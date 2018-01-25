package homework2;
import java.io.*;//标准输入输出
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class _15211514_吕滢_2_StudentTest{ 
	public static void main(String args[]) throws IOException{ 


    	String name, number;
		int maths, english, science;
		boolean invalid = true;
		BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
		_15211514_吕滢_2_Student newStu = new _15211514_吕滢_2_Student();
		while(invalid){
 	   
 	   		System.out.print("请输入学生学号："); //System.out.print不换行
    		number=in.readLine();//读取一个文本行 标准的读键盘函数
			try{    	
    			newStu.setNumber(number);
    			invalid = false;
			}catch(_15211514_吕滢_2_StudentNumberException e){
 				System.out.println("学号格式不正确，请重新输入");   		
    		}
    	}
		System.out.print("请输入学生姓名："); //读取字符串
    	name=in.readLine();
    	newStu.setName(name);
		
		invalid = true;
		while(invalid){
			System.out.print("请输入三门课成绩："); //读取字符串
		
			
			BufferedReader   distream   =   new   BufferedReader(new   InputStreamReader(System.in));
			int[] arr = new int[3];
			String str;
			try {
		
				str = distream.readLine();
				String[] temp = str.split(",");
				for (int i = 0; i < 3; i++) {
					arr[i] = Integer.valueOf(temp[i]);
				}

			} catch (IOException e) {

				e.printStackTrace();
			}
		
		


    		maths = arr[0];
    		english = arr[1];
    		science = arr[2];	
    		try{
    			newStu.enterMarks(maths,english,science);
				invalid = false;
    		}catch(_15211514_吕滢_2_ScoreException e){
 				System.out.println("成绩数据有误，请重新输入");   		
    		}
    	}

    	   	System.out.println("学生信息如下：");
      	   System.out.println(newStu.toString());  	   
	}
 }
