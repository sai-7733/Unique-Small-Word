import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        int min=Integer.MAX_VALUE;
        String k="";
        for(int i=0;i<a.length;i++){
            int c=0;
            int d=0;
            for(int j=0;j<a.length;j++){
                if(a[i].equals(a[j])){
                    d++;
                }
            }
            if(d==1){
                c=a[i].length();
                if(c<=min){
                    min=c;
                    k=a[i];
                }
            }
        }
        System.out.print(k);
    }
}