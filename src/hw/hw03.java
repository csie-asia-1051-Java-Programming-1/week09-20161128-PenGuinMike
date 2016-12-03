package hw;

import java.util.*;

/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，
 * Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，
 * 並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 104021074 楊永聖
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Student>student=new ArrayList<Student>();
		student.add(new Student("Mike","1024"));
		//student.get(0).showInfo();//student.get(0).addGrade(55, 88, 99);
		student.get(0).addCourse("Program", "01", 100, "周永振", 3);
		student.get(0).addCourse("Math", "02", 55, "呂威輔", 3);
		student.get(0).showInfo();
	}

}


class Student{
	
		private String id,name,courses;
		private ArrayList<Course>couList = new ArrayList<Course>();
		//private ArrayList
		public Student (String name1,String id1){
			name=name1;id=id1;
		}
		public void addCourse(String name1,String id1,int score1,String teacher1,int credit){
			couList.add(new Course(name1,id1,score1,teacher1,credit));
		}
		public void showInfo() {
			System.out.print("  姓名: "+name);
			System.out.println("/ 學號: "+id);
			for(int i=0;i<couList.size();i++){
				System.out.print(" /課程名稱: "+couList.get(i).getCouName()
						+" /課程代號: "+couList.get(i).getCouId()
						+" /該課成績: "+couList.get(i).getCouScore()
						+" /授課教授: "+couList.get(i).getCouTeacher()
						+" /學分數: "+couList.get(i).getCouCredit()+"");
				System.out.println();
			}System.out.println();
			
			
			//"grade-chinese: "+grdList.get(i).getChi()
			//System.out.print("  name: "+name);
			//System.out.print("/ id: "+id);
			//System.out.print("/ course: "+courses);
			//System.out.println("#of course:"+couList.size());
		}
	}
class Course{
	private String couName,couId,teaCher;
	private int score,creDit;
	public Course(String name1,String id1,int score1,String teacher1,int credit){
		couName=name1;couId=id1;score=score1;teaCher=teacher1;creDit=credit;
	}
	public String getCouName(){
		return couName;
	}
	public String getCouId(){
		return couId;
	}
	public String getCouTeacher(){
		return teaCher;
	}
	public int getCouScore(){
		return score;
	}
	public int getCouCredit(){
		return creDit;
	}
	
	
}