package co.edu.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		//배열 -> 같은 데이터 타입을 연속된 공간에 저장.
		//int타입(정수) 배열, 5개의 데이터를 넣을 수 있는 공간.
		int[]ary = new int[5];
		//1) 데이터를 저장 하는 방법
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;

		//2) 데이터 저장 하는 방법
		int[] ary1 = {1,2,3,4,5};
		
		//1. 배열 만들고, Scanner 를 통해서 데이터를 넣는 프로그램.
		
		//Scanner 선언
		Scanner sc= new Scanner(System.in);
		//공간 5개인 정수형 타입 배열 생성
		int[]ary2 = new int[5];
		//반복문을 이용해 배열에 데이터 저장.
		/*
		 * for(int i =0; i<ary2.length; i++) { System.out.println("데이터를 입력하세요."); //
		 * ary2[0] = sc.nextlnt(); // ary2[1] = sc.nextlnt(); // 각 배열 첫번째~다섯번째 데이터를 넣는
		 * 구문 ary2[i] = sc.nextInt(); // 각 배열의 데이터 출력 System.out.println(ary2[i]); }
		 */
		
       

       for(int i=0; i<ary2.length;i++) {
    	   System.out.println("점수를 입력하세요.");
    	   ary2[i] = sc.nextInt();
    	   
       }
		int sum = 0;
		for(int i=0; i<ary2.length;i++) {
			// sum = sum + ary[i]
			sum +=ary2[i];
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double)(sum/ary2.length));
		
		// 1~100까지 의 합을 구하는 방법
		int[]ary3 = new int[100];
		for(int i=0; i>ary3.length; i++ ) {
			// 변수 i를 이용해서 데이터를 저장하는 방법
			ary3[i] = i+1;
			
		}
		
		   //위에서 sum에 데이터가 들어가 있어서 0으로 초기화
		sum = 0 ;
		for(int i=0; i<ary3.length; i++) {
			ary3[i] = i+1;
		}
		
		
		// sum에 배열 
		
		
		
		
		// 0~99(
		sum=0;
		for(int i = 0; i<ary3.length; i++){
			if(sum == 99) {
				ary3[i] = sum;
				break;
			
			}
			
			sum+=ary3[i];
			
		}
		System.out.println("0~99까지의 합계 : " +ary3[99]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
