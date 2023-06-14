package springbasic.order.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.service.MemberService;
import springbasic.domain.member.service.MemberServiceImpl;
import springbasic.domain.order.entity.Order;
import springbasic.domain.order.service.OrderService;
import springbasic.domain.order.service.OrderServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void 주문생성() {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "shin1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 1000000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

        Assertions.assertThat(order.calculatePrice()).isEqualTo(999000);
    }


}