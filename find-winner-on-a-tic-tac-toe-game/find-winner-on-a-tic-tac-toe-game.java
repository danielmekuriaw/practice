class Solution {
    public String tictactoe(int[][] move) {
        boolean done = true;
        
        char[][] moves = {{'E', 'E', 'E'}, {'E', 'E', 'E'}, {'E', 'E', 'E'}};
        
        char temp = 'X';
        
        for(int[] m : move){
            moves[m[0]][m[1]] = temp;
            
            if (temp == 'X'){
                temp = 'O';
            } else {
                temp = 'X';
            }
        }
        
        // Diagonal Wins
        if (moves[0][0] == 'O' && moves[1][1] == 'O' && moves[2][2] == 'O'){
            return "B";
            
        } else if (moves[0][0] == 'X' && moves[1][1] == 'X' && moves[2][2] == 'X'){
            return "A";
            
        } else if (moves[2][0] == 'O' && moves[1][1] == 'O' && moves[0][2] == 'O'){
            return "B";
            
        } else if (moves[2][0] == 'X' && moves[1][1] == 'X' && moves[0][2] == 'X'){
            return "A";
            
        }
        
        // Checking for horizontal/vertical wins
        for(int i = 0; i < 3; i++){
            
            if (moves[i][0] == 'O' && moves[i][1] == 'O' && moves[i][2] == 'O'){
                return "B";
                
            } else if (moves[i][0] == 'X' && moves[i][1] == 'X' && moves[i][2] == 'X'){
                return "A";
                
            } else if (moves[0][i] == 'O' && moves[1][i] == 'O' && moves[2][i] == 'O'){
                return "B";
                
            } else if (moves[0][i] == 'X' && moves[1][i] == 'X' && moves[2][i] == 'X'){
                return "A";
                
            }
            
            if (moves[i][0] == 'E' || moves[i][1] == 'E' || moves[i][2] == 'E'){
                done = false;
            }
            
        }
        
        // Checking for pending and draw conditions
        if (done == false){
            return "Pending";
        } else {
            return "Draw";
        }
        
    }
}