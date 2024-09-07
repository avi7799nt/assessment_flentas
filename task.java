
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task {

public static String tesk1(String pattern, String text) {
	        int lengthofPattern = pattern.length();
	        int lengthofText = text.length();
	     
	        if (lengthofPattern > lengthofText) {
	            return "NO";
	        }

	        int[] patternCount = new int[26];
	        for (char ch : pattern.toCharArray()) {
	            patternCount[ch - 'a']++;
	        }
	        int[] windowCount = new int[26];
	        for (int i = 0; i < lengthofPattern; i++) {
	            windowCount[text.charAt(i) - 'a']++;
	        }

	        if (Arrays.equals(patternCount, windowCount)) {
	            return "YES";
	        }

	        for (int i = lengthofPattern; i < lengthofText; i++) {
	           
	            windowCount[text.charAt(i) - 'a']++;
	           
	            windowCount[text.charAt(i - lengthofPattern) - 'a']--;
	          
	            if (Arrays.equals(patternCount, windowCount)) {
	                return "YES";
	            }
	        }

	        return "NO";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        int T = sc.nextInt();
	        sc.nextLine();
	        List<String> results=new ArrayList<>();
	        for (int t = 0; t < T; t++) {
	            String pattern = sc.nextLine();
	            String text = sc.nextLine();
	            String result = tesk1(pattern, text);
	            results.add(result);
	        }
	        sc.close();
	        for (String result : results) {
	            System.out.println(result);
	        }
	    }
}
    
