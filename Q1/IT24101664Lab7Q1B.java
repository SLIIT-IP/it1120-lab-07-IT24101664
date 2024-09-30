import java.util.Scanner;
public class  IT24101664Lab7Q1B{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int count=1;
double total;
double average;
double student;
double j;
double submarks1,submarks2,submarks3,submarks4;

for(count=1;count<=3;count=count+1){

System.out.println("Student" + " " +count);



System.out.print("Enter subject mark:");
submarks1=input.nextDouble();
submarks2=input.nextDouble();
submarks3=input.nextDouble();
submarks4=input.nextDouble();



total=submarks1+submarks2+submarks3+submarks4;

average=total/4;
System.out.println("average is"+ average);


if(average<=100 && average>=75){
System.out.println("overallgrade is: Distinction");}

if(average<=74 && average>=50){
System.out.println("overallgrade is: credit");}

if(average<=49 && average>=0){
System.out.println("overallgrade is: fail");}
total = 0;
System.out.print("\n");
}
}
}