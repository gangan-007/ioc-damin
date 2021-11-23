package com.example.demo.model.enterprise;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ChoiceType;
import xyz.erupt.annotation.sub_field.sub_edit.NumberType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_field.sub_edit.VL;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Erupt(name = "园区行业生产情况")
@Table(name = "e_product", uniqueConstraints = {@UniqueConstraint(name = "uk_type", columnNames="type")})
@Entity
public class EProduct extends BaseModel {

        @EruptField(
                views = @View(
                        title = "行业类型", sortable = true
                ),
                edit = @Edit(
                        title = "行业类型",
                        type = EditType.CHOICE, search = @Search, notNull = true,
                        choiceType = @ChoiceType(
                                vl = {
                                        @VL(label = "农、林、牧、渔业", value = "A"),
                                        @VL(label = "采矿业", value = "B"),
                                        @VL(label = "制造业", value = "C"),
                                        @VL(label = "电力、热力、燃气及水生产和供应业", value = "D"),
                                        @VL(label = "建筑业", value = "E"),
                                        @VL(label = "批发和零售业", value = "F"),
                                        @VL(label = "交通运输、仓储和邮政业", value = "G"),
                                        @VL(label = "住宿和餐饮业", value = "H"),
                                        @VL(label = "信息传输、软件和信息技术服务业", value = "I"),
                                        @VL(label = "金融业", value = "J"),
                                        @VL(label = "房地产业", value = "K"),
                                        @VL(label = "租赁和商务服务业", value = "L"),
                                        @VL(label = "科学研究和技术服务业", value = "M"),
                                        @VL(label = "水利、环境和公共设施管理业", value = "N"),
                                        @VL(label = "居民服务、修理和其他服务业", value = "O"),
                                        @VL(label = "教育", value = "P"),
                                        @VL(label = "卫生和社会工作", value = "Q"),
                                        @VL(label = "文化、体育和娱乐业", value = "R"),
                                        @VL(label = "公共管理、社会保障和社会组织", value = "S"),
                                        @VL(label = "国际组织", value = "T")
                                }
                        )
                )
        )
        private String type;

        @EruptField(
                views = @View(
                        title = "行业产值（万）", sortable = true
                ),
                edit = @Edit(
                        title = "行业产值（万）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer industryValue;

}
