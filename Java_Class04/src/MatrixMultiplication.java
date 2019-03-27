//2D Arrays
public class MatrixMultiplication {
	
	
	public static void main(String[] args) {
		//2X2 matrix
        int r01 = 2; 
        int c01 = 2;
        int r02 = 2; 
        int c02 = 2;
        int[][] Matrix01 = { {5, -2}, {3, 7} };
        int[][] Matrix02 = { {1, 7}, {-9, 2} };

        
        int[][] multiplication = new int[r01][c02];
        for(int i = 0; i < r01; i++) {
            for (int j = 0; j < c02; j++) {
                for (int k = 0; k < c01; k++) {
                    multiplication[i][j] += Matrix01[i][k] * Matrix02[k][j];
                }
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int[] row : multiplication) {
            for (int column : row) {
                System.out.print(column + "");
                System.out.print(row + "");
            }
             }
    }

	
	
	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
	
}
