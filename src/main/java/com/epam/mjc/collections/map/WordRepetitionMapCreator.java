package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static void main(String[] args)
    {
        WordRepetitionMapCreator wordRepetitionMapCreator= new WordRepetitionMapCreator();
        System.out.println(wordRepetitionMapCreator.createWordRepetitionMap("Hello,    world! How are you? hElLo"));
    }
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        if (sentence != null & sentence != ""){
            String sentenceToLowerCase = sentence.toLowerCase();
            String[] words = sentenceToLowerCase.split("[^a-zA-Z0-9']+");
            for (String word : words) {
                if (!wordRepetitionMap.containsKey(word)) {
                    wordRepetitionMap.put(word, 1);
                } else {
                    int count = wordRepetitionMap.get(word);
                    wordRepetitionMap.put(word, count + 1);
                }
            }
        }
        return wordRepetitionMap;
    }
}
