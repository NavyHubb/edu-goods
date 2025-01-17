package com.green.edugoods.service;

import com.green.edugoods.dto.GoodsDto;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    public GoodsDto getGoodsByGoodNo(String goodNo) {
        // 비즈니스 로직: 상품 정보를 생성
        // 실제로는 DB에서 정보를 조회하거나 다른 API를 호출하는 로직이 들어갈 수 있음
        return new GoodsDto(
            goodNo,
            "Sample Product " + goodNo
        );
    }
}