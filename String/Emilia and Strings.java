// Emilia loves to play with strings. Help her find the K- th lexicographically smallest string among the strings that are permutations of a string S.
// Input
// The input consists of a string and an integer separated by a space.
// S K

// Constraints
// 1 ≤ ∣S∣ ≤ 8
// S consists of lowercase English letters.
// There are at least K distinct strings that are permutations of S.
// Output
// Print the answer.
// Example
// Sample Input 1
// aab 2
// Sample Output 1
// aba

// Sample Input 2
// baba 4
// Sample Output 2
// baab

// Sample Input 3
// ydxwacbz 40320
// Sample Output 3
// zyxwdcba

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> list = generatePermutations(s);
        Collections.sort(list);

        System.out.println(list.get(k-1));
    }

    public static List<String> generatePermutations(String str) {
        List<String> list = new ArrayList<>();
        generatePermutationsHelper(str.toCharArray(), 0, list);
        return list;
    }

    public static void generatePermutationsHelper(char[] s, int i, List<String> list) {
        if (i == s.length-1) 
        {
            list.add(new String(s));
        }
        else 
        {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < s.length; j++) 
            {
                if (!seen.contains(s[j])) 
                {
                    seen.add(s[j]);
                    swap(s, i, j);
                    generatePermutationsHelper(s, i + 1, list);
                    swap(s, i, j);
                }
            }
        }
    }
}
