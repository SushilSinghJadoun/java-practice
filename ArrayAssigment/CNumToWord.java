class CNumToWord{
	static void numToWord(long x){
		String stringtoprint="";
        int tens=(int) (x%100);      x/=100;
        int hundreds=(int) (x%10);   x/=10;
        int thousands=(int) (x%100); x/=100;
        int lakhs=(int) (x%100);     x/=100;
        int crores=(int) (x);
        if(crores!=0){   
            stringtoprint+=inttostring(crores);
            stringtoprint+=" crores ";
        }if(lakhs!=0){   
            stringtoprint+=inttostring(lakhs);
            stringtoprint+=" lakhs ";
        }if(thousands!=0){   
            stringtoprint+=inttostring(thousands);
            stringtoprint+=" thousands ";
        }if(hundreds!=0){   
            stringtoprint+=inttostring(hundreds);
            stringtoprint+=" hundreds ";
        }if(tens!=0){   
            stringtoprint+=inttostring(tens);
            stringtoprint+=".";
        }System.out.println(stringtoprint.trim());
	}
    static String inttostring(int tempno){
        int second=tempno%10;   int first=tempno/10;    String mystring="";
        switch(first){
            case 0: mystring="";        break;
            case 2: mystring="Twenty";  break;
            case 3: mystring="Thirty";  break;
            case 4: mystring="Forty";   break;
            case 5: mystring="Fifty";   break;
            case 6: mystring="Sixty";   break;
            case 7: mystring="Seventy"; break;
            case 8: mystring="Eighty";  break;
            case 9: mystring="Ninty";   break;
            default:
                switch(second){
                    case 0:mystring="Ten";      break;
                    case 1:mystring="Eleven";   break;
                    case 2:mystring="Twelve";   break;
                    case 3:mystring="Thirteen"; break;
                    case 4:mystring="Forteen";  break;
                    case 5:mystring="Fifteen";  break;
                    case 6:mystring="Sixteen";  break;
                    case 7:mystring="Seventeen";break;
                    case 8:mystring="Eighteen"; break;
                    case 9:mystring="Ninteen";  break;
                }
        }
        if(first!=1){
            switch(second){
                case 0:mystring+="";        break;
                case 1:mystring+=" One";     break;
                case 2:mystring+=" Two";     break;
                case 3:mystring+=" Three";   break;
                case 4:mystring+=" Four";    break;
                case 5:mystring+=" Five";    break;
                case 6:mystring+=" Six";     break;
                case 7:mystring+=" Seven";   break;
                case 8:mystring+=" Eight";   break;
                case 9:mystring+=" Nine";    break;
            }
        }    
        return mystring;
    }public static void main(String []args){
        numToWord(1);
    }
}
