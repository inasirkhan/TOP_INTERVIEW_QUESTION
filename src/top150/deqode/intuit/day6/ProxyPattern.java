package top150.deqode.intuit.day6;

interface internet{

    void accessSite(String name);
}

class RealInternet implements internet{

    @Override
    public void accessSite(String name) {
        System.out.println("accessing site : "+name);
    }
}

class ProxyInternet implements internet{

    internet internet;

    ProxyInternet(internet internet){
        this.internet = internet;
    }
    @Override
    public void accessSite(String name) {
        if (name.equals("facebook.com")){
            System.out.println("access denied");
            return;
        }
        internet.accessSite(name);


    }
}

public class ProxyPattern {

    public static void main(String[] args) {
        ProxyInternet proxyInternet = new ProxyInternet(new RealInternet());
        proxyInternet.accessSite("facebook.com");
        proxyInternet.accessSite("goggle.com");
    }
}
