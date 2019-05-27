package com.eightqueens;

public class MyEightQueens {
    private static int[][] chessBoard = new int[8][8];
    private static int totalSolutionCount = 0;

    public static void findToPlaceQueen(int row) {
        if (row > 7) {
            totalSolutionCount++;
            printChessBordWithQueen();
            return;
        } else {
            for (int column = 0; column < 8; column++) {
                if (checkQueenLocation(row, column)) {
                    chessBoard[row][column] = 1;
                    findToPlaceQueen(row + 1);
                    chessBoard[row][column] = 0;
                }
            }
        }

    }

    public static void printChessBordWithQueen() {
        System.out.println("这是八皇后的问题的第" + totalSolutionCount + "种解法：");
        for (int i = 0; i < 8; i++) {
            StringBuffer oneLine = new StringBuffer();
            for (int j = 0; j < 8; j++) {
                String symbolToPut = "+  ";
                if (chessBoard[i][j] == 1) {
                    symbolToPut = "Q  ";
                }
                if (j == 7) {
                    symbolToPut = symbolToPut.trim();
                }
                oneLine.append(symbolToPut);
            }
            System.out.println(oneLine);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        findToPlaceQueen(0);
        System.out.println(totalSolutionCount);
    }

    private static boolean checkQueenLocation(int row, int column) {
        // 检查左对角线
        for (int rowToCheck = row - 1, columnToCheck = column - 1;
             rowToCheck >= 0 && columnToCheck >= 0; rowToCheck--, columnToCheck--) {
            if (chessBoard[rowToCheck][columnToCheck] == 1) {
                return false;
            }
        }
        // 检查右对角线
        for (int rowToCheck = row - 1, columnToCheck = column + 1;
             rowToCheck >= 0 && columnToCheck <= 7; rowToCheck--, columnToCheck++) {
            if (chessBoard[rowToCheck][columnToCheck] == 1) {
                return false;
            }
        }
        // 检查行和列（其实是检查列）因为程序是按行运行的 不会出现一行两个的情况
        for (int rowToCheck = row - 1; rowToCheck >= 0; rowToCheck--) {
            if (chessBoard[rowToCheck][column] == 1) {
                return false;
            }
        }
        return true;
    }
}
