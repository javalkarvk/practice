package samplepackage;

public class CircularMatrix {
	public static void main(String[] args) {
		int row=10, col=10;
		int a[][] = new int[row][col];
		spiralFill(row,col,a);
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] spiralFill(int rowEnd,int colEnd, int[][] mat) {
		int val=1;
		int rowStart=0, colStart=0;
		while(rowStart<rowEnd && colStart<colEnd) {
			for (int i=colStart;i<colEnd;++i) {
				mat[rowStart][i]=val++;
			}
			rowStart++;
			
			for (int i=rowStart;i<rowEnd;++i) {
				mat[i][colEnd-1]=val++;
			}
			colEnd--;

			for (int i=colEnd-1;i>=colStart;--i) {
				mat[rowEnd-1][i]=val++;
			}
			rowEnd--;

			for (int i=rowEnd-1;i>=rowStart;--i) {
				mat[i][colStart]=val++;
			}
			colStart++;
		}
		return mat;
	}
}
