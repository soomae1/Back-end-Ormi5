package Ormi_Java_20240617;

public interface InterfaceA {
    void methodA();

    default void showA() { // 디폴트 메서드 추가적으로 사용함
        System.out.println("okay");
    }
}
