package exercicios;

import java.util.ArrayList;

public class ArrayDeLista {
	
	Metro metro = new Metro();
	  
    public void test1() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    list.add(new int[] {2,5});
    }
    

}

class Metro {
    int total;
  
  public int countPassengers(ArrayList<int[]> stops) {
    
    for(int[] e : stops) {
      int[] a = stops.get(stops.indexOf(e));
      
      int A = a[0];
      int B = a[1];
      
      total = total + A;
      total = total - B;
    }
    
    return total;
  }
}
