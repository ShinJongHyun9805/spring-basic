package springbasic.domain.discount;

import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPrice = 10;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? price * discountPrice / 100 : 0;
    }
}
