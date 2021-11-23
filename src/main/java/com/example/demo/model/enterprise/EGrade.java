package com.example.demo.model.enterprise;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.PreDataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.NumberType;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@PreDataProxy(EGradeDataProxy.class)
@Erupt(name = "专业资质列表")
@Table(name = "e_grade")
@Entity
public class EGrade extends BaseModel {

        @EruptField(
                views = @View(
                        title = "发明专利（个）"
                ),
                edit = @Edit(
                        title = "发明专利（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer invention;

        @EruptField(
                views = @View(
                        title = "实用新型专利（个）"
                ),
                edit = @Edit(
                        title = "实用新型专利（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer practical;

        @EruptField(
                views = @View(
                        title = "外观设计专利（个）"
                ),
                edit = @Edit(
                        title = "外观设计专利（个）",
                        type = EditType.NUMBER, notNull = true,
                        numberType = @NumberType
                )
        )
        private Integer appearance;

}