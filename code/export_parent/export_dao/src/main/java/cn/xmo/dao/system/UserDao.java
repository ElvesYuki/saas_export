package cn.xmo.dao.system;

import cn.xmo.domain.system.Role;
import cn.xmo.domain.system.User;
import cn.xmo.domain.system.UserExample;

import java.util.List;

public interface UserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pe_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);


    User findByEmail(String email);
}