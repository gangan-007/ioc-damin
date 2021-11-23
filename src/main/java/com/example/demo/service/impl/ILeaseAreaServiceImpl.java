package com.example.demo.service.impl;

import com.example.demo.model.industry.ILeaseArea;
import com.example.demo.service.ILeaseAreaService;
import com.example.demo.vo.LeaseAreaVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import xyz.erupt.jpa.dao.EruptDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Copyright: Copyright (c) 2021  ALL RIGHTS RESERVED.
 * @Company: 深圳市兴海物联科技有限公司
 * @Author: gyc
 * @CreateDate: 2021/11/19 11:26
 * @UpdateDate: 2021/11/19 11:26
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Service
public class ILeaseAreaServiceImpl implements ILeaseAreaService {

    @Resource
    private EruptDao eruptDao;

    @Override
    public LeaseAreaVO getLeaseArea() {
        List<ILeaseArea> list = eruptDao.getJdbcTemplate()
                .queryForList("SELECT * FROM `i_iease_area` WHERE obs_time = DATE_FORMAT(NOW(), '%Y')", ILeaseArea.class);
        ILeaseArea iLeaseArea = list.get(0);
        System.out.println(iLeaseArea);
        LeaseAreaVO leaseAreaVO = new LeaseAreaVO();
        BeanUtils.copyProperties(iLeaseArea, leaseAreaVO);
        return leaseAreaVO;
    }

    public static void main(String[] args) {

    }
}
