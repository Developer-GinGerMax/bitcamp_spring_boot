public class BankAccountPO
{
    //예금잔액
    static int balance = 0;

    public static void main(String[] args)
    {
        //입금 진행
        deposit(10000);
        //잔액 확인
        checkMyBalance();
        //출금 진행
        withdraw(3000);
        //잔액 확인
        checkMyBalance();
    }

    public static int deposit(int amount)
    {
        //입금을 담당하는 메소드
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount)
    {
        //출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    public static int checkMyBalance()
    {
        //예금 조회를 담당하는 메소드
        System.out.println("잔액 : " + balance);
        return balance;
    }

}