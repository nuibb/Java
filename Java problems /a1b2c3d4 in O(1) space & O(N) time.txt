
package javaapplication6;
class Main{  
    public static void main(String[] args) {
      String string = "a1b2c3d4e5f6g7h8";
		char[] str = string.toCharArray();
		char temp;
		int i = 1,j;
		int swapcount = 0;
		while (i < str.length/2){
			//int j = (i - i/2*2)*(str.length/2) + i/2;
                    if(i%2==0)
                        j=i/2;
                    else 
                        j=str.length/2+i/2;
                    while (i!=j) {
                        System.out.print(i+" "+j+" ");
                        System.out.println(str);
                        temp = str[j];
			str[j]=str[i];
			str[i]=temp;
			swapcount++;
			//j = (j - j/2*2)*(str.length/2) + j/2;
                        if(j%2==0)
                            j=j/2;
                        else 
                            j=str.length/2+j/2;          
                    }
                    while (str[i]<'0' || str[i] > '9') {
                       // swapcount++;
                        i++;
                    }
                }
		System.out.println(str);
		System.out.println("Swap count: " + swapcount);
	}
}
