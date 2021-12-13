public class ATM {

    public static void main(String[] args) {
        //System.out.println(countBanknotes(756));
    }
    public  int countBanknotes(int sum){
        int res = 0;

        if(sum/500 > 0) {
            res = sum / 500;
           // System.out.println("500:"+res);
            sum -= res * 500;
        }
        if(sum/200 > 0) {
            int tmp = sum / 200;
            res +=tmp ;
           // System.out.println("200:"+res);
            sum -= tmp * 200;
        }
        if(sum/100 > 0){
            int tmp = sum / 100;
            res +=tmp ;
            //System.out.println("100:"+res);
            sum -= tmp * 100;
        }

        if(sum/50 > 0) {
            int tmp = sum / 50;
            res +=tmp ;
         //   System.out.println("50:"+res);
            sum -= tmp * 50;
        }

        if(sum/20 > 0) {
            int tmp = sum / 20;
            res +=tmp ;
          //  System.out.println("20:"+res);
            sum -= tmp * 20;
        }
        if(sum/10 > 0) {
            int tmp = sum / 10;
            res +=tmp ;
        //    System.out.println("10:"+res);
            sum -= tmp * 10;

        }
        if(sum/5 > 0) {
            int tmp = sum / 5;
            res +=tmp ;
         //   System.out.println("5:"+res);
            sum -= tmp * 5;
        }
        if(sum/2 > 0) {
            int tmp = sum / 2;
            res +=tmp ;
         //   System.out.println("2:"+res);
            sum -= tmp * 2;
        }
        if(sum/1 > 0) {
            int tmp = sum / 1;
            res +=tmp ;
           // System.out.println("1:"+res);
            sum -= tmp * 1;
        }

        return res;
    }
}
