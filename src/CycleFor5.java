public class CycleFor5 {
    public static void main(String[] args) {
        //Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        System.out.print("0,");
        for (int i=1; i<10; i++){
            i++;
            System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");
        }
    }
}
