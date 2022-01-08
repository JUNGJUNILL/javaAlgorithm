package SpringStudy;

import java.util.*;

public class Member_MemoryMemberRepository implements Member_MemberRepository{

	
	  private static Map<Long,Member_Member> store = new HashMap<>();


	    @Override
	    public void save(Member_Member member) {
	        store.put(member.getId(),member);
	    }

	    @Override
	    public Member_Member findById(long memberId) {
	        return store.get(memberId);
	    }

}
