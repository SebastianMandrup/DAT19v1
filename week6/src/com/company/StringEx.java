package com.company;

public class StringEx{

    public static void main(String[] args){




    }


    public String helloName(String name) {
        return "Hello " + name + "!";
    }


    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }


    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word +"</" + tag + ">";
    }


    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }


    public String extraEnd(String str) {
        String end = str.substring(str.length()-2,str.length());

        return end + end + end;
    }


    public String firstTwo(String str){

        if(str.length() < 2){
            return str;
        }

        return str.substring(0,2);
    }


    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }


    public String withoutEnd(String str){
        return str.substring(1,str.length()-1);
    }


    public String comboString(String a, String b){

        if(a.length() < b.length()){
            return a + b + a;
        } else {
            return b + a + b;
        }

    }

    public String nonStart(String a, String b) {
        String first = a.substring(1,a.length());
        String second = b.substring(1,b.length());

        return first + second;

    }



}
