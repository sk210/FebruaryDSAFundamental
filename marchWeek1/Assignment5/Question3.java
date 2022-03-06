package marchWeek1.Assignment5;

public class Question3 {

	public static void main(String[] args){
        // TODO Auto-generated method stub
        int[][] spiralMatrix= {
                { 1, 2, 34, 4, 5},
                { 6, 34, 2, 12, 31},
                { 123, 454, 35, 2, 314}
        };
        int minRow = 0;
        int minCol = 0;
        int maxRow = spiralMatrix.length-1;
        int maxCol = spiralMatrix[0].length-1;;
        int count = 0;
        int totalNoOfElements = 3*5;//row=3 n columns=5

        while(count < totalNoOfElements){
  
            for(int i = minRow, j = minCol;i <= maxRow && count < totalNoOfElements; i++){
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            minCol++;

           
            for(int j = minCol, i = maxRow; j <= maxCol && count < totalNoOfElements; j++){//minColumn will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            maxRow--;

            
            for(int i = maxRow, j = maxCol; i >= minRow && count < totalNoOfElements; i--){//maxCOl will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            maxCol--;

            
            for(int j=maxCol, i = minRow; j >= minCol && count < totalNoOfElements; j--){//minRow will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            minRow++;
        }
	}
}
