package springbasic.domain.member.service;

import springbasic.domain.member.entity.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
