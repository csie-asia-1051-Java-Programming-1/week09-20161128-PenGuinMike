package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */

import java.util.ArrayList;

import ex.Student;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>student=new ArrayList<Student>();
		student.add(new Student("Mike","1024"));
		student.get(0).showInfo();
	}
}


class Student{
		private String id,name;
		//private ArrayList
		public Student (String name1,String id1){
			name=name1;id=id1;
		}
		public void addCourse(String name1,String id1){
			
		}
		public void showInfo() {
			System.out.println("name: "+name);
			System.out.println("id: "+id);
			//System.out.println("#of course:"+couList.size());
		}
	}
class Course{
	private String couName,couId,teaCher;
	private int score;
	public Course(String name1,String id1){
		couName=name1;couId=id1;
	}
	public String getName(){
		return couName;
	}
	
	
}