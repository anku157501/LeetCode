class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char t;
        while(left<right){
            t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
        
        
    }
}
