package springbasic.controller;

import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.service.MemberService;
import springbasic.domain.member.service.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + findMember.getId());

    }
}
