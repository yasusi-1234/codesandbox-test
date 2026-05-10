package com.example.taskapi.mapper;

import com.example.taskapi.entity.Task;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskMapper {

    @Select("SELECT id, title, status FROM tasks")
    List<Task> findAll();

    @Select("SELECT id, title, status FROM tasks WHERE id = #{id}")
    Optional<Task> findById(Long id);

    @Insert("INSERT INTO tasks(title, status) VALUES(#{title}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Task task);

    @Update("UPDATE tasks SET title = #{title}, status = #{status} WHERE id = #{id}")
    int update(Task task);

    @Delete("DELETE FROM tasks WHERE id = #{id}")
    int deleteById(Long id);
}
