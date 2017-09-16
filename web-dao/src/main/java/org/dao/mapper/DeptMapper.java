package org.dao.mapper;

import org.dao.model.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SongX on 2017/9/16.
 */
@Repository
public interface DeptMapper {

    List<Dept> selectDept();
}
