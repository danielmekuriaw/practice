class Solution {
    public List<String> letterCombinations(String digits) {
        String[][] numbers_letters = {{"a", "b", "c"},
                                      {"d", "e", "f"},
                                      {"g", "h", "i"},
                                      {"j", "k", "l"},
                                      {"m", "n", "o"},
                                      {"p", "q", "r", "s"},
                                      {"t", "u", "v"},
                                      {"w", "x", "y", "z"}};
        
        
        List<String> returned_string = new ArrayList();
        
        if (digits.isEmpty()){
            return returned_string;
            
        } else{
            
            if(digits.length() == 1){
                int char_num = Character.getNumericValue(digits.charAt(0));
                String[] single_char = numbers_letters[char_num-2];
                
                for(String sc: single_char){
                    returned_string.add(sc);
                }
                
            } else if (digits.length() == 2){
                int char_num0 = Character.getNumericValue(digits.charAt(0));
                int char_num1 = Character.getNumericValue(digits.charAt(1));
                
                String[] first_char = numbers_letters[char_num0-2];
                String[] second_char = numbers_letters[char_num1-2];
                
                for(String fc: first_char){
                    for (String sc : second_char){
                        returned_string.add(fc.concat(sc));
                    }
                }
                
            } else if (digits.length() == 3){
                int char_num0 = Character.getNumericValue(digits.charAt(0));
                int char_num1 = Character.getNumericValue(digits.charAt(1));
                int char_num2 = Character.getNumericValue(digits.charAt(2));
                
                String[] first_char = numbers_letters[char_num0-2];
                String[] second_char = numbers_letters[char_num1-2];
                String[] third_char = numbers_letters[char_num2-2];
                
                for(String fc: first_char){
                    for (String sc : second_char){
                        for(String tc : third_char){
                            returned_string.add(fc.concat(sc.concat(tc)));
                        }
                    }
                }
                
            } else if (digits.length() == 4){
                
                int char_num0 = Character.getNumericValue(digits.charAt(0));
                int char_num1 = Character.getNumericValue(digits.charAt(1));
                int char_num2 = Character.getNumericValue(digits.charAt(2));
                int char_num3 = Character.getNumericValue(digits.charAt(3));
                
                String[] first_char = numbers_letters[char_num0-2];
                String[] second_char = numbers_letters[char_num1-2];
                String[] third_char = numbers_letters[char_num2-2];
                String[] fourth_char = numbers_letters[char_num3-2];
                
                for(String fc: first_char){
                    for (String sc : second_char){
                        for(String tc : third_char){
                            for(String frc : fourth_char){
                                returned_string.add(fc.concat(sc.concat(tc.concat(frc))));
                            }
                        }
                    }
                }
                
            }
            
            return returned_string;
            
        }     
    }
}