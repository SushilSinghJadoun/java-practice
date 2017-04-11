class CCountDigitInString{
  static int countDigitInString(String s){
    int temp=0;
    for (int i=0;i<s.length() ;i++ )
      if(s.charAt(i)>='0'&&s.charAt(i)<='9')
        temp++;
    return temp;
  }public static void main(String[] args) {
    System.out.print(countDigitInString("sushil123123123"));
  }
}
