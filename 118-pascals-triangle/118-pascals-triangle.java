class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> return_list = new ArrayList<List<Integer>>();
        
        List temp = new ArrayList<Integer>();
        List temp2 = new ArrayList<Integer>();
        
        temp.add(1);
        temp2.add(1);
        temp2.add(1);
        
        if(numRows == 1){
            return_list.add(temp);
            return return_list;
        } else if (numRows == 2){
            return_list.add(temp);
            return_list.add(temp2);
            return return_list;
            
        } else {
            return_list.add(temp);
            return_list.add(temp2);
        }
        
        
        for(int i = 2; i < numRows; i++){
            List temporary = return_list.get(i-1);
            List added = new ArrayList<Integer>();
            added.add(1);
            
            for(int j = 0; j < temporary.size()-1; j++){
                int to_be_added = (int)temporary.get(j) + (int)temporary.get(j+1);
                added.add(to_be_added);
            }
            added.add(1);
            
            return_list.add(added);
        }
        
        
        return return_list;
    }
}