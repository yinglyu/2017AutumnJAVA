package homework2;

class _15211514_吕滢_2_StudentNumberException extends Exception{

	public _15211514_吕滢_2_StudentNumberException(){
	}
}
class _15211514_吕滢_2_ScoreException extends Exception{

	public _15211514_吕滢_2_ScoreException(){
	}
}

public class _15211514_吕滢_2_Student//_15211514_吕滢_2__15211514_吕滢_2_Student
{
	String number;
	String name;
	private int maths=-1;
	private int English=-1;
	private int science=-1;
	public _15211514_吕滢_2_Student(String number, String name){
		this.number=number;
		this.name=name;
	
	}
	public _15211514_吕滢_2_Student(){	
	}
	public void setNumber(String number)	throws _15211514_吕滢_2_StudentNumberException{
		if(number.length() == 10 & number.matches("20[0-9]{8}")){//正则表达式
			this.number = number;
		}else{
		
			throw new _15211514_吕滢_2_StudentNumberException();
		
		}
			
	}
	public void setName(String name){
		this.name = name;
	}	
	

	public String getNumber(){
		return this.number;
	
	}
	public String getName(){
		return this.name;
	}
	public void enterMarks(int maths, int English, int science) throws _15211514_吕滢_2_ScoreException
	{ 
		if(maths>=0 && maths<=100 && English>=0 && English<=100 && English>=0 && English<=100){
			this.maths = maths;
			this.English = English;
			this.science=science;

		}else{
		
			throw new _15211514_吕滢_2_ScoreException();
		
		}


	}
	public int getMathsMark(){
		return this.maths;
	}
	public int getEnglishMark(){
		return this.English;
	}
	public int getScienceMark(){
		return this.science;
	}
	public double calculateAverage(){
		return (this.maths+this.English+this.science)/3.0;	
	}
	public String toString() //返回学生信息，包括学号、姓名、数学成绩、英语成绩、
	{
		String aString=		"学号："+getNumber()+"\n姓名："+getName()+"\n数学成绩："+getMathsMark()+"\n英语成绩："+getEnglishMark()+"\n科学成绩："+getScienceMark()+"\n平均成绩："+calculateAverage(); 		
		return aString;
	}

}
