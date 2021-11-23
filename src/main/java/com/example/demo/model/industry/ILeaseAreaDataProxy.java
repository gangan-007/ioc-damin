package com.example.demo.model.industry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.upms.service.EruptUserService;

@Service
public class ILeaseAreaDataProxy implements DataProxy<ILeaseArea> {

    @Autowired
    private EruptUserService eruptUserService;

    @Override
    public void beforeAdd(ILeaseArea iLeaseArea) {
        // 可租面积=可租总面积+空置总面积+其他面积
        // 总面积=可租面积+不可租面积
        // 本年已租面积=续租面积+新签面积
        iLeaseArea.setAbleLease(iLeaseArea.getAbleLeaseTotal() + iLeaseArea.getEmptyTotal() + iLeaseArea.getOther());
        iLeaseArea.setTotal(iLeaseArea.getAbleLease() + iLeaseArea.getUnableLease());
        iLeaseArea.setAlreadyLease(iLeaseArea.getNowLease() + iLeaseArea.getNewLease());
    }

    @Override
    public void beforeUpdate(ILeaseArea iLeaseArea) {
        iLeaseArea.setAbleLease(iLeaseArea.getAbleLeaseTotal() + iLeaseArea.getEmptyTotal() + iLeaseArea.getOther());
        iLeaseArea.setTotal(iLeaseArea.getAbleLease() + iLeaseArea.getUnableLease());
        iLeaseArea.setAlreadyLease(iLeaseArea.getNowLease() + iLeaseArea.getNewLease());
    }
}