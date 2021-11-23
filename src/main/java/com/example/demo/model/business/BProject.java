package com.example.demo.model.business;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.InputType;
import xyz.erupt.annotation.sub_field.sub_edit.NumberType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Erupt(name = "重点项目TOP")
@Table(name = "b_project", uniqueConstraints = {@UniqueConstraint(name = "uk_name", columnNames="name"),@UniqueConstraint(name = "uk_sort", columnNames="sort")})
@Entity
public class BProject extends BaseModel {

        @EruptField(
                views = @View(
                        title = "重点项目名称"
                ),
                edit = @Edit(
                        title = "重点项目名称",
                        type = EditType.INPUT, search = @Search, notNull = true,
                        inputType = @InputType
                )
        )
        private String name;

        @EruptField(
                views = @View(
                        title = "重点项目排序序号", sortable = true,
                        desc = "序号越小项目越重点"
                ),
                edit = @Edit(
                        title = "重点项目排序序号",
                        desc = "序号越小项目越重点",
                        type = EditType.NUMBER, search = @Search, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer sort;

}