class CLength{
  static int length(String s){
    int temp=0;
    try{
      for (int i=0; ;i++ ) {
        s.charAt(i);
        temp++;
      }
    }catch (Exception e) {
    }return temp;
  }public static void main(String[] args) {
    System.out.print(length("Sushil Singh Jadoun"));
  }
}
