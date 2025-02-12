public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    ArrayAverages twoDee = new ArrayAverages(ray);

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
