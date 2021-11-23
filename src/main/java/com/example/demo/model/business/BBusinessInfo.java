package com.example.demo.model.business;/*
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

@Erupt(name = "招商情况")
@Table(name = "b_business_info", uniqueConstraints = {@UniqueConstraint(name = "uk_obs_time", columnNames="obsTime")})
@Entity
public class BBusinessInfo extends BaseModel {

        @EruptField(
                views = @View(
                        title = "月", sortable = true
                ),
                edit = @Edit(
                        title = "月",
                        type = EditType.DATE, search = @Search, notNull = true,
                        dateType = @DateType(type = DateType.Type.MONTH)
                )
        )
        private String obsTime;

        @EruptField(
                views = @View(
                        title = "新增商机（个）"
                ),
                edit = @Edit(
                        title = "新增商机（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer total;

        @EruptField(
                views = @View(
                        title = "新增意向（个）"
                ),
                edit = @Edit(
                        title = "新增意向（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer intention;

        @EruptField(
                views = @View(
                        title = "新增准投资商（个）"
                ),
                edit = @Edit(
                        title = "新增准投资商（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer prepare;

        @EruptField(
                views = @View(
                        title = "新增成交（个）"
                ),
                edit = @Edit(
                        title = "新增成交（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer deal;

}