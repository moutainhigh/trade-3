package com.trade.service.strategy;

import com.trade.vo.DailyVo;
import com.trade.vo.OrderVo;

/**
 * @Author georgy
 * @Date 2020-03-30 上午 11:34
 * @DESC TODO
 */
public interface CloseStrategyService {

    /**
     * 突破止损策略
     * @param daily
     * @param orderVo
     */
    void breakClose(DailyVo daily, OrderVo orderVo);
}
