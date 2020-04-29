package cn.zjut.hotel.service;

import cn.zjut.hotel.domain.HotelOrder;

import java.util.List;

/**
 * 查询订单、添加订单、修改订单、删除订单
 *
 * @author kuluo
 */
public interface HotelOrderServiceInterface {
    /**
     * 查询所有订单
     *
     * @param pageId   页号
     * @param pageSize 每页大小
     * @return 订单集合
     */
    List<HotelOrder> findOrders(Integer pageId, Integer pageSize);

    HotelOrder findOneOrderById(int orderId);
}