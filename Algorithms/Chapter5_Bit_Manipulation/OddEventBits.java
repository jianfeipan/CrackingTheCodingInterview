/*交换奇数和偶数位Write a program to swap odd and even bits in an integer with as few instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).*/
public class OddEventBits{
  public static int swapOddEvenBits(int input){
    return ( ((input&0xaaaaaaaa)>>1) | ((input&0x55555555)<<1) );
  }
}
