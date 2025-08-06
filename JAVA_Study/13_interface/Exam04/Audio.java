package Exam04;


	public class Audio implements RemoteControl  {

		// 인터페이스 = 선언 -> 구현 -> 사용
		
		private int volume;
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");

		}

		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");

		}

		@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;// 이것이 10을 넘으로 10에 맞추겠다	
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("현재 Audio의 볼륨 : "+this.volume);
		}

	}


