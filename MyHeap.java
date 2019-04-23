public class MyHeap {
  private static void pushDown(int[] data, int size, int index) {
    if (size <= index*2+1) {
      return;
    }
    if (size != index*2+2) {
      if (data[index*2+1] > data[index*2+2]) {
        if (data[index*2+1] > data[index] {
          int temp = data[index];
          data[index] = data[index*2+1];
          data[index*2+1] = temp;
          pushDown(data,size,index*2+1);
        }
      }
      else {
        if (data[index*2+2] > data[index] {
          int temp = data[index];
          data[index] = data[index*2+2];
          data[index*2+2] = temp;
          pushDown(data,size,index*2+2);
        }
      }
    }
    else {
      if (data[index*2+1] > data[index]) {
        int temp = data[index];
        data[index] = data[index*2+1];
        data[index*2+1] = temp;
      }
    }
  }
  public static void heapify(int[] data) {
  }
  public static void heapsort(int[] data) {
  }
}
