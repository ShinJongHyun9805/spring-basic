package springbasic.domain.discount;

import springbasic.domain.member.entity.Member;

public interface DiscountPolicy {

    /**
     * return 할인 대상 금액
     * */
    int discount(Member member, int price);
}
