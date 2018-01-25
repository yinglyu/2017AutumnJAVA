public class _15211514_吕滢_1_StudentList   
{

	private _15211514_吕滢_1_Student[] list; //list存储学生对象
	private int total=0; //学生总人数
	public _15211514_吕滢_1_StudentList(int length){   //length是数组长度
		list = new  _15211514_吕滢_1_Student[length];
		//total = length;
	}
	public boolean add(_15211514_吕滢_1_Student stu){ //增加stu到数组中，成功，返回true，否则false

		if (total < list.length){
		
			list[total]=stu;
			total++;//total是最后一个数组位置+1
			return true;			
		}else{
			return false;
		}
		

		
	}
	public boolean remove(int no){ //删除第no个数组元素，删除成功，返回true，否则false
		if (no > total){//序号比总人数多，无法删除
			//System.out.print("对不起，没有对应的学生")
			return false;
		}else{
			
			
			
			if(no != total){//前面的位置
				int i;
				for(i=no-1;i<total-1;i++){//从no个开始，后面的往前顶，最后一个被顶掉的是total-2
					list[i]=list[i+1];
				}
			
			}
			total --;//最后一个位置，没消掉，只是无效掉了	
			return true;
		}
		
	
	}
	public boolean remove(String number){ //删除学号为number的学生，删除成功，返回true，否则false
		int i=0;
		while(i<total){
					System.out.println(number.equals(  list[i].getNumber()  ) );
			if (  number.equals(  list[i].getNumber()  )  ){//note 不能用等于判断字符串，因为字符串只是一个指针
				//System.out.println(number.equals(  list[i].getNumber()  ) );
				if(remove(i+1))
					return true;			
				else
					return false;

			}
			i++;
			//System.out.println("第"+i+"个没有匹配");
		}
		return false;
	
	}
	public boolean isEmpty(){ //判断数组是否为空，若是，返回true，否则false
		if(total == 0){
			return true;
		}else{
			return false;
		}
	}
	public _15211514_吕滢_1_Student getItem(int no){ //返回第no个学生，使用时需要判断一下。
		if(no <= total){
			
			return list[no-1];
		}else{
			
			return null;
			
		}
	}
	public _15211514_吕滢_1_Student getItem(String number){ //返回学号为number的学生，若该生不存在，返回null。
		int i = 0;
		while (i < total){
			if (  number.equals(  list[i].getNumber()  )  ){
			
		
				return getItem(i+1);
	
			}
			i++;
		}
		return null;
	
	}
	public int getTotal(){//返回学生总人数
		return total;
	
	} 

}
