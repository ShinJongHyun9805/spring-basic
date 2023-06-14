package springbasic.domain.discount;

import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? discountFixAmount : 0;
    }
}
