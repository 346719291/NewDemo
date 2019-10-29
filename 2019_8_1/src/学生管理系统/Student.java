package 学生管理系统;

import java.util.ArrayList;
import java.util.List;

public class Student extends Persion<Student>{
	protected int id;//编号
	protected String name;//名字
	protected int age;//年龄
	protected String sex;//性别
	protected String role;//角色

	List<Student> list=new ArrayList<Student>();
	public Student add(Student s) {//添加
		list.add(s);
		System.out.println("添加成功");
		return s;
	}
	public Student select() {
		for(Student lis:list) {
			
			System.out.println("编号:"+lis.getId()+"\n"+"姓名："+lis.getName()+"\n"+"年龄"+lis.getAge()+"\n"+"性别"+lis.getSex()+"\n"+"等级"+lis.getRole());
		}
		return null;
		
	};
	public Student(int id, String name, int age, String sex, String role, List<Student> list) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
		this.list = list;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, String sex, String role) {
		super(id, name, age, sex, role);
		// TODO Auto-generated constructor stub
	}
	//修改学生
	public boolean update(int i) {
		boolean d= list.contains(i);
		if(true==d) {
			return true;
		}
		return true;
	}
	
	public void update_stu(Integer i,Student t) {
		list.set(i-1, t);
		System.out.println("修改成功");
	}
	//删除学生
	public void del_byid(Student t) {
		list.remove(t);
		
	}
	//添加编号
		public boolean add_id(String id) {
			String number="^[1-9]$";
			if(!id.matches(number)) {
				System.out.println("输入格式错误！！！");
				return false;
			}
			return true;
		}
}
