package �Ƚ���;

import java.util.Comparator;

public class jkd  implements Comparator<yuangong>{
	@Override
	public int compare(yuangong o1, yuangong o2) {
		// TODO Auto-generated method stub
				if(o1.getScore()>o2.getScore()) {
					return 1; 
				}else if(o1.getScore()<o2.getScore()) {
					return -1;
				}else {
					if(o1.getJiangjing()>o2.getJiangjing()) {
						return 1;
					}else if(o1.getJiangjing()<o2.getJiangjing()) {
						return -1;
					}else {
						System.out.println(o1.getName()+"��"+o2.getName()+"��ͬһ����");
						return 0;
					}
				}
	}

}
