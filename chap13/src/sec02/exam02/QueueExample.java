package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

// Queue를 이용한 간단한 메시지 큐를 구현한 예제
// 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣는 순서대로 메시지가 처리됨
// => FIFO(선입선출)
public class QueueExample {

	public static void main(String[] args) {
//		Queue<Message> messageQueue = new LinkedList<Message>();
		Queue<Message> messageQueue = new LinkedList<>();
		
		// 메시지 저장
		messageQueue.offer(new Message("sendMail", "유재석"));
		messageQueue.offer(new Message("sendSMS", "김재현"));
		messageQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		// 메시지가 큐가 비었는지 확인
		while (!messageQueue.isEmpty()) {
			// 메시지 큐에서 1개의 메시지 꺼냄
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}

}
