package pro;

import java.util.Scanner;

public class Logic5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="1234";
		int i;
		int j;
		int len=str.length();
		for(i=0;i<len;i++){
			System.out.println(str.charAt(i));
		}
		for(i=0;i<len;i++){
			for(j=i+1;j<len;j++){
				String s2="";
				s2=s2+str.charAt(i)+str.charAt(j);
				System.out.println(s2);
			}
		}
		for(i=0;i<len;i++){
			for(j=1;j<len-1;j++){
				String s3="";
				s3=s3+str.charAt(i)+str.substring(j,j+2);
				System.out.println(s3);
			}
		}
	}
}
