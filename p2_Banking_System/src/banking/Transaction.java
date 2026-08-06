package banking;

import java.time.LocalDateTime;

public class Transaction {
    private final TransactionType type;
    private final double amount;
    private final LocalDateTime date;
    private final String description;

    public Transaction(
            TransactionType type,
            double amount,
            String description
    ){
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = LocalDateTime.now();
    }

    public TransactionType getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public String getDescription(){
        return description;
    }
}

