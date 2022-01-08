package SpringStudy;

public interface Member_MemberRepository {

	 void save(Member_Member member);
	 Member_Member findById(long memberId);

}
