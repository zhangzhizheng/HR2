package cn.hr.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.hr.model.Person;
import cn.hr.utils.DBUtils;

public class PersonDao {
	/**
	 * 查询所有员工信息
	 * @return
	 */
	public String[][] getAllForBasic(){
		return null;
	}
	/**
	 * 员工信息的增加
	 * @param person
	 */
	public static void addPerson(Person person){
		Connection conn=DBUtils.getConnection();
		String sql="insert into Person(PersonID,Name,Sex,Birth,Nat,Address,DeptID,Assess,Other) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1, person.getPersonID());
			ps.setString(2,person.getName());
			ps.setString(3, person.getSex());
			ps.setString(4, person.getBirth());
			ps.setString(5, person.getNat());
			ps.setString(6, person.getAddress());
			ps.setLong(7, person.getDeptID());
			ps.setString(8, person.getAssess());
			ps.setString(9, person.getOther());
			ps.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//关闭连接
			DBUtils.close(ps);
			DBUtils.close(conn);
		}
		
	}
	/**
	 * 员工信息的修改
	 * @param person
	 */
	public static void updatePerson(Person person){
		
	}
	/**
	 * 员工信息的删除
	 * @param personID
	 */
	public static void deletePerson(long PersonID){
		
	}
	/**
	 * 获取下一个可用编号
	 * @return
	 */
	public long getNextId(){
		return 0;
		
	}
	/**
	 * 以“编号”、”姓名“的形式来查询所有员工的信息
	 * @return
	 */
	public String[] getNamewithId(){
		return null;
		
	}
	/**
	 * 根据员工编号查询当前部门编号
	 * @param PersonID
	 * @return
	 */
	public long getDeptId(long PersonID){
		return 0;
		
	}
	/**
	 * 更新部门
	 * @param PersonID
	 * @param DeptID
	 */
	public void updateDept(long PersonID,long DeptID ){
		
	}
	/**
	 * 更新考核结果
	 * @param PersonID
	 * @param Assess
	 */
    public void updateAssess(long PersonID,String Assess){
		
	}
    /**
     * 更新薪资
     * @param PersonID
     * @param Salary
     */
    public void updateSalary(long PersonID,long Salary){
		
   	}
    /**
     * 查询所有员工的部门、考核信息和劳资信息
     * @return
     */
    public String[][] getAllForHistory(){
		return null;
    	
    }
}
