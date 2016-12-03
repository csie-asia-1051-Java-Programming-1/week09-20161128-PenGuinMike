package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 104021074 楊永聖
 */

import java.util.*;
import ex.Student;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		ArrayList<Student>student=new ArrayList<Student>();
		boolean flag = true;
		char a;
		//System.out.println("請輸入姓名與學號(mike 1024): ");
		while(flag){
			System.out.println("請輸入姓名與學號(mike enter鍵   1024): ");
			student.add(new Student(scn.nextLine(),scn.nextLine()));
			System.out.println("請輸入成績: ");
			student.get(0).addGrade(scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
			System.out.println("請問還有資料要輸入嗎?(Y/N): ");
			a=scn.next().charAt(0);
			if(a=='n'||a=='N'){
				System.out.println("資料已輸入完畢,運算中.....");
				flag=false;
			}else{
				flag=true;
			}
		}
		for(int i=0;i<student.size();i++){
			student.get(i).showInfo();
		}
		
		//student.add(new Student("Mike","1024"));
		//student.add(new Student("jack","1025"));
		//student.add(new Student("tracy","1026"));
		//student.add(new Student("joyce","1027"));
		//student.get(0).showInfo();
		//student.get(0).addCourse("program1", "8787");
		//student.get(0).addGrade(55, 88, 99);
		//student.get(1).addGrade(44, 55, 66);
		//student.get(2).addGrade(70, 88, 80);
		//student.get(3).addGrade(80, 85, 90);
		//student.get(0).showInfo();
		//student.get(1).showInfo();
		//student.get(2).showInfo();
		//student.get(3).showInfo();
		//Collections.sort((List<T>) student);//List<T> list, Comparator<? super T> c
	}
}


class Student{
		private String id,name;
		private ArrayList<Course>couList = new ArrayList<Course>();
		private ArrayList<Grade>grdList = new ArrayList<Grade>();
		public Student (String name1,String id1){
			name=name1;id=id1;
		}
		public void addCourse(String name1,String id1){
			couList.add(new Course(name1,id1));
		}
		public void addGrade(float grade1,float grade2,float grade3){
			grdList.add(new Grade  (grade1, grade2, grade3));
		}
		public void showInfo() {
			System.out.print("name: "+name+"\t");
			System.out.print("id: "+id+"\t");
			//System.out.println("#of course:"+couList.size());
			for(int i=0;i<grdList.size();i++){
				System.out.println("grade-chinese: "+grdList.get(i).getChi()+"/ english: "
			+grdList.get(i).getEng()+"/ math: "+grdList.get(i).getMath()+"/ Avg= "+grdList.get(i).getAvg());
			}System.out.println();
			/*for(int i=0;i<couList.size();i++){
				System.out.println("course name: "+couList.get(i).getName());
			}*/
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
class Grade{
	private float chinese,english,math;
	public Grade(float grade1,float grade2,float grade3){
		chinese=grade1;english=grade2;math=grade3;
	}
	public float getAvg(){
		return (chinese+english+math)/3;
	}
	public float getChi(){
		return chinese;
	}
	public float getEng(){
		return english;
	}
	public float getMath(){
		return math;
	}

	
	
}