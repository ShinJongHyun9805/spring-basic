package springbasic.controller;

import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.service.MemberService;
import springbasic.domain.member.service.MemberServiceImpl;
import springbasic.domain.order.entity.Order;
import springbasic.domain.order.service.OrderService;
import springbasic.domain.order.service.OrderServiceImpl;

public class OrderAPP {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "shin1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 1000000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
