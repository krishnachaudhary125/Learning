class Banks{
    public void getInterestRate(){};
}
class SBI extends Banks{
    double interestRate = 8.0;
    @Override
    public void getInterestRate() {
        System.out.println("Interest rate of SBI : "+interestRate);
    }
}
class PNB extends Banks{
    double interestRate = 7.5;
    @Override
    public void getInterestRate() {
        System.out.println("Interest rate of PNB : "+interestRate);
    }
}
class RRB extends Banks{
    double interestRate = 7.0;
    @Override
    public void getInterestRate() {
        System.out.println("Interest rate of RRB : "+interestRate);
    }
}
public class MethodOverridingAssignFour {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getInterestRate();
        PNB pnb = new PNB();
        pnb.getInterestRate();
        RRB rrb = new RRB();
        rrb.getInterestRate();
    }
}
