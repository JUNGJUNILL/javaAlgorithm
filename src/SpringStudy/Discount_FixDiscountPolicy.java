package SpringStudy;

public class Discount_FixDiscountPolicy implements Discount_DiscountPolicy {

	
    private int disCountFixAmount=1000;

    @Override
    public int discount(Member_Member member, int price) {
        if(member.getGrade()==Grade.VIP){
            return disCountFixAmount;
        }else{
            return 0;
        }
    }
	
}
