    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int l1=a.length();
        int first[]=new int[l1];
        // Complete the function by writing your code here.
        for(int i=0;i<l1;i++){
            first[i]=0;
        }
        int l2=b.length();
        if(l2==l1){
            for(int i=0;i<l2;i++){
                char ch=b.charAt(i);
                for(int j=0;j<l1;j++){
                    char cy=a.charAt(j);
                    if(ch==cy && first[j]==0){
                        first[j]++;
                        break;
                    }
                }
            }
            int flag=0;
            for(int i=0;i<l1;i++){
                if(first[i]==0){
                    flag++;
                }
            }
            if(flag==0){
                return true;
            }
        }
        return false;
    }