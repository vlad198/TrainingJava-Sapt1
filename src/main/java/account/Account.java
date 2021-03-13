package account;

import lombok.*;

public @Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
class Account {
    @NonNull
    private final String id;
    @NonNull
    private final String name;
    private int balance;

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.credit(amount);
            debit(amount);
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
}
