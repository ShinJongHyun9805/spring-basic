package springbasic.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import springbasic.domain.discount.DiscountPolicy;
import springbasic.domain.discount.RateDiscountPolicy;
import springbasic.domain.member.entity.Grade;
import springbasic.domain.member.entity.Member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    private DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void VIP할인(){
        // given
        Member member = new Member(1L, "vip", Grade.VIP);

        // when
        int discount = discountPolicy.discount(member, 10000);
        System.out.println("discount = " + discount);

        // then
        assertThat(discount).isEqualTo(1000);

    }

    @Test
    @DisplayName("일반회원은 할인 미적용")
    void 일반회원(){
        // given
        Member member = new Member(1L, "vip", Grade.BASIC);

        // when
        int discount = discountPolicy.discount(member, 10000);
        System.out.println("discount = " + discount);

        // then
        assertThat(discount).isEqualTo(0);
    }

}