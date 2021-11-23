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

@Erupt(name = "签约情况")
@Table(name = "b_sign_info", uniqueConstraints = {@UniqueConstraint(name = "uk_obs_time", columnNames="obsTime")})
@Entity
public class BSignInfo extends BaseModel {

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
                        title = "签约企业（个）"
                ),
                edit = @Edit(
                        title = "签约企业（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer sign;

        @EruptField(
                views = @View(
                        title = "签退企业（个）"
                ),
                edit = @Edit(
                        title = "签退企业（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer signOut;

        @EruptField(
                views = @View(
                        title = "签约金额（万）"
                ),
                edit = @Edit(
                        title = "签约金额（万）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer amount;

}