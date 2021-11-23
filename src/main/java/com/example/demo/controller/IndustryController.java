package com.example.demo.controller;

import com.example.demo.service.ILeaseAreaService;
import com.example.demo.vo.LeaseAreaVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Copyright: Copyright (c) 2021  ALL RIGHTS RESERVED.
 * @Company: 深圳市兴海物联科技有限公司
 * @Author: gyc
 * @CreateDate: 2021/11/19 11:24
 * @UpdateDate: 2021/11/19 11:24
 * @UpdateRemark: init
 * @Version: 1.0
 */
@RestController
@RequestMapping("/industry")
public class IndustryController {

    @Resource
    private ILeaseAreaService iLeaseAreaService;

    @RequestMapping("/lease-area")
    public LeaseAreaVO getLeaseArea() {
        LeaseAreaVO leaseAreaVO = iLeaseAreaService.getLeaseArea();
        return leaseAreaVO;
    }
}
