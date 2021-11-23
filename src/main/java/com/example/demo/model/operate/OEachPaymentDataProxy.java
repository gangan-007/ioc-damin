package com.example.demo.model.operate;

import com.example.demo.constant.AdminConstant;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import xyz.erupt.annotation.fun.DataProxy;

/**
 * @Description:
 * @Copyright: Copyright (c) 2021  ALL RIGHTS RESERVED.
 * @Company: 深圳市兴海物联科技有限公司
 * @Author: gyc
 * @CreateDate: 2021/11/22 16:08
 * @UpdateDate: 2021/11/22 16:08
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Service
public class OEachPaymentDataProxy implements DataProxy<OEachPayment>{

    @Override
    public void beforeAdd(OEachPayment oEachPayment) {
        yearOrMonth(oEachPayment);
    }

    @Override
    public void beforeUpdate(OEachPayment oEachPayment) {
        yearOrMonth(oEachPayment);
    }

    public void yearOrMonth(OEachPayment oEachPayment) {
        String type = oEachPayment.getType();
        String year = oEachPayment.getYear();
        String obsTime = oEachPayment.getObsTime();
        if (ObjectUtils.isEmpty(year) && ObjectUtils.isEmpty(obsTime)) {
            throw new RuntimeException("年/月二选一，且不能为空");
        }
        if (type.equals(AdminConstant.YEAR)) {
            if (ObjectUtils.isEmpty(year)) {
                throw new RuntimeException("年不能为空");
            }
            oEachPayment.setObsTime(null);
        } else if (type.equals(AdminConstant.MONTH)) {
            if (ObjectUtils.isEmpty(obsTime)) {
                throw new RuntimeException("月份不能为空");
            }
            oEachPayment.setYear(null);
        }
    }
    
}
