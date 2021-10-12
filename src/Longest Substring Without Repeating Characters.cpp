class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char,int> mapp;
        int right = 0,left =0;
        int len = 0;
       int n = s.size();
        while(right<n){
            if(mapp.find(s[right])!=mapp.end()){
                left = max(left,mapp[s[right]]+1);
            }
            mapp[s[right]] = right;
            
            len = max(len,right-left+1);
            
            right++;
        }
        return len;
    }
};