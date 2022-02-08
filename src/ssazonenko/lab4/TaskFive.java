package ssazonenko.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFive {
    public static void main(String[] args) {
        int nubmerOfWords = 0;
        int vowel = 0;
        int consonants = 0;
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z]+$");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                words.add(line);
            }
        }
        for (int iteration = 0; iteration < words.size(); iteration++) {
            Pattern pattern = Pattern.compile("[a+,e+,o+,i+,u+,y+,A+,E+,O+,I+,U+,Y+]");
            Matcher matcher = pattern.matcher(words.get(iteration));
            while (matcher.find()) {
                vowel++;
            }
            System.out.println(vowel);
            Pattern pattern1 = Pattern.compile("[B+,C+,D+,F+,G+,H+,J+,K+,L+,M+,N+,P+,Q+,R+,S+,T+,V+,W+,X+,Z+,q+,w+,r+,t+,p+,s+,d+,f+,g+,h+,j+,k+,l+,z+,x+,c+,v+,b+,n+,m+]");
            Matcher matcher1 = pattern1.matcher(words.get(iteration));
            while (matcher1.find()) {
                consonants++;
            }
            System.out.println(consonants);
            if (vowel == consonants) {
                nubmerOfWords ++;
            }
            vowel = 0;
            consonants = 0;
        }
        System.out.println("Число слов, которые содержат только латинские буквы равно:" + words.size());
        System.out.println("Число слов с равным количестом гласных и согласных букв: " + nubmerOfWords);
        }
    }









