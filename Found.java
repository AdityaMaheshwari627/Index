package Arrays;

import java.util.Scanner;

public class Found {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        System.out.print("Enter x:");
        int x=obj.nextInt();
        for(int i=0;i<n;i++) {
        	if((arr[i])==x) {
        		System.out.print(x+" is found at index "+i+" of position "+(i+1));
        	}
        }
	}

}
