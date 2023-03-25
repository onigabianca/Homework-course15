package org.fasttrackit;

import java.util.Scanner;

public class RecursionHomework {

    public static void main(String[] args) {
        System.out.println("1)Sum of first n integer numbers is : ");
        System.out.println(sumOfFirstIntegersNumbers(5));


        System.out.println("2)Sum of first n even integer numbers is : ");
        System.out.println(sumOfFirstEvenIntegers(5));

        System.out.println("3)Mode1.The word is a palindrome?");
        System.out.println(palindromeWordMode1("madam"));

        System.out.println("3)Model2.The word is a palindrome?");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce a word:");
        String word=scanner.nextLine();
        System.out.println("The word is:"+word);
        System.out.println(palindromeWordMode2(word,0,word.length()-1));

        System.out.println("4)Sum of digits for a number");
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Introduce a number:");
        int number= scanner2.nextInt();
        System.out.println("Sum is:");
        System.out.println(sumOfDigitsforNumber(number));

        System.out.println("5)Fibonacci array.Value for the n-th element:");
        System.out.println(fibonacciArray(6));
    }

    public static int fibonacciArray(int n) {
        if(n<=1){
            return n;
        }
        return fibonacciArray(n-1)+fibonacciArray(n-2);

    }

    public static double sumOfDigitsforNumber(long number) {
        if(number==0){
            return 0;
        }return (number%10+sumOfDigitsforNumber(number / 10));
    }

    public static boolean palindromeWordMode2(String word,int left,int right) {

        if(left>=right){
            return true;
        }else {
            if(word.charAt(left)== word.charAt(right)){
                return palindromeWordMode2(word,++left ,--right);
            }
            else{
                return false;
            }
        }
    }

    public static boolean palindromeWordMode1(String word) {
        if (word.isEmpty()) {
            return true;
        } return (word.equals(new StringBuffer(word).reverse().toString()));
    }

    public static int sumOfFirstEvenIntegers(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            return sumOfFirstEvenIntegers(n - 1);
        } else return n+sumOfFirstEvenIntegers(n - 2);
    }

    public static int sumOfFirstIntegersNumbers(int n) {
        if (n == -1) {
            return 0;
        }
        return n+sumOfFirstIntegersNumbers(n-1);
    }
}
