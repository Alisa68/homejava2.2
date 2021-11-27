public class Main {
    public static void main(String[] args) {
        int account = 500;
        int add = 1100;
        int totalSum = account + add;

        int bonus, totalBonus;
        if (add > 1000) {
            bonus =  add / 100;
            totalBonus = bonus + totalSum;
            System.out.println("Итого:" + totalBonus);
            System.out.println("Бонус:" + bonus);
        } else
            System.out.println("Итого:" + totalSum);
    }
}









