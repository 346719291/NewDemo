package ѧ������ϵͳ;

import java.util.ArrayList;
import java.util.List;

public class Student extends Persion<Student>{
	protected int id;//���
	protected String name;//����
	protected int age;//����
	protected String sex;//�Ա�
	protected String role;//��ɫ

	List<Student> list=new ArrayList<Student>();
	public Student add(Student s) {//���
		list.add(s);
		System.out.println("��ӳɹ�");
		return s;
	}
	public Student select() {
		for(Student lis:list) {
			
			System.out.println("���:"+lis.getId()+"\n"+"������"+lis.getName()+"\n"+"����"+lis.getAge()+"\n"+"�Ա�"+lis.getSex()+"\n"+"�ȼ�"+lis.getRole());
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
	//�޸�ѧ��
	public boolean update(int i) {
		boolean d= list.contains(i);
		if(true==d) {
			return true;
		}
		return true;
	}
	
	public void update_stu(Integer i,Student t) {
		list.set(i-1, t);
		System.out.println("�޸ĳɹ�");
	}
	//ɾ��ѧ��
	public void del_byid(Student t) {
		list.remove(t);
		
	}
	//��ӱ��
		public boolean add_id(String id) {
			String number="^[1-9]$";
			if(!id.matches(number)) {
				System.out.println("�����ʽ���󣡣���");
				return false;
			}
			return true;
		}
}
