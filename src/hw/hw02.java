package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt(),sum=1,i=0;
		while(sum<x){
			sum+=i;
			i++;
			System.out.print(sum+" ");
		}System.out.println();
		for(int a=1;a<=x+1;a++){
			for(int b=0;b<a;b++){
				System.out.print(a);
			}
		}
	}

}
