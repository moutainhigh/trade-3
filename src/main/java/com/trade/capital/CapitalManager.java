package com.trade.capital;

import com.trade.config.TradeConstantConfig;
import com.trade.vo.AssetVo;
import com.trade.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgy on 2020-02-24.
 * 资金管理
 */
@Component
public class CapitalManager {

    @Autowired
    private TradeConstantConfig tradeConstantConfig;

    /** 保存所有交易订单 **/
    public static List<OrderVo> tradeOrders;

    /** 资金池 **/
    public static AssetVo assetVo;

    public void init(){
        tradeOrders = new ArrayList<>();
        assetVo = AssetVo.create(BigDecimal.valueOf(tradeConstantConfig.getTotalCapital()), BigDecimal.valueOf(tradeConstantConfig.getRiskParameter()));
    }



}
