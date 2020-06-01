class Solution {
    public int firstUniqChar(String s) {
        int i=0,j=0;
        char c[]=s.toCharArray();
        for(i=0;i<s.length();i++){
            for (j=0;j<s.length();j++){
                if(c[i]==c[j]&&i!=j)
                    break;
            }
                if(j==s.length())
                    return i;
        }
                return -1;
        
    }
}
