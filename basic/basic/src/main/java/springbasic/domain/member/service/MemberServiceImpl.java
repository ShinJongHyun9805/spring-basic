package springbasic.domain.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.repository.MemberRepository;
import springbasic.domain.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
