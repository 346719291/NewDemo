package ±È½ÏÆ÷;

public class yuangong{
	public String name;
	public Double score;
	public Double jiangjing;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getJiangjing() {
		return jiangjing;
	}

	public void setJiangjing(Double jiangjing) {
		this.jiangjing = jiangjing;
	}

	public yuangong(String name, Double score, Double jiangjing) {
		super();
		this.name=name;
		this.score = score;
		this.jiangjing = jiangjing;
	}

	public yuangong() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "yuangong [name=" + name + ", score=" + score + ", jiangjing=" + jiangjing + "]";
	}

	
	
}
