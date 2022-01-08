package SpringStudy;

public class Order_OrderServiceImpl implements Order_OrderService{
	

    private final Member_MemoryMemberRepository memberRepository;
    //DIP ����(�������̽����� ���� : dip)
    //iscountPolicy �������̽��Ӹ� �ƴ϶�
    //FixDiscountPolicy , RateDiscountPolicy ��ü Ŭ������ �Բ� �����Ѵ�.

    //-�߻󿡸� �����ϵ���(�������̽����� ����) ����
    //-DIP�� �������� �ʵ��� �������̽����� �����ϵ��� �������踦 �����ϸ� �ȴ�.


    //OCP����(�������� �ʰ� Ȯ�尡�� : ocp)
    //���� �ڵ�� ����� Ȯ���ؼ� �����ϸ�, Ŭ���̾�Ʈ �ڵ嵵 ������ �ش�.
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
