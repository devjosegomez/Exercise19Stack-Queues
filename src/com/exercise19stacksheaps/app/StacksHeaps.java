package com.exercise19stacksheaps.app;
import java.util.Stack;
public class StacksHeaps {

	public static void main(String[] args) {
		//Variable declaration
		String cad = "Getting more profile views can help you get found for the right opportunity";
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		
		for(Character c : lettersArray) {
			if(Character.toUpperCase(c) == 'A') {
				letters.push(c);
			}
		}
		
		while(!letters.isEmpty()) {
			System.out.println(letters.pop());
		}
		/*
		for(Character c : lettersArray) {
			System.out.println(letters.pop());
		}
		*/
		
	}

}
