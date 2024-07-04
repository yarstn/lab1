import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter number 1:");
//        int num1 = input.nextInt();
//        System.out.println("please enter number 2:");
//        int num2 = input.nextInt();
//while (true){
//    System.out.println(num1 +"+"+ num2 +"=" +(num1+num2));
//    System.out.println(num1 +"*"+ num2 +"=" +(num1*num2));
//    System.out.println(num1 +"-"+ num2 +"=" +(num1-num2));
//    System.out.println(num1 +"/"+ num2 +"=" +(num1/num2));
//    System.out.println(num1 +"%"+ num2 +"=" +(num1%num2));
//
//
//    break;
//}
//        Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        Test Data:
        // same input data at line 11
//        for (int i = 0 ; i <= 10 ; i++){
//            System.out.println(num1+"*"+ i +"="+(num1*i));
//        }
//        3. Write a Java program to print the area and perimeter of a circle.
//        double radius = 7.5;
//        double area = 22*radius*radius/7;
//        double perimeter = 2*22*radius/7;
//        System.out.println("perimeter is: "+ perimeter);
//        System.out.println("area is: "+ area);

//        4. Java program to find out the average of a set of integers
//        System.out.println("please enter the count for numbers:");
//        int num = input.nextInt();
//        double res=0.0;
//        for (int i = 1 ; i<= num ; i++){
//            System.out.println("please enter number:");
//            int num2  = input.nextInt();
//             res += num2;
//
//        }
//        System.out.print("the average is "+ (res / num));
//
//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.
//    boolean result1 = true;
//    boolean result2 = false;
//        System.out.println("please enter number 1 :");
//            int num1  = input.nextInt();
//        System.out.println("please enter number 2 :");
//        int num2  = input.nextInt();
//        System.out.println("please enter number 3 :");
//        int num3  = input.nextInt();
//        if (num1+num2 == num3){
//            System.out.printf("the result is "+ result1);
//        }
//        else {
//            System.out.printf("the result is "+ result2);
//        }
//        6. Write a Java program to reverse a word.
//        String result="";
//String word="nasser";
//        char o;
//        System.out.println(word);
//        for (int i=word.length()-1; i>=0; i--) {
//            o = word.charAt(i);
//            result +=o;
//
//        }
//        System.out.println(result);
//        7 -  Java program to check whether the given number is even or odd
//        System.out.println("please enter number  :");
//            int num1  = input.nextInt();
//            if ( (num1 % 2 == 0)) {
//                System.out.println("number is even");
//            }else {
//                System.out.println("number is odd");
//
//
//            }
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        System.out.println(" enter temperature in Centigrade :");
//            double num1  = input.nextInt();
//        double Fahrenheit = (num1 * 9/5)+ 32;
//        System.out.println("temperature in Fahrenheit is:" + Fahrenheit);

//        .Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//
//        System.out.println(" enter String :");
//            String word  = input.nextLine();
//        System.out.println(" enter number :");
//        word = word.trim();
//        int num1  = input.nextInt();
//                char o = word.charAt(num1);
//                System.out.println(o);

//        10. Write a Java program to print the area and perimeter of a rectangle.
//double rectangle;
//double width = 5.5;
//double height = 8.5;
//double area = width*height;
//double perimeter = 2*(width+height);
//        System.out.println("area is"+width+"*"+height+"="+area);
//        System.out.println("perimeter is 2*("+width+"+"+height+")="+perimeter);
//        11. Write a Java program to compare two numbers.
//        System.out.println(" enter number 1 :");
//        int num1  = input.nextInt();
//        System.out.println(" enter number 2 :");
//        int num2  = input.nextInt();
//        while (true){
//if (num1 != num2 && num1 < num2 && num1 <= num2 ) {
//    System.out.println(num1 + "!=" + num2);
//    System.out.println(num1 + "<" + num2);
//    System.out.println(num1 + "<=" + num2);
//
//}
//break;
//}
//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        System.out.println(" enter number seconds :");
//        int sec  = input.nextInt();
//        int s = sec % 60;
//        int h = sec / 60;
//        int m = h % 60;
//        h = h / 60;
//
//        System.out.print(h + ":" + m + ":" + s);
//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//        System.out.println(" enter number 1 :");
//        int num1  = input.nextInt();
//        System.out.println(" enter number 2 :");
//        int num2  = input.nextInt();
//        System.out.println(" enter number 3 :");
//        int num3  = input.nextInt();
//        System.out.println(" enter number 4 :");
//        int num4  = input.nextInt();
//        if (num1 == num2 && num2 == num3 && num3 == num4){
//            System.out.println("numbers are equal");
//        }
//        else {
//            System.out.println("numbers are not equal");
//
//        }
//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
//        System.out.println(" enter number 1 :");
//        int num1  = input.nextInt();
//        if ( num1 >0 ){
//            System.out.println("no is positive");
//
//        }
//        else if(num1 ==0 ){
//            System.out.println("no is zsro");
//
//        }
//        else {
//            System.out.println("no is negative");
//
//        }
//        15.Write a program to enter the numbers till the user wants and at the end it should
//        display the count of positive, negative and zeros entered
//                (End loop use -1 , Don’t count -1).
//
//        System.out.println(" enter numbers :");
//        int num1=0;
//        int countOfPositive = 0;
//        int countOfNeagtive = 0;
//        int countOfZeros = 0;
//        while (num1 != -1 ){
//            num1  = input.nextInt();
//            if ( num1 >0 ){
//           countOfPositive ++;
//
//        }
//        else if(num1 ==0 ){
//        countOfZeros++;
//        }
//        else {
//
//countOfNeagtive++;
//            }
//
//        }
//        System.out.println("Sum of Prositive: "+countOfPositive);
//        System.out.println("Sum of Zeros: "+countOfZeros);
//        System.out.println("Sum of Negative: "+countOfZeros);
//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//        System.out.println(" enter numbers :");
//        int num1  = input.nextInt();
//        int rev = 0;
//
//        while (num1 > 0) {
//            int digit = num1 % 10;
//            rev = rev * 10 + digit;
//            num1 /= 10;
//        }
//        System.out.println( rev);
//        7 - Write a program to enter the numbers till the user wants and at the end the program
//        should display the largest and smallest numbers entered.
//        int large = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        System.out.println("Enter numbers (enter 0 to stop):");
//
//        while (true) {
//            int num = input.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//            if (num > large) {
//                large = num;
//            }
//            if (num < small) {
//                small = num;
//            }
//        }
//            System.out.println("the large number: "+ large);
//            System.out.println("the smallest number: "+ small);

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//                System.out.println("Enter String: ");
//                String test = input.nextLine();
//        int count = 0;
//        int i = 0;
//        while (i < test.length()) {
//            if (test.charAt(i) == 'a') {
//                count++;
//            }
//            i++;
//        }
//        System.out.println(" Number of a's: " +count);


    }


    }
