package Banking;

public class Main
{
	public static void main(String[] args) {
		method2();
	}
	
	static void method2(){
	    int a[] = {34,67,23,45,69,30};
    int i;
    for(i=0;i<6;i++){
        System.out.print(a[i] + " ");
    }
    int p=a[0];
    for(i=0;i<5;i++){
        a[i] = a[i+1];
    }
    a[5] =p;
    System.out.println();
     for(i=0;i<6;i++){
         System.out.print(a[i] + " ");
    }
	}
}
