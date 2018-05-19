package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {

		int x = 0;
		int count = 1;
		
		String word = "";
		//String phrase = "I Love Dogs";
		word += phrase.charAt(0);
		
		while (x < phrase.length() ){
			if (phrase.charAt(x) == ' ' && count < 3) {
				count++;
				word += phrase.charAt(x + 1);
			}
			++x;
		}
		
		System.out.println("This is acronym: " + word );
		
		return word;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if (sideOne == sideTwo && sideTwo == sideThree){
				return true;
				//System.out.println("This triangle is an Equilateral triangle!");
			}			return false;
		}

		public boolean isIsosceles() {
			if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne){
				return true;
				//System.out.println("This triangle is an Isosceles triangle!");
			}			return false;
		}

		public boolean isScalene() {
			if (sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne){
				return true;
				//System.out.println("This triangle is a Scalene triangle!");
			}			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {

		//String string = "cabbage";
		 int x = 0;
		 int score = 0;
		 //System.out.println("This score will be " + score + " to start.");
		 
		 while (x < string.length() ){
			 string = string.toUpperCase();
			 //System.out.println(string);
			 
			 if ( string.charAt(x) == 'A' 
					 || string.charAt(x) == 'E' 
					 || string.charAt(x) == 'I'
					 || string.charAt(x) == 'O' 
					 || string.charAt(x) == 'U'
					 || string.charAt(x) == 'L'
					 || string.charAt(x) == 'N'
					 || string.charAt(x) == 'R'
					 || string.charAt(x) == 'S'
					 || string.charAt(x) == 'T') {
				 score += 1;
				 //System.out.println(score);
					
				}else if (string.charAt(x) == 'D' 
						 || string.charAt(x) == 'G') {
					 score += 2;
					// System.out.println(score);
					
				}else if (string.charAt(x) == 'B' 
						 || string.charAt(x) == 'C'
						 || string.charAt(x) == 'M'
						 || string.charAt(x) == 'P') {
					 score += 3;
					// System.out.println(score);
				}else if (string.charAt(x) == 'F' 
						 || string.charAt(x) == 'H'
						 || string.charAt(x) == 'V'
						 || string.charAt(x) == 'W'
						 || string.charAt(x) == 'Y') {
					 score += 4;
					// System.out.println(score);
				}else if (string.charAt(x) == 'K') {
					 score += 5;
					// System.out.println(score);
				}else if (string.charAt(x) == 'J' 
						 || string.charAt(x) == 'X') {
					 score += 8;
					 //System.out.println(score);
				}else if (string.charAt(x) == 'Q'
						 || string.charAt(x) == 'Z') {
					 score += 10;
					// System.out.println(score);
				}
			 ++x;
				
			
			} 
		 
		 System.out.println("The score of " + string + " is: " + score);
		
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {

		//String string = "+1 (613)-995-0253";
		int x = 0;
		String newNumber = "";

		while (x < string.length()) {
			if (Character.isDigit(string.charAt(x))) {
				newNumber += string.charAt(x);
				x++;
			} else {
				x++;
			}
		}

		if (newNumber.length() > 11) {
			System.out.println("There are " + newNumber.length() + " numbers! Try again!");
		} else if (newNumber.length() == 11 || newNumber.length() == 10) {
			System.out.println("This is an acceptable amount of numbers. You may proceed!");
			if (newNumber.startsWith("1")) {
				newNumber = newNumber.substring(1);
				System.out.println(newNumber);
			} else {
				System.out.println(newNumber);
			}
		} else if (newNumber.length() < 10) {
			System.out.println("There are not enough numbers! Try again!");
		}
		
		return newNumber;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {

		//String a(replaced with string) = "stuff stuff olly in come free";

	     String[] b = string.split(" "); 
	     HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
	     for (int i = 0; i < b.length; i++) {
	         String key = b[i];
	         int freq = freqMap.getOrDefault(key, 0);
	         freqMap.put(key, ++freq);
	     }
	     for (Entry<String, Integer> result : freqMap.entrySet()) {
	         System.out.println("The word " + result.getKey() + " occurs: " + result.getValue() + " times");
	     }
	     
		return null;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
		
		int k=0;
	        for(int i=0;i < sortedList.size();i++){
	        	System.out.println(sortedList.get(i));
	            if(sortedList.get(i) == t){
	                k=i;
	                System.out.println(k + ": IS INDEX");
	                break;
	            }
	        }
		 
			return k;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {

		//FOR TEST ON QUICK FAST RUN, QUICK SHOULD BE UICKQAY NOT ICKQUAY BECAUSE OF VOWEL U
		
		//String string = "the therapy dog ran away";
		String pig = "";

		if (!string.contains(" ")) {

			String phrases = string.toUpperCase();
			if (phrases.startsWith("A") || phrases.startsWith("E") || phrases.startsWith("I") || phrases.startsWith("O")
					|| phrases.startsWith("U")) {
				pig += (string + "ay ");
			} else if (phrases.startsWith("SH") || phrases.startsWith("CH") || phrases.startsWith("TH")) {
				pig += (string.substring(2) + string.substring(0, 2) + "ay ");
			} else {
				pig += (string.substring(1) + string.substring(0, 1) + "ay ");
			}
		} else {
			String[] words = string.split(" ");
			for (String word : words) {
				if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
						|| word.startsWith("u")) {
					pig += (word + "ay ");
				} else if (word.startsWith("sh") || word.startsWith("ch") || word.startsWith("th")) {
					pig += (word.substring(2) + word.substring(0, 2) + "ay ");
				} else {
					pig += (word.substring(1) + word.substring(0, 1) + "ay ");
				}
			}
			System.out.println(pig);
		}
		
		return pig;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		
		 String inputAsString = input + "";
	       int numberOfDigits = inputAsString.length();
	       int copyOfInput = input;
	       int sum = 0;
	       while (copyOfInput != 0) {
	           int lastDigit = copyOfInput % 10;
	           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
	           copyOfInput = copyOfInput / 10;
	       }
	       
	       if (sum == input) {
	           System.out.println(input + " is an armstrong number.");
	           return true;
	       } else {
	           System.out.println(input + " is not an armstrong number.");
	           return false;
	       }
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {

	     while (l%2==0)
	     {
	         System.out.print(2 + " ");
	         l /= 2;
	     }

	     for (int i = 3; i <= Math.sqrt(l); i+= 2)
	     {
	         while (l%i == 0)
	         {
	             System.out.print(i + " ");
	             l /= i;
	         }
	     }
	     if (l > 2)
	         System.out.print(l + " ");
	     
		return null;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {

			StringBuffer result= new StringBuffer();
			
			for (int i=0; i<string.length(); i++)
			{
				if (Character.isUpperCase(string.charAt(i)))
				{
					char ch = (char)(((int)string.charAt(i) +
									key - 65) % 26 + 65);
					result.append(ch);
				}
				else if (Character.isWhitespace(string.charAt(i))){
				     char ch = ' ';
				   result.append(ch);
				}
				else if (Character.isDigit(string.charAt(i))) {
					char ch = string.charAt(i);
					result.append(ch);					
				}
				else if(!Character.isDigit(string.charAt(i)) && 
						!Character.isWhitespace(string.charAt(i)) && 
						!Character.isAlphabetic(string.charAt(i))) {
					
					char ch = string.charAt(i);
					result.append(ch);	
				}
				else
				{
					char ch = (char)(((int)string.charAt(i) +
									key - 97) % 26 + 97);
					result.append(ch);
				}
			}
			System.out.println(result);
			return null;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {

		int num = 1;
	    int j;
	    int count = 0;

	    while (count < i){
	      num=num+1;
	      for (j = 2; j <= num; j++){
	        if (num % j == 0) {
	          break;
	        }
	      }
	      if ( j == num){
	        count = count+1;
	      }
	    }
	    if(i != 0) {
	    System.out.println("Value of nth prime: " + num);
	    }
		
		return num;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {


			String allchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			 string=string.replaceAll(" ", "");
			 string=string.toUpperCase();
	         int len= string.length();
	         int len1 = allchar.length();
	         String cipher="";
	         int count = 0;
	         
	         for(int i=0; i<len; i++)
	         {
	             char b=string.charAt(i);
	             if(Character.isLetter(b)) {
	             for(int j=0; j<len1; j++)
	             {
	                 char c = allchar.charAt(j);
	                 if(c == b )
	                 {
	                     int index=allchar.indexOf(c);
	                     int position=(len1-1)-index;
	                     cipher+= allchar.charAt(position);
	                     count++;
	                     if(count % 5 == 0){
	                         cipher += " ";
	                     }
	                     break;
	                 }//System.out.println(cipher);
	             }
	             }
	             else if(Character.isDigit(b)){
	            	 cipher += b;
	             }
	         }
	         return (cipher.toLowerCase());
	       // return cipher;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			String allchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			 string=string.toUpperCase();
	         int len= string.length();
	         int len1 = allchar.length();
	         String cipher="";
	         int count = 0;
	         
	         for(int i=0; i<len; i++)
	         {
	             char b=string.charAt(i);
	             if(Character.isLetter(b)) {
	             for(int j=0; j<len1; j++)
	             {
	                 char c = allchar.charAt(j);
	                 if(c == b )
	                 {
	                     int index=allchar.indexOf(c);
	                     int position=(len1-1)-index;
	                     cipher+= allchar.charAt(position);
	                     count++;
	                     if(count % 5 == 0){
	                         cipher += " ";
	                     }
	                     break;
	                 }//System.out.println(cipher);
	             }
	             }
	             else if(Character.isDigit(b)){
	            	cipher += b;
	             }
	         }
			

	         System.out.println(cipher.toLowerCase());			
	         return null;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
	
		string = string.replaceAll( "-", "" );
		int count = 1;
		int result = 0;
		for(int i = 0; i < string.length(); i++) {
			int number = Character.getNumericValue(string.charAt(i));
			switch (count) {
			case 1:
				result+= number * 10;
				break;
			case 2:
				result+= number * 9;
				break;
			case 3:
				result+= number * 8;
				break;
			case 4:
				result+= number * 7;
				break;
			case 5:
				result+= number * 6;
				break;
			case 6:
				result+= number * 5;
				break;
			case 7:
				result+= number * 4;
				break;
			case 8:
				result+= number * 3;
				break;
			case 9:
				result+= number * 2;
				break;
			case 10:
				if (number == 33) {
					result += 10;
				}
				else if(!Character.isAlphabetic(string.charAt(i))) {
					result+= number * 1;

				}
				break;
			default:
				break;
			}
			count++;
			}
		
		if((result % 11) == 0) {
			System.out.println("ISBN is valid");
			return true;
		}
		else {
			System.out.println("ISBN is not valid");
			System.out.println(result);
		
		
		return false;
		}
	//return true;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
	    int n = 26; 

	    if(string.length() < n){
			System.out.println("Not enough letters to be a Pangram");
	          return false;	           
	        }
		else {
	        for(char c = 'A'; c <= 'Z' ; c++){
	            if((string.indexOf(c) < 0) && (string.indexOf((char)(c + 32)) < 0)){
	            	System.out.println("Not enough letters to be a Pangram");
	               return false;
	            }
	        }
	        System.out.println("This is a Pangram");
	        return true;
	    }
		//return false;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		int count = 0;
        int ans =0;
        int sum = 0;
        
		for(int j = 0 ;  j < set.length; j++) {
       	 int m = i / set[j];
       	 //System.out.println(m);
       	 sum = m * (m + 1) / 2;
       	// System.out.println(sum);
       	 ans += set[j] * sum;
       	// System.out.println(ans);
       	 count++;
       	}
		
		return ans;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		int nDigits = string.length();
		 
	    int nSum = 0;
	    boolean isSecond = false;
	    for (int i = nDigits - 1; i >= 0; i--) 
	    {
	 
	        int d = string.charAt(i) - 'a';
	 
	        if (isSecond == true)
	            d = d * 2;
	        nSum += d / 10;
	        nSum += d % 10;
	 
	        isSecond = !isSecond;
	        return true;
	    }
	    return (nSum % 10 == 0);
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

}
