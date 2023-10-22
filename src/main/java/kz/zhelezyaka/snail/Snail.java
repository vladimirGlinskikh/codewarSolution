package kz.zhelezyaka.snail;

public class Snail {
    public static int[] snail(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[] result = new int[rows * columns];
        int index = 0;

        int rowStart = 0;
        int rowEnd = array.length - 1;
        int columnStart = 0;
        int columnEnd = array[0].length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                result[index++] = array[rowStart][i];
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result[index++] = array[i][columnEnd];
            }
            columnEnd--;

            if (rowStart <= rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    result[index++] = array[rowEnd][i];
                }
                rowEnd--;
            }

            if (columnStart <= columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--)
                    result[index++] = array[i][columnStart];
                columnStart++;
            }
        }
        return result;
    }
}
