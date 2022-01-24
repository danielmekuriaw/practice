class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> xcter = new ArrayList<Character>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            xcter.add(s.charAt(i));
        }
        
        for(int k = 0; k < t.length(); k++){
            if(!xcter.contains(t.charAt(k))){
                return false;
            }
            
            xcter.remove(xcter.indexOf(t.charAt(k)));
        }
                
        return true;
    }
}