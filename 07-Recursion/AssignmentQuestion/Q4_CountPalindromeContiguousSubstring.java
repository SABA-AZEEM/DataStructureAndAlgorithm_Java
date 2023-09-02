//Question4:We are given a string S, we need to find the count of all contiguous 
//substrings starting and ending with the same character.
							//Sample Input 1:
//S = "abcab" 
//Sample Output 1: 7
//There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca,
//cab, a, ab, b
//Out of the above substrings,there are 7 
//substrings:a,abca,b,bcab,c,a and b.
//So,only 7 contiguous substrings start and end with the same character.
							//Sample Input 2:
//S = "aba"
//Sample Output 2: 4
//The substrings are a, b, a and aba

class CountPalindromeContiguousSubstrings {
  
    public static void main(String[] args) {
        String s = "abcab";
        int result = countContiguousSubstrings(s, 0, s.length() - 1);
        System.out.println("Sample Output: " + result); // Output: 7
    }
  

    public static int countContiguousSubstrings(String s, int start, int end) {
        if (start > end) {
            return 0; // Base case: empty substring
        }

        int count = countContiguousSubstrings(s, start, end - 1) + countForCharacter(s, end);

        return count;
    }

    public static int countForCharacter(String s, int end) {
        int count = 0;

        for (int i = 0; i <= end; i++) {
            if (s.charAt(i) == s.charAt(end)) {
                count++;
            }
        }

        return count;
    }
}

