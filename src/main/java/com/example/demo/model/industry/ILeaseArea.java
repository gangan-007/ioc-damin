package com.example.demo.model.industry;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import lombok.Getter;
import lombok.Setter;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.PreDataProxy;
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

@Getter
@Setter
@PreDataProxy(ILeaseAreaDataProxy.class)
@Erupt(name = "面积概况")
@Table(name = "i_iease_area", uniqueConstraints = {@UniqueConstraint(name = "uk_obs_time", columnNames="obsTime")})
@Entity
public class ILeaseArea extends BaseModel {

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
                        title = "总面积（㎡）"
                ),
                edit = @Edit(
                        title = "总面积（㎡）",
                        show = false
                )
        )
        private Integer total;

        @EruptField(
                views = @View(
                        title = "不可租面积（㎡）"
                ),
                edit = @Edit(
                        title = "不可租面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer unableLease;

        @EruptField(
                views = @View(
                        title = "可租面积（㎡）"
                ),
                edit = @Edit(
                        title = "可租面积（㎡）",
                        show = false
                )
        )
        private Integer ableLease;

        @EruptField(
                views = @View(
                        title = "可租总面积（㎡）"
                ),
                edit = @Edit(
                        title = "可租总面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer ableLeaseTotal;

        @EruptField(
                views = @View(
                        title = "空置总面积（㎡）"
                ),
                edit = @Edit(
                        title = "空置总面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer emptyTotal;

        @EruptField(
                views = @View(
                        title = "其他面积（㎡）"
                ),
                edit = @Edit(
                        title = "其他面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer other;

        @EruptField(
                views = @View(
                        title = "本年已租面积（㎡）"
                ),
                edit = @Edit(
                        title = "本年已租面积（㎡）",
                        show = false
                )
        )
        private Integer alreadyLease;

        @EruptField(
                views = @View(
                        title = "本年新签面积（㎡）"
                ),
                edit = @Edit(
                        title = "本年新签面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer newLease;

        @EruptField(
                views = @View(
                        title = "本年续租面积（㎡）"
                ),
                edit = @Edit(
                        title = "本年续租面积（㎡）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer nowLease;

}