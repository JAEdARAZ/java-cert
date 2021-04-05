package arraysMultiD;

public class MainArraysMultiD {
    public static void main(String[] args){
        //valid initializations: int[]a[], int[][]a, int a[][]
        int[][] array2D = new int[3][];

        //last dimensions can be not specified (not intermediate ones - new int[][3] INVALID)
        array2D[0] = new int[]{1};
        array2D[1] = new int[]{1,2};
        array2D[2] = new int[]{1,2,3};

        for (int[] ints : array2D) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            System.out.println("--------------");
        }

        //the abbreviate initialization {1,2,3} can't be used for arrays with undetermined positions
        int[][] x = new int[2][];
        x[0] = new int[]{1,2,3};
        //x[1] = {4,5,6}; //compilation error
    }
}
