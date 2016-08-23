package quicksort;

import java.util.Arrays;
import java.util.List;


public class QuickSortHoare {

  public static void quicksort(List<Integer> ar) {
    quicksort(ar, 0, ar.size() - 1);
  }

  private static void quicksort(List<Integer> ar, int lo, int hi) {
    if (lo < hi) {
      int pivot = partition(ar, lo, hi);
      quicksort(ar, lo, pivot);
      quicksort(ar, pivot + 1, hi);
    }
  }

  private static int partition(List<Integer> ar, int lo, int hi) {
    int i = lo;
    int pivot = ar.get(lo);
    int j = hi;
    while (true) {
      while (ar.get(i) < pivot) {
        i++;
      }
      while (ar.get(j) > pivot) {
        j--;
      }
      if (i >= j) {
        return j;
      }
      int t = ar.get(i);
      ar.set(i, ar.get(j));
      ar.set(j, t);
    }
  }

  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(5, 7, 1, 4, 8, 2, 6, 0);
    QuickSortHoare.quicksort(l);
    System.out.println(l);
  }

}
