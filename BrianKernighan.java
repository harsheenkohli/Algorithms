public class BrianKernighan {
  public static int countSetBits (int n) {
    int res = 0;
    while (n > 0) {
      n = n & (n - 1);
      res++;
    }
    return res;
  }
}

// n & (n - 1) inverts first set bit and trailing zeroes
// jab sab 1 inverted honge toh n == 0 ho jaayega
