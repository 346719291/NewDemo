package �Ƚ���.�ڲ������ıȽ�;

public class yuangont_comple implements Comparable<yuangont_comple>{
	protected String name ;
	protected Double score;
	protected Double jiangli;
	
	
	
	public yuangont_comple(String name, Double score, Double jiangli) {
		super();
		this.name = name;
		this.score = score;
		this.jiangli = jiangli;
	}



	@Override
	public String toString() {
		return "yuangont_comple [name=" + name + ", score=" + score + ", jiangli=" + jiangli + "]";
	}



	@Override
	public int compareTo(yuangont_comple o) {
		// TODO Auto-generated method stub
		if(this.score>o.score) {
			return 1;
		}else if(this.score<o.score) {
			return -1;
		}else {
			if(this.jiangli>o.jiangli) {
				return 1;
				
			}else if(this.jiangli<o.jiangli) {
				return -1;
			}else{
				System.out.println(this.name+"��"+o.name+"��ͬһ����");
				return 0;
			}
		}
		
	}

}
