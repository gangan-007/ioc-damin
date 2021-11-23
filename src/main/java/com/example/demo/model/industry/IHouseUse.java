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

@Erupt(name = "房屋用途")
@Table(name = "i_house_use", uniqueConstraints = {@UniqueConstraint(name = "uk_obs_time", columnNames="obsTime")})
@Entity
public class IHouseUse extends BaseModel {

        @EruptField(
                views = @View(
                        title = "年", sortable = true
                ),
                edit = @Edit(
                        title = "年",
                        type = EditType.DATE, search = @Search, notNull = true,
                        dateType = @DateType(type = DateType.Type.YEAR)
                )
        )
        private String obsTime;

        @EruptField(
                views = @View(
                        title = "厂房（个）"
                ),
                edit = @Edit(
                        title = "厂房（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer factory;

        @EruptField(
                views = @View(
                        title = "办公（个）"
                ),
                edit = @Edit(
                        title = "办公（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer office;

        @EruptField(
                views = @View(
                        title = "商铺（个）"
                ),
                edit = @Edit(
                        title = "商铺（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer shop;

        @EruptField(
                views = @View(
                        title = "酒店（个）"
                ),
                edit = @Edit(
                        title = "酒店（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer hotel;

        @EruptField(
                views = @View(
                        title = "其他（个）"
                ),
                edit = @Edit(
                        title = "其他（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer other;

}