package ѧ������ϵͳ;

import java.util.Scanner;

public class Main_Demo {
	public static void run_Time() {
		Teacher teacher = new Teacher();
		Student s_tudent = new Student();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("��������--123");
			String pwd = "123";
			String pwd_2 = sc.nextLine();
			if (pwd.equals(pwd_2)) {
				while (true) {
				System.out.println("��ʦ����---------t");
				System.out.println("ѧ������---------s");
				System.out.println("����Ա����---------g");
				String str = sc.nextLine();
				String t = "t";
				String t2 = "s";// ѧ��
				String t3 = "";
				String t4 = "";
				String t5 = "";
				String supman = "g";
				int i = t.compareTo(str);// ��ʦ
				int is = t2.compareTo(str);// ѧ��
				int super_nam = supman.compareTo(str);
				if (0 == i) {
					System.out.println("������==================================");
					System.out.println("������� 1");
					System.out.println("ɾ������4");
					System.out.println("�޸�����2");
					System.out.println("��ѯ����3");
					System.out.println("�鿴ѧ������5");
					String Teach = sc.nextLine();// ��ʦ����
					t = "1";// ���
					t2 = "2";// �޸�
					t3 = "3";// ��ѯ
					t4 = "4";
					t5 = "5";
					if (t.equals(Teach)) {
						// ���
						System.out.println("������1-9�ı��---��˳������");
						String tea_id = sc.nextLine();
						Integer id = Integer.parseInt(tea_id);
						boolean id_teachar=  teacher.add_id(tea_id) ;
						if(true==id_teachar) {
							System.out.println("�������");
							String tea_name = sc.nextLine();
							
							System.out.println("�������");
							String teachar_age = sc.nextLine();
							Integer teachar_age_age = Integer.parseInt(teachar_age);
							
							System.out.println("�Ա�");
							String teacher_sex = sc.nextLine();
							
							System.out.println("�ȼ�");
							String teacher_role = sc.nextLine();
							
							teacher.add(new Teacher(id, tea_name, teachar_age_age, teacher_sex, teacher_role));
						}
						
					} else if (t2.equals(Teach)) {
						System.out.println("������ʦ���");
						String teacher_id = sc.nextLine();// ��ʦ���
						Integer id_teacaher = Integer.parseInt(teacher_id);

						boolean d = teacher.selectbyid(id_teacaher);
						if (true == d) {
							System.out.println("�������");
							String tea_name = sc.nextLine();
							
							System.out.println("�������");
							String teachar_age = sc.nextLine();
							Integer teachar_age_age = Integer.parseInt(teachar_age);
							
							System.out.println("�Ա�");
							String teacher_sex = sc.nextLine();
							
							System.out.println("�ȼ�");
							String teacher_role = sc.nextLine();
							
							teacher.xiugai(id_teacaher,
									new Teacher(id_teacaher, tea_name, teachar_age_age, teacher_sex, teacher_role));
						}
					} else if (t3.equals(Teach)) {// ��ѯ
						teacher.selectall();
					} else if (t4.equals(Teach)) {
						System.out.println("ѧ������Ϊ");
						s_tudent.select();
					}

				} else if (is == 0) {// ѧ��
					
					System.out.println("ѧ��1-9���--��˳������");
					String stu_id = sc.nextLine();
					Integer stu_id_s = Integer.parseInt(stu_id);
				 boolean id_student=s_tudent.add_id(stu_id);
					if(true==id_student) {
						System.out.println("����");
						String stu_name = sc.nextLine();
						
						System.out.println("����");
						String stu_age = sc.nextLine();
						Integer stu_id_age = Integer.parseInt(stu_age);
						
						System.out.println("�Ա�");
						String stu_sex = sc.nextLine();
						System.out.println("��ӽ�ɫ");
						String stu_rolr = sc.nextLine();
						s_tudent.add(new Student(stu_id_s, stu_name, stu_id_age, stu_sex, stu_rolr));
					}
					
				} else if (0 == super_nam) {
					System.out.println("====================================================================");
					System.out.println("����1�鿴ѧ��");
					System.out.println("����2�鿴��ʦ");
					System.out.println("����3�޸�ѧ��");
					System.out.println("����4ɾ��ѧ��");
					System.out.println("����5�޸���ʦ");
					System.out.println("����6ɾ����ʦ");
					String g1 = "1";
					String g2 = "2";
					String g3 = "3";
					String g4 = "4";
					String g5 = "5";
					String super_i = sc.nextLine();//
					if (g1.equals(super_i)) {// �鿴ѧ��
						System.out.println("ѧ����");
						s_tudent.select();
					} else if (g2.equals(super_i)) {
						System.out.println("��ʦ��ʾ");
						teacher.selectall();
					} else if (g3.equals(super_i)) {
						System.out.println("�޸�ѧ�����");
						String stu_id = sc.nextLine();
						int sut_id_bianhao = Integer.parseInt(stu_id);
						
						int dc = s_tudent.getId();
						boolean jai = s_tudent.update(dc);//
						if (true == jai) {
							System.out.println("�޸ĵ�������");
							String stu_n_name = sc.nextLine();
							
							System.out.println("�޸ĵ�������");
							String stu_n_age = sc.nextLine();
							int age_s_stu = Integer.parseInt(stu_n_age);
							
							System.out.println("�޸ĵ��Ա���");
							String stu_se_sex = sc.nextLine();
						
							System.out.println("�޸ĵĵȼ���");
							String stu_r_fole = sc.nextLine();
							
							s_tudent.update_stu(sut_id_bianhao,
									new Student(sut_id_bianhao, stu_n_name, age_s_stu, stu_se_sex, stu_r_fole));
						}
					} else if (g4.equals(super_i)) {// ɾ��
						System.out.println("����ѧ�����");
						String sut_id_si = sc.nextLine();
						int idstu_id = Integer.parseInt(sut_id_si);
					}
				}
				}
			} else {
				System.out.println("�������");
			}
		
	}

	public static void main(String[] args) {
		run_Time();
	}
}
