import java.lang.Math;
class CBinaryToDecimal{
  static int binaryToDecimal(String s){
    int digitalno=0;
    for(int i=s.length()-1,j=0 ;i>=0 ;i--,j++ )
      if(s.charAt(i)=='1')
        digitalno+=Math.pow(2,j);
    return digitalno;
  }public static void main(String[] args) {
    System.out.print(binaryToDecimal("100111"));
  }
}
