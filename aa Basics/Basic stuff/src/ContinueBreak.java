public class ContinueBreak {
    public static void main(String[] args) {
        int[] digs1 = {1,2,3,4,5,10,6,7,8,9};
        for (int i=0; i<digs1.length; i++){
            if (digs1[i]==10){break;}
            else System.out.print(digs1[i]+"-");
        }
        System.out.println("Конец цикла");

        System.out.println("\n========================");
        int[] digs2 = {1,2,37,3,13,4,5,10,6,56,7,8,29,9};
        for (int i=0; i<digs2.length; i++){
            if (digs2[i]>=10) {
                continue;
            }
            else
                System.out.print(digs2[i]+"-");
        }
    }
}
