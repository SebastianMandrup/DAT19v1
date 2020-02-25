import java.util.*;

public class TicTacToe2{
   boolean[][] placedX = new boolean[3][3];
   boolean[][] placedO = new boolean[3][3];
   boolean isPlaying = true;

   
   public void play(){
      while(isPlaying){
         displayBoard();
         yourTurn();
         if(allPlaced()){
            break;
         }
         botTurn();
         if(allPlaced()){
            break;
         }
         checkWinner();
      }
      displayBoard();
   }
   
   private void displayBoard(){
      System.out.println(symbol(0,2) + "|" + symbol(1,2) + "|" + symbol(2,2));
      System.out.println("-----");
      System.out.println(symbol(0,1) + "|" + symbol(1,1) + "|" + symbol(2,1));
      System.out.println("-----");
      System.out.println(symbol(0,0) + "|" + symbol(1,0) + "|" + symbol(2,0));
   }
   
   private char symbol(int x, int y){
      if(placedX[x][y]){return 'x';}
      else if(placedO[x][y]){ return 'o';}
      else{return ' ';}
   }
   
   private void yourTurn(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("input your next x value (0-2)");
      int x = scanner.nextInt();
      if(x < 0){x = 0;}
      else if(x > 2){x = 2;}
      System.out.println("input your next y value (0-2)");
      int y = scanner.nextInt();
      if(y < 0){y = 0;}
      else if(y > 2){y = 2;}
      if(placeX(x,y) == false){
         yourTurn();
      }
   }
   
   private void botTurn(){
      int x = getRandom();
      int y = getRandom();
      if(!placeO(x,y)){
         botTurn();
      }
   }
   
   private int getRandom(){
      Random random = new Random();
      return random.nextInt(3); //returns 0-2
   }
   
   private boolean placeX(int x, int y){
      if(!placedO[x][y] && !placedX[x][y]){placedX[x][y] = true; return true;}
      return false;
   }
   
   private boolean placeO(int x, int y){
      if(!placedX[x][y] && !placedO[x][y]){placedO[x][y] = true; return true;}
      return false;
   }
   
   private void checkWinner(){
      for(int i = 0; i < 3; i++){
         if( (placedX[i][0] && placedX[i][1] && placedX[i][2]) || (placedX[0][i] && placedX[1][i] && placedX[2][i]) ||
         (placedX[0][0] && placedX[1][1] && placedX[2][2]) || (placedX[0][2] && placedX[1][1] && placedX[2][0]) ){
            System.out.println("YOU WON!");
            isPlaying = false;
         } else if((placedX[i][0] && placedX[i][1] && placedX[i][2]) || (placedX[0][i] && placedX[1][i] && placedX[2][i]) ||
         (placedX[0][0] && placedX[1][1] && placedX[2][2]) || (placedX[0][2] && placedX[1][1] && placedX[2][0]) ){
            System.out.println("YOU LOST");
            isPlaying = false;
         }
      }
   }
   
   private boolean allPlaced(){
      for(int i = 0; i < 3; i++){
         if( (!placedX[i][0] && !placedO[i][0]) || (!placedX[i][1] && !placedO[i][1] ) || (!placedX[i][2] && !placedO[i][2]) ){
            return false;
         }
      }
      System.out.println("TIE!");
      return true;
   }
}