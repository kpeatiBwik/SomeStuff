package core;

import core.Helper;

public class Deposit extends Helper {
    private String name;
    private String country;
    private String type;
    private String depositor;
    private long accountId;
    private long amountOnDeposit;
    private int profitability;
    private int termOfDeposit;

    public Deposit(String name, String country, String type, String depositor, long accountId, long amountOnDeposit, int profitability, int termOfDeposit) {
        setName(name);
        setCountry(country);
        setType(type);
        setDepositor(depositor);
        setAccountId(accountId);
        setAmountOnDeposit(amountOnDeposit);
        setProfitability(profitability);
        setTermOfDeposit(termOfDeposit);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    public String getDepositor() {
        return depositor;
    }

    public long getAccountId() {
        return accountId;
    }

    public long getAmountOnDeposit() {
        return amountOnDeposit;
    }

    public int getProfitability() {
        return profitability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }

    public void setAccountId(long accountId) {
        try {
            String tempString = Long.toString(accountId);
//            boolean tempBool = validationAccountID(tempString);
//            if (tempBool) {
//                this.accountId = accountId;
//            }
        } catch (Exception e) {
            //TODO Нужно придумать эксепшн, если не получилось записать. вообще вероятно что тут null запишется
            //TODO А вообще стоп! accountId у нас будет генериться автоматом, нам нужно только подстраховаться для команды -> info account <accountId>, так что тут нужно как-то выкрутится
        }

    }

    public void setAmountOnDeposit(long amountOnDeposit) {
        this.amountOnDeposit = amountOnDeposit;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }

	public int getTermOfDeposit() {
		return termOfDeposit;
	}

	public void setTermOfDeposit(int termOfDeposit) {
		this.termOfDeposit = termOfDeposit;
	}
}