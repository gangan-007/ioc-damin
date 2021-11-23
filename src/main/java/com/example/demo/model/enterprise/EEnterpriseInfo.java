package com.example.demo.model.enterprise;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Erupt(name = "园区企业信息")
@Table(name = "e_enterprise_info", uniqueConstraints = {@UniqueConstraint(name = "uk_name", columnNames="name")})
@Entity
public class EEnterpriseInfo extends BaseModel {

        @EruptField(
                views = @View(
                        title = "企业名称", sortable = true
                ),
                edit = @Edit(
                        title = "企业名称",
                        type = EditType.INPUT, search = @Search, notNull = true,
                        inputType = @InputType
                )
        )
        private String name;

        @EruptField(
                views = @View(
                        title = "是否上市"
                ),
                edit = @Edit(
                        title = "是否上市",
                        type = EditType.BOOLEAN, search = @Search, notNull = true,
                        boolType = @BoolType
                )
        )
        private Boolean listing;

        @EruptField(
                views = @View(
                        title = "企业类型"
                ),
                edit = @Edit(
                        title = "企业类型",
                        type = EditType.CHOICE, search = @Search, notNull = true,
                        choiceType = @ChoiceType(vl = {@VL(value = "1", label = "科技企业"), @VL(value = "2", label = "制造业企业"),
                                @VL(value = "3", label = "零售业企业"), @VL(value = "4", label = "其他企业")})
                )
        )
        private String type;

        @EruptField(
                views = @View(
                        title = "企业税收（万）"
                ),
                edit = @Edit(
                        title = "企业税收（万）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer tax;

        @EruptField(
                views = @View(
                        title = "企业生产值（万）"
                ),
                edit = @Edit(
                        title = "企业生产值（万）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer productionValue;

        @EruptField(
                views = @View(
                        title = "企业注册资金（万）"
                ),
                edit = @Edit(
                        title = "企业注册资金（万）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer capital;

}