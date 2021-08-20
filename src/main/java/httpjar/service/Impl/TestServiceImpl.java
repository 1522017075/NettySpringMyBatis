package httpjar.service.Impl;

import httpjar.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("test success");
    }

    public TestServiceImpl() {
        System.out.println("TestServiceImpl created..");
    }
}
