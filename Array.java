import java.util.Scanner;
public class Array {
public static void main (String[]args){
Scanner scan=new Scanner(System.in);
int [] numbers= {15,17,18,19,24, 28,29,47,49,57};
     // calculate sum or all array elements
int sum=0;
for (int i=0; i< numbers.length; i++ ){
sum=sum+numbers[i];
}
// calculate average value
double average= sum/numbers.length ;
System.out.println("Average value of the array element"+ average);
	
		
}
}
