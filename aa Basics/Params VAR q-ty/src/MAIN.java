public class MAIN {
    static int mxsum (int ...nums){          //nums - массив. С "..." рандомное кол-во пар-ров. Можно и не передавать
        int sum = 0;
        for (int x: nums)
            sum+=x;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(mxsum(3,4,5));
    }
}
