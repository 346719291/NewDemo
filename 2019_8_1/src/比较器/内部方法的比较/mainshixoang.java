package 比较器.内部方法的比较;

import java.util.TreeSet;

public class mainshixoang {
	public static void rn() {
		yuangont_comple sd=new yuangont_comple("阿里云",52.2,52.5);
		yuangont_comple sd2=new yuangont_comple("阿里云",512.2,52.5);
		yuangont_comple sd3=new yuangont_comple("阿里云",522.2,52.5);
		yuangont_comple sd4=new yuangont_comple("阿里云",532.2,52.5);
		yuangont_comple sd5=new yuangont_comple("阿里云",5222.2,52.5);
		TreeSet<yuangont_comple> D=new TreeSet<yuangont_comple>();
		D.add(sd2);
		D.add(sd2);
		D.add(sd3);
		D.add(sd4);
		D.add(sd5);
		for(yuangont_comple dv:D) {
			System.out.println(dv);
		}
	}
	
	//排序方法
	public static void paic() {
		int [] in= {1,5,25,582,253};
		int s= in.length;
		int tem=0;
		for (int i = 0; i < s-1; i++) {
			for (int j = i+1; j < s; j++) {
				if(in[i]<in[j]) {
					tem=in[i];
					in[i]=in[j];
					in[j]=tem;
				}
			}
			System.out.println(in[i]);
		}
		
	}
	public static void main(String[] args) {
		//rn();
		paic();
	}
}
