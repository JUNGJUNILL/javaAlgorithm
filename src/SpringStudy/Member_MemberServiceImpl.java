package SpringStudy;

public class Member_MemberServiceImpl implements Member_MemberService{

	
	 //이 또한 DIP와 OCP를 위반
    private final Member_MemberRepository memberRepository;


    public Member_MemberServiceImpl(Member_MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member_Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member_Member findMember(long memberId) {
        return memberRepository.findById(memberId);
    }

}
