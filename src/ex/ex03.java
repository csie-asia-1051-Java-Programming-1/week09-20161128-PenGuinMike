package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		//System.out.println(x);
		int y=0,a=0;
		while(y!=x-2){
			for(int i=x-1;i>1;i--){
				//System.out.println(i);
				//System.out.print((x%i)+" ");
				if(x%i==0){
					//System.out.println((x%i));
					a++;
				}else{
				}//System.out.println(y);
			}y++;
			
		}if(a>0){
			System.out.println("不是質數");
		}else{
			System.out.println("是質數");
		}
	}

}
