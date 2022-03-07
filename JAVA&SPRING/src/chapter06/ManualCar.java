package chapter06;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("핸들로 방향을 바꿉니다.");

	}

	@Override
	public void stop() {
		System.out.println("브레이크로 멈춥니다.");

	}

}
