package ѧ������ϵͳ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * ��ʦ
 *
 *
 */
public class Teacher extends Persion<Teacher>{
	private static final int List = 0;
	private static final int Teacher = 0;
	protected int id;//���
	protected String name;//����
	protected int age;//����
	protected String sex;//�Ա�
	protected String role;//��ɫ
	
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
		System.out.println("������");
		return null;
	}
	
	
	public boolean selectbyid(Integer td) {
		if(list.contains(td)) {
			System.out.println("�˺Ŵ���");
			return true;
		}else {
			
			return true;//��ѯ
		}
	}
	
	public void xiugai(Integer i,Teacher t) {
		list.set(i-1, t);
		//list.remove(t);
		//list.add(t);
		
		
		System.out.println("�޸ĳɹ�");
	}
	
	//��ʾ����
	
	public void selectall() {
		for(Teacher d:list) {
			System.out.println("���:"+d.getId()+"\n"+"������"+d.getName()+"\n"+"����"+d.getAge()+"\n"+"�Ա�"+d.getSex()+"\n"+"�ȼ�"+d.getRole());
		}
	}
	//��ӱ��
	public boolean add_id(String id) {
		String number="^[1-9]+$";
		if(!id.matches(number)) {
			System.out.println("�����ʽ���󣡣���");
			return false;
		}
		return true;
	}
	
}
