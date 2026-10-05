public class Fibonacci{
    public static void main(String args[]){
        int i=0, a=0, b=1, c=0;

        System.out.print("Serie con for: ");
        for(i=0; i<10; i++){
            if (i<9){
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
        }

        System.out.println("");
        System.out.print("Serie con while: ");

        int i1=0, a1=0, b1=1, c1=0;
        while(i1<10){
            if (i1<9){
                System.out.print(a1 + ", ");
                c1 = a1 + b1;
                a1 = b1;
                b1 = c1;
            } else {
                System.out.println(a1);
            }
            i1++;
        }

        System.out.println("");
        System.out.print("Serie con do while: ");
        int i2=0, a2=0, b2=1, c2=0;
        do{
            if (i2<9){
                System.out.print(a2 + ", ");
                c2 = a2 + b2;
                a2 = b2;
                b2 = c2;
            } else {
                System.out.println(a2); 
            }
            i2++;
        } while (i2<10);

    }

}