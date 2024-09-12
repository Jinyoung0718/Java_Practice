package chap_12.clean;

public class Room {
    public int number = 1;
    synchronized public void clean(String name) {
        // 직원1 : 3번방 청소 중
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}

// synchronized : 동기화란 각각의 쓰레드가 메서드를 이용하여 동작을 할 시, 병행하여 같은 메서드에 접속하게 하지 아니하고, 각각의 쓰레드가 이용 후에 다음 쓰레드가 이용하도록 하는 것으로
// 즉 절차를 지키게하는 것이다 -> synchronized 파일로 이동

    // 스레드가 동시에 clean 메서드에 접근하는 것을 방지한다고 해도, 스레드 스케줄링과 실행 순서는 운영체제와 JVM의 결정에 의해 결정됩니다.
    // 따라서 스레드 1과 스레드 2의 작업이 정확하게 번갈아 가며 실행되는 것은 보장되지 않습니다
