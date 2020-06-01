class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] c=J.toCharArray();
        char[] c2=S.toCharArray();
        int a=0;
        for(int i=0;i<J.length();i++){
            for(int j=0;j<S.length();j++){
                if(c[i]==c2[j])
                    a++;           
        }}
            return a;
        
        
    }
}
