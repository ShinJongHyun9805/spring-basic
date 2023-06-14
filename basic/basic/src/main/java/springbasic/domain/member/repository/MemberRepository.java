package springbasic.domain.member.repository;

import springbasic.domain.member.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
