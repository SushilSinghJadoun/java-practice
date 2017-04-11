class CTriangle2{
  static void triangle2(String s){
    for(int i=s.length()-1;i>=0;i--){
      for (int j=0;j<=i ;j++ )
        System.out.print(s.charAt(j));
      System.out.println();
    }
  }
  public static void main(String[] args) {
    triangle2("Sushil");
  }
}
