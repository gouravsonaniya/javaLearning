package JavaBasics;
import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
      //   System.out.println("Hello Gaurav!");

    Scanner sc = new Scanner(System.in);

   do{
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    if(n %10 == 0){
      continue;
    }
    System.out.println(n);
   } while(true);
  

    
   // String input = sc.next();
   //  System.out.println(input);

   //  String input = sc.nextLine();
   //  System.out.println(input);

   // int number = sc.nextInt();
   //  System.out.println(number);

   //  float num = sc.nextFloat();
   //System.out.println(num);


   //  double num = sc.nextDouble();
   // System.out.println(num);

 //  short  num = sc.nextShort();
  // System.out.println(num);
   
  // boolean number = sc.nextBoolean();
 //  System.out.println(number);

 //  byte number = sc.nextByte();
   // System.out.println(number);

    // float rad = sc.nextFloat();
    // float area =  3.14f * rad * rad ;
    // System.out.println(area);
      
      // int a = sc.nextInt();
      // int b = sc.nextInt();
      // int c = sc.nextInt();
      // float average = (a + b + c)/3;
      // System.out.println(average);
    
    //  float pencil = sc.nextFloat();
    //  float pen = sc.nextFloat();
    //  float eraser = sc.nextFloat();
    //  float totalCost = (pencil + pen + eraser);
    //  float withGST = (totalCost * 18)/100;
    //  float total = totalCost + withGST;
    //  System.out.println(totalCost);
    //  System.out.println(withGST);
    //  System.out.println(total);

    // int $ = 24;
    // System.out.println($);

      //  String str = "XXXX1234G21";

		  //  String digits = str.replaceAll("[^0-9]", "");

		  //  System.out.println(digits);

    // int age = 22;
    // if(age >= 18){
    //   System.out.println("adult : drive, vote");
    // }
    // if(age > 13 && age < 18){
    //   System.out.println("teenager");
    // }
    // else{
    //   System.out.println("Not Adult");
    // }


    //  int number = sc.nextInt();

    //  if(number % 2 == 0 ){
    //   System.out.println("Even");
    //  } else {
    //   System.out.println("Odd");
    //  }
/*
    int income = sc.nextInt();
    int tax;

    if(income < 500000){
      tax = 0;
    }
    else if(income >= 500000 && income < 1000000){
      tax = (int) (income * 0.2);
    }
    else {
      tax = (int) (income * 0.3);
    }

    System.out.println("your tax is : " + tax);
  
  
  int a = 1;
  int b = 3;
  int c = 6;

  if((a >= b) && (a >= c)){
    System.out.println("A is the Largest Of Three");
  }
  else if (b >= c){
    System.out.println("B is the Largest of three");
  }
  else {
    System.out.println("C is the Largest of Three");
  }
  */
  
  // int number = 5;
  // // ternary Operator
  // String type = (number%2 == 0 )?"even":"Odd";
  // System.out.println(type);
  
  // int marks = sc.nextInt();
  // String reportCard = (marks >= 33)?"Pass":"Fail";
  // System.out.println(rc);
  
  // int number = 4;
  // switch(number){
  //   case 1 : System.out.println("Samosa");
  //              break;
  //   case 2 : System.out.println("Burger");
  //              break;
  //   case 3 : System.out.println("Mango Shake");
  //              break;
  //   default : System.out.println("We wake up");
    
 // }
    
      //  double temp = 98;
      //  if(temp > 100){
      //   System.out.println("You have a Fever");
      //  }
      //  else{
      //   System.out.println("You don't have a fever");
      //  }
    // System.out.println("Please enter a number : ");
    //   int day = sc.nextInt();
    //   switch(day){
    //     case 1 : System.out.println("Monday");
    //              break;
    //     case 2 : System.out.println("Tuesday");
    //              break;
    //     case 3 : System.out.println("Wednesday");
    //              break;
    //     case 4 : System.out.println("Thursday");
    //              break;
    //     case 5 : System.out.println("Friday");
    //              break;
    //     case 6 : System.out.println("Saturday");
    //              break;
    //     case 7 : System.out.println("Sunday");
    //              break;
    //     default : System.out.println("Not a Valid Number ");
    //   }

    // System.out.println("Enter a year : ");
    //  int year = sc.nextInt();
    //  if(year%4==0 && (year%100!=0 || year%400==0) ){
    //   System.out.println("Is a leap year");
    //  }
    //  else{
    //   System.out.println("Is not a leap year");
    //  }
    // int n = sc.nextInt();
    // int counter = 1;
    // while(counter<100){
    //   System.out.println("Hello World");
    //   counter++;
    // }
    // System.out.println("Printed hW 100*");
    
    // while(counter<=n){
    //   System.out.print(counter+" ");
    //   counter++;
    // }

    // int n = 25;
    // int sum = 0;
    // int i = 1;
    // while(i<=n){
    //   sum += i;
    //   i++;
    // }
    // System.out.println("Sum is : "+ sum);

    //int i = 1;
    // for(int i=1; i<=10; i++){
    //   System.out.println("Hello World");
    // }

    // for(int line = 1; line<=4;line++){
    //   System.out.println("****");
    // }

    // int line =1;
    // while(line<=4){
    //   System.out.println("****");
    //   line++;
    // }

    // int n = 10899;
    // while(n > 0){
    //   int lastDigit = n % 10;
    //   System.out.print(lastDigit);
    //   n = n / 10; //n/=10
    // }
    // System.out.println();

    //  int n = 10899;
    //  int rev = 0;

    //  while(n > 0){
    //   int lastDigit = n % 10;
    //   rev = (rev*10) + lastDigit;
    //   n = n/10;
    //  }
    //  System.out.println(rev);

    // int counter = 1;
    // do{
    //   System.out.println("Hello World");
    //   counter++;
    // } while(counter <= 10);

    // for(int i=1; i<=5;i++){
    //   if(i == 3){
    //     break;
    //   }
    //   System.out.println(i);
    // }
    // System.out.println("i am out of the loop");

    // do{
    //   System.out.print("enter your number : ");
    //   int n = sc.nextInt();
    //   if(n % 10 == 0){
    //     break;
    //   }
    //   System.out.println(n);
    // }while(true);

    // for(int i=1; i<=5;i++){
    //   if(i == 3){
    //     continue;
    //   }
    //   System.out.println(i);
    // }
      
    // do{
    //    System.out.print("enter a number : ");
    //    int n = sc.nextInt();
    //    if(n %10 == 0){
    //     continue;
    //    }
    //    System.out.println("number was : " + n);
    // }while(true);

  //   System.out.println("enter a number : ");
  //   int n = sc.nextInt();
   
  //  if(n == 2){
  //   System.out.println("n is prime");
  //  } else {
  //   boolean isPrime = true;
  //   for(int i=2; i<=Math.sqrt(n);i++){
  //     if(n % i == 0){ // n is a multiple of i ( i not equal to 1 or n)
  //     isPrime = false;
  //     }
  //   }
  //   if(isPrime == true){
  //     System.out.println("n is prime");
  //   } else {
  //     System.out.println("n is not prime");
  //   }

  //  }
   
  }
   }