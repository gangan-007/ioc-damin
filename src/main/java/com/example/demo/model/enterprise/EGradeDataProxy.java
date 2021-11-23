package com.example.demo.model.enterprise;

import org.springframework.stereotype.Service;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.jpa.dao.EruptDao;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EGradeDataProxy implements DataProxy<EGrade> {

    @Resource
    private EruptDao eruptDao;

    @Override
    public void beforeAdd(EGrade eGrade) {
        List<Map<String, Object>> list = eruptDao.getJdbcTemplate()
                .queryForList("select * from e_grade");
        if (list.size() >= 1) {
            throw new RuntimeException("有且仅有一条数据");
        }

    }

}