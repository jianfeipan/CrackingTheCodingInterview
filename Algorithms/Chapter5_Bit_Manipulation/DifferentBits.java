/*Write a function to determine the number of bits required to convert integer A to integer B.
Input: 31, 14
Output: 2*/
public class DifferentBits{
  public static int numberOfDifferentbits(int a, int b){
    int count=0;
    int c=a^b;
    for(c;c!=0;c=c>>1){
      count+=c&1;
    } 
    return count;
}
