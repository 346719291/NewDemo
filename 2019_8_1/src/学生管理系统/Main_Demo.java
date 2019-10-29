package 学生管理系统;

import java.util.Scanner;

public class Main_Demo {
	public static void run_Time() {
		Teacher teacher = new Teacher();
		Student s_tudent = new Student();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("输入密码--123");
			String pwd = "123";
			String pwd_2 = sc.nextLine();
			if (pwd.equals(pwd_2)) {
				while (true) {
				System.out.println("老师输入---------t");
				System.out.println("学生输入---------s");
				System.out.println("管理员输入---------g");
				String str = sc.nextLine();
				String t = "t";
				String t2 = "s";// 学生
				String t3 = "";
				String t4 = "";
				String t5 = "";
				String supman = "g";
				int i = t.compareTo(str);// 老师
				int is = t2.compareTo(str);// 学生
				int super_nam = supman.compareTo(str);
				if (0 == i) {
					System.out.println("功能有==================================");
					System.out.println("添加输入 1");
					System.out.println("删除输入4");
					System.out.println("修改输入2");
					System.out.println("查询输入3");
					System.out.println("查看学生输入5");
					String Teach = sc.nextLine();// 老师输入
					t = "1";// 添加
					t2 = "2";// 修改
					t3 = "3";// 查询
					t4 = "4";
					t5 = "5";
					if (t.equals(Teach)) {
						// 添加
						System.out.println("请输入1-9的编号---按顺序输入");
						String tea_id = sc.nextLine();
						Integer id = Integer.parseInt(tea_id);
						boolean id_teachar=  teacher.add_id(tea_id) ;
						if(true==id_teachar) {
							System.out.println("添加姓名");
							String tea_name = sc.nextLine();
							
							System.out.println("添加年龄");
							String teachar_age = sc.nextLine();
							Integer teachar_age_age = Integer.parseInt(teachar_age);
							
							System.out.println("性别");
							String teacher_sex = sc.nextLine();
							
							System.out.println("等级");
							String teacher_role = sc.nextLine();
							
							teacher.add(new Teacher(id, tea_name, teachar_age_age, teacher_sex, teacher_role));
						}
						
					} else if (t2.equals(Teach)) {
						System.out.println("输入老师编号");
						String teacher_id = sc.nextLine();// 老师编号
						Integer id_teacaher = Integer.parseInt(teacher_id);

						boolean d = teacher.selectbyid(id_teacaher);
						if (true == d) {
							System.out.println("添加姓名");
							String tea_name = sc.nextLine();
							
							System.out.println("添加年龄");
							String teachar_age = sc.nextLine();
							Integer teachar_age_age = Integer.parseInt(teachar_age);
							
							System.out.println("性别");
							String teacher_sex = sc.nextLine();
							
							System.out.println("等级");
							String teacher_role = sc.nextLine();
							
							teacher.xiugai(id_teacaher,
									new Teacher(id_teacaher, tea_name, teachar_age_age, teacher_sex, teacher_role));
						}
					} else if (t3.equals(Teach)) {// 查询
						teacher.selectall();
					} else if (t4.equals(Teach)) {
						System.out.println("学生名单为");
						s_tudent.select();
					}

				} else if (is == 0) {// 学生
					
					System.out.println("学生1-9编号--按顺序输入");
					String stu_id = sc.nextLine();
					Integer stu_id_s = Integer.parseInt(stu_id);
				 boolean id_student=s_tudent.add_id(stu_id);
					if(true==id_student) {
						System.out.println("姓名");
						String stu_name = sc.nextLine();
						
						System.out.println("年龄");
						String stu_age = sc.nextLine();
						Integer stu_id_age = Integer.parseInt(stu_age);
						
						System.out.println("性别");
						String stu_sex = sc.nextLine();
						System.out.println("添加角色");
						String stu_rolr = sc.nextLine();
						s_tudent.add(new Student(stu_id_s, stu_name, stu_id_age, stu_sex, stu_rolr));
					}
					
				} else if (0 == super_nam) {
					System.out.println("====================================================================");
					System.out.println("输入1查看学生");
					System.out.println("输入2查看老师");
					System.out.println("输入3修改学生");
					System.out.println("输入4删除学生");
					System.out.println("输入5修改老师");
					System.out.println("输入6删除老师");
					String g1 = "1";
					String g2 = "2";
					String g3 = "3";
					String g4 = "4";
					String g5 = "5";
					String super_i = sc.nextLine();//
					if (g1.equals(super_i)) {// 查看学生
						System.out.println("学生是");
						s_tudent.select();
					} else if (g2.equals(super_i)) {
						System.out.println("老师显示");
						teacher.selectall();
					} else if (g3.equals(super_i)) {
						System.out.println("修改学生编号");
						String stu_id = sc.nextLine();
						int sut_id_bianhao = Integer.parseInt(stu_id);
						
						int dc = s_tudent.getId();
						boolean jai = s_tudent.update(dc);//
						if (true == jai) {
							System.out.println("修改的姓名是");
							String stu_n_name = sc.nextLine();
							
							System.out.println("修改的年龄是");
							String stu_n_age = sc.nextLine();
							int age_s_stu = Integer.parseInt(stu_n_age);
							
							System.out.println("修改的性别是");
							String stu_se_sex = sc.nextLine();
						
							System.out.println("修改的等级是");
							String stu_r_fole = sc.nextLine();
							
							s_tudent.update_stu(sut_id_bianhao,
									new Student(sut_id_bianhao, stu_n_name, age_s_stu, stu_se_sex, stu_r_fole));
						}
					} else if (g4.equals(super_i)) {// 删除
						System.out.println("输入学生编号");
						String sut_id_si = sc.nextLine();
						int idstu_id = Integer.parseInt(sut_id_si);
					}
				}
				}
			} else {
				System.out.println("输入错误");
			}
		
	}

	public static void main(String[] args) {
		run_Time();
	}
}
