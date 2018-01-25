import java.io.*;//标准输入输出
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _15211514_吕滢_1_StudentTest{ 
   public static void main(String args[]) throws IOException{ 


    		String name, number;
    		int maths, english, science;
		    BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
 	   		System.out.print("请输入学生学号："); //System.out.print不换行
    		name=in.readLine();//读取一个文本行 标准的读键盘函数
			System.out.print("请输入学生姓名："); //读取字符串
    		number=in.readLine();
			_15211514_吕滢_1_Student newStu = new _15211514_吕滢_1_Student(number, name);
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
    	//	=in.readLine();???????		
    		maths = arr[0];
    		english = arr[1];
    		science = arr[2];	/*其他写法
    		
		try {
			str = distream.readLine();
			String[] temp = str.split(",");
			
				maths = Integer.valueOf(temp[0]);
				english = Integer.valueOf(temp[0]);
				science = Integer.valueOf(temp[0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

    		
    		
    		*/
			newStu.enterMarks(maths,english,science);
    	   	System.out.println("学生信息如下：");
      	   System.out.println(newStu.toString());  	   
	}
 }
