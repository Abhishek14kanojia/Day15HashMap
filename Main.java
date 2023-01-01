package com.hashMapDay15;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String string = "To be or not to be";
		String[] words = string.toCharArray().split(" ");
		
		HashMap<String, Integer> hashmap = new Hashmap<>();
		
		for (int i = 0; i < words.length; i++) {
			String word = word[i];
			Integer value = hashmap.get(word);
			if(value == null) {
				value = 1;
				
			}else {
				value = value + 1;
				
			} hashmap.add(word, value);
			
		}
		System.out.println(hashmap);
	}

}
