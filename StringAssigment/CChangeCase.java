class CChangeCase{
  static String changeCase(String s){
    StringBuffer sb=new StringBuffer();
    int ascii; char character;
    for (int i=0;i<s.length();i++) {
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        ascii=s.charAt(i)-32;
        character=(char)ascii;
        sb.append(character);
      }else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
        ascii=s.charAt(i)+32;
        character=(char)ascii;
        sb.append(character);
      }else
        sb.append(s.charAt(i));
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print(changeCase("SuShIl SiNgH JADoun"));
  }
}
