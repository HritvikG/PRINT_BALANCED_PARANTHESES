import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] str=new char[2*n];
		print(str,n);
				}
	static void print(char str[],int n){
		if(n>0){
			printp(str,0,n,0,0);
			return;
		}
	}
	static void printp(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = ')'; 
                printp(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '('; 
                printp(str, pos+1, n, open+1, close); 
            } 
        } 
    }
}