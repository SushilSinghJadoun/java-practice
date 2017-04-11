class CCompare{
  static int compare(String s1,String s2){
    int asciis1,asciis2,shortlength=0;
    if(s1.length()<=s2.length())
      shortlength=s1.length();
    else if(s1.length()>s2.length())
      shortlength=s2.length();
    for (int i=0;i<shortlength;i++)
      if(s1.charAt(i)!=s2.charAt(i)){
        asciis1=s1.charAt(i);
        asciis2=s2.charAt(i);
        return asciis1-asciis2;
      }return s1.length()-s2.length();
  }public static void main(String[] args) {
    System.out.print(compare("sushil","sushil"));
  }
}
