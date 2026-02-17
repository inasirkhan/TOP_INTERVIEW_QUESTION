package top150.deqode.desingpattern;

interface Internet{

    void accessSite(String site);
}

class RealInternet implements Internet{

    @Override
    public void accessSite(String site) {
        System.out.println("accessing "+site);
    }
}

//❌ Problem: static proxy
//
//You must write one proxy class per interface
//
//Not scalable if many interfaces need filtering
//
//👉 Dynamic Proxy fixes this.
class ProxyInternet implements Internet{

    private Internet realInternet;

    ProxyInternet(RealInternet realInternet){
        this.realInternet = realInternet;
    }

    @Override
    public void accessSite(String site) {
        if (site.equals("facebook.com")){
            System.out.println("access denied");
        }
        else {
            realInternet.accessSite(site);
        }
    }
}

public class ProxyPattern {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        ProxyInternet proxy = new ProxyInternet(new RealInternet());
        proxy.accessSite("facebook.com");
        proxy.accessSite("google.com");

        new Thread(()->{
           synchronized (lock1){
               synchronized (lock2){

               }
           }
        }).start();

        new Thread(()->{
            synchronized (lock2){
                synchronized (lock1){

                }
            }
        }).start();
    }


}
