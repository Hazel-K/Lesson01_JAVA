package blog.hyojin4588.first.level3;

public class CarTest {
	
		public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("소나타", "흰색", 2500);
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80");
		// car1.name = "소나타"; // 생성자를 쓰기 전 데이터 입력 방식
		// car1.color = "흰색"; // 생성자를 쓰기 전 데이터 입력 방식
		
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		System.out.println("---");
	}

}
