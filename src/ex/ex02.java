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
		char a=0;int b=0;
		while(flag){
			
			System.out.println("請輸入姓名與學號(mike 1024): ");
			student.add(new Student(scn.next(), scn.next()));
			System.out.println("請輸入成績: ");
			student.get(b).addGrade(scn.nextInt(), scn.nextInt(), scn.nextInt());
			b++;
			System.out.println("請問還有資料要輸入嗎?(Y/N): ");
			a=scn.next().charAt(0);
			if(a=='n'||a=='N'){
				System.out.println("資料已輸入完畢,運算中.....");
				flag=false;
			}
			else{	
				flag=true;
							}
		}
		for(int i=0;i<student.size();i++){	   
			student.get(i).showInfo();
			System.out.println();
		}
	}
}


class Student{
		private String name,id;
		//private int id;
		private ArrayList<Course>couList = new ArrayList<Course>();
		private ArrayList<Grade>grdList = new ArrayList<Grade>();
		public Student (String name1,String id1){
			name=name1;id=id1;
		}
		public void addCourse(String name1,String id1){
			couList.add(new Course(name1,id1));
		}
		public String getName(){
			return name;
		}
		public String getId(){
			return id;
		}
		public void addGrade(int grade1,int grade2,int grade3){
			grdList.add(new Grade  (grade1, grade2, grade3));
		}
		public void showInfo() {
			System.out.print("name: "+getName());
			System.out.print("  id: "+getId());
			for(int i=0;i<grdList.size();i++){
			System.out.print(" / grade-chinese: "+grdList.get(i).getChi()+
							  "/ english: "+grdList.get(i).getEng()+
							  "/ math: "+grdList.get(i).getMath()+
							  "/ Avg= "+grdList.get(i).getAvg()+"\n");
			}
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
	private int chinese,english,math;
	public Grade(int grade1,int grade2,int grade3){
		chinese=grade1;english=grade2;math=grade3;
	}
	public float getAvg(){
		return (chinese+english+math)/3;
	}
	public int getChi(){
		return chinese;
	}
	public int getEng(){
		return english;
	}
	public int getMath(){
		return math;
	}

}