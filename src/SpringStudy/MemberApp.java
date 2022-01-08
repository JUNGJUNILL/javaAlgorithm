package SpringStudy;

public class MemberApp {

	public static void main(String[] args) {
		   AppConfig appConfig = new AppConfig();
	        Member_MemberService memberService = appConfig.memberService();
	        Member_Member member = new Member_Member(1L,"memberA", Grade.VIP);
	        memberService.join(member);

	        Member_Member findMember = memberService.findMember(1L);

	        System.out.println("new member=>"+member.getName());
	        System.out.println("findmember=>"+findMember.getName());

	}

}
