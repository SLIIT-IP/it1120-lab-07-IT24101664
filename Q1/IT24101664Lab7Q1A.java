import java.util.Scanner;
public class IT24101664Lab7Q1A{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

double submarks;
int count=1;
double total=0;
double average;

while(count<=4){

System.out.println("Enter subject mark");

submarks=input.nextDouble();

count=count+1;
total=submarks+total;
}
average=total/4;
System.out.println(average);


if(average<=100 && average>=75){
System.out.println("Distinction");}

if(average<=74 && average>=50){
System.out.println("credit");}

if(average<=49 && average>=0){
System.out.println("fail");}

}
}