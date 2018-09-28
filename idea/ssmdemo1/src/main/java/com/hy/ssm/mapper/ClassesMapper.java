package com.hy.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.ssm.bean.Classes;

import java.util.List;

public interface ClassesMapper extends BaseMapper<Classes> {
    public List<Classes> queryAllCla();
}