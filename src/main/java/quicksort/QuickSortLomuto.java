package quicksort;

import java.util.Arrays;
import java.util.List;

public class QuickSortLomuto {

  public static void quicksort(List<Integer> ar) {
    quicksort(ar, 0, ar.size() - 1);
  }

  private static void quicksort(List<Integer> ar, int lo, int hi) {
    if (lo < hi) {
      int i = partition(ar, lo, hi);
      quicksort(ar, lo, i - 1);
      quicksort(ar, i+1, hi);
    }
  }

  private static int partition(List<Integer> ar, int lo, int hi) {
    int i = lo;
    int p = ar.get(hi);
    for(int j = lo; j < hi-1; j++) {
      int cur = ar.get(j);
      if (cur <= p) {
        ar.set(j, ar.get(i));
        ar.set(i, cur);
        i++;
      }
    }
    ar.set(hi, ar.get(i));
    ar.set(i, p);
    return i;
  }

  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(5,7,1,4,8,2,6,0);
    QuickSortLomuto.quicksort(l);
    System.out.println(l);
  }
}
