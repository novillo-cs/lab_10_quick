public class Quick {

  /* You must declare variables to track left and right indices,
   * in case your algorithm requires make comparissons with the 
   * original start and end indices.
   * Choose the pivot
   * Iterate over the array until left crosses right:
   *     While arr[left] ≤ pivot, move left forward
   *     While arr[left] > pivot, swap arr[left] with arr[right] and move right backward 
   * Once left ≥ right, swap the pivot (arr[0]) with arr[left].
  */
  public static int partition( int [] data, int start, int end){
    int left = start;
    int right = end;
    return -1;
  }

	
  /* QuickSelect method to find the k-th smallest element
  *  pivot = partition(data, start, end)
  *  if pivot > k - 1
  *    Recursive call to your QuickSelect - parameters: start=?, end=?
  *  else if pivot < k - 1
  *    Recursive call to your QuickSelect - parameters: start=?, end=?
  *  else
  *    Kth element found return  the value [k-1]
  */
  public static int quickSelect(int[] data, int k, int start, int end){
    return -1;
  }
}
