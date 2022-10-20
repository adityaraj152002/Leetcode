class Solution {
    public String intToRoman(int num) {
        String s="";
        if(num/1000>0){
            for(int i=0;i<num/1000;i++)
                s=s+"M";
        }
        if((num%1000)/100>0&&(num%1000)/100<4){
             for(int i=0;i<(num%1000)/100;i++)
                s=s+"C";
        }
        if((num%1000)/100==4){
                s=s+"CD";
        }
        if((num%1000)/100>4&&(num%1000)/100<9){
              s=s+"D";
             for(int i=0;i<(num%1000)/100-5;i++)
                s=s+"C";
        }
        if((num%1000)/100==9){
                s=s+"CM";
        }
        
        
        if((num%100)/10>0&&(num%100)/10<4){
            for(int i=0;i<(num%100)/10;i++)
                s=s+"X";
         }
        if((num%100)/10==4){
                s=s+"XL";
        }
        if((num%100)/10>4&&(num%100)/10<9){
            s=s+"L";
            for(int i=0;i<(num%100)/10-5;i++)
                s=s+"X";
         }
        if((num%100)/10==9){
                s=s+"XC";
        }
         
        
        if(num%10>0 && num%10<4){
            for(int i=0;i<num%10;i++)
                s=s+"I";
         }
        if(num%10==4){
                s=s+"IV";
        }
        if(num%10>4 && num%10<9){
            s=s+"V";
            for(int i=0;i<num%10-5;i++)
                s=s+"I";
         }
        if(num%10==9){
                s=s+"IX";
        }
        return s;
    }
}
