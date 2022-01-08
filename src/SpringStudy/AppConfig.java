package SpringStudy;

public class AppConfig {

    //역할과 구현이 한눈에 들어온다.
    //역할이 잘 드러남
    //중복 제거

    //DI, 의존관계 주입
    //생성자 주입 ,철저히 DIP를 지키고 있다.
    public Member_MemberService memberService(){
        return new Member_MemberServiceImpl(memberRepository());
    }

    private Member_MemoryMemberRepository memberRepository(){
        return new Member_MemoryMemberRepository();
    }

    //생성자 주입
    public Order_OrderServiceImpl orderService(){
        return new Order_OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private Discount_DiscountPolicy discountPolicy(){

        //이런식으로 AppConfig에서 함수만 바꿔서 할인 정책을 변경할 수 있다.
        return new Discount_RateDiscountPolicy();
        //return new FixDiscountPolicy();
    }

}
