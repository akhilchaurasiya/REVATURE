
public class Program5 {

	static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	
	public static String replacePalindromes(String input) {
        char[] result = input.toCharArray();
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j <= n; j++) { // Consider substrings of length 2 or more
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    // Replace characters in palindrome with '*'
                    for (int k = i; k < j; k++) {
                        result[k] = '*';
                    }
                }
            }
        }

        return new String(result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "bob has a radar plane";
        String output = replacePalindromes(input);
        System.out.println(output); 
	}

}
