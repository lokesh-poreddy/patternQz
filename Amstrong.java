public class Amstrong {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int a = 0;
        int num = n;
        String s = Integer.toString(num);
        int l = s.length();
        while(n > 0) {
            a = n % 10;
            double pow = Math.pow(a, l) ;
            sum += (int)pow;
            n = n / 10 ;
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        Amstrong sol = new Amstrong();
        System.out.println(sol.isArmstrong(153)); 
    }
}
