package org.xp.coder.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xp.coder.web.entity.DemoTable;
import org.xp.coder.web.entity.DemoTableExample;

public interface DemoTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    long countByExample(DemoTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    int deleteByExample(DemoTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    int insert(DemoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    int insertSelective(DemoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    List<DemoTable> selectByExample(DemoTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DemoTable record, @Param("example") DemoTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DemoTable record, @Param("example") DemoTableExample example);
}