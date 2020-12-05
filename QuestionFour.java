public class QuestionFour {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 1, 4}, {-18, -3, 4, 2}, {3, 18, 10, -34}, {-4, 1, 1, 7}};
        System.out.println(maxSubMatrix(matrix));
    }

    public static int maxSubMatrix(int[][] matrix){
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[][] startingSum = new int[rowLength + 1][columnLength];

        for(int i = 0; i < rowLength; i++){
            for (int j = 0; j < columnLength; j++)
                startingSum[i + 1][j] = startingSum[i][j] + matrix[i][j];
        }

        int bigSum = -1;
        int smallSum = Integer.MIN_VALUE;
        int negRow = 0, negCol = 0;
        int rowStart = 0, rowEnd = 0, colStart = 0, colEnd = 0;
        for(int i = 0; i < rowLength; i++){
            for (int row = i; row < rowLength; row++){
                int sum = 0;
                int curColStart = 0;
                
                for(int col = 0; col < columnLength; col++){
                    sum += startingSum[row + 1][col] - startingSum[i][col];
                    if(sum < 0) {
                        if(smallSum < sum){
                            smallSum = sum;
                            negRow = row;
                            negCol = col;
                        }
                        sum = 0;
                        curColStart = col + 1;
                    }
                    else if(bigSum < sum){
                        bigSum = sum;
                        rowStart = i;
                        rowEnd = row;
                        colStart = curColStart;
                        colEnd = col;
                    }
                }
            }
        }

        if (bigSum == -1){
            System.out.println("From row #" + negRow + " to row #" + negRow);
            System.out.println("From column #" + negCol + " to column #" + negCol);
        }
        else {
            System.out.println("From row #" + rowStart + " to row #" + rowEnd);
            System.out.println("From column #" + colStart + " to column #" + colEnd);
        }
        return bigSum == -1 ? smallSum : bigSum;
    }
}
