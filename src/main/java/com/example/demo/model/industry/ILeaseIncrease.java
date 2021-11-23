package com.example.demo.model.industry;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.DateType;
import xyz.erupt.annotation.sub_field.sub_edit.NumberType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Erupt(name = "租赁增长")
@Table(name = "i_lease_increase", uniqueConstraints = {@UniqueConstraint(name = "uk_obs_time", columnNames="obsTime")})
@Entity
public class ILeaseIncrease extends BaseModel {

        @EruptField(
                views = @View(
                        title = "年月", sortable = true
                ),
                edit = @Edit(
                        title = "年月",
                        type = EditType.DATE, search = @Search, notNull = true,
                        // 年-月：eg 2021-11
                        dateType = @DateType(type = DateType.Type.MONTH)
                )
        )
        private String obsTime;

        @EruptField(
                views = @View(
                        title = "新租房源数（个）"
                ),
                edit = @Edit(
                        title = "新租房源数（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer newRental;

        @EruptField(
                views = @View(
                        title = "新租面积（㎡）"
                ),
                edit = @Edit(
                        title = "新租面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer newLease;

}