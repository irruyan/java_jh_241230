package db.ex1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.ex1.model.vo.StudentVO;

public interface StudentDAO {

	public List<StudentVO> selectStudentList() ;

	StudentVO selectStudent(@Param("grade")int grade, @Param("classNum")int classNum, @Param("num")int num);

	public StudentVO selectStudent2(@Param("std")StudentVO studentVO);


}
