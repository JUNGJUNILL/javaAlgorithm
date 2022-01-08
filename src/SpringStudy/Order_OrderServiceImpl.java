package SpringStudy;

public class Order_OrderServiceImpl implements Order_OrderService{
	

    private final Member_MemoryMemberRepository memberRepository;
    //DIP 위반(인터페이스에만 의존 : dip)
    //iscountPolicy 인터페이스뿐만 아니라
    //FixDiscountPolicy , RateDiscountPolicy 구체 클래스도 함께 의존한다.

    //-추상에만 의존하도록(인터페이스에만 의존) 변경
    //-DIP를 위반하지 않도록 인터페이스에만 의존하도록 의존관계를 변경하면 된다.


    //OCP위반(변경하지 않고 확장가능 : ocp)
    //지금 코드는 기능을 확장해서 변경하면, 클라이언트 코드도 영향을 준다.
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private final Discount_DiscountPolicy discountPolicy;

    public Order_OrderServiceImpl(Member_MemoryMemberRepository memberRepository, Discount_DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order_Order createOrder(long memberId, String itemName, int itemPrice) {
        Member_Member member = memberRepository.findById(memberId);
        int discountPrice=discountPolicy.discount(member,itemPrice);

        return new Order_Order(memberId,itemName,itemPrice,discountPrice);
    }

}
