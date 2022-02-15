package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;

@DisplayName("싱글톤 예제")
public class SingletonService {
    public static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void  logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
