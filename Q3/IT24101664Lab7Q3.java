import java.util.Scanner;
public class  IT24101664Lab7Q3{

	public static void main(String[] args){

Scanner input = new Scanner(System.in);

double dis=0.05;
double totbill;
int i=1;
char mode;


for(i=1;i<=5;i++){


System.out.println("customer" + " " + i );

	
	System.out.println("Enter total bill amount:");
	totbill=input.nextDouble();
	
        System.out.println("Enter mode of payment(C for cash,O for other):");
	
	mode=input.next().charAt(0);

if(mode=='C'||mode=='c'){
double discount=dis*totbill;
System.out.println("discount is:" + discount);
double paybill=totbill-discount;
System.out.println("Amount to be paid:" + paybill);}


else if(mode=='O'||mode=='o'){
System.out.println("no discount applicable");
System.out.println("Amount to be paid:" + totbill);}



else{
System.out.println("payment is not valid"); }



totbill=0;
System.out.println();
}

}
}


