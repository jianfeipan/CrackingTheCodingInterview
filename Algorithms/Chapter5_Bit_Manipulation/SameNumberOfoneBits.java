/*
Given an integer, print the next smallest and next largest number that have the same number of 1 bits in their binary representation.
*/
public class SameNumberOfoneBits{
  public static int[] have thSameNumberOfOneBits(int input){
    int[] result=new int[2];
    int test=1;
    int n=0;
    result[0]=input;
    boolean first1=false;
    boolean first0=false;
    for(int i=0; i<=31;i++){
      if((input&(test<<i))==1){
        n++;
        if(first1==false){
          result[0]=result[0]&(~(test<<i));//turn off the lowest 1 to 0
          first1=true;
        }
      }else{
        if(first0==false){
          result[0]=result[0]|(test<<i);//turn on the lowest 0 to 1
          first0=true;
        }
      }
      

    }
    result[1]=(~0)<<(32-n);
    return result;
  }
}
