public class MyHeap {
  private static void pushDown(int[] data, int size, int index) {
    if (size <= index*2+1) {
      return;
    }
    if (size != index*2+2) {
      if (data[index*2+1] > data[index*2+2]) {
        if (data[index*2+1] > data[index]) {
          int temp = data[index];
          data[index] = data[index*2+1];
          data[index*2+1] = temp;
          pushDown(data,size,index*2+1);
        }
      }
      else {
        if (data[index*2+2] > data[index]) {
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
  private static void remove(int[] data, int size) {
    int temp = data[0];
    data[0] = data[size-1];
    data[size-1] = temp;
    pushDown(data,size-1,0);
  }
  public static void heapify(int[] data) {
    for (int x = (int)Math.pow(2,(int)(Math.log(data.length)/Math.log(2)))-2; x >= 0; x--) {
      pushDown(data,data.length,x);
    }
  }
  public static void heapsort(int[] data) {
    heapify(data);
    for (int x = data.length; x > 0; x--) {
      remove(data,x);
    }
  }
}
