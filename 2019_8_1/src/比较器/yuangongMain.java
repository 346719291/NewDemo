package �Ƚ���;

import java.util.TreeSet;

public class yuangongMain {
	public static void bijiao() {
		yuangong y1=new yuangong("����",90.0,100.0);
		yuangong y2=new yuangong("С��",90.0,100.0);
		yuangong y3=new yuangong("�˽�",920.0,100.0);
		yuangong y4=new yuangong("����",910.0,100.0);
		yuangong y5=new yuangong("����",92.0,100.0);
		TreeSet<yuangong> hyuan=new TreeSet<yuangong>(new jkd());//TreeSet���Զ�����Ĺ���
		hyuan.add(y1);
		hyuan.add(y2);
		hyuan.add(y3);
		hyuan.add(y4);
		hyuan.add(y5);
		hyuan.forEach(it->{System.out.println(it);});
	}
	public static void main(String[] args) {
		bijiao();
	}
}
