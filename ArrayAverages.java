import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    
    for (int[] row: ray)
    {
      double sum = 0;
      
        for(int val: row)
        {
          sum += val;
        }
        System.out.println(sum/ray.length);
        sum++;
    }
  }

  public void columnAverages()
  {
    int[] colAvgs = new int[ray.length];
    for(int[] row: ray)
  {
    int colTrack = 0;
    for(int col: row)
    {
      colAvgs[colTrack] += col;
      colTrack++;
    }

  }
  for(double i: colAvgs)
    {
      System.out.println(i / ray.length);

    }




  }

  public void arrayAverage()
  {
    double sum = 0;
    for(int[] row: ray)
  {

      for(int col: row)
      {
        sum += col;
      }

    }
      System.out.println(Arrays.toString(ray[row]));
    }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

      return "";
  }
}
// #ughigvupits2l82fxthserrs