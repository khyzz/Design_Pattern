package adapter;

/**
 * @Description :
 * @Author :
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void shoWithAster() {
        System.out.println("*" + string + "*");
    }
}
