package top150.deqode.desingpattern.stuctural;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class InternetInvocationHandler implements InvocationHandler {

    private final top150.deqode.desingpattern.stuctural.Internet realInternet;

    public InternetInvocationHandler(top150.deqode.desingpattern.stuctural.Internet realInternet) {
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
