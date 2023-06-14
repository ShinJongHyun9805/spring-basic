package springbasic.member.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.service.MemberService;
import springbasic.domain.member.service.MemberServiceImpl;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void 회원가입(){
        // given
        Member member = new Member(1L, "shin1", Grade.VIP);

        // when
        memberService.join(member);
        Member findeMember = memberService.findMember(member.getId());

        // then
        Assertions.assertThat(member).isEqualTo(findeMember);
    }
}