package springbasic.domain.member.repository;



import springbasic.domain.member.entity.Member;

import java.util.HashMap;
import java.util.Map;

/**
 * DB 확정이 되지 않았지만 오픈일자가 나왔을 때.
 * 그럴때 사용하는 Repository
 * */

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
