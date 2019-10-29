package 学生管理系统;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * 教师
 *
 *
 */
public class Teacher extends Persion<Teacher>{
	private static final int List = 0;
	private static final int Teacher = 0;
	protected int id;//编号
	protected String name;//名字
	protected int age;//年龄
	protected String sex;//性别
	protected String role;//角色
	
	public Teacher(int id, String name, int age, String sex, String role, List<Teacher> list) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
		this.list = list;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, String name, int age, String sex, String role) {
		super(id, name, age, sex, role);
		// TODO Auto-generated constructor stub
	}

	List<Teacher> list=new ArrayList<Teacher>();
	public Teacher add(Teacher t) {
		
		list.add(t);
		System.out.println("添加完成");
		return null;
	}
	
	
	public boolean selectbyid(Integer td) {
		if(list.contains(td)) {
			System.out.println("账号存在");
			return true;
		}else {
			
			return true;//查询
		}
	}
	
	public void xiugai(Integer i,Teacher t) {
		list.set(i-1, t);
		//list.remove(t);
		//list.add(t);
		
		
		System.out.println("修改成功");
	}
	
	//显示数据
	
	public void selectall() {
		for(Teacher d:list) {
			System.out.println("编号:"+d.getId()+"\n"+"姓名："+d.getName()+"\n"+"年龄"+d.getAge()+"\n"+"性别"+d.getSex()+"\n"+"等级"+d.getRole());
		}
	}
	//添加编号
	public boolean add_id(String id) {
		String number="^[1-9]+$";
		if(!id.matches(number)) {
			System.out.println("输入格式错误！！！");
			return false;
		}
		return true;
	}
	
}
