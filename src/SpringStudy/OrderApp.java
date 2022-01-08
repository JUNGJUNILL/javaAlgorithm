package SpringStudy;

public class OrderApp {

	public static void main(String[] args) {

		
		
	    AppConfig appConfig =new AppConfig();

        Order_OrderService orderService = appConfig.orderService();
        Member_MemberService memberService = appConfig.memberService();

        long memberId=1l;
        Member_Member member = new Member_Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order_Order order =orderService.createOrder(memberId,"itemA",90000);
        System.out.println(order.toString());
        System.out.println(order.getDiscountPrice());
        System.out.println(order.calculatePrice());


	}
}
