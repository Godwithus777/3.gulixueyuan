package com.atguigu.guli.service.edu.controller.admin;


import com.atguigu.guli.service.edu.entity.Teacher;
import com.atguigu.guli.service.edu.service.TeacherService;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2020-09-19
 */

@Api(description = "讲师管理")
@RestController
@RequestMapping("/admin/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("所有讲师列表")
    @GetMapping("list")
    public List<Teacher> listAll() {
        return teacherService.list();
    }

    @ApiOperation(value = "根据ID删除讲师",notes = "根据ID删除讲师，逻辑删除")
    @DeleteMapping("remove/{id}")
    public boolean removeById(@ApiParam(value = "讲师ID",required = true) @PathVariable String id) {
        return teacherService.removeById(id);
    }

}

