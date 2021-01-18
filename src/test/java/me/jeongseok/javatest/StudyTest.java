package me.jeongseok.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }


    @Test
    void create1() {
        System.out.println("create1");
    }

    @Test
    @Disabled // 테스트 코드를 실행하고 싶지 않은 경우 사용 언제 사용 -> 깨지는 테스트이고, 어떻게 고치는지 모를 땐 잠시 사용함, 하지만 깨진 테스트는 코쳐야함
   void create2() {
        System.out.println("create3");
    }

    // 모든 테스트가 시작하기 전에 딱 한번만 호출
    // static void로 시작해야함
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    // 모든 테스트가 시작한 후에 딱 한번만 호출함
    // static void로 시작해야함
    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    // 각각의 테스트가 실행되기 이전에 실행
    // 굳이 static 필요없음
    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each");
    }

    // 각각의 테스트가 실행된 이후에 실행
    // 굳이 static 필요없음
    @AfterEach
    void afterEach() {
        System.out.println("After Each");
    }

}