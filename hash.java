import java.util.*;
class A
{
public static void main(String...args){
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
int i,j;
for(i=1;i<=n;i++){
	if(i==1){
		System.out.print("*");
		}
	else if(i>1&&i<n){
		System.out.print("* ");
		for(j=1;j<=i-1;j++){
			System.out.print("  ");
				}
		System.out.print("*");
		}
	else{
		for(j=1;j<=n;j++){
			System.out.print("* ");
			}
	}
	System.out.println();
	System.out.println("this is for git now in branch");
}
}
}