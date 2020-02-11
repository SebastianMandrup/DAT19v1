package com.company;

public class logic1 {

    public static void main(String[] args){


    }


    public boolean cigarParty(int cigars, boolean isWeekend) {

        if(isWeekend){
            return cigars >= 40;
        }
        return cigars >= 40 && cigars <= 60;

    }



    public int dateFashion(int you, int date) {

        if(you <= 2 || date <= 2){
            return 0;
        }

        if(you >= 8 ||date >= 8){
            return 2;
        }

        return 1;

    }


    public boolean squirrelPlay(int temp, boolean isSummer) {

        if(isSummer){
            return temp >= 60 && temp <= 100;
        }
        return temp >= 60 && temp <= 90;

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if(speed <= 60){
            return 0;
        }

        if(isBirthday){

            if(speed <= 65){
                return 0;
            }else if(speed <= 85){
                return 1;
            }
            return 2;

        }

        if(speed <= 80){
            return 1;
        }

        return 2;

    }

    public int sortaSum(int a, int b) {

        int sum = a + b;

        if(sum >= 10 && sum <= 20){
            return 20;
        }

        return sum;

    }


    public String alarmClock(int day, boolean vacation) {

        if(!vacation){
            if(day > 0 && day < 6){
                return "7:00";
            }
            return "10:00";
        }

        if(day > 0 && day < 6){
            return "10:00";
        }

        return "off";

    }

    public boolean love6(int a, int b) {

        if(a == 6 || b == 6){
            return true;
        }

        if(a + b == 6){
            return true;
        }

        return a - b == 6 || b - a == 6;
    }


    public boolean in1To10(int n, boolean outsideMode) {

        if(outsideMode){
            return n >= 10 || n <= 1;
        }

        return n >= 1 && n <= 10;

    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n%11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {

        if(n % 3 == 0){
            return n%5 != 0;
        }

        return n % 5 == 0;

    }

    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public boolean nearTen(int num) {

        int rem = num % 10;

        return rem == 0 || rem == 1 || rem == 2 || rem == 9 || rem == 8;

    }

    public int teenSum(int a, int b) {
        if((a >= 13 && a <= 19 )||( b >= 13 && b <= 19)){
            return 19;
        }

        return a + b;
    }


    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep){
            return false;
        }

        if(isMorning && isMom){
            return true;
        }

        return !isMorning;
    }

    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5){
            return 0;
        }

        if(tea >= 2*candy || candy >= 2*tea){
            return 2;
        }

        return 1;

    }


    public String fizzString(String str) {
        if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }
        if(str.startsWith("f")){
            return "Fizz";
        }
        if(str.endsWith("b")){
            return "Buzz";
        }

        return str;
    }


    public String fizzString2(int n) {

        boolean div5 = n%5 == 0;
        boolean div3 = n%3 == 0;

        if(div5 && div3){
            return "FizzBuzz!";
        }

        if(div5){
            return "Buzz!";
        }

        if(div3){
            return "Fizz!";
        }

        return n + "!";
    }


    public boolean twoAsOne(int a, int b, int c) {

        if(a + b == c || b + c == a || a + c == b){
            return true;
        }

        return false;

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk){
            return b > a &&  c > b;
        }
        return c > b && c > a;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk){
            return a <= b && b <= c;
        }
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {

        a %= 10;

        b %= 10;

        c %= 10;

        return a == b || b == c || a == c;
    }


    public boolean lessBy10(int a, int b, int c) {

        boolean ab = a - 10 >= b;
        boolean ac = a - 10 >= c;
        boolean ba = b - 10 >= a;
        boolean bc = b - 10 >= c;
        boolean ca = c - 10 >= a;
        boolean cb = c - 10 >= b;

        return ab || ac || ba || bc || ca || cb;

    }


    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if(!noDoubles){
            return die1 + die2;
        }

        if(die1 != die2){
            return die1 + die2;
        }

        if(die1 == 6){
            die1 = 1;
        } else {
            die1 ++;
        }

        return die1 + die2;

    }


    public int maxMod5(int a, int b) {

        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {

            if (a > b) {
                return b;
            }
            return a;
        }

        if (a > b) {
            return a;
        }
        return b;

    }


    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }

        if( a == b && b == c) {
            return 5;
        }

        if( b != a && c != a) {
            return 1;
        }

        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if(a != b && b != c && a != c) {
            return 0;
        }

        if(a == b && b == c) {
            return 20;
        }

        return 10;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if(ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        ab -= 10;

        if(ab == bc || ab == ac) {
            return 5;
        }

        return 0;
    }

    public boolean shareDigit(int a, int b) {
        int a1 = a/10;
        int a2 = a%10;
        int b1 = b/10;
        int b2 = b%10;

        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }


    public int sumLimit(int a, int b) {

        String a1 = "" + a;

        int sum = a + b;

        String sum1 = "" + sum;

        if(a1.length() == sum1.length()) {
            return sum;
        }

        return a;

    }






}






}
