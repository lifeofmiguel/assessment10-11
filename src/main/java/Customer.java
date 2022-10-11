import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends User{
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> addresses;
    private Size size;
    private Product[] products;

    public Customer(String username, String password, String user, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] products) {
        super(username, password, user);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void useMyRewardPoints() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "rewardPoints=" + rewardPoints +
                ", accountBalance=" + accountBalance +
                ", addresses=" + addresses +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
