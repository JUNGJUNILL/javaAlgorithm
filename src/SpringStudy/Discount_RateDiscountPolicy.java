package SpringStudy;

public class Discount_RateDiscountPolicy implements Discount_DiscountPolicy{

	
    private final int discountPercent = 10;

    @Override
    public int discount(Member_Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }else{
            return 0;
        }

    }
}
