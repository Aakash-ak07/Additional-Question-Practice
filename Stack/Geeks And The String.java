Our geek loves to play with strings, Currently, he is trying to reduce the size of a string by recursively removing all the consecutive duplicate pairs. In other words, He can apply the below operations any number of times.

Remove all the consecutive duplicate pairs and concatenate the remaining string to replace the original string.
Your task is to find the string with minimum length after applying the above operations.

Note: If the string length become zero after applying operations, return "-1" as a string.

Example 1:
Input:
aaabbaaccd
Output: 
ad
Explanation: 
Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad

Example 2:
Input: 
aaaa
Output: 
Empty String
Explanation: 
Remove (aa)aa => aa
Again removing pair of duplicates then (aa) 
will be removed and we will get 'Empty String'.

class Solution {
    public static String removePair(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(st.isEmpty())
                st.push(s.charAt(i));
            else if(st.peek() == s.charAt(i))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        if(st.isEmpty())
            return "-1";
        String str="";
        while(!st.isEmpty())
        {
            str = st.pop() + str; 
        }
        return str;
    }
}
        
