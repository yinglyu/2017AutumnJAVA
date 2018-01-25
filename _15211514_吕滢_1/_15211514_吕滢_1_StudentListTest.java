import java.io.*;//标准输入输出
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _15211514_吕滢_1_StudentListTest{ 

			private static void outputAll(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    		String name, number;
    		int command,maths, english, science;

		    BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
                    System.out.println("---目前有"+_15211514_吕滢_1_StudentList.getTotal()+"个学生，信息为---：");
				int i;
				for(i=1;i<=_15211514_吕滢_1_StudentList.getTotal();i++)
					System.out.println(_15211514_吕滢_1_StudentList.getItem(i).toString()); 				
			} 
			private static void addNew(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    		String name, number;
    		int command,maths, english, science;

		    BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
				System.out.print("学号："); //System.out.print不换行
				number=in.readLine();//读取一个文本行 标准的读键盘函数
				System.out.print("姓名："); //读取字符串
    			name=in.readLine();
				System.out.print("数学成绩："); 
				maths=Integer.parseInt(in.readLine());
				System.out.print("英语成绩："); 
				english=Integer.parseInt(in.readLine());
				System.out.print("科学成绩："); 
				science=Integer.parseInt(in.readLine());
				
				_15211514_吕滢_1_Student newStu = new _15211514_吕滢_1_Student(number, name);		
				newStu.enterMarks(maths,english,science);
				if(!_15211514_吕滢_1_StudentList.add(newStu))
					System.out.println("已达到人数上线"+_15211514_吕滢_1_StudentList.getTotal()+"人，增加失败");
				
				outputAll(_15211514_吕滢_1_StudentList);				
			
			}
			
			private static void removeByNumber(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    		String name, number;
    		int command,maths, english, science;

		    BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
				System.out.print("请输入要删除学生学号："); //System.out.print不换行
    			number=in.readLine();
    			_15211514_吕滢_1_Student reStu = _15211514_吕滢_1_StudentList.getItem(number);
    			if(_15211514_吕滢_1_StudentList.remove(number))
    				System.out.println("删除成功");
    			else
    				System.out.println("对不起，没有对应的学生");    				

			}				
			
			
			public static void removeByNo(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    			String name, number;
    			int command,maths, english, science;

		   		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("请输入要删除第几个学生："); //System.out.print不换行
    			int no =Integer.parseInt(in.readLine());
    			if(_15211514_吕滢_1_StudentList.remove(no))
    				System.out.println("删除成功");
    			else
    				System.out.println("对不起，没有对应的学生");    				

			}	

			public static void returnByNo(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    			String name, number;
    			int command,maths, english, science;

		   		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("请输入学生位置："); //System.out.print不换行
    			int no =Integer.parseInt(in.readLine());
    			_15211514_吕滢_1_Student reStu = _15211514_吕滢_1_StudentList.getItem(no);
				if (reStu != null)
					System.out.println(reStu.toString());  	
				else
					System.out.println("对不起，没有对应的学生");		
				
						
			
			}	


    
			public static void returnByNumber(_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList) throws IOException{ 
    			String name, number;
    			int command,maths, english, science;

		   		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("请输入学生学号："); //System.out.print不换行
    			number=in.readLine();
    			_15211514_吕滢_1_Student reStu = _15211514_吕滢_1_StudentList.getItem(number);
				if (reStu!=null)
					System.out.println(reStu.toString());  	
				else
					System.out.println("对不起，没有对应的学生");		
				
						
			
			}
   public static void main(String args[]) throws IOException{ 
			_15211514_吕滢_1_StudentList _15211514_吕滢_1_StudentList = new _15211514_吕滢_1_StudentList(10);
    		String name, number;
    		int command,maths, english, science;

    		boolean loop =true;
		    BufferedReader in = new BufferedReader(new 
                       InputStreamReader(System.in));
			



    		

        	System.out.println("菜单如下，请输入 1~8代表您要执行的操作：");
        	System.out.println("1. 增加1个学生  2. 根据学号删除学生  3. 根据位置删除学生"); 
            System.out.println("4. 判断是否为空   5.根据位置返回学生   6.根据学号返回学生");   
        	System.out.println("7. 输出全部学生信息  8.退出程序 ");        	

        	while(loop){
        		System.out.print("请输入您的操作：");  
        		command=Integer.parseInt(in.readLine());//读取命令
        		//System.out.println("command =" +command); 测试
        		if(command == 1){
				
					addNew(_15211514_吕滢_1_StudentList);	    	
			    }else if (command == 2){
			   		removeByNumber(_15211514_吕滢_1_StudentList);

    				}
    			else if (command == 3){
    				removeByNo(_15211514_吕滢_1_StudentList);
    			}
    			else if (command == 4){
    			   if(_15211514_吕滢_1_StudentList.isEmpty())	System.out.println("数组为空"); 
		   					else System.out.println("数组不空");
    			}
    			else if (command == 5){
    				returnByNo(_15211514_吕滢_1_StudentList);
    			}
    			else if (command == 6){
    				returnByNumber(_15211514_吕滢_1_StudentList);
    			    			
				}
    			else if (command == 7){
					
					outputAll(_15211514_吕滢_1_StudentList); 	     			
				}
    			else if (command == 8){
				   loop = false	;     			
				}
    			else{
    				  System.out.println("错误的输入");
				}       	
        	}

        	
	   
	}
 }
