public class Test2 {
    public static int sum_odd_between(int from,int to){
        return (to-(to+1)%2+(from+(from+1)%2))*((to-(to+1)%2-(from+(from+1)%2)+2-(to%2+from%2)/2)/2+(to%2+from%2)/2 )/2;
    }
    public static int all_odd_between(int from,int to){
        int sum=0;
        from+=(from+1)%2;
        for(int i=from;i<=to;i+=2)
            sum+=i;
        return sum;
    }
    public static void main(String []args){
        System.out.println("func1 sum all odd between 1-10000: "+all_odd_between(1,10000));
        System.out.println("func2 sum all odd between 1-10000: "+sum_odd_between(1,10000));
        System.out.println("func1 sum all odd between 1-10: "+all_odd_between(1,10));
        System.out.println("func2 sum all odd between 1-10: "+sum_odd_between(1,10));
        System.out.println("func1 sum all odd between 5-17: "+all_odd_between(5,17));
        System.out.println("func2 sum all odd between 5-17: "+sum_odd_between(5,17));
        System.out.println("func1 sum all odd between 4-16: "+all_odd_between(4,16));
        System.out.println("func2 sum all odd between 4-16: "+sum_odd_between(4,16));
        System.out.println("func1 sum all odd between 32-51: "+all_odd_between(32,51));
        System.out.println("func2 sum all odd between 32-51: "+sum_odd_between(32,51));
        System.out.println("func1 sum all odd between 150-300: "+all_odd_between(150,300));
        System.out.println("func2 sum all odd between 150-300: "+sum_odd_between(150,300));
        System.out.println("func1 sum all odd between 421-579: "+all_odd_between(421,579));
        System.out.println("func2 sum all odd between 421-579: "+sum_odd_between(421,579));
    }
}
