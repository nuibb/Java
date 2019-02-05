public class Main {

    public static void main(String[] args) {
    String s = "a1b2c3d4";
    String s1="";
    String s2="";
    char ch;
    for(int i=0;i<s.length();i++){
    ch= s.charAt(i);
    if(ch>=97 && ch<=122){
        s1=s1+ch;
    }
    else
        s2=s2+ch;
    }
    System.out.println(s1+s2);
    }

}



## Without any extra memory

        String s="a1b2c3d4e5";
        int a=s.length();//initial length of initial string
        for(int i=0;i<a;i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                s+=s.charAt(i);
            }
            else {
                System.out.print(s.charAt(i));
            }
        }
        for(int i=a;i<s.length();i++){
        System.out.print(s.charAt(i));
