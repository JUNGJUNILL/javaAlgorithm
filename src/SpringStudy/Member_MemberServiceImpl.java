package SpringStudy;

public class Member_MemberServiceImpl implements Member_MemberService{

	
	 //�� ���� DIP�� OCP�� ����
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
