package com.example.demo.vo;

import lombok.Data;

/**
 * @Description:
 * @Copyright: Copyright (c) 2021  ALL RIGHTS RESERVED.
 * @Company: 深圳市兴海物联科技有限公司
 * @Author: gyc
 * @CreateDate: 2021/11/19 11:30
 * @UpdateDate: 2021/11/19 11:30
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Data
public class LeaseAreaVO {

    /**
     * id
     */
    private Integer id;
    /**
     * obs_time
     */
    private String obsTime;
    /**
     * able_lease
     */
    private Integer ableLease;
    /**
     * able_lease_total
     */
    private Integer ableLeaseTotal;
    /**
     * already_lease
     */
    private Integer alreadyLease;
    /**
     * empty_total
     */
    private Integer emptyTotal;
    /**
     * new_lease
     */
    private Integer newLease;
    /**
     * other
     */
    private Integer other;
    /**
     * total
     */
    private Integer total;
    /**
     * unable_lease
     */
    private Integer unableLease;
    /**
     * now_lease
     */
    private Integer nowLease;
}
