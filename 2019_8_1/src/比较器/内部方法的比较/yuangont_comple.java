package 比较器.内部方法的比较;

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
				System.out.println(this.name+"和"+o.name+"是同一个人");
				return 0;
			}
		}
		
	}

}
