package com.callor.score.model;

/*
 * 데이터를 담아서 정보처리를 수행할때
 * 편리하게 테이터를 묶어서 관리하기 위한 클래스
 * VO 를 만드는 작업: 데이터 모델링(설계)
 * 1. 추상화
 * 2. 정보은닉
 * 3. 캡슐화
 * 4.재정의(Override)
 * 
 * 모델링 된 ScoreVO를 실제로 사용할때는 객체로 생성한다
 * ScoreVO scoreVO = new ScoreVO();
 * 필요 할때마다 객체로 생성하고 데이터를  setter하고
 * 연산을 수행한 후 데이터를 Getter하는 방식으로 활용한다
 * 
 * DB항목에서는 Entity 모델링이라고 한다
 * 모델링 된 Entity를 data TABLE 로 생성하여 사용한다
 * 한번 TABLE을 생성하고 영구적으로 사용한다
 * 
 */
public class ScoreVO extends Object{
	
	private String num;
	private String name;
	
	// VO 클래스에 숫자형 변수를 선언할때
	// primitive 형이 아닌 wrapper 클래스형으로 선언할때는
	//     0으로 clear를 해 주자
	// 이러한 불편을 방지하지 위하여 primitive형으로 만들기도 하지만
	// null 값을 취급하기 어려운 단점이 발생한다
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;
	
	
	/*
	 * VO클래스를 모델링하고 : 추상화
	 * 변수를 private로 선언했다 : 정보은닉
	 * 은닉된 변수에 접근하기 위해 Getter setter method를 생성
	 * 
	 * getter의 setter를 생성하고봤더니
	 * 총점(total)과 평균(avg)는 점수가 입력되면 항상 계산되어야 하는 항목이다
	 * 즉, 외부에서 이 변수에 값을 저장할 일이 별로 없을 것 같다
	 *        외부에서 total, avg 값을 요청하면
	 *          그때마다 계산하여 return을 하면 될 것 같다
	 *           
	 * 1. total과 avg변수를 삭제하고
	 * 2. total, avg 변수에 setter method를 제거한다
	 * 3. total, avg 변수의 getter method를 변경한다
	 *      과목총점과 과목평균을 
	 */
	
	
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
	/*
	 * 캡슐화
	 * 외부에서 객체.getTotal() method를 호출하면
	 * 과목의 총점을 return받을 수 잇다.
	 * 
	 * 실제코드는 3과목의 총점을 계산하고
	 * 계산된 결과를 return하는 구조로 되어 있다
	 * 
	 * 하지만 외부에서는 실제 코드가 어떠헥 작도오디는 몰라도
	 * 또는 관심갖지 않아도 상관 없이 getTotal method는
	 * 당연히 잘 계산된 총점 결과를 알려준다는 것을 알고 있다
	 * 
	 * 이렇게 내부 코드를 감추고(외부에 노출하지 않고도)
	 * 기능을 충실히 수행 할 수 있도록 하는것
	 */
	public Integer getTotal() {
		Integer total = kor;
		total += eng;
		total += math;
		return total;
	}
	public Float getAvg() {
		float avg = Float.valueOf(getTotal()) / 3;
		return avg;
	}
	/*
	 * 재정의(Override)
	 * toString() method는 Object 클래스에 정의되어 있으며
	 * 모든 클래스는 자동적으로 Object 클래스를 상속 받는다
	 * 
	 * 따라서 ScoreVO 클래스에는 자동으로 toString() method가 
	 * 있는 것처럼 동작할 것이다
	 * 
	 * 다만, object 클래스에 정의된 toString() method는
	 * 사용하는데 의미가 없다
	 * 
	 * 그래서 toString() method를
	 * VO객체의 변수에 담긴 값들ㅇ르 문자열로 만들어
	 * return하는 코드로 다시 작성을 한다
	 * 이제 vo객체.toString() method를 호출하면
	 * vo객체의 변수들에 담긴 값들이 출력될 것이다
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num 
				+ ", name=" + name 
				+ ", kor=" + kor 
				+ ", eng=" + eng 
				+ ", math=" + math
				+ ", total=" + this.getTotal() 
				+ ", avg=" + this.getAvg() + "]";
	}
	
	
	

}
