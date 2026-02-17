package top150.deqode.desingpattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class InternetInvocationHandler implements InvocationHandler {

    private final Internet realInternet;

    public InternetInvocationHandler(Internet realInternet) {
        this.realInternet = realInternet;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String siteName = (String) args[0];

        if (siteName.equalsIgnoreCase("facebook.com")) {
            System.out.println("No access. This site is blocked.");
            return null;
        }

        return method.invoke(realInternet, args);
    }
}




public class DynamicProxyPattern {

    public static void main(String[] args) {
        Internet realInternet = new RealInternet();

        Internet proxyInternet = (Internet) Proxy.newProxyInstance(
                Internet.class.getClassLoader(),
                new Class[]{Internet.class},
                new InternetInvocationHandler(realInternet)
        );

        proxyInternet.accessSite("google.com");
        proxyInternet.accessSite("facebook.com");
    }
}
