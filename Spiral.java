import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         int n = 5;
         int a[][] = new int[n][n];
         int m=n*n, c1=0, c2=n-1, r1=0, r2=n-1;
         int i;
         int j;
         int k;
       for(k=25;k>=1;k--){
         for(i=c1;i<=c2;i++){
        	 a[r1][i]=m;
        	 m--;
         }
         for(j=r1+1;j<=r2;j++){
        	 a[j][c2]=m--;
         }
         for(i=r2-1;i>=c1;i--){
        	a[c2][i]=m;
        	m--;
         }
         for(j=c2-1;j>c1;j--){
        	 a[j][c1]=m;
        	 m--;
         }
       c1++;
         r1++;
         c2--;
         r2--;
        }
         for(i=0;i<n;i++){
        	 for(j=0;j<n;j++){
        		 System.out.print(a[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}
}
