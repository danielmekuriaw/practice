class Solution {
    public int firstUniqChar(String s) {

        
        
        for(int i = 0; i < s.length(); i++){
            StringBuilder MyString = new StringBuilder(s);   
            
            char c = MyString.charAt(i);
            StringBuilder temp = MyString.deleteCharAt(i);
            if (temp.indexOf(Character.toString(c)) == -1){
                return i;
            }
        }
        
        return -1;
    }
}