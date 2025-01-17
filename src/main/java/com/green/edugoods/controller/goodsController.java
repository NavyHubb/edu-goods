package com.green.edugoods.controller;

import com.green.edugoods.dto.GoodsDto;
import com.green.edugoods.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/goods")
public class goodsController {

    private final GoodsService goodsService;

    @GetMapping("/{goodNo}")
    public ResponseEntity<GoodsDto> getGoodsByGoodNo(@PathVariable("goodNo") String goodNo) {
        GoodsDto goodsDto = goodsService.getGoodsByGoodNo(goodNo);
        return ResponseEntity.ok(goodsDto);
    }

}
