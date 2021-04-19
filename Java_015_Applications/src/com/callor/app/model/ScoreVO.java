package com.callor.app.model;

/*
 * 성적처리를 하기 위한 VO클래스
 * 학번, 학생이름, 국어,영어, 수학,총점,평균
 */
public class ScoreVO {
	
	/*
	 * Java 소스코드인 클래스 파일은
	 * 보통 public class 클래스명 {} 형식으로 만들어진다
	 * 이때 extends 키워드를사용하여 다른 클래스를 상속하면
	 *   상속하는 클래스에 정의된method 변수를 물려 받아 사용가능
	 *   
	 * 클래스를 만들때 extends 키워드 명령문을 사용하지 않으면 모든 클래스는
	 * 자동으로 extends Object 명령문이 추가 되는 것과 같다
	 * 
	 * Object 클래스는 java의 모든 클래스의 조상이다
	 * Object 클래스에는 시스템적, 메모리적인 메서드들이 있다
	 * 이러한 메서드들은 특별한 용도로 사용한다
	 * 
	 * 하지만, Object 클래스에 정의되어 잇는method는
	 * 일반적인 개발을 할때는 별로 사용을 하지 않는다
	 * 
	 * 보통 클래스르 만들때 Object로 부터 상속받은 여러 메서드 중에
	 * toString() 메서드를 재 정의하여 디버깅 용도 등으로 활용을 한다
	 */
	
	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	private Integer total;
	private float avg;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		return sum;
	}
	
	public float getAvg() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		
		float avg = (float)sum / 3;
		return avg;
	}
	
	//재정의
    //상속받을 클래스에 있는 method를
	//내맘대로 다시 만들어 쓰기
	
	//재 활용
	// toString() method는 Object 클래스로부터 상속받은
	// 모든 클래스로 만든 객체에서 호출 가능
	//VO 클래스에서는 VO의 변수들에 담긴 값을 확인하는 용도로 재 정의하여 활용한다
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	

}
