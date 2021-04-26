package tn.dari.spring.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service 
public class BadWordsAds {
	   static ArrayList<String> words = new ArrayList<String>();
	    
	    static int largestWordLength = 0;
	    
	    public static void loadConfigs() {
	        try {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ResourceUtils.getFile("classpath:Word_Filter.csv"))));
	            String line = "";
	            int counter = 0;
	            while((line = reader.readLine()) != null) {
	                counter++;
	                String[] content = null;
	               
	                    content = line.split(",");
	                    if(content.length == 0) {
	                        continue;
	                    }
	                    String word = content[0];
	               	                    if(word.length() > largestWordLength) {
	                        largestWordLength = word.length();
	                    }
	            	    words.add(word.replaceAll(" ", " "));

	                    }
	            System.out.println("Loaded " + counter + " words to filter out");
	        }
	            catch (IOException e) {
	            e.printStackTrace();
	        }

	    }


	    /**
	     * Iterates over a String input and checks whether a cuss word was found in a list, then checks if the word should be ignored (e.g. bass contains the word *ss).
	     * @param input
	     * @return
	     */
	     
	    public static ArrayList<String> badWordsFound(String input) {
	        if(input == null) {
	            return new ArrayList<>();
	        }

	        // don't forget to remove leetspeak, probably want to move this to its own function and use regex if you want to use this 
	        
	        input = input.replaceAll("1","i");
	        input = input.replaceAll("!","i");
	        input = input.replaceAll("3","e");
	        input = input.replaceAll("4","a");
	        input = input.replaceAll("@","a");
	        input = input.replaceAll("5","s");
	        input = input.replaceAll("7","t");
	        input = input.replaceAll("0","o");
	        input = input.replaceAll("9","g");
	        

	        ArrayList<String> badWords = new ArrayList<>();
	        input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");

	        // iterate over each letter in the word
	        for(int start = 0; start < input.length(); start++) {
	            // from each letter, keep going to find bad words until either the end of the sentence is reached, or the max word length is reached. 
	            for(int offset = 1; offset < (input.length()+1 - start) && offset < largestWordLength; offset++)  {
	                String wordToCheck = input.substring(start, start + offset);
	                if(words.contains(wordToCheck)) {
	                	badWords.add(wordToCheck);
	                }
	            }
	        }
	                    
	        for(String s: badWords) {
	            System.out.println(s + " qualified as a bad word ");
	        }
	        return badWords;

	    }

	    public static String filterText(String input) throws BadWordsException  {
	        ArrayList<String> badWords = badWordsFound(input);
	        if(badWords.size() > 0) {
throw new BadWordsException("This ads was blocked because a bad word was found. If you believe this word should not be blocked, please message support.")	 ;       }
	        return input;
	    }
}
