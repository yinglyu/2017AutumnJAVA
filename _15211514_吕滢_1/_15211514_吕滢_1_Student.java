public class _15211514_吕滢_1_Student//_15211514_吕滢_1__15211514_吕滢_1_Student
{
	String _15211514_吕滢_1_StudentNumber;
	String _15211514_吕滢_1_StudentName;
	private int markForMaths=-1;
	private int markForEnglish=-1;
	private int markForScience=-1;
	public _15211514_吕滢_1_Student(String number, String name){
		_15211514_吕滢_1_StudentNumber=number;
		_15211514_吕滢_1_StudentName=name;
	
	}

	public String getNumber(){
		return _15211514_吕滢_1_StudentNumber;
	
	}
	public String getName(){
		return _15211514_吕滢_1_StudentName;
	}
	public void enterMarks(int markForM, int markForE, int markForS){
		markForMaths=markForM;
		markForEnglish=markForE;		
		markForScience=markForS;		
		
	}
	public int getMathsMark(){
		return markForMaths;
	}
	public int getEnglishMark(){
		return markForEnglish;
	}
	public int getScienceMark(){
		return markForScience;
	}
	public double calculateAverage(){
		return (markForMaths+markForEnglish+markForScience)/3.0;	
	}
	public String toString() //返回学生信息，包括学号、姓名、数学成绩、英语成绩、
	{
		String aString=		"学号："+getNumber()+"\n姓名："+getName()+"\n数学成绩："+getMathsMark()+"\n英语成绩："+getEnglishMark()+"\n科学成绩："+getScienceMark()+"\n平均成绩："+calculateAverage(); 		
		return aString;
	}

}
