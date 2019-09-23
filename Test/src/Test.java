public class Test {
        public static void main(String[] args) {
            //获取一个数二进制序列中的偶数位和奇数位并输出
            numEvenOdd(10);
        }
        public static void numEvenOdd(int num){
            //奇数位
            for(int i = 0;i <= 30; i += 2) {
                System.out.print(( num >> i ) & 1);
            }
            System.out.println();
            //偶数位
            for(int i = 1; i <= 31; i += 2){
                System.out.print((num >> i) & 1);
            }
        }
}
