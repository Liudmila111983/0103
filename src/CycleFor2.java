public class CycleFor2 {
    public static void main(String[] args) {
        //Счетчик имеется только у одного человека
        //При этом первый поднимается вверх, а второй спускается вниз
        for (int i=0; i<10; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(9 - i);
            //for (int i=9; i>=0; j++); //100
            //i=0 9
            //i=1 8
            //i=2 7
            //i j?
            //i+j=9 j=9-i
        }
        //for (int i=0; j=9; i<10; i++; j--);
        //System.out.print(i);
        //System.out.print(" ");
        //System.out.println(9 - i);
    }
}
