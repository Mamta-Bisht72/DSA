class Solution {
public:
    bool isIsomorphic(string str1, string str2) {
      if(str1.length()!=str2.length()) return false;
        unordered_map<char,char> mp, kp;
        int flag=1, flag2=1;
        for(int i=0, j=0;i<str2.length();i++, j++){
            if(mp.find(str2[i])==mp.end())
            mp[str2[i]]=str1[j];
            else if(mp[str2[i]]!=str1[j]) flag=0;
        }
         for(int i=0, j=0;i<str1.length();i++, j++){
            if(kp.find(str1[i])==kp.end())
            kp[str1[i]]=str2[j];
            else if(kp[str1[i]]!=str2[j]) flag2=0;
        }
        if(flag and flag2) return true;
        else return false;   
    }
};