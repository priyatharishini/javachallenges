package JavaChallenges3;

public class JavaChallenges2 {
	public static boolean isPalindrome(String s) {
	      
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
  
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	public static void main(String[] args)
	{
	        String s = "A man, a plan, a canal: Panama"; 
	        boolean result = isPalindrome(s);
	        System.out.println(result);
	    }
	
	}


