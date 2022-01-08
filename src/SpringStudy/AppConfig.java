package SpringStudy;

public class AppConfig {

    //���Ұ� ������ �Ѵ��� ���´�.
    //������ �� �巯��
    //�ߺ� ����

    //DI, �������� ����
    //������ ���� ,ö���� DIP�� ��Ű�� �ִ�.
    public Member_MemberService memberService(){
        return new Member_MemberServiceImpl(memberRepository());
    }

    private Member_MemoryMemberRepository memberRepository(){
        return new Member_MemoryMemberRepository();
    }

    //������ ����
    public Order_OrderServiceImpl orderService(){
        return new Order_OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private Discount_DiscountPolicy discountPolicy(){

        //�̷������� AppConfig���� �Լ��� �ٲ㼭 ���� ��å�� ������ �� �ִ�.
        return new Discount_RateDiscountPolicy();
        //return new FixDiscountPolicy();
    }

}
