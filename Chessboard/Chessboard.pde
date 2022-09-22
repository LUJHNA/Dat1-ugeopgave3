int[][] board = new int[8][8];

void setup(){
  size(320,320);
  for(int i = 0; i<board.length; i++){
    for(int j = 0; j<board.length; j++){
      if((i % 2 == 0) == (j % 2 == 0)){
        board[i][j] = 1;
      } 
        else {
        board[i][j] = 0;
        
        
          }
         
        }
      }
    }
 void draw(){
 int sideLength = 40;
   for(int i = 0; i<board.length; i++){
     for(int j = 0; j<board.length; j++){
       if(board[i][j] == 0) {
         fill(0);
       } else {
         fill(255);
       }
     rect(j*sideLength, i*sideLength, sideLength, sideLength);
   
       }  
      }
     }
 
