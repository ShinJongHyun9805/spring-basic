package springbasic.domain.order.service;

import springbasic.domain.discount.DiscountPolicy;
import springbasic.domain.discount.FixDiscountPolicy;
import springbasic.domain.member.entity.Member;
import springbasic.domain.member.repository.MemberRepository;
import springbasic.domain.member.repository.MemoryMemberRepository;
import springbasic.domain.order.entity.Order;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
