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
 * @CreateDate: 2021/11/22 16:09
 * @UpdateDate: 2021/11/22 16:09
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Service
public class ONotPaymentEnterpriseDataProxy implements DataProxy<ONotPaymentEnterprise>{

    @Override
    public void beforeAdd(ONotPaymentEnterprise oNotPaymentEnterprise) {
        yearOrMonth(oNotPaymentEnterprise);
    }

    @Override
    public void beforeUpdate(ONotPaymentEnterprise oNotPaymentEnterprise) {
        yearOrMonth(oNotPaymentEnterprise);
    }

    public void yearOrMonth(ONotPaymentEnterprise oNotPaymentEnterprise) {
        String type = oNotPaymentEnterprise.getType();
        String year = oNotPaymentEnterprise.getYear();
        String obsTime = oNotPaymentEnterprise.getObsTime();
        if (ObjectUtils.isEmpty(year) && ObjectUtils.isEmpty(obsTime)) {
            throw new RuntimeException("年/月二选一，且不能为空");
        }
        if (type.equals(AdminConstant.YEAR)) {
            if (ObjectUtils.isEmpty(year)) {
                throw new RuntimeException("年不能为空");
            }
            oNotPaymentEnterprise.setObsTime(null);
        } else if (type.equals(AdminConstant.MONTH)) {
            if (ObjectUtils.isEmpty(obsTime)) {
                throw new RuntimeException("月份不能为空");
            }
            oNotPaymentEnterprise.setYear(null);
        }
    }
}
