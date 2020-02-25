package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        String text = readText();

        countLetters(text);

        countWords(text);


    }


    public String readText(){
        try {
            URL url = new URL("https://www.gutenberg.org/files/11/11.txt"); //new
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); //new

            String line = br.readLine();
            String output = "";

            while(line != null){
                output += "\n" + line;
                line = br.readLine();
            }

            return output;

        } catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }


    public void countLetters(String text){

        HashSet<Character> letters = new HashSet<>();

        for(int i = 0; i < text.length(); i++){
            letters.add(text.charAt(i));
        }

        System.out.println("# of Characters: " + letters.size());

    }

    public void countWords(String text) {

        HashMap<String, Integer> words = new HashMap<>();

        Scanner scanner = new Scanner(text);

        if(!scanner.hasNext()){
            System.out.println("NO TEXT WAS READ...");
            return;
        }

        String current = scanner.next();

        while(scanner.hasNext()){

            if(words.containsKey(current)){
                words.put(current,words.get(current) + 1);
            } else {
                words.put(current,1);
            }

            current = scanner.next();
        }

        System.out.println("# of Words: " + words.size() + "\r\n--------------");




        for(Map.Entry<String,Integer> entry : words.entrySet()){

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}
