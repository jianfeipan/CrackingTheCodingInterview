/*
Given an integer, print the next smallest and next largest number that have the same number of 1 bits in their binary representation.
*/
public class SameNumberOfoneBits{
  public static int[] have thSameNumberOfOneBits(int input){
    int[] result=new int[2];
    int test=1;
    int n=0;
    for(int i=0; i<=31;i++){
      if((input&(test<<i))==1)
        n++;
    }
    result[0]=(~0)>>(31-n);
    result[1]=(~0)<<(31-n);
    return result;
  }
}
