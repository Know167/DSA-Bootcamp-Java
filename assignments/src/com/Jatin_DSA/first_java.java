package com.Jatin_DSA;

import java.util.Scanner;

public class first_java {
    private static void eve_odd() {
        System.out.println("Please Enter a Number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("Number is Even");
        }
        if (input % 2 != 0) {
            System.out.println("Number is Odd");
        }
    }

    private static void greeting() {
        System.out.println("Please Enter your name:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Hello " + str);
    }


    public static void main(String[] args) {
        eve_odd();
        greeting();
        calc_interest();
        calc();
        largest();
        cvt_usd();
        fibonacci();
        palindrome_chk();
        armstrong();
    }

    private static void armstrong() {
        System.out.println("Enter the first number from which you want to search");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number until which you want to search");
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            double digit[]=new double[5];
            double sum=0;
            for (int j = 0; j < 5; j++) {
                digit[j]= (int)((i%Math.pow(10,j+1))/Math.pow(10,j));
            }
            for (double val :
                    digit) {
                sum+=Math.pow(val,3);
            }
            if(sum==i){
                System.out.println(i+" is an armstrong number");
                break;
            }
        }
    }

    private static void palindrome_chk() {
        System.out.println("Enter the string to check:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0,j=str.length()-1;
        while(i<str.length()&&j>=0){

            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("A Palindrome!");
    }

    private static void fibonacci() {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i++;
            System.out.print(sum+", ");
        }
    }

    private static void cvt_usd() {
        System.out.println("Enter the amount in Rupees:");
        Scanner sc=new Scanner(System.in);
        float rupee=sc.nextFloat();
        float usd=rupee/78;
        System.out.println("$ "+usd);
    }

    private static void largest() {
        System.out.println("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        float num1= sc.nextFloat();
        System.out.println("Enter the second number:");
        float num2=sc.nextFloat();
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");
        }
    }

    private static void calc() {
        System.out.println("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        float num1= sc.nextFloat();
        System.out.println("Enter the second number:");
        float num2=sc.nextFloat();
        System.out.println("Enter the operator:");
        char opr=sc.next().charAt(0);
        float ans=0;
        switch (opr){
            case '+':
                ans=num1+num2;
                break;
            case '-':
                ans=num1-num2;
                break;
            case '*':
                ans=num1*num2;
                break;
            case '/':
                ans=num1/num2;
                break;
        }
        System.out.println("ans = " + ans);
    }

    private static void calc_interest() {
        System.out.println("Enter the Principle:");
        Scanner sc=new Scanner(System.in);
        int principle=sc.nextInt();
        System.out.println("Enter the Interest rate:");
        float rate=sc.nextFloat();
        System.out.println("Enter the Tenure in Months:");
        float time=sc.nextFloat();
        float interest=principle*rate*time/1200;
        System.out.println("Simple interest = " + interest);
    }
}
