package ѧ������ϵͳ;

/**
 * 
 * ����
 *
 */
public class Persion<T> {
	protected int id;//���
	protected String name;//����
	protected int age;//����
	protected String sex;//�Ա�
	protected String role;//��ɫ
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persion(int id, String name, int age, String sex, String role) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", role=" + role + "]";
	}
	
}
