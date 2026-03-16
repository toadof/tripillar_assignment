//LeetCode 387 – First Unique Character in a String (Easy)
class Solution {
    public int firstUniqChar(String s) {
        int t[]=new int[26];
        for(int j=0;j<s.length();j++)
            t[s.charAt(j)-'a']++;
         for(int j=0;j<s.length();j++)
            if(t[s.charAt(j)-'a']==1)
          return j;
           

return -1;
    }
}