class CTriangle3{
  static void triangle3(String s){
    for(int i=0;i<s.length();i++){
      for(int j=0;j<i;j++)
        System.out.print(" ");
      for (int j=i;j<s.length();j++ )
        System.out.print(s.charAt(j));
      System.out.println();
    }
  }
  public static void main(String[] args) {
    triangle3("Sushil");
  }
}
