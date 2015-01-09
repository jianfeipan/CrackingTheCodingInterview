/*
Given a (decimal - e.g. 3.72) number that is passed in as a string, print the binary representation. If the number can not be represented accurately in binary, print “ERROR”
*/
public class BinaryPrint{
  public static String printBinary(String input){
    int intpart=Integer.parseInt(input.substring(0, input.indexOf(‘.’)));
    double floatpart=Double.parseDouble(input.substring(input.indexOf(‘.’), input.length()));
    String int_string=Integer.toBinaryString(int intpart);
    StringBuffer float_string=new StringBuffer();
    while(floatpart>0){
      if(float_string.length()>32) return "ERROR";
      if(floatpart=1){
        float_string.append((int)floatpart);
        break;
      } 
      double r=floatpart*2;
      if(r>=1){
        float_string.append(1);
        floatpart=r-1;
      }else{
        float_string.append(0);
        floatpart=r;
      }
    }
    return int_string+"."+float_string.toString();
  }
}
