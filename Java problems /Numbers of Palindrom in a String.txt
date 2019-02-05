public class JavaApplication2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcbaaa");      
          System.out.println(sb);
         
          int s=0;
          
        for(int i=0;i<sb.length()-1;i++){
            for(int j=i+2; j<=sb.length();j++){
                String s1,s2;
                
                s1=sb.substring(i,j);
                StringBuffer sb1 = new StringBuffer(s1);
                sb1.reverse();
                s2=sb1.toString();
                System.out.println(s1+"  "+sb1);
                if(s1.equals(s2)){
                    s++;
                }                        
            }      
        }
        System.out.println("No. of palinddrom = "+s);  
    }
}