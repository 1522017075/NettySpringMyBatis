package httpjar.util;

public class WebUtil {
    public static <T>T getBean(Class<T> clazz) {
        return ContextUtil.getContextUtil().getBean(clazz);
    }
}
