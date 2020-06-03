class Solution {
    public String frequencySort(String s) {
        char[] a=s.toCharArray();
        int[] b=new int[s.length()];
        int c,t=0;
        char tc,r;
        String ss="";
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                
                    if(a[i]==a[j]){
                        for(int k=i;k<j;k++){
                            if(a[i]!=a[k])
                        {
                        r=a[j];
                    a[j]=a[k];
                    a[k]=r;}}
                }
            }
        }
        for(int i=0;i<s.length();i++){
	        c=0;
	        for(int j=0;j<s.length();j++){
	            if(a[i]==a[j])
	            c++;
	        }
	        b[i]=c;
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i-1;j++){
                if(b[j]<b[j+1]){
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                    //char array sorting
                    tc=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tc;
                }
            }
        }
        
        for(int i=0;i<s.length();i++){
            ss=ss+a[i];
        }
        return ss;
        
    }
}


//32 / 35 test cases passed.
//Status: Time Limit Exceeded
//Submitted: 0 minutes ago
