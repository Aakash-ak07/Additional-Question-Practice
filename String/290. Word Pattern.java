// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
  
// Example 2:
// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
  
// Example 3:
// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false
 
// Constraints:
// 1 <= pattern.length <= 300
// pattern contains only lower-case English letters.
// 1 <= s.length <= 3000
// s contains only lowercase English letters and spaces ' '.
// s does not contain any leading or trailing spaces.
// All the words in s are separated by a single space.



class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");  //split string into an array

        //check num of the word and num of letter in pattern not equal
        if(words.length != pattern.length())
        {
            return false;
        }
        //store the mappings between the letters in the pattern and the words
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String w = words[i];

            //if a letter is not already in the map add it.
            if(!map.containsKey(ch))
            {
                //if the word already mapped to a letter
                if(map.containsValue(w))
                    return false;

                map.put(ch, w);
            }
            else
            {
                //if the letter is already in the map, check map is correct
                if(!map.get(ch).equals(w))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
