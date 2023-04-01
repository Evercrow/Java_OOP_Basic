package org.Seminar9.CowsAndBulls;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordEnglishGame extends AbstractGame{
    File dictionary = new File("The_Oxford_3000.txt");

    static Hashtable<Integer,String> wordList = new Hashtable<>();


    HashSet<String> usedWords = new HashSet<>();
    @Override
    public String generateWord() {
        sizeWord = r.nextInt(3,8);
        maxTry = sizeWord;
        return  this.generateWord(sizeWord,maxTry);
    }

    @Override
    public String generateWord(Integer sizeWord, Integer maxTry) {
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(dictionary), StandardCharsets.UTF_8)) ;

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                wordList.merge(line.length(),line,(oldWords,newWord)->String.join(" ",oldWords,newWord));
            }

            reader.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        String generated = this.pickWordRandom(wordList.get(sizeWord));
        usedWords.add(generated);
        return generated;
    }

    private String pickWordRandom(String entry) {
        String[] l = entry.split(" ");
        String chosen = l[r.nextInt(l.length)];
        while (usedWords.contains(chosen)){
            chosen = l[r.nextInt(l.length)];}
        return chosen;
    }


}
